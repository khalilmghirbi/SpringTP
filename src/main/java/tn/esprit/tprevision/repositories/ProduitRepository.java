package tn.esprit.tprevision.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tprevision.Entity.Etudiant;
import tn.esprit.tprevision.Entity.Produit;

public interface ProduitRepository extends JpaRepository<Produit,Long> {
}
