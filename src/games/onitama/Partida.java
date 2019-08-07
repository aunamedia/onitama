package games.onitama;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Partida {
	
	public Tablero tablero;
	public Jugador jugador1, jugador2;
	private Properties prop;
	public Jugador[] jugadores;

	public Partida() {
		System.out.println("Creamos una partida");
		
		setProperties();
		
		this.tablero = new Tablero();
		System.out.println("El tablero se llama " + this.tablero.nombre);
		jugador1 = new Jugador(prop.getProperty("JUGADOR1.NOMBRE"),prop.getProperty("JUGADOR1.IA"));
		jugador2 = new Jugador(prop.getProperty("JUGADOR2.NOMBRE"), prop.getProperty("JUGADOR2.IA"));
		//jugadores[0] = jugador1;
		//jugadores[1] = jugador2;
		jugador1.ia.tablero = jugador2.ia.tablero = tablero;
		jugador1.mover();
		jugador2.mover();
		jugador1.mover();
		jugador2.mover();
	}
	
	public void start() {
		System.out.println("Comienza la partida");
	}
	
	public void setProperties() {
		this.prop = new Properties();
		InputStream input = null;
		
		try {
			input = new FileInputStream("Onitama.properties");
			prop.load(input);
		} catch (IOException io) {
			io.printStackTrace();
		} finally {
			if(input != null) {
				try {
					input.close();
				} catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
