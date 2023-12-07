package org.generation.italy;

import java.util.HashMap;

public class Auto extends Veicolo {
	private String alimentazione;
	private Integer porte;
	//private HashMap <String,Auto> listaAuto = new HashMap <>();
	public Auto(String marca, Integer cilindrata, Integer anno, Integer porte, String alimentazione) {
		super(marca, cilindrata, anno);
		this.porte=porte;
		this.alimentazione=alimentazione;
	}
	
	public String getAlimentazione() {
		return alimentazione;
	}

	public void setAlimentazione(String alimentazione) {
		this.alimentazione = alimentazione;
	}

	public Integer getPorte() {
		return porte;
	}

	public void setPorte(Integer porte) {
		this.porte = porte;
	}

	public void aggiungiAuto () {
		
		
	}
	
	
	
}
