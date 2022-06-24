package ar.utn.frbb.tup.biblioteca.business;

import ar.utn.frbb.tup.biblioteca.model.Libro;

public interface LibroBusiness {
    Libro altaLibro(AltaLibroDto dto);
}
