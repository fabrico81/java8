package java8.codility;

public class Proviamo {
	
	public void cambiaValore(int valore){
		valore = 1000;
	}
	
	public int cambiaValoreERestituisce(int valore){
		valore = 1000;
		return valore;
	}


	private int a ;

	private void setA(int a){
		this.a = a;
	}

	private void setC(int c){
		this.c = c;
	}

	private int c;

	private transient int b;

	private void setB(int b){
		this.b = b;
	}
}

