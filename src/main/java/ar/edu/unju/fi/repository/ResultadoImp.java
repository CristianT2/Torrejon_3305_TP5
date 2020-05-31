package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Torrejon3305Tp5Application;
import ar.edu.unju.fi.model.Resultado;

@Repository("resultadoImp")
public class ResultadoImp implements IResultado {
	
	@Autowired
	private Resultado resultado;
	
	public static Logger LOG= LoggerFactory.getLogger(Torrejon3305Tp5Application.class);

	@Override
	public void guardar() {
		LOG.info("El resultado fue guardada"+resultado.getEquipo1()+" "+resultado.getGolesEquipo1()+" - "+resultado.getGolesEquipo2()+" "+resultado.getEquipo2());
	}

	@Override
	public Resultado mostrar() {
		LOG.info("Mostrar los datos del resultado");
		return resultado;
	}

	@Override
	public void eliminar() {
		LOG.info("Eliminar los datos del resultado");

	}

	@Override
	public Resultado modificar() {
		LOG.info("Modificar los datos del resultado");
		return resultado;
	}

}
