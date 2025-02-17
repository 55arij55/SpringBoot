package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tp_foyer.Entity.Etudiant;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant,String> {
}
