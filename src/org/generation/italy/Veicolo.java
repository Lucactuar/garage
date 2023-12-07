package org.generation.italy;

public class Veicolo {
	protected String marca;
	protected Integer cilindrata,anno;
	public Veicolo(String marca, Integer cilindrata, Integer anno) {
		super();
		this.marca = marca;
		this.cilindrata = cilindrata;
		this.anno = anno;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Integer getCilindrata() {
		return cilindrata;
	}
	public void setCilindrata(Integer cilindrata) {
		this.cilindrata = cilindrata;
	}
	public Integer getAnno() {
		return anno;
	}
	public void setAnno(Integer anno) {
		this.anno = anno;
	}
	
	
	
}
