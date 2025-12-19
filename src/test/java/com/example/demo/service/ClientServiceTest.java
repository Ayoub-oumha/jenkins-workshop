package com.example.demo.service;

import com.example.demo.entity.Client;
import com.example.demo.repository.ClientRepository;
import com.example.demo.service.impl.ClientServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ClientServiceTest {

    @Mock
    private ClientRepository clientRepository;

    @InjectMocks
    private ClientServiceImpl clientService;

    @Test
    void testFindAll() {
        // use real entity instances instead of mocked entities
        Client client1 = new Client();
        Client client2 = new Client();
        List<Client> clients = Arrays.asList(client1, client2);
        
        when(clientRepository.findAll()).thenReturn(clients);

        List<Client> result = clientService.findAll();

        assertEquals(2, result.size());
        verify(clientRepository, times(1)).findAll();
    }
}