package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Torrejon3305Tp5Application;
import ar.edu.unju.fi.model.Noticia;

@Repository("noticiaImp")
public class NoticiaImp implements INoticia {
	
	@Autowired
	private Noticia noticia;
	
	public static Logger LOG= LoggerFactory.getLogger(Torrejon3305Tp5Application.class);

	@Override
	public void guardar() {
		LOG.info("La noticia fue guardada"+noticia.getFecha()+","+noticia.getTitulo()+","+noticia.getResumen());

	}

	@Override
	public Noticia mostrar() {
		LOG.info("Mostrar los datos de la noticia");
		return noticia;
	}

	@Override
	public void eliminar() {
		
		LOG.info("Se elimino la noticia de la BD");
	}

	@Override
	public Noticia modificar() {
		LOG.info("Se modifico la noticia de la BD");
		return noticia;
	}

}
