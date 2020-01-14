import resources.Utiles;

public class DetectarPosturaTest {
	/*
	 * Partiendo de la base de que tengo un vector que 
	 * me indica las ocurrencias
	 * parejas trio poker  escalera color
	 *  1 0 0 0 0 pareja           1
	 *  2 0 0 0 0 doble pareja     2
	 *  0 1 0 0 0 trio             3 
	 *  1 1 0 0 0 full             4 
	 *  0 0 1 0 0 poker            5 
	 *  0 0 0 1 0 escalera         6
	 *  0 0 0 0 1 color            7
	 *  0 0 0 1 1 escalera de color 13
	 *  */
	public static void main(String[] args) {
		int baza[]= {12,13,14,15,16};
		int postura[]= new int[5];
		detectarPostura(postura, baza);
		Utiles.mostrarVector(postura);
	}
	private static void detectarPostura(int[] postura, int[] baza) {
		//Problema: hay que conocer las posiciones
		boolean color=false,escalera=false;
		int posColor=4, posEscalera=3;
		if(isColorTest.isColor(baza)) {
			postura[posColor]=1;
			color=true;
		}
		if(IsEscaleraTest.isEscalera(baza)) {
			postura[posEscalera]=1;
			escalera=true;
		}
		if(!escalera&&!color) {
			//Si no es ni color ni escalera busca las repetidas
			detectarDuplicadas(postura, baza);
		}
		
	}
	private static void detectarDuplicadas(int[] postura, int[] baza) {
		int posicion=0;
		int[] bazaReducida=reducirBaza(baza);
		do {
			int repetidas = ContarRepetidasTest.contarRepetidas(bazaReducida, posicion);			
			AnotarPosturaTest.anotarPostura(postura, repetidas);
			posicion += repetidas + 1;
		} while (posicion < baza.length - 1);
		
	}

	private static int[] reducirBaza(int[] baza) {
		int bazaReducida[]=new int[baza.length];
		int base=10;
		for (int i = 0; i < bazaReducida.length; i++) {
			bazaReducida[i]=baza[i]%base;
		}
		return bazaReducida;
	}
}
