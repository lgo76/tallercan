package es.tallercan.domainModel.Persona;

import javax.persistence.Embeddable;

@Embeddable
public class DatosBancarios {
	public String banco;
	public String sucursal;
	public String DC;
	public String numero;
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	public String getSucursal() {
		return sucursal;
	}
	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}
	public String getDC() {
		return DC;
	}
	public void setDC(String dC) {
		DC = dC;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	
}
