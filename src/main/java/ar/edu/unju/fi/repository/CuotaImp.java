package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Torrejon3305Tp5Application;
import ar.edu.unju.fi.model.Cuota;

@Repository("cuotaImp")
public class CuotaImp implements ICuota {
	
	@Autowired
	private Cuota cuota;
	
	public static Logger LOG= LoggerFactory.getLogger(Torrejon3305Tp5Application.class);

	@Override
	public void guardar() {
		LOG.info("La cuota fue guardada"+cuota.getId()+" "+cuota.getMonto());

	}

	@Override
	public Cuota mostrar() {
		LOG.info("Mostrar los datos de la cuota");
		return cuota;
	}

	@Override
	public void eliminar() {
		LOG.info("Eliminar los datos de la cuota de la BD");

	}

	@Override
	public Cuota modificar() {
		LOG.info("Modificar los datos de la cuota de la BD");
		return cuota;
	}

}
