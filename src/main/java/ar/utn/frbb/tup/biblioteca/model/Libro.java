package ar.utn.frbb.tup.biblioteca.model;

import java.util.Date;

public class Libro {
    private String nombre;
    private String editorial;
    private Date fecha_de_edicion;
    private String autor;
    private int cantEjemplares;

    public Libro(String nombre, String editorial, Date fecha_de_edicion, String autor, int cantEjemplares) {
        this.nombre = nombre;
        this.editorial = editorial;
        this.fecha_de_edicion = fecha_de_edicion;
        this.autor = autor;
        this.cantEjemplares = cantEjemplares;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public Date getFecha_de_edicion() {
        return fecha_de_edicion;
    }

    public void setFecha_de_edicion(Date fecha_de_edicion) {
        this.fecha_de_edicion = fecha_de_edicion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getCantEjemplares() {
        return cantEjemplares;
    }

    public void setCantEjemplares(int cantEjemplares) {
        this.cantEjemplares = cantEjemplares;
    }
}
