package es.tallercan.domainModel.Factura;

import java.sql.Date;
import java.util.Set;

import es.tallercan.domainModel.Pago.Pago;

public class Factura {
	public int numero;
	public Date anho;
	public double importeNeto;
	public double porcentajeImpuesto;
	public double importeTotal;
	public boolean pagado;
	public String nif;
	public String nombre;
	
	public Set<Pago> pagos;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Date getAnho() {
		return anho;
	}

	public void setAnho(Date anho) {
		this.anho = anho;
	}

	public double getImporteNeto() {
		return importeNeto;
	}

	public void setImporteNeto(double importeNeto) {
		this.importeNeto = importeNeto;
	}

	public double getPorcentajeImpuesto() {
		return porcentajeImpuesto;
	}

	public void setPorcentajeImpuesto(double porcentajeImpuesto) {
		this.porcentajeImpuesto = porcentajeImpuesto;
	}

	public double getImporteTotal() {
		return importeTotal;
	}

	public void setImporteTotal(double importeTotal) {
		this.importeTotal = importeTotal;
	}

	public boolean isPagado() {
		return pagado;
	}

	public void setPagado(boolean pagado) {
		this.pagado = pagado;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<Pago> getPagos() {
		return pagos;
	}

	public void setPagos(Set<Pago> pagos) {
		this.pagos = pagos;
	}
	
	

}
