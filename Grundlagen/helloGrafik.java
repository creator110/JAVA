import javax.swing.JLabel
import javax.swing.JFrame
public class HelloGrafik{

	public static void main (String[] args){
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
