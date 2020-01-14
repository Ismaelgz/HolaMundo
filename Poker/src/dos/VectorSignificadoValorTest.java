package dos;

public class VectorSignificadoValorTest {

	public static void main(String[] args) {
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
		 *  	 *  		 */
//		int postura[][]={{0,0,0,0,0},{1,0,0,0,0},{2,0,0,0,0},
//				{0,1,0,0,0},{1,1,0,0,0},{0,0,1,0,0},{0,0,0,1,0},
//				{0,0,0,0,1},{0,0,0,1,1}};
		int postura[]={0,0,0,0,0};
//		for (int i = 0; i < postura.length; i++) {
//			System.out.println(calcularPosturaBaza(postura[i]));
//		}
			System.out.println(calcularPosturaBaza(postura));
		
	}

	/**
	 * calcula un valor numerico para cada posible 
	 * estado de la postura, de forma que una baza de mayor peso
	 * tiene un valor numerico mayor
	 * @param postura
	 * @return
	 */
	public  static int calcularPosturaBaza(int postura[]) {
		int acumulado=0;
		for (int i = 0,j=1; i < postura.length; i++,j+=2) {
			acumulado+=(i+j)*postura[i];
		}
		return acumulado;
	}
}
