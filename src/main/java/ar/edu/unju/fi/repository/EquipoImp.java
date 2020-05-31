package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Torrejon3305Tp5Application;
import ar.edu.unju.fi.model.Equipo;

@Repository("equipoImp")
public class EquipoImp implements IEquipo {
	
	@Autowired
	private Equipo equipo;
	
	public static Logger LOG= LoggerFactory.getLogger(Torrejon3305Tp5Application.class);

	@Override
	public void guardar() {
		LOG.info("El equipo fue guardado"+equipo.getNombre());

	}

	@Override
	public Equipo mostrar() {
		LOG.info("Mostrar los datos del equipo");
		return equipo;
	}

	@Override
	public void eliminar() {
		LOG.info("Se elimino el equipo de la BD");
	}

	@Override
	public Equipo modificar() {
		LOG.info("Se modifico el equipo de la BD");
		return equipo;
	}

}
