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

public class Reservation {
    @Id
    @GeneratedValue
    private String idReservation;
    private Date anneeUniversitaire;
    private boolean estValide;

    // Relation ManyToOne avec Chambre (chambre_reservation)
    @ManyToOne
    @JoinTable(
            name = "chambre_reservation",
            joinColumns = @JoinColumn(name = "reservation_id"),
            inverseJoinColumns = @JoinColumn(name = "chambre_id")
    )
    private Chambre chambre;

    // Relation ManyToMany avec Etudiant (reservation_etudiants)
    @ManyToMany
    @JoinTable(
            name = "reservation_etudiants",
            joinColumns = @JoinColumn(name = "reservation_id"),
            inverseJoinColumns = @JoinColumn(name = "etudiant_id")
    )
    private Set<Etudiant> etudiants;
}
