
/**
 * 
 * @author Eva Gorbano Pinet
 */
public class Jam {
	private String contents;
	private String date;
	private int capacity;
	private static int numTotalJars, noJam = 0;

        /**
         * 
         * @param contents 
         * @param date: data del jar
         * @param size: capacitat del jar
         */
	Jam(String contents, String date, int size) {
		this.contents = contents;
		this.date = date;
		capacity = size;
		numTotalJars++;
	}

        /**
         * 
         * @return capacitat 0
         */
	public boolean empty() {
		return (capacity == 0);
	}

        /**
         * Mostra per pantalla la informació
         */
	public void print() {
		System.out.println(contents + " " + date + " " + capacity + " fl. oz.");
		System.out.println("El numero total de Jars creats des de l'inici dels temps son: " + Jam.getNumTotalJars());
		System.out.println("El numero de Jars que s'han quedat sense melmelada des de l'inici dels temps: " + Jam.getNoJam());
	}

        /**
         * Metode per buidar jars
         * @param fluidOz: quantitat de mermelada que es va buidant
         */
	public void spread(int fluidOz) {
		if (!empty()) {
			if (fluidOz < capacity) {
				System.out.println("Spreading " + fluidOz + " fluid ounces of " + contents);
				capacity = capacity - fluidOz;
			} else {
				System.out.println("Spreading " + capacity + " fluid ounces of " + contents);
				capacity = 0;
				noJam++;			}
		} else {
			System.out.println("No jam in the Jar!");
		}
	}

        /**
         * 
         * @return nombre total de Jars
         */
	public static int getNumTotalJars() {
		return numTotalJars;
	}

        /**
         * 
         * @return nombre de jars sense mermelada
         */
	public static int getNoJam() {
		return noJam;
	}
}
