package ideagenerator.controller;

import ideagenerator.model.PlacesToVisit;
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

    @Transactional
    @GetMapping("/{description}/{place}/{timeToPlaceGd}/{timeToPlaceKat}/{timeToPlaceKr}/{timeToPlacePoz}/{timeToPlaceSz}/{timeToPlaceWaw}")
    public void addPlaceToVisit(@PathVariable String description) {
        PlacesToVisit placeToVisit = new PlacesToVisit();
        placeToVisit.setDescription(description);

        placesToVisitRepository.save(placeToVisit);
    }

}