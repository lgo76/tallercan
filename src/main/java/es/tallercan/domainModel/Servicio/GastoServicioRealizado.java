package es.tallercan.domainModel.Servicio;

import java.time.format.DateTimeFormatter;

import javax.persistence.*;


import es.tallercan.domainModel.Persona.Empleado;

@Embeddable
public class GastoServicioRealizado {
	public double precio;
	public int unidades;
	public double descuento;
	public DateTimeFormatter fechaHoraIniPRev;
	public DateTimeFormatter fechaHoraFinPRev;
	public DateTimeFormatter fechaHoraIniReal;
	public DateTimeFormatter fechaHoraFinReal;
	public String observaciones;
	
	@OneToOne
	public Servicio servicio;
	
	@OneToOne
	public Empleado empleadoResponsable;
	
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
	public Servicio getServicio() {
		return servicio;
	}
	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}
	public Empleado getEmpleadoResponsable() {
		return empleadoResponsable;
	}
	public void setEmpleadoResponsable(Empleado empleadoResponsable) {
		this.empleadoResponsable = empleadoResponsable;
	}
	
	
}
