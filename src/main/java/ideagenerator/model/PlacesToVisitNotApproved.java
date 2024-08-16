package ideagenerator.model;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "placesToVisitNotApproved")
public class PlacesToVisitNotApproved {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String place;
    private String description;
    private Long type;
    private double timeToPlaceKat;
    private double timeToPlaceWaw;
    private double timeToPlaceKr;
    private double timeToPlaceGd;
    private double timeToPlaceSz;
    private double timeToPlacePoz;
    private double timeToSpendMin;
    private double timeToSpendMax;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public double getTimeToPlaceKat() {
        return timeToPlaceKat;
    }

    public void setTimeToPlaceKat(double timeToPlaceKat) {
        this.timeToPlaceKat = timeToPlaceKat;
    }

    public double getTimeToPlaceWaw() {
        return timeToPlaceWaw;
    }

    public void setTimeToPlaceWaw(double timeToPlaceWaw) {
        this.timeToPlaceWaw = timeToPlaceWaw;
    }

    public double getTimeToPlaceKr() {
        return timeToPlaceKr;
    }

    public void setTimeToPlaceKr(double timeToPlaceKr) {
        this.timeToPlaceKr = timeToPlaceKr;
    }

    public double getTimeToPlaceGd() {
        return timeToPlaceGd;
    }

    public void setTimeToPlaceGd(double timeToPlaceGd) {
        this.timeToPlaceGd = timeToPlaceGd;
    }

    public double getTimeToPlaceSz() {
        return timeToPlaceSz;
    }

    public void setTimeToPlaceSz(double timeToPlaceSz) {
        this.timeToPlaceSz = timeToPlaceSz;
    }

    public double getTimeToPlacePoz() {
        return timeToPlacePoz;
    }

    public void setTimeToPlacePoz(double timeToPlacePoz) {
        this.timeToPlacePoz = timeToPlacePoz;
    }

    public double getTimeToSpendMin() {
        return timeToSpendMin;
    }

    public void setTimeToSpendMin(double timeToSpendMin) {
        this.timeToSpendMin = timeToSpendMin;
    }

    public double getTimeToSpendMax() {
        return timeToSpendMax;
    }

    public void setTimeToSpendMax(double timeToSpendMax) {
        this.timeToSpendMax = timeToSpendMax;
    }
}
