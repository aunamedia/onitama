package games.onitama;

public class Pieza {
	public Boolean maestro = false;
	public int posFila, posColumna;
	
	
	public Pieza() {
		//System.out.println("Ponemos pieza");
	}
	
	public void maestro() {
		maestro = true;
	}
}
