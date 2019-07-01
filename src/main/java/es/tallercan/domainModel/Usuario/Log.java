package es.tallercan.domainModel.Usuario;

import java.time.format.DateTimeFormatter;

public class Log {
	public DateTimeFormatter fechaHora;
	public String campo;
	public String tabla;
	public String valorAntes;
	public String valorDespues;
	public DateTimeFormatter getFechaHora() {
		return fechaHora;
	}
	public void setFechaHora(DateTimeFormatter fechaHora) {
		this.fechaHora = fechaHora;
	}
	public String getCampo() {
		return campo;
	}
	public void setCampo(String campo) {
		this.campo = campo;
	}
	public String getTabla() {
		return tabla;
	}
	public void setTabla(String tabla) {
		this.tabla = tabla;
	}
	public String getValorAntes() {
		return valorAntes;
	}
	public void setValorAntes(String valorAntes) {
		this.valorAntes = valorAntes;
	}
	public String getValorDespues() {
		return valorDespues;
	}
	public void setValorDespues(String valorDespues) {
		this.valorDespues = valorDespues;
	}
	
	
}
