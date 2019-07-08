package es.tallercan.domainModel.Servicio;

import java.util.Set;

import javax.persistence.*;

@Embeddable
public class Departamento {
	public String nombre;
	public String acronimo;
	
	@OneToMany
	public Set<Servicio> servicios;

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
