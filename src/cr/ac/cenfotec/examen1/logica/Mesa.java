package cr.ac.cenfotec.examen1.logica;

import java.util.ArrayList;

public class Mesa {

	private Repartidor repartidorMesa = new Repartidor();
	private ArrayList<Jugador> jugadores = new ArrayList<Jugador>();

	public boolean agregarJugador(int numeroJugadores) throws Exception {
		boolean campo;

		if (numeroJugadores == 0 || numeroJugadores > 4) {
			campo = false;
		} else {
			campo = true;
		}
		return campo;
	}



	public ArrayList<Jugador> empezarAJugar21(ArrayList<String> nombresJugadores) throws Exception {

		ArrayList<Carta> manoJugador = new ArrayList<Carta>();
		ArrayList<Jugador> jugadoresEnMesa = new ArrayList<Jugador>();
		Repartidor rep = new Repartidor();
		Jugador tempJugador = null;

		Carta carta = new Carta();

		String nombreJugador = "";

		for (int i = 0; i < nombresJugadores.size(); i++) {
			for (int x = 0; x <= 2; x++) {
				nombreJugador = nombresJugadores.get(i);
				carta = rep.darCarta();
				manoJugador.add(carta);
			}
			tempJugador = new Jugador(nombreJugador, manoJugador);
			jugadoresEnMesa.add(tempJugador);
		}
		return jugadoresEnMesa;
	}
	
}
