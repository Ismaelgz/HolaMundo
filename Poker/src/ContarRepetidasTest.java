
public class ContarRepetidasTest {

	public static void main(String[] args) {
		int baza[] = { 2, 2, 2, 3, 3 };
		int posicion = 0;
		do {
			int repetidas = contarRepetidas(baza, posicion);
			// El resultado de la primera llamada debe ser 1
			System.out.println(repetidas);
			posicion += repetidas + 1;
			System.out.println("posicion " + posicion);
		} while (posicion < baza.length - 1);
	}

	/**
	 * Cuenta las cartas de la baza que son repetidas
	 * 
	 * @param baza     el vector de cinco elementos ordenados
	 * @param posicion desde donde debe comenzar a contar
	 * @return un valor entre 0 y 3
	 */
	public static int contarRepetidas(int[] baza, int posicion) {
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
