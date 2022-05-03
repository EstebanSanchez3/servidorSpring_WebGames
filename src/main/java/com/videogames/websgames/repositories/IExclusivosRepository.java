package com.videogames.websgames.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.videogames.websgames.entities.ExclusivosEntities;

//EXTENDS EN FORMA (JPA) EL REPOSITORIO
//JPA AYUDA AL PROYECTO EN CASI TODX
//INTEGER INDICA CLAVE PRIMARIA ES ENTERO
public interface IExclusivosRepository extends JpaRepository <ExclusivosEntities, Integer> {
//ESTE REPOSITORIO HACE METODOS DE INSERCIÓN, BORRADO, ACTUALIZACIÓN, BUSQUEDA POR CLAVE↓↓
//↑↑PRIMARIA, BUSQUEDA DE TODOS LOS REGISTROS.
}
