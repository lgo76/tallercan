package es.tallercan.domainModel.Factura;

import java.util.Date;
import java.util.Set;

import javax.persistence.*;

import es.tallercan.domainModel.Persona.Empleado;
import es.tallercan.domainModel.Servicio.GastoServicioRealizado;
import es.tallercan.domainModel.Vehiculo.Presupuesto;

@Embeddable
public class Orden_Trabajo {
	public String observaciones;
	@Enumerated
	public EstadoOrden_Trabajo estado;
	public Date fechaEntrega;
	public Date fechaPreparacion;
	public Date fechaAutorizacion;
	public Date fechaSupervision;
	public Date fechaPrevistaFin;
	public double importeTotal;
	
	@Embedded
	public Presupuesto presupuesto;
	@OneToOne
	public Empleado empleadoPreparacion;
	@OneToOne
	public Empleado empleadoEntrega;
	@OneToMany
	public Set<Factura> facturas;
	@Embedded
	public Set<GastoServicioRealizado> gastosServiciosReales;
	
	
	public Set<GastoServicioRealizado> getGastosServiciosReales() {
		return gastosServiciosReales;
	}
	public void setGastosServiciosReales(Set<GastoServicioRealizado> gastosServiciosReales) {
		this.gastosServiciosReales = gastosServiciosReales;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	public EstadoOrden_Trabajo getEstado() {
		return estado;
	}
	public void setEstado(EstadoOrden_Trabajo estado) {
		this.estado = estado;
	}
	public Date getFechaEntrega() {
		return fechaEntrega;
	}
	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}
	public Date getFechaPreparacion() {
		return fechaPreparacion;
	}
	public void setFechaPreparacion(Date fechaPreparacion) {
		this.fechaPreparacion = fechaPreparacion;
	}
	public Date getFechaAutorizacion() {
		return fechaAutorizacion;
	}
	public void setFechaAutorizacion(Date fechaAutorizacion) {
		this.fechaAutorizacion = fechaAutorizacion;
	}
	public Date getFechaSupervision() {
		return fechaSupervision;
	}
	public void setFechaSupervision(Date fechaSupervision) {
		this.fechaSupervision = fechaSupervision;
	}
	public Date getFechaPrevistaFin() {
		return fechaPrevistaFin;
	}
	public void setFechaPrevistaFin(Date fechaPrevistaFin) {
		this.fechaPrevistaFin = fechaPrevistaFin;
	}
	public double getImporteTotal() {
		return importeTotal;
	}
	public void setImporteTotal(double importeTotal) {
		this.importeTotal = importeTotal;
	}
	public Presupuesto getPresupuesto() {
		return presupuesto;
	}
	public void setPresupuesto(Presupuesto presupuesto) {
		this.presupuesto = presupuesto;
	}
	public Empleado getEmpleadoPreparacion() {
		return empleadoPreparacion;
	}
	public void setEmpleadoPreparacion(Empleado empleadoPreparacion) {
		this.empleadoPreparacion = empleadoPreparacion;
	}
	public Empleado getEmpleadoEntrega() {
		return empleadoEntrega;
	}
	public void setEmpleadoEntrega(Empleado empleadoEntrega) {
		this.empleadoEntrega = empleadoEntrega;
	}
	public Set<Factura> getFacturas() {
		return facturas;
	}
	public void setFacturas(Set<Factura> facturas) {
		this.facturas = facturas;
	}
	
	
}
