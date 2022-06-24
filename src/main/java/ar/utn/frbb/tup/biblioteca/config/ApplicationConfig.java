package ar.utn.frbb.tup.biblioteca.config;

import ar.utn.frbb.tup.biblioteca.business.LibroBusiness;
import ar.utn.frbb.tup.biblioteca.business.SocioBusiness;
import ar.utn.frbb.tup.biblioteca.business.impl.LibroBusinessImplementation;
import ar.utn.frbb.tup.biblioteca.business.impl.SocioBusinessImplementation;
import ar.utn.frbb.tup.biblioteca.dto.AltaLibroDto;
import ar.utn.frbb.tup.biblioteca.model.Libro;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"ar.utn.frbb.tup.biblioteca.business"})
public class ApplicationConfig {

    @Bean
    public LibroBusiness libroBusiness(){
        return new LibroBusinessImplementation();
    }

    @Bean
    public SocioBusiness socioBusiness() {
        return new SocioBusinessImplementation();
    }

}
