package tn.spring.springboot.entite;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.sql.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@FieldDefaults(level= AccessLevel.PRIVATE)
public class Equipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="idEquipe")
    int idDepart;
    @Column(name ="nomEquipe")
    String nomEquipe;
    @Column(name ="niveau")
    Niveau niveau;
    @ManyToMany(mappedBy="equipes", cascade = CascadeType.ALL)

    private Set<Etudiant> etudiants;
}
