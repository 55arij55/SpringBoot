package tn.esprit.tp_foyer.Entity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Universite {
    @Id
    private long idUniversite;
    private String nomUniversite;
    private String adresse;

    @ToString.Exclude
    @OneToOne
    private Foyer foyer;
}
