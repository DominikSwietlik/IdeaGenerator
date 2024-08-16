package ideagenerator.repository;

import ideagenerator.model.PlacesToVisit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;


public interface PlacesToVisitRepository extends JpaRepository<PlacesToVisit, Long> {

    @Query("")
    PlacesToVisit add(@Param("description") String description,
                      @Param("place") String place,
                      @Param("timeToPlaceGd") double timeToPlaceGd,
                      @Param("timeToPlaceKat") double timeToPlaceKat,
                      @Param("timeToPlaceKr") double timeToPlaceKr,
                      @Param("timeToPlacePoz") double timeToPlacePoz,
                      @Param("timeToPlaceSz") double timeToPlaceSz,
                      @Param("timeToPlaceWaw") double timeToPlaceWaw,
                      @Param("timeToSpendMax") double timeToSpendMax,
                      @Param("timeToSpendMin") double timeToSpendMin,
                      @Param("type") Long type);
    @Query("SELECT p FROM PlacesToVisit p")
    List<PlacesToVisit> findAll();
    @Query("SELECT p FROM PlacesToVisit p WHERE p.id = :id")
    Optional<PlacesToVisit> findById(@Param("id") Long id);
    @Query("SELECT p FROM PlacesToVisit p WHERE p.timeToSpendMax >= (:time + (2* p.timeToPlaceGd)) AND (p.timeToSpendMin + (2*p.timeToPlaceGd)) <= :time AND p.type = :type")
    List<PlacesToVisit> findByTimeRangeGd(@Param("time") double time, @Param("type") double type);
    @Query("SELECT p FROM PlacesToVisit p WHERE p.timeToSpendMax >= (:time + (2* p.timeToPlaceKat)) AND (p.timeToSpendMin + (2*p.timeToPlaceKat)) <= :time AND p.type = :type")
    List<PlacesToVisit> findByTimeRangeKat(@Param("time") double time, @Param("type") double type);
    @Query("SELECT p FROM PlacesToVisit p WHERE p.timeToSpendMax >= (:time + (2* p.timeToPlaceKr)) AND (p.timeToSpendMin + (2*p.timeToPlaceKr)) <= :time AND p.type = :type")
    List<PlacesToVisit> findByTimeRangeKr(@Param("time") double time, @Param("type") double type);
    @Query("SELECT p FROM PlacesToVisit p WHERE p.timeToSpendMax >= (:time + (2* p.timeToPlacePoz)) AND (p.timeToSpendMin + (2*p.timeToPlacePoz)) <= :time AND p.type = :type")
    List<PlacesToVisit> findByTimeRangePoz(@Param("time") double time, @Param("type") double type);
    @Query("SELECT p FROM PlacesToVisit p WHERE p.timeToSpendMax >= (:time + (2* p.timeToPlaceSz)) AND (p.timeToSpendMin + (2*p.timeToPlaceSz)) <= :time AND p.type = :type")
    List<PlacesToVisit> findByTimeRangeSz(@Param("time") double time, @Param("type") double type);
    @Query("SELECT p FROM PlacesToVisit p WHERE p.timeToSpendMax >= (:time + (2* p.timeToPlaceWaw)) AND (p.timeToSpendMin + (2*p.timeToPlaceWaw)) <= :time AND p.type = :type")
    List<PlacesToVisit> findByTimeRangeWaw(@Param("time") double time, @Param("type") double type);

}
