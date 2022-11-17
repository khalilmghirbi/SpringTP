package tn.esprit.tprevision.services;

import org.springframework.stereotype.Service;
import tn.esprit.tprevision.Entity.Etudiant;
import tn.esprit.tprevision.Entity.Produit;
import tn.esprit.tprevision.Generique.IGeneriqueServiceImpl;
@Service
public class ProduitServices extends IGeneriqueServiceImpl<Produit,Long> implements IProduitServices{
}
