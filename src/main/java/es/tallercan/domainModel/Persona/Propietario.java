package es.tallercan.domainModel.Persona;

import javax.persistence.*;

@Embeddable
public class Propietario extends Persona {
	public String personaContacto;
	public String sms;
	
	public String getPersonaContacto() {
		return personaContacto;
	}
	public void setPersonaContacto(String personaContacto) {
		this.personaContacto = personaContacto;
	}
	public String getSms() {
		return sms;
	}
	public void setSms(String sms) {
		this.sms = sms;
	}
	
	
}
