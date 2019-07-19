package es.tallercan;

import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import es.tallercan.domainModel.Calendario.*;
import es.tallercan.domainModel.repositories.CalendarioRepository;

/**
 * Clase que se ejecuta al iniciarse la aplicacion y crea datos
 * para anhadir en los repositorios
 * @author Lucía
 *
 */
@Component
public class TallercanManager implements CommandLineRunner {
	
	@Autowired
	CalendarioRepository cr;
	
	Logger lg = LoggerFactory.getLogger(TallercanManager.class);
	
	private void createCalendario() {

		Calendario c = new Calendario();
		c.setFechaFin(new Date());
		c.setFechaInicio(new Date());
		c.setHorasDia(8);
		c.setHorasSemana(40);
		Set<Semana_Laboral> semanas_laborales = new HashSet<Semana_Laboral>();
		c.setSemanas_laborales(semanas_laborales);
		//Guardamos en el repositorio
		cr.save(c);
		
		lg.info("Calendario creado");
	}
	
	private void createFactura() {
		
	}
	
	private void createMaterial() {
		
	}
	private void createPago() {
		
	}

	@Override
	public void run(String... args) throws Exception {
		createCalendario();
		createFactura();
		createMaterial();
		createPago();
		/*createPersona();
		createServicio();
		createUsuario();
		createVehiculo();*/
		
		
	}

}
