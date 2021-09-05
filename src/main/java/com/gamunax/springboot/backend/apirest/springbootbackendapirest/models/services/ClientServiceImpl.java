package com.gamunax.springboot.backend.apirest.springbootbackendapirest.models.services;

import java.util.List;

import com.gamunax.springboot.backend.apirest.springbootbackendapirest.models.dao.IClientDao;
import com.gamunax.springboot.backend.apirest.springbootbackendapirest.models.entity.Client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements IClientService {

  @Autowired
  private IClientDao clientDao;

  @Override
  public List<Client> findAll() {
    // TODO Auto-generated method stub
    return (List<Client>) clientDao.findAll();
  }
  
}
