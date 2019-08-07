import games.onitama.IA;

public class Antonio_IA_onitama extends IA {

	public Antonio_IA_onitama() {
		super();
		System.out.println("¿Qué pasa?, Soy la I.A. Antonio");
	}
	
	public void mover() {
		System.out.println("YO MUEVO MEJOR en el " + super.tablero.nombre);
	}
}
