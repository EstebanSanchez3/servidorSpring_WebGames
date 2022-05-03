package com.videogames.websgames.services;

import java.util.List;

import com.videogames.websgames.entities.ExclusivosEntities;

public interface IExclusivosService {
	public void addExclusivos(ExclusivosEntities a);
	public List<ExclusivosEntities> findAll();

}
