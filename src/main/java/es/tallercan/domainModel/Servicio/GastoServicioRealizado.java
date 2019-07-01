package es.tallercan.domainModel.Servicio;

import java.time.format.DateTimeFormatter;
import java.util.Set;

import es.tallercan.domainModel.Factura.Orden_Trabajo;
import es.tallercan.domainModel.Persona.Empleado;

public class GastoServicioRealizado {
	public double precio;
	public int unidades;
	public double descuento;
	public DateTimeFormatter fechaHoraIniPRev;
	public DateTimeFormatter fechaHoraFinPRev;
	public DateTimeFormatter fechaHoraIniReal;
	public DateTimeFormatter fechaHoraFinReal;
	public String observaciones;
	
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getUnidades() {
		return unidades;
	}
	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}
	public double getDescuento() {
		return descuento;
	}
	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
	public DateTimeFormatter getFechaHoraIniPRev() {
		return fechaHoraIniPRev;
	}
	public void setFechaHoraIniPRev(DateTimeFormatter fechaHoraIniPRev) {
		this.fechaHoraIniPRev = fechaHoraIniPRev;
	}
	public DateTimeFormatter getFechaHoraFinPRev() {
		return fechaHoraFinPRev;
	}
	public void setFechaHoraFinPRev(DateTimeFormatter fechaHoraFinPRev) {
		this.fechaHoraFinPRev = fechaHoraFinPRev;
	}
	public DateTimeFormatter getFechaHoraIniReal() {
		return fechaHoraIniReal;
	}
	public void setFechaHoraIniReal(DateTimeFormatter fechaHoraIniReal) {
		this.fechaHoraIniReal = fechaHoraIniReal;
	}
	public DateTimeFormatter getFechaHoraFinReal() {
		return fechaHoraFinReal;
	}
	public void setFechaHoraFinReal(DateTimeFormatter fechaHoraFinReal) {
		this.fechaHoraFinReal = fechaHoraFinReal;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	public Set<Servicio> getServicios() {
		return servicios;
	}
	public void setServicios(Set<Servicio> servicios) {
		this.servicios = servicios;
	}
	public Set<Orden_Trabajo> getOrdenes_trabajo() {
		return ordenes_trabajo;
	}
	public void setOrdenes_trabajo(Set<Orden_Trabajo> ordenes_trabajo) {
		this.ordenes_trabajo = ordenes_trabajo;
	}
	public Empleado getEmpleadoResponsable() {
		return empleadoResponsable;
	}
	public void setEmpleadoResponsable(Empleado empleadoResponsable) {
		this.empleadoResponsable = empleadoResponsable;
	}
	public Set<Servicio> servicios;
	public Set<Orden_Trabajo> ordenes_trabajo;
	public Empleado empleadoResponsable;
	
}
