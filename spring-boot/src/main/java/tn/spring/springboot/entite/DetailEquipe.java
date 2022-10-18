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
public class DetailEquipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="salle")
    int salle;
    @Column(name ="thematique")
    String thematique;

}
