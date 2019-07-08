package es.tallercan.domainModel.Material;
import javax.persistence.*;

@Embeddable
public class Fabricante {
	public String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
