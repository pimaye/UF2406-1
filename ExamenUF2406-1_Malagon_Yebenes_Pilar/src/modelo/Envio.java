package modelo;

import java.util.Objects;

public class Envio {

	//Atributos
	
	public String ciudadOrigen;
	public boolean origenNacional;
	public String ciudadDestino;
	public boolean destinoNacional;
	public String tipoEnvio;
	public int peso;
	
	//Constructores sin Parámetros
	
	public Envio() {
		super();
	}
	
	
	//Constructores con Parámetros
	
	public Envio(String ciudadOrigen, boolean origenNacional, String ciudadDestino, boolean destinoNacional,
			String tipoEnvio, int peso) {
		super();
		this.ciudadOrigen = ciudadOrigen;
		this.origenNacional = origenNacional;
		this.ciudadDestino = ciudadDestino;
		this.destinoNacional = destinoNacional;
		this.tipoEnvio = tipoEnvio;
		this.peso = peso;
	}
	
	
	//Getters and Setters

	public String getCiudadOrigen() {
		return ciudadOrigen;
	}


	public void setCiudadOrigen(String ciudadOrigen) {
		this.ciudadOrigen = ciudadOrigen;
	}


	public boolean isOrigenNacional() {
		return origenNacional;
	}


	public void setOrigenNacional(boolean origenNacional) {
		this.origenNacional = origenNacional;
	}


	public String getCiudadDestino() {
		return ciudadDestino;
	}


	public void setCiudadDestino(String ciudadDestino) {
		this.ciudadDestino = ciudadDestino;
	}


	public boolean isDestinoNacional() {
		return destinoNacional;
	}


	public void setDestinoNacional(boolean destinoNacional) {
		this.destinoNacional = destinoNacional;
	}


	public String getTipoEnvio() {
		return tipoEnvio;
	}


	public void setTipoEnvio(String tipoEnvio) {
		this.tipoEnvio = tipoEnvio;
	}


	public int getPeso() {
		return peso;
	}


	public void setPeso(int peso) {
		this.peso = peso;
	}

	
	//hashCode and equals

	@Override
	public int hashCode() {
		return Objects.hash(ciudadDestino, ciudadOrigen, destinoNacional, origenNacional, peso, tipoEnvio);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Envio other = (Envio) obj;
		return Objects.equals(ciudadDestino, other.ciudadDestino) && Objects.equals(ciudadOrigen, other.ciudadOrigen)
				&& destinoNacional == other.destinoNacional && origenNacional == other.origenNacional
				&& peso == other.peso && Objects.equals(tipoEnvio, other.tipoEnvio);
	}

	
	
	
	
	//Método calcularImporte
	public int calcularImporte(double precio) {
		
		if (this.origenNacional && this.isDestinoNacional()) {
			precio = 4;
		}
	} else  {
		precio = 7;
			
	}
		if (tipoEnvio )
	
	
	
	

}
