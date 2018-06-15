package cr.ac.cenfotec.examen1.logica;

import java.util.ArrayList;

import java.util.List;

public class Naipe {

	public List<Carta> creacionNaipe() throws Exception {
		
		List<Carta> naipe = new ArrayList<Carta>();
		Carta tempCarta = new Carta();
		
		for (PaloCarta palito : PaloCarta.values()) {
			
			for (NombreCarta nombrecito : NombreCarta.values()) {
				
				tempCarta.nuevaCarta(nombrecito, palito);
				naipe.add(tempCarta);
				
			}
		}
		
		return naipe;
	}
}
