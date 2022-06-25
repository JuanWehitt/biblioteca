package ar.utn.frbb.tup.biblioteca.persistence;

import ar.utn.frbb.tup.biblioteca.model.Libro;

import java.util.List;

public interface LibroDao {
    Libro save(Libro libro);
    Libro updateLibro(Libro libro);
    boolean deleteLibro(Libro libro);
    public List<Libro> findAll();
}
