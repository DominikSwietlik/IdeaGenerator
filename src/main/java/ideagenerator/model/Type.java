package ideagenerator.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "type")
public class Type {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "type")
    private Set<PlacesToVisit> placesToVisit;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Set<PlacesToVisit> getPlacesToVisit() {
        return placesToVisit;
    }

    public void setPlacesToVisit(Set<PlacesToVisit> placesToVisit) {
        this.placesToVisit = placesToVisit;
    }
    @Override
    public String toString() {
        return name;
    }
}
