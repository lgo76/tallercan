package es.tallercan.domainModel.Vehiculo;

import javax.persistence.*;

import es.tallercan.domainModel.Servicio.Servicio;

@Entity
public class Modelo {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	public long id;
	public String name;
	@OneToOne
	public Marca marca;
	@OneToOne
	public Servicio servicio;
	@Enumerated
	public TipoCombustible tipoCombustible;
	public int potencia;
	
	public TipoCombustible getTipoCombustible() {
		return tipoCombustible;
	}
	public void setTipoCombustible(TipoCombustible tipoCombustible) {
		this.tipoCombustible = tipoCombustible;
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
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
