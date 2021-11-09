package pe.edu.upeu.examen.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pe.edu.upeu.service.SLibros;
import pe.edu.upeu.serviceImp.LibrosServiceImp;

@Configuration
public class Springconfig {

	@Bean
	public SLibros librosservices() {
		return new LibrosServiceImp();
	}
}
