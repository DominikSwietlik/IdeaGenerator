package ideagenerator.controller;

import ideagenerator.model.PlacesToVisitNotApproved;
import ideagenerator.repository.PlacesToVisitNotApprovedRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Random;

@Controller
@RequestMapping("/placeToVisitNotApproved")
public class PlacesToVisitNotapprovedController {

    private final PlacesToVisitNotApprovedRepository placesToVisitNotApprovedRepository;

    public PlacesToVisitNotapprovedController(PlacesToVisitNotApprovedRepository placesToVisitNotApprovedRepository) {
        this.placesToVisitNotApprovedRepository = placesToVisitNotApprovedRepository;
    }

    @GetMapping("")
    public String getAllPlacesToVisit(Model model) {
        List<PlacesToVisitNotApproved> allPlacesToVisittNotApproved = placesToVisitNotApprovedRepository.findAll();
        model.addAttribute("placesToVisitNotApproved", allPlacesToVisittNotApproved);
        return "allPlacesToVisitNotApproved";
    }




    @GetMapping("add")
    public String DisplayAddPlaceToVisitNotApproved() {
        return "addPlacesToVisitNotApproved";
    }
    @Transactional
    @PostMapping("add")
    public String addPlaceToVisitNotApproved(@RequestParam("description") String description,
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
        PlacesToVisitNotApproved placeToVisitNotApproved = new PlacesToVisitNotApproved();
        placeToVisitNotApproved.setDescription(description);
        placeToVisitNotApproved.setPlace(place);
        placeToVisitNotApproved.setTimeToPlaceGd(time_to_place_gd);
        placeToVisitNotApproved.setTimeToPlaceKat(time_to_place_kat);
        placeToVisitNotApproved.setTimeToPlaceKr(time_to_place_kr);
        placeToVisitNotApproved.setTimeToPlacePoz(time_to_place_poz);
        placeToVisitNotApproved.setTimeToPlaceSz(time_to_place_sz);
        placeToVisitNotApproved.setTimeToPlaceWaw(time_to_place_waw);
        placeToVisitNotApproved.setTimeToSpendMin(time_to_spend_min);
        placeToVisitNotApproved.setTimeToSpendMax(time_to_spend_max);
        placeToVisitNotApproved.setType(type);
        placesToVisitNotApprovedRepository.save(placeToVisitNotApproved);
        return "addPlacesToVisitNotApproved";
    }

}