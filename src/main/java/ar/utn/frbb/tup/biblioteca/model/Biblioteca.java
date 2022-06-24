package ar.utn.frbb.tup.biblioteca.model;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nombre;
    private List libros;
    private List socios;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        libros = new ArrayList<>();
        socios = new ArrayList<Socio>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List getLibros() {
        return libros;
    }

    public void setLibros(List libros) {
        this.libros = libros;
    }

    public List getSocios() {
        return socios;
    }

    public void setSocios(List socios) {
        this.socios = socios;
    }

    public void agregarLibro(Libro libro){
        libros.add(libro);
    }

    public void agregarSocio(Socio socio){
        socios.add(socio);
    }
}
