package ar.utn.frbb.tup.biblioteca.controller;

import ar.utn.frbb.tup.biblioteca.business.LibroBusiness;
import ar.utn.frbb.tup.biblioteca.dto.AltaLibroDto;
import ar.utn.frbb.tup.biblioteca.model.Libro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibroController {
    @Autowired
    LibroBusiness libroBusiness;

    @PostMapping(value = "/libro", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Libro crearLibro(AltaLibroDto dto){
        return libroBusiness.altaLibro(dto);
    }
}
