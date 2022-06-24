package ar.utn.frbb.tup.biblioteca.dto;

import java.util.Date;


public class AltaSocioDto {
    private String dni;
    private String nombre;
    private String direccion;
    private String telefono;
    private Date fechaDeNac;

    public AltaSocioDto(String dni, String nombre, String direccion, String telefono, Date fechaDeNac) {
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaDeNac = fechaDeNac;
    }

    public AltaSocioDto(){}

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

}
