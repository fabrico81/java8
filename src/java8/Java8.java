/**
 * 
 */
package java8;

/**
 * @author corrente
 *
 */
public class Java8 {

	/**
	 * @param args
	 */
	float f = 3.14f;


	public static void main(String[] args) {
		
		float f = 3.14f;
		int i = 1_000_000;
		int a = 0;
		Proviamo prov = new Proviamo();
		prov.cambiaValore(i);
		System.out.println("cambia valore: "+  i);
		
		Proviamo prov1 = new Proviamo();
		prov1.cambiaValoreERestituisce(i);
		System.out.println("cambia valore e restituisce: " +i);
		//Reference
		System.out.println("cambia valore e restituisce: " +prov1.cambiaValoreERestituisce(i));

	}

	public String solution(int [] T){

		int array [] = {-4, 12, 13, 40, 9, 32, 4, 27 };

		return "";
	}

}
