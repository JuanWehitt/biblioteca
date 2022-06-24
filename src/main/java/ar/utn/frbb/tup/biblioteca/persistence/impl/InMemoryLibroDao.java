package ar.utn.frbb.tup.biblioteca.persistence.impl;

import ar.utn.frbb.tup.biblioteca.model.Libro;
import ar.utn.frbb.tup.biblioteca.persistence.LibroDao;

import java.util.Random;

public class InMemoryLibroDao implements LibroDao {

    private Libro libro;

    @Override
    public Libro save(Libro libro) {
        libro.setISBN("4654654665-888");
        return libro;
    }

    @Override
    public Libro updateLibro(Libro libro) {
        return libro;
    }

    @Override
    public boolean deleteLibro(Libro libro) {
        return false;
    }
}
