package ar.utn.frbb.tup.biblioteca.persistence.impl;

import ar.utn.frbb.tup.biblioteca.model.Socio;
import ar.utn.frbb.tup.biblioteca.persistence.SocioDao;

import java.util.Random;

public class InMemorySocioDao implements SocioDao {


    @Override
    public Socio save(Socio socio) {
        socio.setDni("12.122.222");
        return socio;
    }

    @Override
    public Socio updateSocio(Socio socio) {
        return socio;
    }

    @Override
    public boolean deleteSocio(Socio socio) {
        return false;
    }
}
