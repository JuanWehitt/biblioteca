package ar.utn.frbb.tup.biblioteca.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Socio {

    private String dni;
    private String nombre;
    private String direccion;
    private String telefono;
    private Date fechaDeNac;
    private List listaDeLibrosSolicitados;

    public Socio(String dni, String nombre, String direccion, String telefono, Date fechaDeNac) {
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaDeNac = fechaDeNac;
        listaDeLibrosSolicitados = new ArrayList<Libro>();
    }

    public Socio() {

    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFechaDeNac() {
        return fechaDeNac;
    }

    public void setFechaDeNac(Date fechaDeNac) {
        this.fechaDeNac = fechaDeNac;
    }

    public List getListaDeLibrosSolicitados() {
        return listaDeLibrosSolicitados;
    }

    public void setListaDeLibrosSolicitados(List listaDeLibrosSolicitados) {
        this.listaDeLibrosSolicitados = listaDeLibrosSolicitados;
    }

    public void agregarLibro(Libro libro){
        if (listaDeLibrosSolicitados.size()<3) {
            listaDeLibrosSolicitados.add(libro);
        }
    }
    public void devolverLibro(Libro libro){
        listaDeLibrosSolicitados.remove(libro);
    }

}
