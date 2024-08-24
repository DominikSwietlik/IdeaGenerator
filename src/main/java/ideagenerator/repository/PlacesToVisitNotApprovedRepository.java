package ideagenerator.repository;

import ideagenerator.model.PlacesToVisit;
import ideagenerator.model.PlacesToVisitNotApproved;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;


public interface PlacesToVisitNotApprovedRepository extends JpaRepository<PlacesToVisitNotApproved, Long> {


    @Query("SELECT p FROM PlacesToVisitNotApproved p")
    List<PlacesToVisitNotApproved> findAll();
    @Query("SELECT p FROM PlacesToVisitNotApproved p WHERE p.id = :id")
    Optional<PlacesToVisitNotApproved> findById(@Param("id") Long id);




}
