package ar.utn.frbb.tup.biblioteca.business.impl;

import ar.utn.frbb.tup.biblioteca.business.LibroBusiness;
import ar.utn.frbb.tup.biblioteca.business.SocioBusiness;
import ar.utn.frbb.tup.biblioteca.dto.AltaLibroDto;
import ar.utn.frbb.tup.biblioteca.dto.AltaSocioDto;
import ar.utn.frbb.tup.biblioteca.model.Libro;
import ar.utn.frbb.tup.biblioteca.model.Socio;
import ar.utn.frbb.tup.biblioteca.persistence.LibroDao;
import ar.utn.frbb.tup.biblioteca.persistence.SocioDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SocioBusinessImplementation implements SocioBusiness {

    @Autowired
    SocioDao dao;


    @Override
    public Socio altaSocio(AltaSocioDto dto) {
        Socio s = new Socio();

        s.setNombre(dto.getNombre());
        s.setDni(dto.getDni());
        s.setDireccion(dto.getDireccion());
        s.setTelefono(dto.getTelefono());
        s.setDireccion(dto.getDireccion());


        return dao.save(s);

    }
}
