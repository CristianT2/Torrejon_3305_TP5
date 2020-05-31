/**
 * 
 */
package ar.edu.unju.fi.model;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

/**
 * @author Torrejon Cristian
 *
 */
@Component
public class Noticia {
	/*
	 *---------------------------------
	 *-------- atributos --------------
	 *---------------------------------
	 */
	
	/**
	 * Atributo que representa la fecha de Noticia
	 */
	private LocalDate fecha;
	/**
	 * Atributo que representa el titulo de Noticia
	 */
	private String titulo;
	/**
	 * Atributo que representa el resumen de Noticia
	 */
	private String resumen;
	
	/*
	 *---------------------------------
	 *-------- constructores --------------
	 *---------------------------------
	 */
	
	/**
	 * Constructor por defecto
	 */
	
	public Noticia() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor parametrizado
	 * @param fecha valor de la fecha de Noticia
	 * @param titulo valor del titulo de Noticia
	 * @param resumen valor del resumen de Noticia
	 */
	public Noticia(LocalDate fecha, String titulo, String resumen) {
		// asignacion del parametro fecha al atributo fecha
		this.fecha = fecha;
		// asignacion del parametro titulo al atributo titulo
		this.titulo = titulo;
		// asignacion del parametro resumen al atributo resumen
		this.resumen = resumen;
	}
	
	/*
	 *---------------------------------
	 *-------- metodos accesores --------------
	 *---------------------------------
	 */

	/**
	 * retorna la fecha de Noticia
	 * @return the fecha
	 */
	public LocalDate getFecha() {
		return fecha;
	}

	/**
	 * asigna un valor a la fecha de Noticia
	 * @param fecha the fecha to set
	 */
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	/**
	 * retorna el titulo de Noticia
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * asigna un valor al titulo de Noticia
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * retorna el resumen de Noticia
	 * @return the resumen
	 */
	public String getResumen() {
		return resumen;
	}

	/**
	 * asigna un valor a resumen de Noticia
	 * @param resumen the resumen to set
	 */
	public void setResumen(String resumen) {
		this.resumen = resumen;
	}

	//Metodo que retorna una cadena de texto con los valores de los atributos
	@Override
	public String toString() {
		return "Noticia [fecha=" + fecha + ", titulo=" + titulo + ", resumen=" + resumen + "]";
	}
	
	
	
	
}
