/**
 * 
 */
package ar.edu.unju.fi.model;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Torrejon Cristian
 *
 */
@Component
public class Resultado {
	/*
	 *---------------------------------
	 *-------- atributos --------------
	 *---------------------------------
	 */
	
	/**
	 * Atributo que representa la fecha de Resultado
	 */
	private LocalDate fecha;
	/**
	 * Atributo que representa el equipo1 de Resultado
	 */
	@Autowired
	private Equipo equipo1;
	/**
	 * Atributo que representa el equipo2 de Resultado
	 */
	@Autowired
	private Equipo equipo2;
	/**
	 * Atributo que representa los goles del equipo1 de Resultado
	 */
	private int golesEquipo1;
	/**
	 * Atributo que representa los goles del equipo2  de Resultado
	 */
	private int golesEquipo2;
	
	/*
	 *---------------------------------
	 *-------- constructores --------------
	 *---------------------------------
	 */
	/**
	 * Constructor por defecto
	 */
	public Resultado() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor parametrizado
	 * @param fecha valor de la fecha de Resultado
	 * @param equipo1 valor del equipo1 de Resultado
	 * @param equipo2 valor del equipo2 de Resultado
	 * @param golesEquipo1 valor de los goles de equipo1 de Resultado
	 * @param golesEquipo2 valor de los goles de equipo2 de Resultado
	 */
	public Resultado(LocalDate fecha, Equipo equipo1, Equipo equipo2, int golesEquipo1, int golesEquipo2) {
		// asignacion del parametro fecha al atributo fecha
		this.fecha = fecha;
		// asignacion del parametro equipo1 al atributo equipo1
		this.equipo1 = equipo1;
		// asignacion del parametro equipo2 al atributo equipo2
		this.equipo2 = equipo2;
		// asignacion del parametro golesEquipo1 al atributo golesEquipo1
		this.golesEquipo1 = golesEquipo1;
		// asignacion del parametro golesEquipo2 al atributo golesEquipo2
		this.golesEquipo2 = golesEquipo2;
	}
	
	/*
	 *---------------------------------
	 *-------- metodos accesores --------------
	 *---------------------------------
	 */

	/**
	 * retorna la fecha de Resultado
	 * @return the fecha
	 */
	public LocalDate getFecha() {
		return fecha;
	}
	
	/**
	 * asigna un valor a la fecha de Resultado 
	 * @param fecha the fecha to set
	 */
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	/**
	 * Retorna el equipo1 de Resultado
	 * @return the equipo1
	 */
	public Equipo getEquipo1() {
		return equipo1;
	}

	/**
	 * asigna un valor a equipo1 de Resultado
	 * @param equipo1 the equipo1 to set
	 */
	public void setEquipo1(Equipo equipo1) {
		this.equipo1 = equipo1;
	}

	/**
	 * Retorna el equipo2 de Resultado
	 * @return the equipo2
	 */
	public Equipo getEquipo2() {
		return equipo2;
	}

	/**
	 * asigna un valor a equipo2 de Resultado
	 * @param equipo2 the equipo2 to set
	 */
	public void setEquipo2(Equipo equipo2) {
		this.equipo2 = equipo2;
	}

	/**
	 * Retorna el golesEquipo1 de Resultado
	 * @return the golesEquipo1
	 */
	public int getGolesEquipo1() {
		return golesEquipo1;
	}

	/**
	 * asigna un valor a goleEquipo1 de Resultado
	 * @param golesEquipo1 the golesEquipo1 to set
	 */
	public void setGolesEquipo1(int golesEquipo1) {
		this.golesEquipo1 = golesEquipo1;
	}

	/**
	 * Retorna el golesEquipo2 de Resultado
	 * @return the golesEquipo2
	 */
	public int getGolesEquipo2() {
		return golesEquipo2;
	}

	/**
	 * asigna un valor a goleEquipo2 de Resultado
	 * @param golesEquipo2 the golesEquipo2 to set
	 */
	public void setGolesEquipo2(int golesEquipo2) {
		this.golesEquipo2 = golesEquipo2;
	}

	//Metodo que retorna una cadena de texto con los valores de los atributos
	@Override
	public String toString() {
		return "Resultado [fecha=" + fecha + ", equipo1=" + equipo1 + ", equipo2=" + equipo2 + ", golesEquipo1="
				+ golesEquipo1 + ", golesEquipo2=" + golesEquipo2 + "]";
	}
	
	
	
	
	
}
