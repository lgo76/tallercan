package es.tallercan.domainModel.Vehiculo;

import java.util.Date;
import java.util.Set;

import es.tallercan.domainModel.Factura.Factura;
import es.tallercan.domainModel.Persona.Empleado;

public class Presupuesto {
	public String observaciones;
	public double costePresupuesto;
	public Date fechaAviso;
	public Date fechaAceptacionSeguro;
	public Date fechaAceptacionCliente;
	public Date fechaAnulacion;
	public EstadoPresupuesto estado;
	
	public Empleado empleadoResponsable;
	public Set<GastoMaterial> gastosMateriales;
	public Set<Factura> facturas;
	
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	public double getCostePresupuesto() {
		return costePresupuesto;
	}
	public void setCostePresupuesto(double costePresupuesto) {
		this.costePresupuesto = costePresupuesto;
	}
	public Date getFechaAviso() {
		return fechaAviso;
	}
	public void setFechaAviso(Date fechaAviso) {
		this.fechaAviso = fechaAviso;
	}
	public Date getFechaAceptacionSeguro() {
		return fechaAceptacionSeguro;
	}
	public void setFechaAceptacionSeguro(Date fechaAceptacionSeguro) {
		this.fechaAceptacionSeguro = fechaAceptacionSeguro;
	}
	public Date getFechaAceptacionCliente() {
		return fechaAceptacionCliente;
	}
	public void setFechaAceptacionCliente(Date fechaAceptacionCliente) {
		this.fechaAceptacionCliente = fechaAceptacionCliente;
	}
	public Date getFechaAnulacion() {
		return fechaAnulacion;
	}
	public void setFechaAnulacion(Date fechaAnulacion) {
		this.fechaAnulacion = fechaAnulacion;
	}
	public EstadoPresupuesto getEstado() {
		return estado;
	}
	public void setEstado(EstadoPresupuesto estado) {
		this.estado = estado;
	}
	public Empleado getEmpleadoResponsable() {
		return empleadoResponsable;
	}
	public void setEmpleadoResponsable(Empleado empleadoResponsable) {
		this.empleadoResponsable = empleadoResponsable;
	}
	public Set<GastoMaterial> getGastosMateriales() {
		return gastosMateriales;
	}
	public void setGastosMateriales(Set<GastoMaterial> gastosMateriales) {
		this.gastosMateriales = gastosMateriales;
	}
	public Set<Factura> getFacturas() {
		return facturas;
	}
	public void setFacturas(Set<Factura> facturas) {
		this.facturas = facturas;
	}

	
}
