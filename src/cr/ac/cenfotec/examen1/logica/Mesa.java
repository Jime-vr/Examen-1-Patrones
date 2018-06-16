package cr.ac.cenfotec.examen1.logica;

import java.util.ArrayList;

public class Mesa {

	private Repartidor repartidorMesa = new Repartidor();
	private ArrayList <Jugador> jugadores = new ArrayList<Jugador>();

	
	public boolean agregarJugador(int numeroJugadores) throws Exception{
		boolean campo;
		
		
		if(numeroJugadores == 0 || numeroJugadores > 4) {
			campo = false;
		}else {
			campo = true;
		}
		return campo;
	}
}
