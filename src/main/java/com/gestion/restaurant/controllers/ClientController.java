package com.gestion.restaurant.controllers;


import com.gestion.restaurant.models.Client;
import com.gestion.restaurant.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class ClientController {
    @Autowired
    ClientService clientService;

    @RequestMapping("/createClient")
    public String createClient(){
        return "CreateClient";
    }
    @RequestMapping("/saveClient")
    public String savePClient(
            @ModelAttribute("client") Client client,
            @RequestParam("dateRes") String dateController,
            ModelMap modelMap
    ) throws ParseException {
        SimpleDateFormat dateFormat =new SimpleDateFormat("yyyy-MM-dd");
        Date dateCreation = dateFormat.parse(String.valueOf(dateController));
        client.setDateRes(dateCreation);

        Client memo = clientService.saveClient(client);
        String messageController = "The product whose Id : " +
                memo.getIdClient() + " is saved";
        modelMap.addAttribute("messageJsp", messageController);
        return "CreateClient";
    }

    @RequestMapping("/clientsList")
    public String clientsList(ModelMap modelMap){
        List<Client> clientsController = clientService.getAllClients();
        modelMap.addAttribute("clientJsp", clientsController);
        return "ClientsList";
    }

    @RequestMapping("/deleteClient")
    public String deleteClient(@RequestParam("id") Long id, ModelMap modelMap){
        clientService.deleteClientById(id);
    List<Client> clientsController = clientService.getAllClients();
    modelMap.addAttribute("clientJsp", clientsController);
    return "ClientsList";
    }

    @RequestMapping("/showClient")
    public String showClient(@RequestParam("id") Long id, ModelMap modelMap){
        Client clientsController = clientService.getClientById(id);
        modelMap.addAttribute("clientJsp", clientsController);
        return "EditClient";
    }
    @RequestMapping("/updateClient")
    public String updateClient(@ModelAttribute("client")Client client
    ) {
        Client memory = clientService.saveClient(client);
        return "ClientsList";
    }
}
