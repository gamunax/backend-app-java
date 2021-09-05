package com.gamunax.springboot.backend.apirest.springbootbackendapirest.models.dao;

import com.gamunax.springboot.backend.apirest.springbootbackendapirest.models.entity.Client;

import org.springframework.data.repository.CrudRepository;

public interface IClientDao extends CrudRepository<Client, Long > {
  
}
