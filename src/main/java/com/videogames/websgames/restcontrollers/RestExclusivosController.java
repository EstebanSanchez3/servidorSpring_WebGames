package com.videogames.websgames.restcontrollers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.videogames.websgames.entities.ExclusivosEntities;
import com.videogames.websgames.services.IExclusivosService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class RestExclusivosController {
	@Autowired
	IExclusivosService ExclusivosService ;
	@GetMapping(path="/exclusivos", produces=
		{MediaType.APPLICATION_JSON_VALUE})
	List<ExclusivosEntities> getexclusivos(){
		return ExclusivosService.findAll();

}
}
