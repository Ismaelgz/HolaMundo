import java.util.Arrays;

public class Poker {
	public static void main(String[] args) {
		int baza[] = { 2, 2, 3, 4, 5 };
		Arrays.sort(baza);
		int posicion = 0;
		do {
			int repetidas = contarRepetidas(baza, posicion);
			// Postura
			/*
			 * LA primera posicion es el numero de parejas la segunda el numero de trios la
			 * tercera el numero de pokers
			 */
			int postura[] = new int[3];
			anotarPostura(postura, repetidas);
			posicion += repetidas + 1;
		} while (posicion < baza.length - 1);
	}

	/**
	 * Analiza la cantidad de figuras que hay en un momento
	 * @param postura la infomracion sobre las figuras
	 * @param repetidas numero de cartas consecutivas repetidas
	 */
	private static void anotarPostura(int[] postura, int repetidas) {
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

	/**
	 * Cuenta las cartas de la baza que son repetidas
	 * 
	 * @param baza     el vector de cinco elementos ordenados
	 * @param posicion desde donde debe comenzar a contar
	 * @return un valor entre 0 y 3
	 */
	private static int contarRepetidas(int[] baza, int posicion) {
		int repetidas = 0;
		// no me puedo pasar del tamaño del vector
		// por eso pongo el if
		// Como comparo un elemento con el siguiente
		// tengo que poner longitud-1
		boolean comparacion = true;
		do {
			comparacion = baza[posicion] == baza[posicion + 1];
			if (comparacion) {
				repetidas++;
			}
			posicion++;
		} while (comparacion && posicion < baza.length - 1);
		return repetidas;
	}

}
