package es.tallercan.domainModel.Vehiculo;

import javax.persistence.*;

@Embeddable
public class Aseguradora {
	public String aseguradora;

	public String getNombre() {
		return aseguradora;
	}

	public void setNombre(String nombre) {
		this.aseguradora = nombre;
	}
	
	
}
