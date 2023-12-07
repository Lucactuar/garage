package org.generation.italy;

import java.lang.runtime.ObjectMethods;
import java.util.HashMap;

public class Furgone extends Veicolo {

	private Float capacità;
	private HashMap <Integer,Furgone> listaFurgone = new HashMap <>();
	public Furgone(String marca, Integer cilindrata, Integer anno, Float capacità) {
		super(marca, cilindrata, anno);
		this.capacità=capacità;
	}

}
