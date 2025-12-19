package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Data
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nom;
    private String prenom;
    private String adresse;
    
    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL )
    @JsonIgnore
    private List<Commande> commandes;
}
