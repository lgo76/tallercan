package es.tallercan.domainModel.Persona;

import javax.persistence.*;

@Embeddable
public class Cat_Prof {
	public String cat_prof;

	public String getNombre() {
		return cat_prof;
	}

	public void setNombre(String nombre) {
		this.cat_prof = nombre;
	}
	
	
}
