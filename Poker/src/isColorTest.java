
public class isColorTest {
	public static void main(String[] args) {
		int baza[]= {13,14,16,18,19};
		System.out.println(isColor(baza));
	}
	/*
	 * Utilizamos los valores de 0 a 9 de cada decena
	 * para representar las cartas de 1 hasta 0 de cada decena
	 * De esta forma solucionamos el problema de hacer que los valores
	 * x9 sean consecutivos con (x+1)0
	 */
	public static boolean isColor(int baza[]){
		boolean retorno=true;
		int i=0;
		do {
			int base = 10;
			if(baza[i]/base!=baza[i+1]/base){
				retorno=false;
			}
			i++;
		}while(retorno&&i<baza.length-1);
		return retorno;
	}
}
