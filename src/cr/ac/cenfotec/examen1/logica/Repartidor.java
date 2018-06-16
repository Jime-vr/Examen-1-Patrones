package cr.ac.cenfotec.examen1.logica;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Repartidor {

	private Random random = new Random();
	private int cartasRepartidor = 52;

	public List<Carta> barajaNaipe() throws Exception {
		Naipe naipe = new Naipe();

		List<Carta> barajaOrdenada = naipe.creacionNaipe();

		Collections.shuffle(barajaOrdenada);

		return barajaOrdenada;

	}

	public Carta darCarta() throws Exception {
		
		List<Carta> baraja = barajaNaipe();
		Carta cartaDar = null;
		
		if (!(cartasRepartidor == 0)) {

			int indice = random.nextInt(baraja.size());
			cartaDar = new Carta(baraja.get(indice).getNombre(), baraja.get(indice).getPalo(), baraja.get(indice).getValor());

			cartasRepartidor--;			
			
		} else {
			System.out.println("El repartidor ya no tiene cartas.");
		}

		return cartaDar;

	}
}
