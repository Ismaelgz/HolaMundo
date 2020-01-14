
public class PokerConPalos {
	public static void main(String[] args) {
		int cartaMasAlta = 40;
		int cartaMasBaja = 1;
		// Pero de esta forma como podemos asegurar que no se repiten las cartas?
		// Habría que comparar cada carta cuando sale, con el resto, poco efectivo
		// Como usar los vectores para estas cosas?
		// Juguemos un poco
		int baraja[] = crearBaraja(cartaMasAlta);
		barajarCartas(baraja);
		//Que tenemos que hacer para el lunes
		/*
		 * 1o.- un sistema para repartir, sin repeticion, valores desde mian hasta max.
		 * 2o.- basandote en lo anterior del poker haz que reconozca:
		 * 	- la escalera (no ciclica)
		 * 	- color (todas las cartas del mismo palo)
		 * 	- la ecalera de color
		 * 3o.- Haz que el programa permita 4 jugadores (decidir el ganador)
		 */
	}

	public static void intercambiarCartas(int[] vector, int i, int j) {
		int intercambio = vector[i];
		vector[i] = vector[j];
		vector[j] = intercambio;

	}

	public static void barajarIntercalando(int[] baraja) {
		int cantidad = 1000;
		for (int movimientos = 0; movimientos < cantidad; movimientos++) {
			for (int i = baraja.length / 2, j = 0; i < baraja.length; i++, j += 2) {
				intercambiarCartas(baraja, i, j);
			}
		}
	}

	private static void barajarCartas(int[] baraja) {
		// TODO Auto-generated method stub

	}

	public static int[] crearBaraja(int cartaMasAlta) {
		int retorno[] = new int[cartaMasAlta];
		for (int i = 0; i < retorno.length; i++) {
			retorno[i] = i;
		}
		return retorno;
	}
}
