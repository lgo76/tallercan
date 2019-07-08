package es.tallercan.domainModel.Calendario;

import java.util.Date;
import java.util.Set;

import javax.persistence.*;

@Entity
public class Calendario {
	@Id
	public long id;
	public Date fechaInicio;
	public Date fechaFin;
	public int horasDia;
	public int horasSemana;
	@Embedded
	public Set<Semana_Laboral> semanas_laborales;
	
	public Date getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public Date getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
	public int getHorasDia() {
		return horasDia;
	}
	public void setHorasDia(int horasDia) {
		this.horasDia = horasDia;
	}
	public int getHorasSemana() {
		return horasSemana;
	}
	public void setHorasSemana(int horasSemana) {
		this.horasSemana = horasSemana;
	}
	public Set<Semana_Laboral> getSemanas_laborales() {
		return semanas_laborales;
	}
	public void setSemanas_laborales(Set<Semana_Laboral> semanas_laborales) {
		this.semanas_laborales = semanas_laborales;
	}
	
	
	
}
