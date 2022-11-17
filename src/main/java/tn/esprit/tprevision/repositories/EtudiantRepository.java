package tn.esprit.tprevision.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tprevision.Entity.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant,Integer> {



}
