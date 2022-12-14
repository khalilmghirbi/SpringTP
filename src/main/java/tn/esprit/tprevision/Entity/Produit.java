package tn.esprit.tprevision.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Produit implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idProduit;
    private String codeProduit;
    private String libelleProduit;
    private float prixUnitaire;
    @ManyToOne
    Rayon rayon;

    @ManyToMany
    List<Fournisseur>fournisseurs;

    @ManyToOne
    Stock stock;
    @OneToOne(mappedBy = "produit")
    DetailProduit detailProduit;

    @OneToMany(mappedBy = "leproduit")
    List<DetailFacture>detailFactures;
}
