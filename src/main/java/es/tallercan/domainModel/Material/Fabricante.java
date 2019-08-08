package es.tallercan.domainModel.Material;
import javax.persistence.*;

@Entity
public class Fabricante {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	public long id;
	public String fabricante;

	public String getNombre() {
		return fabricante;
	}

	public void setNombre(String nombre) {
		this.fabricante = nombre;
	}
	
	
}
