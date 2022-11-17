package tn.esprit.tprevision.RestController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.tprevision.Entity.Etudiant;
import tn.esprit.tprevision.Entity.Facture;
import tn.esprit.tprevision.Generique.RestControllerGenerique;

@RestController
@RequestMapping("/facture")
public class FactureController extends RestControllerGenerique<Facture,Long> {
}
