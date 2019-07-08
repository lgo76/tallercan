package es.tallercan.domainModel.Usuario;
import javax.persistence.*;

import java.util.Set;

@Entity
public class Usuario {
	@Id
	public long id;
	public String nombre;
	public String clave;
	
	@Embedded
	public Set<Log> logs;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public Set<Log> getLogs() {
		return logs;
	}

	public void setLogs(Set<Log> logs) {
		this.logs = logs;
	}
	
	
}
