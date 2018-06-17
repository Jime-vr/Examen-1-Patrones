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
				nombreJugador.toString();
				
			}
			tempJugador = new Jugador(nombreJugador, manoJugador);
			jugadoresEnMesa.add(tempJugador);
			
		}
		return jugadoresEnMesa;
	}
	
	public static String sacarGanador(ArrayList<Carta> manoJugador, String nombre) throws Exception{
		
		ArrayList<String> jugadores = new ArrayList<String>();
		jugadores.add(nombre);
		
		ArrayList<Integer> cartas = new ArrayList<Integer>();
		
		String manoString = "";
		String nombreGanador = "";
		Integer valor = 0;
		int mano = 0;
		int total = 0;		

		
		for(int i = 0; i <= jugadores.size(); i++) {
			valor = manoJugador.get(i).getValor();
			manoString = valor.toString();
			mano = Integer.parseInt(manoString);
			total += mano;
			cartas.add(total);
		}
		
		int ganador = cercania21(cartas);
		
		nombreGanador = jugadores.get(ganador);
		
		return nombreGanador;
		
	}
	
	public static int cercania21(ArrayList<Integer> cartas) throws Exception{
		int mayor = 0;
		int k = 0;
		
		for(int i = 0; i < cartas.size(); i++) {
			if(cartas.get(i) > mayor ) {
				mayor = cartas.get(i);
				k = i - 1;
			}
		}
		
		return k;
	}
	
}
