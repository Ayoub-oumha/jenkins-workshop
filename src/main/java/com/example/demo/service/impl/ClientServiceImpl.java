package com.example.demo.service.impl;

import com.example.demo.entity.Client;
import com.example.demo.repository.ClientRepository;
import com.example.demo.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public List<Client> findAll() {
        return clientRepository.findAll();
    }

    @Override
    public List<Client> findByName(String name) {
        return clientRepository.findByNom(name);
    }

    @Override
    public List<Client> rechercherParNomEtPrenome(String nom, String prenom) {
        return clientRepository.findByNomAndPrenom(nom , prenom);
    }


}