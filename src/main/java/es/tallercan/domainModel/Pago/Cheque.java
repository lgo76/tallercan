package es.tallercan.domainModel.Pago;

public class Cheque extends MetodoPago {
	public int numero;
	public String IBAN;
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getIBAN() {
		return IBAN;
	}
	public void setIBAN(String iBAN) {
		IBAN = iBAN;
	}
	
	
}
