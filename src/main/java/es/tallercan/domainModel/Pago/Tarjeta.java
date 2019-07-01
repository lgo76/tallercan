package es.tallercan.domainModel.Pago;

import java.util.Date;

public class Tarjeta extends MetodoPago {
	public int numero;
	public String tipo;
	public Date caducidad;
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Date getCaducidad() {
		return caducidad;
	}
	public void setCaducidad(Date caducidad) {
		this.caducidad = caducidad;
	}
	
	
}
