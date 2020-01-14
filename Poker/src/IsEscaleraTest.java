
public class IsEscaleraTest {

	public static void main(String[] args) {
		// Para encontrar una escalera debo tener e3n cuanta las unidades
		int baza[] = { 13, 14, 25, 26, 37 };
		System.out.println(isEscalera(baza));

	}

	public static boolean isEscalera(int baza[]) {
		// premisa de arranque es que hay escalera
		// lo que buscamos es el contra ejemplo
		boolean retorno = true;
		int i = 0;
		do {			
			if (!isConsecutiva(baza, i)) {
				// buscando el contra ejemplo
				retorno = false;
			}
			i++;
			// sale del bucle cuando ha encontrado un contraejemplo
			// o cuando ha llegado al final del vector sin encontrarlo
		} while (retorno && i < baza.length - 1);
		return retorno;
	}

	public static boolean isConsecutiva(int[] baza, int i) {
		int base = 10;
		return (baza[i] % base)+1 == baza[i+1] % base;
	}
}
