package es.tallercan.domainModel.Material;

import javax.persistence.*;

@Entity
public class Material {
	@Id
	public long id;
	public String nombre;
	public double precioVenta;
	public double precioCompra;
	public int stock;
	
	
	@Embedded
	@JoinColumn(name="nombreFabricante", insertable=false, updatable=false )
	public Fabricante fabricante;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecioVenta() {
		return precioVenta;
	}
	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}
	public double getPrecioCompra() {
		return precioCompra;
	}
	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public Fabricante getFabricante() {
		return fabricante;
	}
	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	
	
}
