package es.tallercan.domainModel.Vehiculo;

import javax.persistence.*;

@Entity
public class Marca {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	public long id;
	public String marca;

	public String getName() {
		return marca;
	}

	public void setName(String name) {
		this.marca = name;
	}

}
