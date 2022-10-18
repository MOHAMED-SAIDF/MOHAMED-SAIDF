package tn.spring.springboot.entite;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Entity
@Getter
@Setter
@FieldDefaults(level= AccessLevel.PRIVATE)
    public class Etudiant {

        @Id
        @GeneratedValue (strategy = GenerationType.IDENTITY)
        @Column(name ="idEtudiant")
        int idEtudiant;
        @Column(name ="prenomE")
        String prenomE;
        @Column(name ="nomE")
        String nomE;
        @Enumerated(EnumType.STRING)
        Option option;
    }


