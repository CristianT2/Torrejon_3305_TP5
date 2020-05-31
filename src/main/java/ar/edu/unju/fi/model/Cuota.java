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
public class Cuota {
	/*
	 *---------------------------------
	 *-------- atributos --------------
	 *---------------------------------
	 */
	
	/**
	 * Atributo que representa el id de Cuota
	 */
	private long id;
	/**
	 * Atributo que representa la fecha de pago de Cuota
	 */
	private LocalDate fechaPago;
	/**
	 * Atributo que representa el periodo de Cuota
	 */
	private String periodo;
	/**
	 * Atributo que representa el monto de Cuota
	 */
	private double monto;
	/**
	 * Atributo que representa el estado de Cuota
	 */
	private String estado;
	/**
	 * Atributo que representa el usuario de Cuota
	 */
	@Autowired
	private Usuario usuario;
	
	/*
	 *---------------------------------
	 *-------- constructores --------------
	 *---------------------------------
	 */
	/**
	 * Constructor por defecto
	 */
	public Cuota() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Consttructor parametrizado
	 * @param id valor del id de Cuota
	 * @param fechaPago valor de fechaPago de Cuota
	 * @param periodo valor de periodo de Cuota
	 * @param monto valor de monto de Cuota
	 * @param estado valor de estado de Cuota
	 * @param usuario valor de usuario de Cuota
	 */
	public Cuota(long id, LocalDate fechaPago, String periodo, double monto, String estado, Usuario usuario) {
		// asignacion del parametro id al atributo id
		this.id = id;
		// asignacion del parametro fechaPago al atributo fechaPago
		this.fechaPago = fechaPago;
		// asignacion del parametro periodo al atributo periodo
		this.periodo = periodo;
		// asignacion del parametro monto al atributo monto
		this.monto = monto;
		// asignacion del parametro estado al atributo estado
		this.estado = estado;
		// asignacion del parametro usuario al atributo usuario
		this.usuario = usuario;
	}
	
	/*
	 *---------------------------------
	 *-------- metodos accesores --------------
	 *---------------------------------
	 */

	/**
	 * retorna el id de Cuota
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * asigna un valor a el id de Cuota
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * retorna la fecha de pago de Cuota
	 * @return the fechaPago
	 */
	public LocalDate getFechaPago() {
		return fechaPago;
	}

	/**
	 * asigna un valor a fecha de pago de Cuota
	 * @param fechaPago the fechaPago to set
	 */
	public void setFechaPago(LocalDate fechaPago) {
		this.fechaPago = fechaPago;
	}

	/**
	 * retorna el periodo de Cuota
	 * @return the periodo
	 */
	public String getPeriodo() {
		return periodo;
	}

	/**
	 * asigna un valor al periodo de Cuota
	 * @param periodo the periodo to set
	 */
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	/**
	 * retorna el monto de Cuota
	 * @return the monto
	 */
	public double getMonto() {
		return monto;
	}

	/**
	 * asigna un valor al monto de Cuota
	 * @param monto the monto to set
	 */
	public void setMonto(double monto) {
		this.monto = monto;
	}

	/**
	 * retorna el estado de Cuota
	 * @return the estado
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * asigna un valor al estado de Cuota
	 * @param estado the estado to set
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}

	/**
	 * retorna un usuario de Cuota
	 * @return the usuario
	 */
	public Usuario getUsuario() {
		return usuario;
	}

	/**
	 * asigna un valor al usuario de Cuota
	 * @param usuario the usuario to set
	 */
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	//Metodo que retorna una cadena de texto con los valores de los atributos
	@Override
	public String toString() {
		return "Cuota [id=" + id + ", fechaPago=" + fechaPago + ", periodo=" + periodo + ", monto=" + monto
				+ ", estado=" + estado + ", usuario=" + usuario + "]";
	}
	
	
}
