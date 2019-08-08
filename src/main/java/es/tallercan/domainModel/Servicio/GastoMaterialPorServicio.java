package es.tallercan.domainModel.Servicio;

import javax.persistence.*;


import es.tallercan.domainModel.Material.Material;

@Embeddable
public class GastoMaterialPorServicio {
	public int unidades;
	@Embedded
	public Material material;
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

}
