package es.tallercan.domainModel.Persona;

import java.util.Date;
import java.util.Set;

import javax.persistence.*;

import es.tallercan.domainModel.Servicio.Departamento;

@Embeddable
public class Empleado extends Persona{
	public String idEmpleado;
	public Date fecha1contrato;
	public int numHijos;
	@Embedded
	public Departamento departamento;
	@Embedded
	public Cat_Prof cat_prof;
	@Embedded
	public Set<No_Laboral> no_laborales;
	
	public Cat_Prof getCat_prof() {
		return cat_prof;
	}
	public void setCat_prof(Cat_Prof cat_prof) {
		this.cat_prof = cat_prof;
	}
	public Set<No_Laboral> getNo_laborales() {
		return no_laborales;
	}
	public void setNo_laborales(Set<No_Laboral> no_laborales) {
		this.no_laborales = no_laborales;
	}
	public String getIdEmpleado() {
		return idEmpleado;
	}
	public void setIdEmpleado(String idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	public Date getFecha1contrato() {
		return fecha1contrato;
	}
	public void setFecha1contrato(Date fecha1contrato) {
		this.fecha1contrato = fecha1contrato;
	}
	public int getNumHijos() {
		return numHijos;
	}
	public void setNumHijos(int numHijos) {
		this.numHijos = numHijos;
	}
	public Departamento getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	
}
