package tn.esprit.tprevision.RestController;

import org.springframework.web.bind.annotation.*;
import tn.esprit.tprevision.Entity.Etudiant;
import tn.esprit.tprevision.Generique.RestControllerGenerique;

@RestController
@RequestMapping("/etudiant")
public class EtudiantController extends RestControllerGenerique<Etudiant,Integer> {

}