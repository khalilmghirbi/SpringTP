package tn.esprit.tprevision.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tprevision.Entity.Facture;

public interface FactureRepository extends JpaRepository<Facture,Long> {
}
