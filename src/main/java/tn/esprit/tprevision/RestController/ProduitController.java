package tn.esprit.tprevision.RestController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.tprevision.Entity.Etudiant;
import tn.esprit.tprevision.Entity.Produit;
import tn.esprit.tprevision.Generique.RestControllerGenerique;

@RestController
@RequestMapping("/produit")
public class ProduitController extends RestControllerGenerique<Produit,Long> {
}
