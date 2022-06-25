package ar.utn.frbb.tup.biblioteca.persistence.impl;

import ar.utn.frbb.tup.biblioteca.model.Libro;
import ar.utn.frbb.tup.biblioteca.persistence.LibroDao;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
@Component
public class InMemoryLibroDao implements LibroDao {

    private List<Libro> libroList = new ArrayList<>();

    @Override
    public Libro save(Libro libro) {
        libro.setISBN("4654654665-888");
        libroList.add(libro);
        return libro;
    }

    @Override
    public Libro updateLibro(Libro libro) {
        return libro;
    }

    @Override
    public boolean deleteLibro(Libro libro) {
        libroList.remove(libro);
        return true;
    }

    @Override
    public List<Libro> findAll() {
        return libroList;
    }
}
