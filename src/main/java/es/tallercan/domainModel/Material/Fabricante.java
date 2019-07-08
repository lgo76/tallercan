package es.tallercan.domainModel.Material;
import javax.persistence.*;

@Embeddable
public class Fabricante {
	public String fabricante;

	public String getNombre() {
		return fabricante;
	}

	public void setNombre(String nombre) {
		this.fabricante = nombre;
	}
	
	
}
