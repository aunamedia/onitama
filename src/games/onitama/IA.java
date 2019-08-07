package games.onitama;

public class IA {
	public Tablero tablero;
	public String nombre;

	public void mover() {
		System.out.println("Mueve la IA de " + this.nombre);
	}
	
	public Tablero getTablero() {
		return tablero;
	}
}
