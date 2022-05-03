package com.videogames.websgames.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.videogames.websgames.entities.ExclusivosEntities;
import com.videogames.websgames.repositories.IExclusivosRepository;

@Service
public class ExclusivosServicelmpl implements IExclusivosService {
@Autowired
IExclusivosRepository repo ;

@Override
public void addExclusivos(ExclusivosEntities a) {
	repo.save(a) ;
}
@Override
public List <ExclusivosEntities> findAll() {
	return repo.findAll();
}
}
