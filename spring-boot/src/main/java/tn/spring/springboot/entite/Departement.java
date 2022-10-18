package tn.spring.springboot.entite;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
@Getter
@Setter
@Entity
@FieldDefaults(level= AccessLevel.PRIVATE)
public class Departement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="idDepart")
    int idDepart;
    @Column(name ="nomDepart")
    String nomDepart;

}
