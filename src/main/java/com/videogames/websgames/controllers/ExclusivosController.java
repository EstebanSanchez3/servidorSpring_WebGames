package com.videogames.websgames.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.videogames.websgames.entities.ExclusivosEntities;
import com.videogames.websgames.services.IExclusivosService;



@Controller
public class ExclusivosController {
	
	@Autowired
	private IExclusivosService ExclusivosService;
	
	@RequestMapping (value = "/crearExclusivo")
	
	public ModelAndView crearNuevoExclusivo (
			
			//@RequestParam(required = true) Integer id,
			@RequestParam(required = false) String nombre,
			@RequestParam(required = false) Integer puntuacion,
			@RequestParam(required = false) Integer anio_estreno,
			@RequestParam(required = false) String estilo_juego,
			@RequestParam(required = false) String sinopsis,
			@RequestParam(required = false) Integer duracion,
			@RequestParam(required = false) String imagen,
			@RequestParam(required = false) String trailer,
			@RequestParam(required = false) Integer precio) {
		
		if(nombre !=null) {
			ExclusivosEntities a = new ExclusivosEntities (0,nombre, puntuacion, anio_estreno, estilo_juego, sinopsis, duracion, imagen, trailer, precio);
			
			ExclusivosService.addExclusivos(a);
			return new ModelAndView("redirect:/crearExclusivos") ;
		}
		List<ExclusivosEntities> exclusivos= ExclusivosService.findAll();
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("crear_exclusivo");
		mav.addObject("exclusivos", exclusivos) ;
		return mav ;
		}
	
}

