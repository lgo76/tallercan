package es.tallercan.domainModel.Servicio;

public class Servicio {
	public String nombre;
	public double precio;
	public int tiempoEstimadoMin;
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
	
	

}
