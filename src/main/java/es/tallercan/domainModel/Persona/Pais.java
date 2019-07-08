package es.tallercan.domainModel.Persona;

import javax.persistence.Embeddable;

@Embeddable
public class Pais {
	public String pais;

	public String getNombre() {
		return pais;
	}

	public void setNombre(String nombre) {
		this.pais = nombre;
	}
	
	
}
