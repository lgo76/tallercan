package es.tallercan.domainModel.Vehiculo;
import javax.persistence.*;

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
	@Enumerated
	public TipoCombustible tipoCombustible;
	public Date fechaMaxGarantia;
	public Date fechaAlta;
	public Date fechaAnulacion;
	public Date fechaModificacion;
	@Embedded
	public Set<Recepcion> recepciones;
	@OneToOne
	public Persona propietario;
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getBastidor() {
		return bastidor;
	}
	public void setBastidor(String bastidor) {
		this.bastidor = bastidor;
	}
	public Date getFecha1matr() {
		return fecha1matr;
	}
	public void setFecha1matr(Date fecha1matr) {
		this.fecha1matr = fecha1matr;
	}
	public Date getFechaProxITV() {
		return fechaProxITV;
	}
	public void setFechaProxITV(Date fechaProxITV) {
		this.fechaProxITV = fechaProxITV;
	}
	public TipoCombustible getTipoCombustible() {
		return tipoCombustible;
	}
	public void setTipoCombustible(TipoCombustible tipoCombustible) {
		this.tipoCombustible = tipoCombustible;
	}
	public Date getFechaMaxGarantia() {
		return fechaMaxGarantia;
	}
	public void setFechaMaxGarantia(Date fechaMaxGarantia) {
		this.fechaMaxGarantia = fechaMaxGarantia;
	}
	public Date getFechaAlta() {
		return fechaAlta;
	}
	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	public Date getFechaAnulacion() {
		return fechaAnulacion;
	}
	public void setFechaAnulacion(Date fechaAnulacion) {
		this.fechaAnulacion = fechaAnulacion;
	}
	public Date getFechaModificacion() {
		return fechaModificacion;
	}
	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}
	public Set<Recepcion> getRecepciones() {
		return recepciones;
	}
	public void setRecepciones(Set<Recepcion> recepciones) {
		this.recepciones = recepciones;
	}
	public Persona getPropietario() {
		return propietario;
	}
	public void setPropietario(Persona propietario) {
		this.propietario = propietario;
	}
	
	

}
