package com.gamunax.springboot.backend.apirest.springbootbackendapirest.models.services;

import java.util.List;

import com.gamunax.springboot.backend.apirest.springbootbackendapirest.models.dao.IClientDao;
import com.gamunax.springboot.backend.apirest.springbootbackendapirest.models.entity.Client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClientServiceImpl implements IClientService {

  @Autowired
  private IClientDao clientDao;

  @Override
  @Transactional(readOnly = true)
  public List<Client> findAll() {
    return (List<Client>) clientDao.findAll();
  }

  @Override
  @Transactional(readOnly = true)
  public Client findById(Long id) {
    return clientDao.findById(id).orElse(null);
  }

  @Override
  @Transactional
  public Client save(Client client) {
    return clientDao.save(client);
  }

  @Override
  @Transactional
  public void delete(Long id) {
    clientDao.deleteById(id);
  }
  
}
