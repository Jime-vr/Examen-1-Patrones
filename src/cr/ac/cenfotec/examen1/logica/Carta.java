package cr.ac.cenfotec.examen1.logica;

public class Carta {
	
	private NombreCarta nombre;
	private PaloCarta palo;
	private int valor;

	public Carta() {
		
	}
	
	public Carta(NombreCarta nombre, PaloCarta palo, int valor) {
		super();
		this.nombre = nombre;
		this.palo = palo;
		this.valor = valor;
	}

	public NombreCarta getNombre() {
		return nombre;
	}

	public void setNombre(NombreCarta nombre) {
		this.nombre = nombre;
	}

	public PaloCarta getPalo() {
		return palo;
	}

	public void setPalo(PaloCarta palo) {
		this.palo = palo;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public Carta nuevaCarta(NombreCarta nombre, PaloCarta palo ) throws Exception{
		
		int valor = obtenerValor(nombre);
		
		Carta carta = new Carta(nombre, palo, valor);
		
		return carta;
	}
	
	public int obtenerValor(NombreCarta nombre) throws Exception{
		
		String nombreC = nombre.toString();
		int valor = 0;
		
		switch(nombreC) {
		case "As":
			valor = 1;
			break;
		case "Dos":
			valor = 2;
			break;
		case "Tres":
			valor = 3;
			break;
		case "Cuatro":
			valor = 4;
			break;
		case "Cinco":
			valor = 5;
			break;
		case "Seis":
			valor = 6;
			break;
		case "Siete":
			valor = 7;
			break;
		case "Ocho":
			valor = 8;
			break;
		case "Nueve":
			valor = 9;
			break;
		case "Diez":
			valor = 10;
			break;
		case "Jota":
			valor = 10;
		case "Quina":
			valor = 10;
			break;
		case "Ka":
			valor = 10;
			break;
			
		}
		return valor;
		
	}
}

