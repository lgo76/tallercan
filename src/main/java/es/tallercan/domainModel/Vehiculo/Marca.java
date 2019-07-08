package es.tallercan.domainModel.Vehiculo;

import javax.persistence.*;

@Embeddable
public class Marca {
	public String marca;

	public String getName() {
		return marca;
	}

	public void setName(String name) {
		this.marca = name;
	}

}
