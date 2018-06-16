package cr.ac.cenfotec.examen1.logica;

import java.util.ArrayList;

public class Jugador {

	private String nombre;
	private ArrayList<Carta> mano = new ArrayList<Carta>();
	
	public Jugador() {
		
	}
	
	public Jugador(String nombre, ArrayList<Carta> mano) {
		this.nombre = nombre;
		this.mano = mano;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Carta> getMano() {
		return mano;
	}

	public void setMano(ArrayList<Carta> mano) {
		this.mano = mano;
	}

	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", mano=" + mano + "]";
	}
	
}
