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
public class Etudiant implements Serializable {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEtudiant;
    private String prenomE;
    private String nomE;
    @Enumerated(EnumType.STRING)
    private Option option;

    //relation entre Etudiant et Contrat
    //@OneToMany(mappedBy = "etudiants")
   // List<Contrat>contrats;
    //relation entre Etudiant et Contrat


    //relation entre Etudiant et Equipe
    //@ManyToMany
    //List<Equipe>equipes;
    //relation entre Etudiant et Equipe
}
