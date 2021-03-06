package com.gamunax.springboot.backend.apirest.springbootbackendapirest.models.services;

import java.util.List;

import com.gamunax.springboot.backend.apirest.springbootbackendapirest.models.entity.Client;

public interface IClientService {
  public List<Client> findAll();
  public Client findById(Long id);
  public Client save(Client client);
  public void delete(Long id);
}
