package ar.utn.frbb.tup.biblioteca.business.impl;

import ar.utn.frbb.tup.biblioteca.business.LibroBusiness;
import ar.utn.frbb.tup.biblioteca.model.Libro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LibroBusinessImplementation implements LibroBusiness {

    @AutoWired
    LibroDao dao;


    @Override
    public Libro altaLibro(AltaLibroDto dto) {
        Libro e = new Libro();

        e.setAutor(dto.getCuit());
        e.setCantEjemplares(dto.getCantEjemplares());
        e.setEditorial(dto.getCuit());
        e.setNombre(dto.getNombre());
        e.setFecha_de_edicion(dto.getFecha_de_edicion());


        return dao.save(e);

    }
}
