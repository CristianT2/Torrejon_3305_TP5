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
public class Estadio {
	/*
	 *---------------------------------
	 *-------- atributos --------------
	 *---------------------------------
	 */
	
	/**
	 * Atributo que representa el nombre del estadio
	 */
	private String nombre;
	/**
	 * Atributo que representa la fecha de fundacion del estadio
	 */
	private LocalDate fechaFundacion;
	/**
	 * Atributo que representa la ciudad donde esta el estadio
	 */
	private String ciudad;
	/**
	 * Atributo que representa la capacidad del estadio
	 */
	private int capacidad;
	/**
	 * Atributo que representa la direccion del estadio
	 */
	private String direccion;
	
	/*
	 *---------------------------------
	 *-------- constructores --------------
	 *---------------------------------
	 */
	
	/**
	 * Constructor por defecto
	 */
	public Estadio() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor parametrizado
	 * @param nombre valor del nombre del estadio
	 * @param fechaFundacion valor de la fecha de fundacion del estadio
	 * @param ciudad valor de la ciudad en donde se encuentra el estadio
	 * @param capacidad valor de la capaciadad del estadio
	 * @param direccion vallor de la direccion del estadio
	 */
	public Estadio(String nombre, LocalDate fechaFundacion, String ciudad, int capacidad, String direccion) {
		// asignacion del parametro nombre al atributo nombre
		this.nombre = nombre;
		// asignacion del parametro fechaFundacion al atributo fechaFundacion
		this.fechaFundacion = fechaFundacion;
		// asignacion del parametro ciudad al atributo ciudad
		this.ciudad = ciudad;
		// asignacion del parametro capacidad al atributo capacidad
		this.capacidad = capacidad;
		// asignacion del parametro direccion al atributo direcion
		this.direccion = direccion;
	}
	
	/*
	 *---------------------------------
	 *-------- metodos accesores --------------
	 *---------------------------------
	 */

	/**
	 * retorna el nombre del estadio
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Asigna un valor al nombre del estadio
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * retorna la fecha de fundacion del estadio
	 * @return the fechaFundacion
	 */
	public LocalDate getFechaFundacion() {
		return fechaFundacion;
	}

	/**
	 * Asigna un valor a la fecha de fundacion del estadio
	 * @param fechaFundacion the fechaFundacion to set
	 */
	public void setFechaFundacion(LocalDate fechaFundacion) {
		this.fechaFundacion = fechaFundacion;
	}

	/**
	 * retorna la ciudad donde esta el estadio
	 * @return the ciudad
	 */
	public String getCiudad() {
		return ciudad;
	}

	/**
	 * Asigna un valor a la ciudad donde esta ubicado el estadio
	 * @param ciudad the ciudad to set
	 */
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	/**
	 * retorna la capcidad del estadio
	 * @return the capacidad
	 */
	public int getCapacidad() {
		return capacidad;
	}

	/**
	 * Asigna un valor al la capacidad del estadio
	 * @param capacidad the capacidad to set
	 */
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	/**
	 * retorna la direccion del estadio
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * Asigna un valor al la direccion del estadio
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	//Metodo que retorna una cadena de texto con los valores de los atributos
	@Override
	public String toString() {
		return "Estadio [nombre=" + nombre + ", fechaFundacion=" + fechaFundacion + ", ciudad=" + ciudad
				+ ", capacidad=" + capacidad + ", direccion=" + direccion + "]";
	}
	
	
	
	
	
	
}
