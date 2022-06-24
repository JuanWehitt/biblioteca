package ar.utn.frbb.tup.biblioteca.controller;

import ar.utn.frbb.tup.biblioteca.business.SocioBusiness;
import ar.utn.frbb.tup.biblioteca.dto.AltaSocioDto;
import ar.utn.frbb.tup.biblioteca.model.Socio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SocioController {
    @Autowired
    SocioBusiness socioBusiness;

    @PostMapping(value = "/socio", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Socio crearSocio(AltaSocioDto dto){
        return socioBusiness.altaSocio(dto);
    }
}
