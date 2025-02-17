package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tp_foyer.Entity.Reservation;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation,String> {
}
