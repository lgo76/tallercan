package es.tallercan.domainModel.Vehiculo;

import javax.persistence.*;

@Entity
public class Aseguradora {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	public long id;
	public String aseguradora;

	public String getNombre() {
		return aseguradora;
	}

	public void setNombre(String nombre) {
		this.aseguradora = nombre;
	}
	
	
}
