package cr.ac.cenfotec.examen1.logica;

import java.util.Collections;
import java.util.List;

public class Repartidor {

	public List <Carta> barajaNaipe() throws Exception{
		Naipe naipe = new Naipe();
		
		List<Carta> barajaOrdenada = naipe.creacionNaipe();
		
		Collections.shuffle(barajaOrdenada);
		
		return barajaOrdenada;
		
	}
}
