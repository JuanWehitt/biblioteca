package ar.utn.frbb.tup.biblioteca.persistence;

import ar.utn.frbb.tup.biblioteca.model.Libro;
import ar.utn.frbb.tup.biblioteca.model.Socio;

public interface SocioDao {

    Socio save(Socio socio);
    Socio updateSocio(Socio socio);
    boolean deleteSocio(Socio socio);

}
