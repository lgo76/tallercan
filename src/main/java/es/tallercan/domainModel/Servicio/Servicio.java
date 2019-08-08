package es.tallercan.domainModel.Servicio;
import java.util.Set;

import javax.persistence.*;

import es.tallercan.domainModel.Vehiculo.Modelo;


@Entity
public class Servicio {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	public long id;
	public String nombre;
	public double precio;
	public int tiempoEstimadoMin;
	@OneToMany(cascade = CascadeType.ALL)
	public Set<Servicio> subservicios;
	@ManyToOne
	public Departamento departamentoResponsable;
	@OneToOne
	public Modelo modelo;
	@Embedded
	public Set<GastoMaterialPorServicio> materiales;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getTiempoEstimadoMin() {
		return tiempoEstimadoMin;
	}
	public void setTiempoEstimadoMin(int tiempoEstimadoMin) {
		this.tiempoEstimadoMin = tiempoEstimadoMin;
	}
	public Set<Servicio> getSubservicios() {
		return subservicios;
	}
	public void setSubservicios(Set<Servicio> subservicios) {
		this.subservicios = subservicios;
	}
	public Departamento getDepartamentoResponsable() {
		return departamentoResponsable;
	}
	public void setDepartamentoResponsable(Departamento departamentoResponsable) {
		this.departamentoResponsable = departamentoResponsable;
	}
	public Modelo getModelo() {
		return modelo;
	}
	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}
	public Set<GastoMaterialPorServicio> getMateriales() {
		return materiales;
	}
	public void setMateriales(Set<GastoMaterialPorServicio> materiales) {
		this.materiales = materiales;
	}
	
	
	

}
