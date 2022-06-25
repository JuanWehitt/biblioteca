package ar.utn.frbb.tup.biblioteca.presentation;

import ar.utn.frbb.tup.biblioteca.business.LibroBusiness;
import ar.utn.frbb.tup.biblioteca.dto.AltaLibroDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import java.util.Scanner;
import java.util.logging.Logger;

@Configuration
public class LibroPresentation {
    Logger  logger = Logger.getLogger("Libro");

    private String titulo;

    @Autowired
    LibroBusiness libroBusiness;

    public LibroPresentation(String titulo) {
        this.titulo = titulo;
    }

    public LibroBusiness getLibroBusiness() {
        return libroBusiness;
    }

    public void setLibroBusiness(LibroBusiness libroBusiness) {
        this.libroBusiness = libroBusiness;
    }

    public void altaLibro(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Titulo del libro:  ");
        String titulo = scanner.nextLine();
        System.out.print("Autor:  ");
        String autor = scanner.nextLine();

        logger.info("Se da de alta el libro: " + titulo);

        //Data Transfer Object --> es un objeto que se utiliza para mover datos entre distintas capas
        AltaLibroDto dto = new AltaLibroDto();
        dto.setNombre(titulo);
        dto.setAutor(autor);
        libroBusiness.altaLibro(dto);
    }

}
