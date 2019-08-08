package es.tallercan.domainModel.Servicio;

import java.util.Set;

import javax.persistence.*;

import es.tallercan.domainModel.Persona.Empleado;

@Entity
public class Departamento {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	public long id;
	public String nombre;
	public String acronimo;
	
	@OneToMany
	public Set<Servicio> servicios;
	@OneToMany( cascade = CascadeType.ALL)
	public Set<Empleado> empleados;

	public Set<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(Set<Empleado> empleados) {
		this.empleados = empleados;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAcronimo() {
		return acronimo;
	}

	public void setAcronimo(String acronimo) {
		this.acronimo = acronimo;
	}

	public Set<Servicio> getServicios() {
		return servicios;
	}

	public void setServicios(Set<Servicio> servicios) {
		this.servicios = servicios;
	}

}
