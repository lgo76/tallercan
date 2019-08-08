package es.tallercan.domainModel.Vehiculo;

import java.util.Date;

import javax.persistence.*;

@Embeddable
public class Siniestro {
	public String numSiniestroTaller;
	public String numSiniestroComp;
	public String perito;
	public boolean asegurado;
	public Date fechaSiniestro;
	public String daños;
	public String poliza;
	public String franquicia;
	@Embedded
	public Recepcion recepcion;
	@OneToOne
	public Aseguradora aseguradora;
	public String getNumSiniestroTaller() {
		return numSiniestroTaller;
	}
	public void setNumSiniestroTaller(String numSiniestroTaller) {
		this.numSiniestroTaller = numSiniestroTaller;
	}
	public String getNumSiniestroComp() {
		return numSiniestroComp;
	}
	public void setNumSiniestroComp(String numSiniestroComp) {
		this.numSiniestroComp = numSiniestroComp;
	}
	public String getPerito() {
		return perito;
	}
	public void setPerito(String perito) {
		this.perito = perito;
	}
	public boolean isAsegurado() {
		return asegurado;
	}
	public void setAsegurado(boolean asegurado) {
		this.asegurado = asegurado;
	}
	public Date getFechaSiniestro() {
		return fechaSiniestro;
	}
	public void setFechaSiniestro(Date fechaSiniestro) {
		this.fechaSiniestro = fechaSiniestro;
	}
	public String getDaños() {
		return daños;
	}
	public void setDaños(String daños) {
		this.daños = daños;
	}
	public String getPoliza() {
		return poliza;
	}
	public void setPoliza(String poliza) {
		this.poliza = poliza;
	}
	public String getFranquicia() {
		return franquicia;
	}
	public void setFranquicia(String franquicia) {
		this.franquicia = franquicia;
	}
	public Recepcion getRecepcion() {
		return recepcion;
	}
	public void setRecepcion(Recepcion recepcion) {
		this.recepcion = recepcion;
	}
	public Aseguradora getAseguradora() {
		return aseguradora;
	}
	public void setAseguradora(Aseguradora aseguradora) {
		this.aseguradora = aseguradora;
	}
	
	

}
