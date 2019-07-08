package es.tallercan.domainModel.Servicio;

import javax.persistence.*;

import es.tallercan.domainModel.Material.Material;

@Embeddable
public class MaterialServicio {
	public int unidades;
	@OneToOne
	public Material material;
	@OneToOne
	public Servicio servicio;
	public int getUnidades() {
		return unidades;
	}
	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}
	public Material getMaterial() {
		return material;
	}
	public void setMaterial(Material material) {
		this.material = material;
	}
	public Servicio getServicio() {
		return servicio;
	}
	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}
	
	
}
