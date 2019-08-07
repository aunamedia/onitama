package games.onitama;

public class Tablero {
	
	public String nombre = "Tablero principal";
	public Casilla[][] casillas = new Casilla[5][5]; 
	/*
	[4][0]	[4][1]	[4][2]	[4][3]	[4][4]	
	[3][0]	[3][1]	[3][2]	[3][3]	[3][4]	
	[2][0]	[2][1]	[2][2]	[2][3]	[2][4]	
	[1][0]	[1][1]	[1][2]	[1][3]	[1][4]	
	[0][0]	[0][1]	[0][2]	[0][3]	[0][4]	
	 */

	public Tablero() {
		System.out.println("Creamos un tablero y sus casillas");
		crearCasillas();
	}
	
	public void crearCasillas() {
		for(int i = 0; i<5;i++) {
			for(int j = 0; j<5;j++) {
				casillas[i][j] = new Casilla(i,j);
			}
		}
	}

}
