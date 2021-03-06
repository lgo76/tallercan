package es.tallercan.domainModel.Pago;

import java.util.Date;
import javax.persistence.*;

@Entity
public class Pago {
	@Id
	public long id;
	public Date fechaPago;
	public double importe;
	public String concepto;
	
	@Embedded
	public MetodoPago metodoPago;

	public Date getFechaPago() {
		return fechaPago;
	}

	public void setFechaPago(Date fechaPago) {
		this.fechaPago = fechaPago;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public MetodoPago getMetodoPago() {
		return metodoPago;
	}

	public void setMetodoPago(MetodoPago metodoPago) {
		this.metodoPago = metodoPago;
	}
	
	
}
