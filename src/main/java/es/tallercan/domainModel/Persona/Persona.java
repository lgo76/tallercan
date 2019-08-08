package es.tallercan.domainModel.Persona;

import java.util.Date;

import es.tallercan.domainModel.Usuario.Usuario;
import javax.persistence.*;

@Entity
public class Persona {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	public long id;
	public String NIF;
	public String tfno_fijo;
	public String tfno_movil;
	public String email;
	public String nombre_razon_social;
	public String apellido1;
	public String apellido2;
	public Date fechaAlta;
	public Date fechaModif;
	public Date fechaAnulacion;
	
	@Embedded
	public DatosBancarios datosBancarios;
	@Embedded
	public Provincia provincia;
	@Embedded
	public Direccion direccion;
	@OneToOne
	public Usuario usuario;
	
	public String getNIF() {
		return NIF;
	}
	public void setNIF(String nIF) {
		NIF = nIF;
	}
	public String getTfno_fijo() {
		return tfno_fijo;
	}
	public void setTfno_fijo(String tfno_fijo) {
		this.tfno_fijo = tfno_fijo;
	}
	public String getTfno_movil() {
		return tfno_movil;
	}
	public void setTfno_movil(String tfno_movil) {
		this.tfno_movil = tfno_movil;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNombre_razon_social() {
		return nombre_razon_social;
	}
	public void setNombre_razon_social(String nombre_razon_social) {
		this.nombre_razon_social = nombre_razon_social;
	}
	public String getApellido1() {
		return apellido1;
	}
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	public String getApellido2() {
		return apellido2;
	}
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	public Date getFechaAlta() {
		return fechaAlta;
	}
	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	public Date getFechaModif() {
		return fechaModif;
	}
	public void setFechaModif(Date fechaModif) {
		this.fechaModif = fechaModif;
	}
	public Date getFechaAnulacion() {
		return fechaAnulacion;
	}
	public void setFechaAnulacion(Date fechaAnulacion) {
		this.fechaAnulacion = fechaAnulacion;
	}
	public DatosBancarios getDatosBancarios() {
		return datosBancarios;
	}
	public void setDatosBancarios(DatosBancarios datosBancarios) {
		this.datosBancarios = datosBancarios;
	}
	public Provincia getProvincia() {
		return provincia;
	}
	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	
	

}
