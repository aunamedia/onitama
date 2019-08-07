package games.onitama;

import java.lang.reflect.Array;

public class Carta {
	
	public PosicionRelativa[] posiciones;
	
	public Carta() {
		posiciones = new PosicionRelativa[0];
	}
	
	public void addPosicion(int despHor, int despVer) {
		PosicionRelativa pos = new PosicionRelativa();
		pos.despHor = despHor;
		pos.despVer = despVer;
		
		//a = Arrayy.copyOf
	}

}
