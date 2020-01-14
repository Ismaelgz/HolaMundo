
public class AnotarPosturaTest {

	public static void main(String[] args) {
		int baza[] = { 2, 2, 2, 3, 3 };
		int posicion = 0;
		int postura[] = new int[3];
		do {
			int repetidas = ContarRepetidasTest.contarRepetidas(baza, posicion);			
			anotarPostura(postura, repetidas);
			posicion += repetidas + 1;
		} while (posicion < baza.length - 1);
		for (int i = 0; i < postura.length; i++) {
			System.out.println(postura[i]);
		}

	}
	/**
	 * Analiza la cantidad de figuras que hay en un momento
	 * @param postura la infomracion sobre las figuras
	 * @param repetidas numero de cartas consecutivas repetidas
	 */
	public static void anotarPostura(int[] postura, int repetidas) {
		switch (repetidas) {
		case 1:
			postura[0]++;
			break;
		case 2:
			postura[1]++;
			break;
		case 3:
			postura[2]++;
			break;
		}
	}
}
