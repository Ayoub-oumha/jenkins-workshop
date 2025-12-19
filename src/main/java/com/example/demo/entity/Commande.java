package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String produit;
    private Integer quantite;
    private Double prix;
    private Double totalHt;
    private Double tva;
    private Double totalTtc;
    
    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;
}
