package com.gamunax.springboot.backend.apirest.springbootbackendapirest.controllers;

import java.util.List;

import com.gamunax.springboot.backend.apirest.springbootbackendapirest.models.entity.Client;
import com.gamunax.springboot.backend.apirest.springbootbackendapirest.models.services.IClientService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ClientRestController {
  
  @Autowired
  private IClientService clientService;

  @GetMapping("/clients")
  public List<Client> index() {
    return clientService.findAll();
  }
}
