package games.onitama;

//import games.onitama.jugadores.*;

//import games.onitama.jugadores.*;

public class Jugador {
	
	//public Jugador1 jug;
	public IA ia;
	public String nombre;
	public Pieza[] piezas = new Pieza[5];

	public Jugador() {
		System.out.println("Creamos un Jugador");
	}
	
	public Jugador(String nombre, String claseIA) {
		this.nombre = nombre;
		String salida = (nombre != "")?" llamado " + nombre:"";
		System.out.println("Creamos un Jugador" + salida);
		
		ia = ponerIA(claseIA);
		ia.nombre = nombre;
		//this.ia.mover();
		ponerPiezas();

	}
	
	public void mover() {
		ia.mover();
	}
	
	private IA ponerIA(String claseIA) {
		try {
			Class<?> Jugador_IA = Class.forName(claseIA);
			try {
				ia = (games.onitama.IA) Jugador_IA.newInstance();
			} catch (InstantiationException e) {
				//e.printStackTrace();
				ia = new IA();
			} catch (IllegalAccessException e) {
				//e.printStackTrace();
				ia = new IA();
			}
		} catch (ClassNotFoundException e) {
			//e.printStackTrace();
			ia = new IA();
		}
		
		return ia;

	}
	
	private void ponerPiezas() {
		for(int i = 0; i<5;i++) {
			piezas[i] = new Pieza();
			piezas[i].posFila = 0;
			piezas[i].posColumna = i;
		}
		piezas[2].maestro();
	}


}


