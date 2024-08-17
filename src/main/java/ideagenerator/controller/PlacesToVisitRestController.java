package ideagenerator.controller;

import ideagenerator.model.PlacesToVisit;
import ideagenerator.repository.PlacesToVisitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;
import java.util.List;

@Controller
@RequestMapping("/placeToVisit")
public class PlacesToVisitRestController {

    @Autowired
    private PlacesToVisitRepository placesToVisitRepository;

    @GetMapping
    public List<PlacesToVisit> getAllPlacesToVisit() {
        return placesToVisitRepository.findAll();
    }

    @GetMapping("/{type}/{time}/{startPlaceId}")
    public List<PlacesToVisit> getPlaceToVisitByTimeAndStartPlace(@PathVariable Long type,@PathVariable double time, @PathVariable Long startPlaceId) {
        if(startPlaceId == 1){
            return placesToVisitRepository.findByTimeRangeGd(time,type);
        }
        if(startPlaceId == 2){
            return placesToVisitRepository.findByTimeRangeKat(time,type);
        }
        if(startPlaceId == 3){
            return placesToVisitRepository.findByTimeRangeKr(time,type);
        }
        if(startPlaceId == 4){
            return placesToVisitRepository.findByTimeRangePoz(time,type);
        }
        if(startPlaceId == 5){
            return placesToVisitRepository.findByTimeRangeSz(time,type);
        }
        if(startPlaceId == 6){
            return placesToVisitRepository.findByTimeRangeWaw(time,type);
        }

        return List.of();
    }

    @Transactional
    @GetMapping("/{description}/{place}/{timeToPlaceGd}/{timeToPlaceKat}/{timeToPlaceKr}/{timeToPlacePoz}/{timeToPlaceSz}/{timeToPlaceWaw}")
    public void addPlaceToVisit(@PathVariable String description) {
        PlacesToVisit placeToVisit = new PlacesToVisit();
        placeToVisit.setDescription(description);

        placesToVisitRepository.save(placeToVisit);
    }

}