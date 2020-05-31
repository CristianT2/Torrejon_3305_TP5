package ar.edu.unju.fi;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.fi.model.Cuota;
import ar.edu.unju.fi.model.Equipo;
import ar.edu.unju.fi.model.Estadio;
import ar.edu.unju.fi.model.Noticia;
import ar.edu.unju.fi.model.Resultado;
import ar.edu.unju.fi.model.Usuario;
import ar.edu.unju.fi.service.ICuotaService;
import ar.edu.unju.fi.service.IEquipoService;
import ar.edu.unju.fi.service.IEstadioService;
import ar.edu.unju.fi.service.INoticiaService;
import ar.edu.unju.fi.service.IResultadoService;
import ar.edu.unju.fi.service.IUsuarioService;

@SpringBootApplication
public class Torrejon3305Tp5Application implements CommandLineRunner {

	@Autowired
	IUsuarioService usuarioService;
	@Autowired
	Usuario usuario;
	
	@Autowired
	Equipo equipo;
	@Autowired
	IEquipoService equipoService;
	
	@Autowired
	Estadio estadio;
	@Autowired
	IEstadioService estadioService;
	
	@Autowired
	Resultado resultado;
	@Autowired
	IResultadoService resultadoService;
	
	@Autowired
	Noticia noticia;
	@Autowired
	INoticiaService noticiaservice;
	
	@Autowired
	Cuota cuota;
	@Autowired
	ICuotaService cuotaservice;
	
	public static void main(String[] args) {
		SpringApplication.run(Torrejon3305Tp5Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Inicializo las variables de mi objeto usuario
		
		usuario.setApellido("Torrejon");
		usuario.setDireccion("Av. San Martin 190");
		usuario.setDni(39808789);
		usuario.setFechaAlta(LocalDate.now());
		usuario.setFechaNacimiento(LocalDate.of(1996, 12, 7));
		usuario.setId(1);
		usuario.setNombre("Cristian");
		usuario.setPassword("1234");
		usuario.setTipo("SOCIO");
		
		usuarioService.guardar();
		
		estadio.setNombre("Anfield");
		estadio.setFechaFundacion(LocalDate.of(28, 11, 1884));
		estadio.setCiudad("Liverpool");
		estadio.setCapacidad(54074);
		estadio.setDireccion("Anfield Road,Liverpool");
		
		estadioService.guardar();
		
		noticia.setFecha(LocalDate.now());
		noticia.setTitulo("Titulo de la noticia");
		noticia.setResumen("aaaasaaahshdkjadshajhkj");
		
		
		noticiaservice.guardar();
		
		equipo.setNombre("Liverpool FC");
		equipo.setEstadio(estadio);
		
		equipoService.guardar();
		
		resultado.setEquipo1(equipo);
		resultado.setGolesEquipo1(2);
		resultado.setEquipo2(equipo);
		resultado.setGolesEquipo2(3);
		resultado.setFecha(LocalDate.now());
		
		resultadoService.guardar();
		
		cuota.setId(123334);
		cuota.setFechaPago(LocalDate.now());
		cuota.setPeriodo("");
		cuota.setMonto(1200);
		cuota.setUsuario(usuario);
		
		cuotaservice.guardar();
		
		
	}

}
