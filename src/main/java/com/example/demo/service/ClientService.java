package com.example.demo.service;

import com.example.demo.entity.Client;
import java.util.List;

public interface ClientService {
    List<Client> findAll();
    List<Client> findByName(String name) ;
    List<Client> rechercherParNomEtPrenome(String nom , String prenom);
}