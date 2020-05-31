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
public class Usuario {
	/*
	 *---------------------------------
	 *-------- atributos --------------
	 *---------------------------------
	 */
	
	/**
	 * Atributo que representa el id del Usuario
	 */
	private long id;
	/**
	 * Atributo que representa el nombre del Usuario
	 */
	private String nombre;
	/**
	 * Atributo que representa el apellido del Usuario
	 */
	private String apellido;
	/**
	 * Atributo que representa la fecha de nacimiento del Usuario
	 */
	private LocalDate fechaNacimiento;
	/**
	 * Atributo que representa la direccion del Usuario
	 */
	private String direccion;
	/**
	 * Atributo que representa el dni del Usuario
	 */
	private long dni;
	/**
	 * Atributo que representa la fecha de alta del Usuario
	 */
	private LocalDate fechaAlta;
	/**
	 * Atributo que representa el tipo de Usuario
	 */
	private String tipo;
	/**
	 * Atributo que representa el password del Usuario
	 */
	private String password;
	
	/*
	 *---------------------------------
	 *-------- constructores --------------
	 *---------------------------------
	 */
	/**
	 * Constructor por defecto
	 */
	
	public Usuario() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Contructor parametrizado
	 * @param id valor del id del Usuario
	 * @param nombre valor del nombre del Usuario
	 * @param apellido valor del apellido del Usuario
	 * @param fechaNacimiento valor de fecha de nacimiento del Usuario
	 * @param direccion valor de la direccion del Usuario
	 * @param dni valor del dni del Usuario
	 * @param fechaAlta valor de la fecha de alta del Usuario
	 * @param tipo valor del tipo de Usuario
	 * @param password valor del password del Usuario
	 */
	public Usuario(long id, String nombre, String apellido, LocalDate fechaNacimiento, String direccion, long dni,
			LocalDate fechaAlta, String tipo, String password) {
		// asignacion del parametro id al atributo id
		this.id = id;
		// asignacion del parametro nombre al atributo nombre
		this.nombre = nombre;
		// asignacion del parametro apellido al atributo apellido
		this.apellido = apellido;
		// asignacion del parametro fechaNacimiento al atributo fechaNacimiento
		this.fechaNacimiento = fechaNacimiento;
		// asignacion del parametro direccion al atributo direccion
		this.direccion = direccion;
		// asignacion del parametro dni al atributo dni
		this.dni = dni;
		// asignacion del parametro fechaAlta al atributo fechaAlta
		this.fechaAlta = fechaAlta;
		// asignacion del parametro tipo al atributo tipo
		this.tipo = tipo;
		// asignacion del parametro password al atributo password
		this.password = password;
	}
	
	/*
	 *---------------------------------
	 *-------- metodos accesores --------------
	 *---------------------------------
	 */

	/**
	 * retorna el id del Usuario
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * asigna un valor al id del Usuario
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * retorna el nombre del Usuario
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * asigna un valor al nombre del Usuario
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * retorna el apellido del Usuario
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * asigna un valor al apellidp del Usuario
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * retorna la fecha de nacimiento del Usuario
	 * @return the fechaNacimiento
	 */
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	/**
	 * asigna un valor a la fecha de nacimineto del Usuario
	 * @param fechaNacimiento the fechaNacimiento to set
	 */
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	/**
	 * retorna la dirred¿cion del Usuario
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * asigna un valor a la direccion del Usuario
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * retorna el dni del Usuario
	 * @return the dni
	 */
	public long getDni() {
		return dni;
	}

	/**
	 * asigna un valor a el dni del Usuario
	 * @param dni the dni to set
	 */
	public void setDni(long dni) {
		this.dni = dni;
	}

	/**
	 * retorna la fecha de alta del Usuario
	 * @return the fechaAlta
	 */
	public LocalDate getFechaAlta() {
		return fechaAlta;
	}

	/**
	 * asigna un valor a la fecha de alta del Usuario
	 * @param fechaAlta the fechaAlta to set
	 */
	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	/**
	 * retorna el tipo de Usuario
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * asigna un valor al tipo de Usuario
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * retorna el password del Usuario
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * asigna un valor al password del Usuario
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	//Metodo que retorna una cadena de texto con los valores de los atributos
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", fechaNacimiento="
				+ fechaNacimiento + ", direccion=" + direccion + ", dni=" + dni + ", fechaAlta=" + fechaAlta + ", tipo="
				+ tipo + ", password=" + password + "]";
	}
	
	
}
