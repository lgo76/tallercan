package es.tallercan;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import es.tallercan.domainModel.Calendario.*;
import es.tallercan.domainModel.Material.Fabricante;
import es.tallercan.domainModel.Material.Material;
import es.tallercan.domainModel.Persona.DatosBancarios;
import es.tallercan.domainModel.Persona.Empleado;
import es.tallercan.domainModel.Persona.Propietario;
import es.tallercan.domainModel.Servicio.Departamento;
import es.tallercan.domainModel.Servicio.Servicio;
import es.tallercan.domainModel.Vehiculo.*;
import es.tallercan.domainModel.repositories.*;


/**
 * Clase que se ejecuta al iniciarse la aplicacion y crea datos
 * para anhadir en los repositorios
 * @author Lucía
 *
 */
@Component
public class TallercanManager implements CommandLineRunner {
	EntityManager em;
	
	@Autowired
	CalendarioRepository cr;
	@Autowired
	MarcaRepository mr;
	@Autowired
	ModeloRepository modr;
	@Autowired
	AseguradoraRepository ar;
	@Autowired
	FabricanteRepository fr;
	@Autowired
	MaterialRepository matr;
	@Autowired
	PropietarioRepository propr;
	@Autowired
	EmpleadoRepository er;
	@Autowired
	DepartamentoRepository dr;
	@Autowired
	ServicioRepository sr;
	@Autowired
	VehiculoRepository vr;
	
	
	
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
		Material m1 = new Material();
		m1.setNombre("MICHELIN Primacy 4");
		m1.setPrecioCompra(40.5);
		m1.setPrecioVenta(81.5);
		m1.setStock(60);
		m1.setFabricante(null);
		matr.save(m1);
	}
	private void createPago() {
		
	}
	
	private void createMarcas() {
		Marca m1 = new Marca();
		m1.setName("Seat");
		Marca m2 = new Marca();
		m2.setName("Renault");
		Marca m3 = new Marca();
		m3.setName("Peugeot");
		mr.save(m1);
		mr.save(m2);
		mr.save(m3);
		
		lg.info("Marcas creadas");
		
		createModelos(m1, m2, m3);
	}
	
	private void createModelos(Marca m1, Marca m2, Marca m3) {
		Modelo mod1 = new Modelo();
		mod1.setName("Ibiza");
		mod1.setPotencia(80);
		mod1.setMarca(m1);
		mod1.setTipoCombustible(TipoCombustible.DIESEL);
		//mod1.setServicio(new Servicio());
		modr.save(mod1);
		
		Modelo mod2 = new Modelo();
		mod2.setName("Megane");
		mod2.setPotencia(110);
		mod2.setMarca(m2);
		mod2.setTipoCombustible(TipoCombustible.GASOLINA);
		//mod1.setServicio(new Servicio());
		modr.save(mod2);
		
		Modelo mod3= new Modelo();
		mod3.setName("207");
		mod3.setPotencia(150);
		mod3.setMarca(m3);
		mod3.setTipoCombustible(TipoCombustible.DIESEL);
		//mod1.setServicio(new Servicio());
		modr.save(mod3);
		
		
		//Modelo mod2 = new Modelo();
		//Modelo mod3 = new Modelo();
		
		lg.info("Modelos creados");
		
		createServicios(mod1, mod2, mod3);
		
	}
	
	private void createAseguradoras() {
		Aseguradora a1 = new Aseguradora();
		Aseguradora a2 = new Aseguradora();
		a1.setNombre("AXA");
		a2.setNombre("MAPFRE");
		ar.save(a1);
		ar.save(a2);
		lg.info("Aseguradoras creadas");
		
	}
	
	private void createFabricantes() {
		Fabricante f1 = new Fabricante();
		f1.setNombre("Michelin");
		Fabricante f2 = new Fabricante();
		f2.setNombre("AutoScrub");
		fr.save(f1);
		fr.save(f2);
		lg.info("Fabricantes creados");
	}
	
	
	
	private void createPropietarios() {
		DatosBancarios d1 = new DatosBancarios();
		d1.setBanco("Banco Santander");
		d1.setDC("5454");
		d1.setNumero("5420154895847569");
		d1.setSucursal("sucursal1");
		
		Propietario p1 = new Propietario();
		p1.setApellido1("Gomez");
		p1.setApellido2("Rodriguez");
		p1.setDatosBancarios(d1);
		//p1.setDireccion(null);
		p1.setEmail("gomezrodriguez@mail.com");
		Calendar calendar = Calendar.getInstance();
		p1.setFechaAlta(calendar.getTime());
		p1.setNIF("72207584T");
		p1.setNombre_razon_social("Javier");
		p1.setPersonaContacto("Paula Gomez Rodriguez");
		//p1.setProvincia(provincia);
		p1.setSms("Hola sms");
		p1.setTfno_fijo("942548758");
		p1.setTfno_movil("669521322");
		//p1.setUsuario(usuario);
		propr.save(p1);
		
		DatosBancarios d2 = new DatosBancarios();
		d2.setBanco("La Caixa");
		d2.setDC("5454");
		d2.setNumero("8956325625689555");
		d2.setSucursal("sucursal2");
		
		Propietario p2 = new Propietario();
		p2.setApellido1("Perez");
		p2.setApellido2("Ortega");
		p2.setDatosBancarios(d1);
		//p2.setDireccion(null);
		p2.setEmail("perezortega@mail.com");
		p2.setFechaAlta(calendar.getTime());
		p2.setNIF("14568521M");
		p2.setNombre_razon_social("Laura");
		p2.setPersonaContacto("Paula Gomez Rodriguez");
		//p2.setProvincia(provincia);
		p2.setSms("Hola sms");
		p2.setTfno_fijo("942336987");
		p2.setTfno_movil("622147331");
		//p2.setUsuario(usuario);
		propr.save(p2);
		
		lg.info("Propietarios creados");
		createVehiculos(p1,p2);
	}
	
	private void createServicios(Modelo m1, Modelo m2, Modelo m3) {
		Servicio s1 = new Servicio();
		s1.setNombre("Cambio de aceite");
		s1.setPrecio(23.5);
		s1.setTiempoEstimadoMin(30);
		s1.setModelo(m1);
		//s1.setDepartamentoResponsable(departamentoResponsable);
		//s1.setSubservicios(subservicios);
		sr.save(s1);
		lg.info("Servicios creados");
		createDepartamentos(s1);
	}
	
	
	private void createDepartamentos(Servicio s1){
		Departamento d1 = new Departamento();
		d1.setNombre("Chapa y pintura");
		d1.setAcronimo("Chp");
		//d1.setEmpleados(empleados);
		//d1.setServicios(servicios);
		dr.save(d1);
		
		Departamento d2 = new Departamento();
		d2.setNombre("Mecánica");
		d2.setAcronimo("Mec");
		//d2.setEmpleados(empleados);
		Set<Servicio> servicios = new HashSet<Servicio>();
		servicios.add(s1);
		d2.setServicios(servicios);
		dr.save(d2);
		lg.info("Departamentos creados");
		
	}
	
	private void createEmpleados() {
		DatosBancarios d1 = new DatosBancarios();
		d1.setBanco("Banco Santander");
		d1.setDC("5454");
		d1.setNumero("5420154895847569");
		d1.setSucursal("sucursal1");
		
		Empleado e1 = new Empleado();
		e1.setApellido1("Gomez");
		e1.setApellido2("Rodriguez");
		e1.setDatosBancarios(d1);
		//e1.setDireccion(null);
		e1.setEmail("gomezrodriguez@mail.com");
		Calendar calendar = Calendar.getInstance();
		e1.setFechaAlta(calendar.getTime());
		e1.setNIF("72207584T");
		e1.setNombre_razon_social("Javier");
		
		//e1.setProvincia(provincia);
		//TODO
		e1.setTfno_fijo("942548758");
		e1.setTfno_movil("669521322");
		e1.setFecha1contrato(calendar.getTime());
		e1.setIdEmpleado(24242424);
		e1.setNumHijos(0);
		/*e1.setDepartamento(departamento);
		e1.setNo_laborales(no_laborales);
		e1.setCat_prof(cat_prof);*/
		
		er.save(e1);
		
		DatosBancarios d2 = new DatosBancarios();
		d2.setBanco("La Caixa");
		d2.setDC("5454");
		d2.setNumero("8956325625689555");
		d2.setSucursal("sucursal2");
		
		Empleado e2 = new Empleado();
		e2.setApellido1("Fernández");
		e2.setApellido2("Gil");
		e2.setDatosBancarios(d2);
		//e2.setDireccion(null);
		e2.setEmail("fernandezgil@mail.com");
		e2.setFechaAlta(calendar.getTime());
		e2.setNIF("59668741F");
		e2.setNombre_razon_social("Sandra");
		
		//e2.setProvincia(provincia);
		//TODO
		e2.setTfno_fijo("942566895");
		e2.setTfno_movil("66622021");
		e2.setFecha1contrato(calendar.getTime());
		e2.setIdEmpleado(25252525);
		e2.setNumHijos(2);
		/*e2.setDepartamento(departamento);
		e2.setNo_laborales(no_laborales);
		e2.setCat_prof(cat_prof);*/
		
		er.save(e2);
		
		lg.info("Empleados creados");
	}
	
	
	private void createVehiculos(Propietario p1, Propietario p2){
		Calendar calendar1 = Calendar.getInstance();
		calendar1.set(2017, 02, 04);
		Vehiculo v1 = new Vehiculo();
		v1.setPropietario(p1);
		v1.setBastidor("bastidor1");
		v1.setFecha1matr(calendar1.getTime());
		v1.setFechaAlta(calendar1.getTime());
		v1.setFechaMaxGarantia(calendar1.getTime());
		v1.setFechaProxITV(calendar1.getTime());
		v1.setMatricula("1488FFR");
		
		vr.save(v1);
		
		lg.info("Vehiculos creados");
		
	}
	
	
	
	
	@Override
	public void run(String... args) throws Exception {
		createCalendario();
		createMarcas();
		createFactura();
		createMaterial();
		createPago();
		createAseguradoras();
		createFabricantes();
		createPropietarios();
		createEmpleados();
		
		
		/*createPersona();
		createServicio();
		createUsuario();
		createVehiculo();*/
		
		
	}

}
