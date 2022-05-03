package com.videogames.websgames.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.videogames.websgames.entities.ExclusivosEntities;
import com.videogames.websgames.services.IExclusivosService;

//SE GENERA CONTROLLER
  @Controller
  public class ExclusivosController {
	
//AUTOWIRED INYECTA DEPENDENCIAS DE SERVICES
  @Autowired
  private IExclusivosService ExclusivosService;
	
//HREF EN HTML
  @RequestMapping (value = "/crearExclusivos")
	
//MODELANDVIEW LOS DATOS INTRODUCIDOS SE MUESTRAN EN PANTALLA
  public ModelAndView crearNuevoExclusivos (
			
//REQUESTPARAM DATOS QUE SE VERÁN EN PANTALLA E INTERACTUARÁN↓↓ 
//↑↑CON MODELANDVIEW (/CREAREXCLUSIVOS)
//REQUIRED=FALSE NO OBLIGATORIO O OBLIGATORIO
//EL PRIMER DATO NO SE PONE QUE SERÍA ID
//SE PONE "0" EN ID POR QUE ES AUTOINCREMENTAL
  @RequestParam(required = false) String nombre,
  @RequestParam(required = false) String puntuacion,
  @RequestParam(required = false) Integer anio_estreno,
  @RequestParam(required = false) String estilo_juego,
  @RequestParam(required = false) String sinopsis,
  @RequestParam(required = false) String duracion,
  @RequestParam(required = false) String imagen,
  @RequestParam(required = false) String trailer,
  @RequestParam(required = false) String precio) {
		
//CREAS EXCLUSIVO
//NOMBRE !=NULL ES QUE NOMBRE NO PUEDE IR VACÍO
  if(nombre !=null) {
    ExclusivosEntities a = new ExclusivosEntities (0, nombre, puntuacion, anio_estreno, estilo_juego, sinopsis, duracion, imagen, trailer, precio);
	
//
  ExclusivosService.addExclusivos(a);
    return new ModelAndView("redirect:/crearExclusivos") ;
 }
  List<ExclusivosEntities> exclusivos= ExclusivosService.findAll();
     ModelAndView mav = new ModelAndView();
	
//MAV.SETVIEWNAME (NOMBRE DEL HTML)
//MAV.ADDOBJECT (1ºNOMBRE DE TABLA DE LA BBDD) (2ºJSON)
  mav.setViewName("crear_exclusivo");
  mav.addObject("exclusivos_ps4", exclusivos) ;
    return mav ;
 }	
}

