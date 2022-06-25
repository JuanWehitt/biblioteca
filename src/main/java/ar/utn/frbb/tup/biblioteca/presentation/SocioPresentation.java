package ar.utn.frbb.tup.biblioteca.presentation;

import ar.utn.frbb.tup.biblioteca.business.SocioBusiness;
import ar.utn.frbb.tup.biblioteca.dto.AltaSocioDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;
import java.util.logging.Logger;

@Component
public class SocioPresentation {

    Logger logger = Logger.getLogger("Socio");

    @Autowired
    SocioBusiness socioBusiness;

    private String nombreSocio;

    public SocioPresentation(String nombreSocio) {
        this.nombreSocio = nombreSocio;
    }

    public SocioBusiness getSocioBusiness() {
        return socioBusiness;
    }

    public void setSocioBusiness(SocioBusiness socioBusiness) {
        this.socioBusiness = socioBusiness;
    }

    public void altaSocio(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nombre del socio:  ");
        String nombreSocio = scanner.nextLine();
        System.out.print("DNI del socio:  ");
        String dni = scanner.nextLine();

        logger.info("Se da de alta el socio: " + nombreSocio);

        //Data Transfer Object --> es un objeto que se utiliza para mover datos entre distintas capas
        AltaSocioDto dto = new AltaSocioDto();
        dto.setNombre(nombreSocio);
        dto.setDni(dni);
        socioBusiness.altaSocio(dto);
    }
}
