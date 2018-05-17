
/**
 * 
 * @author Eva Gorbano Pinet
 */
public class Pantry {
	private Jam jar1;
	private Jam jar2;
	private Jam jar3;
	private Jam selected;
/**
 * 
 * @param jar1 jar amb numero 1
 * @param jar2 jar amb numero 2
 * @param jar3 jar amb numero 3
 */
	Pantry(Jam jar1, Jam jar2, Jam jar3) {
		this.jar1 = jar1;
		this.jar2 = jar2;
		this.jar3 = jar3;
		selected = null;
	}
/**
 * Mostra els resultats per pantalla
 */
	public void print() {
		System.out.print("1: ");
		jar1.print();
		System.out.print("2: ");
		jar2.print();
		System.out.print("3: ");
		jar3.print();
	}
/**
 * Selecciona el jar corresponent
 * @param jarNumber numero del jar
 */
	public void select(int jarNumber) {
		if (jarNumber == 1) {
			selected = jar1;
		} else if (jarNumber == 2) {
			selected = jar2;
		} else {
			selected = jar3;
		}
	}
/**
 * Unta amb mantega 
 * @param oz Capacitat del jar
 */
	public void spread(int oz) {
		selected.spread(oz);
	}
}
