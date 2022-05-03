package com.videogames.websgames.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.videogames.websgames.entities.ExclusivosEntities;
import com.videogames.websgames.repositories.IExclusivosRepository;

//GENERAR SERVICE
//IMPLEMENTS SOBRE IEXCLUSIVOSSERVICE
  @Service
  public class ExclusivosServicelmpl implements IExclusivosService {

//AUTOWAIRED INYECTA DEPENDENCIAS A REPOSITORY
//IPORTAR REPOSITORY
//REPO ES ABREBIATURA
  @Autowired
  IExclusivosRepository repo ;

//OVERRIDE SOBRESCRIBE UN METODO
//REPO ES ABREBIATURA
  @Override
  public void addExclusivos(ExclusivosEntities a) {
	repo.save(a) ;
}
 
//OVERRIDE SOBRESCRIBE UN METODO
//OVERRIDE LIST
  @Override
  public List <ExclusivosEntities> findAll() {
	return repo.findAll();
  }
}
//PRIMERAS LINEAS DE OVERRIDE (LOS DOS) EN IEXCLUSIVOSSERVICES
