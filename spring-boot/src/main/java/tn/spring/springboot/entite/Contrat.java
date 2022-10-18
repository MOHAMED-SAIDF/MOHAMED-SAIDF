package tn.spring.springboot.entite;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.sql.Date;
@Entity
@Getter
@Setter
@FieldDefaults(level= AccessLevel.PRIVATE)
public class Contrat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="idContrat")
    int idDepart;
    @Column(name ="dateDebutContrat")
    Date dateDebutContrat;
    @Column(name ="dateFinContrat")
    Date dateFinContrat;
    @Column(name ="specialite")
    Specialite specialite;
    @Column
    boolean archive;
    @ManyToOne
    Etudiant etudiant;

}
