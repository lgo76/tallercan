package es.tallercan.domainModel.Vehiculo;

import es.tallercan.domainModel.Servicio.Servicio;

public class Modelo {
	public String name;
	public Marca marca;
	public Servicio servicio;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Marca getMarca() {
		return marca;
	}
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	public Servicio getServicio() {
		return servicio;
	}
	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}
	

}
