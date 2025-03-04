package tn.esprit.tp_foyer.Entity;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Bloc {
    @Id
    private String idBloc;
    private String nomBloc;
    private long capaciteBloc;

    @ManyToOne
    Foyer foyer;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "bloc")
    private Set<Chambre> chambres;

    public String getIdBloc() {
        return idBloc;
    }

    public void setIdBloc(String idBloc) {
        this.idBloc = idBloc;
    }

    public String getNomBloc() {
        return nomBloc;
    }

    public void setNomBloc(String nomBloc) {
        this.nomBloc = nomBloc;
    }

    public long getCapaciteBloc() {
        return capaciteBloc;
    }

    public void setCapaciteBloc(long capaciteBloc) {
        this.capaciteBloc = capaciteBloc;
    }

    public Foyer getFoyer() {
        return foyer;
    }

    public void setFoyer(Foyer foyer) {
        this.foyer = foyer;
    }

    public Set<Chambre> getChambres() {
        return chambres;
    }

    public void setChambres(Set<Chambre> chambres) {
        this.chambres = chambres;
    }
}
