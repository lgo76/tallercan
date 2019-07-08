package es.tallercan.domainModel.Factura;

import java.util.Set;

import javax.persistence.*;

import es.tallercan.domainModel.Servicio.Servicio;
import es.tallercan.domainModel.Vehiculo.Presupuesto;

@Embeddable
public class Documento {
	public String etiquetaContenido;
	public byte fichero;
	public int extension;
	
	@Embedded
	public Set<Presupuesto> presupuestos;
	@Embedded
	public Set<Orden_Trabajo> ordenes_trabajo;
	@OneToOne
	public Servicio servicio;
	@OneToMany
	public Set<Factura> facturas;
	
	public String getEtiquetaContenido() {
		return etiquetaContenido;
	}
	public void setEtiquetaContenido(String etiquetaContenido) {
		this.etiquetaContenido = etiquetaContenido;
	}
	public byte getFichero() {
		return fichero;
	}
	public void setFichero(byte fichero) {
		this.fichero = fichero;
	}
	public int getExtension() {
		return extension;
	}
	public void setExtension(int extension) {
		this.extension = extension;
	}
	public Set<Presupuesto> getPresupuestos() {
		return presupuestos;
	}
	public void setPresupuestos(Set<Presupuesto> presupuestos) {
		this.presupuestos = presupuestos;
	}
	public Set<Orden_Trabajo> getOrdenes_trabajo() {
		return ordenes_trabajo;
	}
	public void setOrdenes_trabajo(Set<Orden_Trabajo> ordenes_trabajo) {
		this.ordenes_trabajo = ordenes_trabajo;
	}
	public Servicio getServicio() {
		return servicio;
	}
	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}
	public Set<Factura> getFacturas() {
		return facturas;
	}
	public void setFacturas(Set<Factura> facturas) {
		this.facturas = facturas;
	}
	
	
	

}
