package tn.esprit.tp_foyer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tp_foyer.Entity.Universite;

@Repository
public interface UniversiteRepostory extends JpaRepository<Universite, Long> {
}
