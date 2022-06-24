package ar.utn.frbb.tup.biblioteca.business;

import ar.utn.frbb.tup.biblioteca.dto.AltaLibroDto;
import ar.utn.frbb.tup.biblioteca.dto.AltaSocioDto;
import ar.utn.frbb.tup.biblioteca.model.Socio;

public interface SocioBusiness {
    Socio altaSocio(AltaSocioDto dto);
}
