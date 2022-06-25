package ar.utn.frbb.tup.biblioteca.persistence.impl;

import ar.utn.frbb.tup.biblioteca.model.Socio;
import ar.utn.frbb.tup.biblioteca.persistence.SocioDao;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class InMemorySocioDao implements SocioDao {

    List<Socio> socioList = new ArrayList<>();

    @Override
    public Socio save(Socio socio) {
        socioList.add(socio);
        return socio;
    }

    @Override
    public Socio updateSocio(Socio socio) {
        return socio;
    }

    @Override
    public boolean deleteSocio(Socio socio) {
        socioList.remove(socio);
        return true;
    }
}
