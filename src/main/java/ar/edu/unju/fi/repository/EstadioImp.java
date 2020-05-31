package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Torrejon3305Tp5Application;
import ar.edu.unju.fi.model.Estadio;

@Repository("estadioImp")
public class EstadioImp implements IEstadio {
	@Autowired
	private Estadio estadio;
	
	public static Logger LOG= LoggerFactory.getLogger(Torrejon3305Tp5Application.class);

	@Override
	public void guardar() {
		LOG.info("El estadio fue guardado"+estadio.getNombre());

	}

	@Override
	public Estadio mostrar() {
		LOG.info("Mostrar los datos del estadio");
		return estadio;
	}

	@Override
	public void eliminar() {
		LOG.info("Se elimino el estadio de la BD");
	}

	@Override
	public Estadio modificar() {
		LOG.info("Se modifico el estadio de la BD");
		return estadio;
	}

}
