package org.generation.italy;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/* Si realizzi una applicazione java per la gestione di un garage secondo le specifiche:
		il garage ha al max 15 posti ognuno dei quali è identificato da un num a partire da 0 e per motivi di capienza può ospitare solo auto moto 
		e furgoni partendo dalla classe base veicolo a motore V; la si estenda, realizzando anche le classi che modellano le entità furgone (F) auto (A) e moto (M).
		Ridefinire il metodo toString in modo che ogni entità possa esternalizzare in forma di stringa tutte le informazioni che la riguardano.
		Si implementi una classe che modelli il garage sopradescritto offrendo le seguenti operazioni di gestione
		1] immissione di un nuovo veicolo
		2] estrazione dal garage del veicolo che occupa un determinato posto (ritornare l'istanza del veicolo stesso)
		3] stampa della situazione corrente dei posti nel garage veicolo:
		marca,anno,cilindrata;
		auto:porte, alimentazione (diesel/benzina)
		moto:tempi
		furgone:capacità */
		Scanner scanner = new Scanner (System.in);
		
		String marca, alimentazione, risposta, nomeVeicolo;
		Integer cilindrata, anno, porte;
		
		
		do 
		{	
		
		System.out.println("Quale veicolo vuoi parcheggiare?");
		System.out.println("1.Auto");
		System.out.println("2.Furgone");
		System.out.println("3.Moto");
		System.out.println("4.Esci");
		nomeVeicolo = scanner.nextLine();
		switch(nomeVeicolo)
		{
		case("1"):
		
		System.out.println("Inserisci la marca dell'auto");
		marca = scanner.nextLine();
		
		System.out.println("Inserisci l'alimentazione dell'auto");
		alimentazione = scanner.nextLine();

		System.out.println("Inserisci la cilindrata dell'auto");
		cilindrata = Integer.parseInt(scanner.nextLine());

		System.out.println("Inserisci l'anno dell'auto");
		anno = Integer.parseInt(scanner.nextLine());

		System.out.println("Inserisci le porte dell'auto");
		porte = Integer.parseInt(scanner.nextLine());
		
		
		Auto auto = new Auto(marca,porte,cilindrata,anno,alimentazione);
		System.out.println(auto.getMarca());
		System.out.println(auto.getPorte());
		System.out.println(auto.getCilindrata());
		System.out.println(auto.getAnno());
		System.out.println(auto.getAlimentazione());
		System.out.println("Vuoi aggiungere altre auto? (s/n)");
		risposta = scanner.nextLine();
		break;
		
		case("2"):
	
	
	}

}while(true);
}
}