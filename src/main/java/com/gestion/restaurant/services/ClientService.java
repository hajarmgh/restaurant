package com.gestion.restaurant.services;


import com.gestion.restaurant.models.Client;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClientService {
    Client saveClient(Client client);
    Client updateClient(Client client);
    Client getClientById(Long idClient);
    List<Client> getAllClients();
    void deleteClientById(Long id);
    void deleteAllClients();
}
