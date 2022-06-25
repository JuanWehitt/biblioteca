package ar.utn.frbb.tup.biblioteca.persistence;

import ar.utn.frbb.tup.biblioteca.model.Libro;
import ar.utn.frbb.tup.biblioteca.model.Socio;

import java.util.List;

public interface SocioDao {

    Socio save(Socio socio);
    Socio updateSocio(Socio socio);
    boolean deleteSocio(Socio socio);
    public List<Socio> findAll();

}
