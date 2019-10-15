package es.tallercan.domainModel.Vehiculo;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.Set;

import es.tallercan.domainModel.Persona.Persona;


@Entity
public class Vehiculo {
	
	@Id
	public String matricula;
	public String bastidor;
	public Date fecha1matr;
	public Date fechaProxITV;
	public Date fechaMaxGarantia;
	public Date fechaAlta;
	public Date fechaAnulacion;
	public Date fechaModificacion;
	
	@Embedded
	public Set<Recepcion> recepciones;
	
	@OneToOne
	public Persona propietario;
	
	@JsonProperty("matricula")
	public String getMatricula() {
		return matricula;
	}
	@JsonProperty("matricula")
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	@JsonProperty("bastidor")
	public String getBastidor() {
		return bastidor;
	}
	@JsonProperty("bastidor")
	public void setBastidor(String bastidor) {
		this.bastidor = bastidor;
	}
	@JsonProperty("fecha1matricula")
	public Date getFecha1matr() {
		return fecha1matr;
	}
	@JsonProperty("fecha1matricula")
	public void setFecha1matr(Date fecha1matr) {
		this.fecha1matr = fecha1matr;
	}
	@JsonProperty("fechaproxitv")
	public Date getFechaProxITV() {
		return fechaProxITV;
	}
	@JsonProperty("fechaproxitv")
	public void setFechaProxITV(Date fechaProxITV) {
		this.fechaProxITV = fechaProxITV;
	}
	@JsonProperty("fechamaxgarantia")
	public Date getFechaMaxGarantia() {
		return fechaMaxGarantia;
	}
	@JsonProperty("fechamaxgarantia")
	public void setFechaMaxGarantia(Date fechaMaxGarantia) {
		this.fechaMaxGarantia = fechaMaxGarantia;
	}
	@JsonProperty("fechaalta")
	public Date getFechaAlta() {
		return fechaAlta;
	}
	@JsonProperty("fechaalta")
	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	@JsonProperty("fechaanulacion")
	public Date getFechaAnulacion() {
		return fechaAnulacion;
	}
	@JsonProperty("fechaanulacion")
	public void setFechaAnulacion(Date fechaAnulacion) {
		this.fechaAnulacion = fechaAnulacion;
	}
	@JsonProperty("fechamodificacion")
	public Date getFechaModificacion() {
		return fechaModificacion;
	}
	@JsonProperty("fechamodificacion")
	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}
	@JsonProperty("recepciones")
	public Set<Recepcion> getRecepciones() {
		return recepciones;
	}
	@JsonProperty("recepciones")
	public void setRecepciones(Set<Recepcion> recepciones) {
		this.recepciones = recepciones;
	}
	@JsonProperty("propietario")
	public Persona getPropietario() {
		return propietario;
	}
	@JsonProperty("propietario")
	public void setPropietario(Persona propietario) {
		this.propietario = propietario;
	}
	
	

}
