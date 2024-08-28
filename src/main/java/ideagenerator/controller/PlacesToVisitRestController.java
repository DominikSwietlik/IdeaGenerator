package ideagenerator.controller;

import ideagenerator.model.PlacesToVisit;
import ideagenerator.model.PlacesToVisitNotApproved;
import ideagenerator.repository.PlacesToVisitRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
@RequestMapping("/placeToVisit")
public class PlacesToVisitRestController {

    private final PlacesToVisitRepository placesToVisitRepository;

    public PlacesToVisitRestController(PlacesToVisitRepository placesToVisitRepository) {
        this.placesToVisitRepository = placesToVisitRepository;
    }

    @GetMapping("")
    public String getAllPlacesToVisit(Model model) {
        List<PlacesToVisit> allPlacesToVisit = placesToVisitRepository.findAll();
        model.addAttribute("placesToVisit", allPlacesToVisit);
        return "allPlacesToVisit";
    }

    @PostMapping("search")
    public String searchPlaceToVisit(@RequestParam("time") double time, @RequestParam("startPlace") int startPlaceId, @RequestParam("type") Long type, Model model) {
         List<PlacesToVisit> placeToVisit = null;
         time = time * 60;
        if (startPlaceId == 1) {
            placeToVisit = (type >= 1 && type <= 3) ?
                    placesToVisitRepository.findByTimeRangeGd(time, type) :
                    placesToVisitRepository.findByTimeRangeGd(time);
        } else if (startPlaceId == 2) {
            placeToVisit = (type >= 1 && type <= 3) ?
                    placesToVisitRepository.findByTimeRangeKat(time, type) :
                    placesToVisitRepository.findByTimeRangeKat(time);
        } else if (startPlaceId == 3) {
            placeToVisit = (type >= 1 && type <= 3) ?
                    placesToVisitRepository.findByTimeRangeKr(time, type) :
                    placesToVisitRepository.findByTimeRangeKr(time);
        } else if (startPlaceId == 4) {
            placeToVisit = (type >= 1 && type <= 3) ?
                    placesToVisitRepository.findByTimeRangePoz(time, type) :
                    placesToVisitRepository.findByTimeRangePoz(time);
        } else if (startPlaceId == 5) {
            placeToVisit = (type >= 1 && type <= 3) ?
                    placesToVisitRepository.findByTimeRangeSz(time, type) :
                    placesToVisitRepository.findByTimeRangeSz(time);
        } else if (startPlaceId == 6) {
            placeToVisit = (type >= 1 && type <= 3) ?
                    placesToVisitRepository.findByTimeRangeWaw(time, type) :
                    placesToVisitRepository.findByTimeRangeWaw(time);
        }
        Random random = new Random();
        int tmp = random.nextInt(placeToVisit.size());
            model.addAttribute("placeToVisit", placeToVisit.get(tmp));
        return "placeToVisitDetails";

}
    @GetMapping("add")
    public String DisplayAddPlaceToVisit() {
        return "addPlacesToVisit";
    }
    @Transactional
    @PostMapping("add")
    public String addPlaceToVisit(PlacesToVisitNotApproved placesToVisitNotApproved){
        PlacesToVisit placeToVisit = new PlacesToVisit();
        placeToVisit.setDescription(placesToVisitNotApproved.getDescription());
        placeToVisit.setPlace(placesToVisitNotApproved.getPlace());
        placeToVisit.setTimeToPlaceGd(placesToVisitNotApproved.getTimeToPlaceGd());
        placeToVisit.setTimeToPlaceKat(placesToVisitNotApproved.getTimeToPlaceKat());
        placeToVisit.setTimeToPlaceKr(placesToVisitNotApproved.getTimeToPlaceKr());
        placeToVisit.setTimeToPlacePoz(placesToVisitNotApproved.getTimeToPlacePoz());
        placeToVisit.setTimeToPlaceSz(placesToVisitNotApproved.getTimeToPlaceSz());
        placeToVisit.setTimeToPlaceWaw(placesToVisitNotApproved.getTimeToPlaceWaw());
        placeToVisit.setTimeToSpendMin(placesToVisitNotApproved.getTimeToSpendMin());
        placeToVisit.setTimeToSpendMax(placesToVisitNotApproved.getTimeToSpendMax());
        placeToVisit.setType(placesToVisitNotApproved.getType());
        placesToVisitRepository.save(placeToVisit);
        return "addPlacesToVisit";
    }
    /*public String addPlaceToVisit(@RequestParam("description") String description,
                                @RequestParam("place") String place,
                                @RequestParam("time_to_place_gd") double time_to_place_gd,
                                @RequestParam("time_to_place_kat") double time_to_place_kat,
                                @RequestParam("time_to_place_kr") double time_to_place_kr,
                                   @RequestParam("time_to_place_poz") double time_to_place_poz,
                                @RequestParam("time_to_place_sz") double time_to_place_sz,
                                @RequestParam("time_to_place_waw") double time_to_place_waw,
                                @RequestParam("time_to_spend_min") double time_to_spend_min,
                                @RequestParam("time_to_spend_max") double time_to_spend_max ,
                                @RequestParam("type") Long type) {
        PlacesToVisit placeToVisit = new PlacesToVisit();
        placeToVisit.setDescription(description);
        placeToVisit.setPlace(place);
        placeToVisit.setTimeToPlaceGd(time_to_place_gd);
        placeToVisit.setTimeToPlaceKat(time_to_place_kat);
        placeToVisit.setTimeToPlaceKr(time_to_place_kr);
        placeToVisit.setTimeToPlacePoz(time_to_place_poz);
        placeToVisit.setTimeToPlaceSz(time_to_place_sz);
        placeToVisit.setTimeToPlaceWaw(time_to_place_waw);
        placeToVisit.setTimeToSpendMin(time_to_spend_min);
        placeToVisit.setTimeToSpendMax(time_to_spend_max);
        placeToVisit.setType(type);
        placesToVisitRepository.save(placeToVisit);
        return "addPlacesToVisit";
    }*/

}