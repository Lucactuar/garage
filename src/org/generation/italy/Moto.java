package org.generation.italy;

import java.lang.runtime.ObjectMethods;
import java.util.HashMap;

public class Moto extends Veicolo {
	private Integer tempi;
	private HashMap <Integer,Moto> listaMoto = new HashMap <>();
	public Moto(String marca, Integer cilindrata, Integer anno, Integer tempi) {
		super(marca, cilindrata, anno);
		this.tempi=tempi;
	}

}
