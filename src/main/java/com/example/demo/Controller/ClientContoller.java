package com.example.demo.Controller;

import com.example.demo.entity.Client;
import com.example.demo.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/clients")
public class ClientContoller {
    
    @Autowired
    private ClientService clientService;
    
    @GetMapping
    public ResponseEntity<List<Client>>  getAllClients() {
        return ResponseEntity.ok().body(clientService.findAll());
    }
    @GetMapping("/getByname/{name}")
    public  ResponseEntity<List<Client>> getByName(@PathVariable String name) {
        return ResponseEntity.ok().body(clientService.findByName(name)) ;
    }
    @GetMapping("/getByname/{name}/{prenom}")
    public  ResponseEntity<List<Client>> getByName(@PathVariable String name , @PathVariable String prenom) {
        return ResponseEntity.ok().body(clientService.rechercherParNomEtPrenome(name , prenom)) ;
    }
}
