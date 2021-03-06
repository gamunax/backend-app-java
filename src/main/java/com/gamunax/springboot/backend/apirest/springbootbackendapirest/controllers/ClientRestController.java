package com.gamunax.springboot.backend.apirest.springbootbackendapirest.controllers;

import java.util.List;

import com.gamunax.springboot.backend.apirest.springbootbackendapirest.models.entity.Client;
import com.gamunax.springboot.backend.apirest.springbootbackendapirest.models.services.IClientService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class ClientRestController {

  @Autowired
  private IClientService clientService;

  @GetMapping("/clients")
  private List<Client> index() {
    return clientService.findAll();
  }

  @GetMapping("/clients/{id}")
  private Client show(@PathVariable Long id) {
    return clientService.findById(id);
  }

  @PostMapping("/clients")
  @ResponseStatus(HttpStatus.CREATED)
  private Client create(@RequestBody Client client) {
    return clientService.save(client);
  }
  
  @PutMapping("/clients/{id}")
  @ResponseStatus(HttpStatus.CREATED)
  private Client update(@RequestBody Client client, @PathVariable Long id) {
    Client currentClient = clientService.findById(id);

    currentClient.setLastName(client.getLastName());
    currentClient.setName(client.getName());
    currentClient.setEmail(client.getEmail());

    return clientService.save(currentClient);
  }

  @DeleteMapping("clients/{id}")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  private void delete(@PathVariable Long id) {
    clientService.delete(id);
  }

}
