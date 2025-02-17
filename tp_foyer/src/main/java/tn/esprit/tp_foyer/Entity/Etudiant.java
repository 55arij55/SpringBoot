package tn.esprit.tp_foyer.Entity;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Etudiant {
    @Id
    private String idEtudiant;
    private String nomET;
    private String cin;
    private String ecole;
    private Date dateNaissance;

    @ManyToMany(mappedBy = "etudiants", cascade = CascadeType.ALL)
    private Set<Reservation> reservationSet;

}
