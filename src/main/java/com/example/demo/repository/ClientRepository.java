package com.example.demo.repository;

import com.example.demo.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

    List<Client> findByNom(String nom);
    List<Client> findByNomAndPrenom(String nom , String prenom) ;
    List<Client> findByNomOrPrenom(String nom , String prenom) ;
}
