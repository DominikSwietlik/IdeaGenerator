package ideagenerator.controller;

import ideagenerator.model.PlacesToVisit;
import ideagenerator.model.PlacesToVisitNotApproved;
import ideagenerator.repository.PlacesToVisitRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
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
    public String searchPlaceToVisit(@RequestParam("time") double time,
                                     @RequestParam("startPlace") int startPlaceId,
                                     @RequestParam("type") Long type,
                                     Model model) {
        List<PlacesToVisit> placeToVisit = null;
        time = time * 60;

        switch (startPlaceId) {
            case 1:
                placeToVisit = (type >= 1 && type <= 3) ?
                        placesToVisitRepository.findByTimeRangeGd(time, type) :
                        placesToVisitRepository.findByTimeRangeGd(time);
                break;
            case 2:
                placeToVisit = (type >= 1 && type <= 3) ?
                        placesToVisitRepository.findByTimeRangeKat(time, type) :
                        placesToVisitRepository.findByTimeRangeKat(time);
                break;
            case 3:
                placeToVisit = (type >= 1 && type <= 3) ?
                        placesToVisitRepository.findByTimeRangeKr(time, type) :
                        placesToVisitRepository.findByTimeRangeKr(time);
                break;
            case 4:
                placeToVisit = (type >= 1 && type <= 3) ?
                        placesToVisitRepository.findByTimeRangePoz(time, type) :
                        placesToVisitRepository.findByTimeRangePoz(time);
                break;
            case 5:
                placeToVisit = (type >= 1 && type <= 3) ?
                        placesToVisitRepository.findByTimeRangeSz(time, type) :
                        placesToVisitRepository.findByTimeRangeSz(time);
                break;
            case 6:
                placeToVisit = (type >= 1 && type <= 3) ?
                        placesToVisitRepository.findByTimeRangeWaw(time, type) :
                        placesToVisitRepository.findByTimeRangeWaw(time);
                break;
            default:

                return "errorPage";
        }

        if (placeToVisit != null && !placeToVisit.isEmpty()) {
            Random random = new Random();
            int tmp = random.nextInt(placeToVisit.size());
            model.addAttribute("placeToVisit", placeToVisit.get(tmp));
            return "placeToVisitDetails";
        } else {
            return "noPlaceFound";
        }
    }

    @GetMapping("add")
    public String DisplayAddPlaceToVisit() {
        return "addPlacesToVisit";
    }

    @Transactional
    @PostMapping("add")
    public String addPlaceToVisit(@ModelAttribute PlacesToVisitNotApproved placesToVisitNotApproved) {
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
        return "redirect:/placeToVisit";
    }
}