package cr.ac.cenfotec.examen1.test;

import static org.junit.Assert.*;


import org.junit.BeforeClass;
import org.junit.Test;

import cr.ac.cenfotec.examen1.logica.Carta;
import cr.ac.cenfotec.examen1.logica.NombreCarta;
import cr.ac.cenfotec.examen1.logica.PaloCarta;

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
}
