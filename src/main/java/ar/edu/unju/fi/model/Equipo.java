/**
 * 
 */
package ar.edu.unju.fi.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Torrejon Cristian
 *
 */
@Component
public class Equipo {
	/*
	 *---------------------------------
	 *-------- atributos --------------
	 *---------------------------------
	 */
	
	/**
	 * Atributo que representa el nombre del Equipo
	 */
	private String nombre;
	/**
	 * Atributo que representa el estadio del Equipo
	 */
	private Estadio estadio;
	
	/*
	 *---------------------------------
	 *-------- constructores --------------
	 *---------------------------------
	 */
	
	/**
	 * Constructor por defecto
	 */
	public Equipo() {
		// TODO Auto-generated constructor stub
	}
	
	

	/**
	 * Contructor parametrizado
	 * @param estadio
	 */
	@Autowired
	public Equipo(Estadio estadio) {
		this.estadio = estadio;
	}



	/**
	 * Constructor parametrizado
	 * @param nombre valor del nombre del Equipo
	 * @param estadio valor del estadio del Equipo
	 */
	public Equipo(String nombre, Estadio estadio) {
		// asignacion del parametro nombre al atributo nombre
		this.nombre = nombre;
		// asignacion del parametro estadio al atributo estadio
		this.estadio = estadio;
	}

	/*
	 *---------------------------------
	 *-------- metodos accesores --------------
	 *---------------------------------
	 */

	/**
	 * retorna el nombre del Equipo
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * asigna un valor al nombre del Equipo
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * retorna el estadio del Equipo
	 * @return the estadio
	 */
	public Estadio getEstadio() {
		return estadio;
	}


	/**
	 * asigna un valor al estadio del Equipo
	 * @param estadio the estadio to set
	 */
	public void setEstadio(Estadio estadio) {
		this.estadio = estadio;
	}

	//Metodo que retorna una cadena de texto con los valores de los atributos
	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", estadio=" + estadio + "]";
	}
	
	
	

}
