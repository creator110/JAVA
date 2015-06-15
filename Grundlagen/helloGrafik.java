import javax.swing.JLabel
import javax.swing.JFrame
public class HelloGrafik{
	
	// Deklaration und Initalisierung von 
	// - globalen statischen Konstanten
	// - globalen statischen Variablen

	public static void main (String[] args){
		
		// Deklaration und Initialisierung von
		// - lokalen Konstanten
		// - lokalen Variablen
	
		//erzuege neues Frame
		JFrame mainFrame = new JFrame;
		//Breite: 800pixel, Hoehe: 600pixel
		mainFrame.setSize(800,600);
		//Label hinzufuegen
		mainFrame.add(new JLabel("Hello Grafik"));
		//Frame anzeigen lassen
		mainFrame.setVisible(true);
		
		
	}
}
