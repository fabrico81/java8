package java8.codility;

import java.awt.Button;
import java.awt.Frame;

public class FinestraConBottone {
	public static void main (String [] args){
		Frame finestra = new Frame("Titolo");
		Button bottone = new Button("Clicca");
		finestra.add(bottone);
		finestra.setSize(200,100);
		finestra.setVisible(true);
	}

}
