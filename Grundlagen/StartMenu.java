import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import Javax.swing.JFrame;
import Javax.swing.JLabel;
import Javax.swing.JButton;

public static void StartMenu{
	
	public static void main(string[] args){
		//Frame erzeugen
		JFrame mainFrame = new JFrame;
		mainFrame.setSize(680, 340);
		mainFrame.setLocation(100, 100);
		
		//Titel Schrift erzeugen
		JLabel titel_Label = new JLabel;
		titel_Label.setSize(20, 100);
		titel_Label.setLocation(350, 25);
		titel_Label.setText("Start Bildschirm");

		//Button erzeugen
		
		//Start Button
		JButton B_start = new JButton;
		//B_start.setSize(20, 100);
		//B_start.setLocation(350, 100);
		B_start.setText("START");
		
		//OptionenButton
		JButton B_optionen = new JButton;
		//B_optionen.setSize(20,100);
		//B_optionen.setLocation(350, 140);
		B_optionen.setText("OPTIONEN");
		
		//Exit Button
		JButton B_exit = new JButton;
		//B_exit.setSize(20, 100);
		//B_exit.setLocation(350, 180);
		B_exit.setText("EXIT");
		
		//Titel und Button dem Frame zuweisen
		mainFrame.add(titel_Label);
		//mainFrame.add(B_start);
		//mainFrame.add(B_optionen);
		//mainFrame.add(B_exit);
		
		//Frame anzeigen
		mainFrame.setVisible(true);
	}
	
	// class ButtonLauscher implements ActionListener{
		
		// public void actionPerformed(ActionEvent e) {
			// if(e.getSource() == B_start){
				// System.out.println("START-Button geklickt");
			// }else if(e.getSource() == B_optionen){
				// System.out.println("OPTIONEN-Button geklickt");
			// }else if{
				// System.out.println("EXIT-Button geklickt");
			// }
	// }
}
