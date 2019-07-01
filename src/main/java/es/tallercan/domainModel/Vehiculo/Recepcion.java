package es.tallercan.domainModel.Vehiculo;

import java.util.Date;
import java.util.Set;

public class Recepcion {
	public String tipoRecepcion;
	public String indicaciones;
	public String motivo;
	public float kms;
	public Date fechaHoraEntrega;
	
	public Set<Presupuesto> presupuestos;

	public String getTipoRecepcion() {
		return tipoRecepcion;
	}

	public void setTipoRecepcion(String tipoRecepcion) {
		this.tipoRecepcion = tipoRecepcion;
	}

	public String getIndicaciones() {
		return indicaciones;
	}

	public void setIndicaciones(String indicaciones) {
		this.indicaciones = indicaciones;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public float getKms() {
		return kms;
	}

	public void setKms(float kms) {
		this.kms = kms;
	}

	public Date getFechaHoraEntrega() {
		return fechaHoraEntrega;
	}

	public void setFechaHoraEntrega(Date fechaHoraEntrega) {
		this.fechaHoraEntrega = fechaHoraEntrega;
	}

	public Set<Presupuesto> getPresupuestos() {
		return presupuestos;
	}

	public void setPresupuestos(Set<Presupuesto> presupuestos) {
		this.presupuestos = presupuestos;
	}
	
	
}
