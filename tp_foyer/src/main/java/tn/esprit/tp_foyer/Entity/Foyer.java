package tn.esprit.tp_foyer.Entity;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Foyer {
    @Id
    private long idFoyer;
    private String nomFoyer;
    private long capaciteFoyer;

    @OneToOne(mappedBy = "foyer") // Change from "Universite" to "foyer"
    private Universite universite;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "foyer")
    private Set<Bloc> blocs; // Consider renaming 'Bloc' to 'blocs' for clarity
}
