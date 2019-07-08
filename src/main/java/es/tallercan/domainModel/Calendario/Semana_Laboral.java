package es.tallercan.domainModel.Calendario;

import javax.persistence.Embeddable;

@Embeddable
public class Semana_Laboral {
	public int nroOrden;
	public String diaSemana;
	public String desdeHora;
	public String hastaHora;
	public int getNroOrden() {
		return nroOrden;
	}
	public void setNroOrden(int nroOrden) {
		this.nroOrden = nroOrden;
	}
	public String getDiaSemana() {
		return diaSemana;
	}
	public void setDiaSemana(String diaSemana) {
		this.diaSemana = diaSemana;
	}
	public String getDesdeHora() {
		return desdeHora;
	}
	public void setDesdeHora(String desdeHora) {
		this.desdeHora = desdeHora;
	}
	public String getHastaHora() {
		return hastaHora;
	}
	public void setHastaHora(String hastaHora) {
		this.hastaHora = hastaHora;
	}
	
	
}
