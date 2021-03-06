package cr.ac.cenfotec.examen1.test;

import static org.junit.Assert.*;


import org.junit.BeforeClass;
import org.junit.Test;

import cr.ac.cenfotec.examen1.logica.Carta;
import cr.ac.cenfotec.examen1.logica.Mesa;
import cr.ac.cenfotec.examen1.logica.Naipe;
import cr.ac.cenfotec.examen1.logica.NombreCarta;
import cr.ac.cenfotec.examen1.logica.PaloCarta;
import cr.ac.cenfotec.examen1.logica.Repartidor;

import java.util.ArrayList;
import java.util.List;

public class Pruebas {

	static Carta card;

	@BeforeClass
	public static void init() {

		card = new Carta();
	}

	@Test
	public void testCrearYCompararCarta() throws Exception{
		
		Carta cardTest = new Carta(NombreCarta.As, PaloCarta.Escudo, 1);
		
		assertEquals(cardTest.getValor(), card.nuevaCarta(NombreCarta.As, PaloCarta.Escudo).getValor());
	}
	
	@Test
	public void naipeDeCartas() throws Exception{
		Naipe na = new Naipe();
		
		List <Carta> tempNaipe = na.creacionNaipe();
		int tamannoList = tempNaipe.size();
		
		assertEquals(tamannoList, na.creacionNaipe().size());
	}
	
	@Test
	public void naipeBarajado() throws Exception{
		
		Naipe naipe = new Naipe ();
		List <Carta> naipeOrdenado = naipe.creacionNaipe();
		
		Repartidor repartidor = new Repartidor();
		List <Carta> barajaNaipe =  repartidor.barajaNaipe();
		
		assertFalse(naipeOrdenado == barajaNaipe);
		
	}
	
	@Test
	public void errorCamposMesa() throws Exception{
		
		Mesa campos = new Mesa();
		
		assertFalse(campos.agregarJugador(5));
		assertFalse(campos.agregarJugador(0));
		assertTrue(campos.agregarJugador(2));
	}
	
	@Test
	public void cartaJugador() throws Exception{
		Carta cartaGenerada = new Carta(NombreCarta.Ka, PaloCarta.Estrella, 10);

		Repartidor rep = new Repartidor();
		
		assertFalse(cartaGenerada == rep.darCarta());
	}
	
	@Test
	public void darCartasJugadores() throws Exception{
		Mesa mesita = new Mesa();
		ArrayList<String> nombres = new ArrayList<String>();
		nombres.add("Jimena");
		nombres.add("Cristina");
		
		int tamanno = 2;
		
		assertEquals(tamanno, mesita.empezarAJugar21(nombres).size());
		
	}
	
	@Test
	public void ganador() throws Exception{
		Mesa mesita = new Mesa();
		
		String nombreTemp = "Ricardo";
		
		ArrayList<Carta> manoTemp = new ArrayList<Carta>();
		Carta cartaTemp1 = new Carta(NombreCarta.Ka, PaloCarta.Estrella, 10);
		Carta cartaTemp2 = new Carta(NombreCarta.As, PaloCarta.Gota, 1);
		
		manoTemp.add(cartaTemp1);
		manoTemp.add(cartaTemp2);
		
		
		assertEquals(nombreTemp, Mesa.sacarGanador(manoTemp, "Ricardo"));
	}
}
