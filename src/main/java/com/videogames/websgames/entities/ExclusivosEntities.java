package com.videogames.websgames.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//GENERAR ENTITY
//NAME DE TABLA EN BBDD
  @Entity(name="exclusivos_ps4")
  public class ExclusivosEntities {

//GENERAR ID+GENERATEDVALUE PARA PK Y AUTOINCREMENTAL
//LO MISMO DICE EL PARENTESIS 
//CREAR VALORES
//MISMO NOMBRE QUE EN BBDD
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id ;
	private String nombre ;
	private String puntuacion ;
	private int anio_estreno ;
	private String estilo_juego ;
	private String sinopsis ;
	private String duracion ;
	private String imagen ;
	private String trailer ;
	private String precio ;

//CONSTRUCTOR VACÍO
	public ExclusivosEntities() {
	}
	
//CONSTRUCTOR CON TODOS
	public ExclusivosEntities(int id, String nombre, String puntuacion, int anio_estreno, String estilo_juego,
			String sinopsis, String duracion, String imagen, String trailer, String precio) {
		this.id = id;
		this.nombre = nombre;
		this.puntuacion = puntuacion;
		this.anio_estreno = anio_estreno;
		this.estilo_juego = estilo_juego;
		this.sinopsis = sinopsis;
		this.duracion = duracion;
		this.imagen = imagen;
		this.trailer = trailer;
		this.precio = precio;
	}
	
	
//GETTERS AND SETTERS
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPuntuacion() {
		return puntuacion;
	}
	public void setPuntuacion(String puntuacion) {
		this.puntuacion = puntuacion;
	}
	public int getAnio_estreno() {
		return anio_estreno;
	}
	public void setAnio_estreno(int anio_estreno) {
		this.anio_estreno = anio_estreno;
	}
	public String getEstilo_juego() {
		return estilo_juego;
	}
	public void setEstilo_juego(String estilo_juego) {
		this.estilo_juego = estilo_juego;
	}
	public String getSinopsis() {
		return sinopsis;
	}
	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}
	public String getDuracion() {
		return duracion;
	}
	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public String getTrailer() {
		return trailer;
	}
	public void setTrailer(String trailer) {
		this.trailer = trailer;
	}
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
}
