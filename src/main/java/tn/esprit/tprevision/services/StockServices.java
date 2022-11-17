package tn.esprit.tprevision.services;

import org.springframework.stereotype.Service;
import tn.esprit.tprevision.Entity.Etudiant;
import tn.esprit.tprevision.Entity.Stock;
import tn.esprit.tprevision.Generique.IGeneriqueServiceImpl;
@Service
public class StockServices extends IGeneriqueServiceImpl<Stock,Long> implements IStockServices{
}
