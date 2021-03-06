package es.tallercan.domainModel.Vehiculo;

import javax.persistence.*;

import es.tallercan.domainModel.Material.Material;

@Embeddable
public class GastoMaterial {
	public int unidades;
	public double precio;
	public double descuento;
	@OneToOne
	public Material material;
	
	public int getUnidades() {
		return unidades;
	}
	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public double getDescuento() {
		return descuento;
	}
	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
	public Material getMaterial() {
		return material;
	}
	public void setMaterial(Material material) {
		this.material = material;
	}
	
	
}
