package tn.esprit.tprevision.services;

import org.springframework.stereotype.Service;
import tn.esprit.tprevision.Entity.Etudiant;
import tn.esprit.tprevision.Generique.IGeneriqueService;
import tn.esprit.tprevision.Generique.IGeneriqueServiceImpl;

@Service
public class EtudiantServices extends IGeneriqueServiceImpl< Etudiant,Integer> implements IGeneriqueService<Etudiant, Integer> {
}