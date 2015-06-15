import Prog1Tools.GraphicScreen;

public class Linienmuster1{
	
	public static void main (String[] args){
		//neue Instanzvon GraphicScreen erzeugen
		GraphicScreen screen = GraphicScreen.getInstance();
		// variablen festlegen
		int x1, y1, x2, y2;
		//varibale MILLISEKUNDEN auf final(endgueltig) festlegen
		final int MILLISEKUNDEN = 10;
		//startkoordinaten der Linie
		x1 = 0;
		y1 = 0;
		//zielkoordinaten der Linie
		x2 = 800;
		y2 = 600;
		
		do{
			screen.drawLine(x1, y1, x2, y2); //Linie zeichnen
			screen.pause(MILLISEKUNDEN);
			x1 = x1 + 20; //zu der Variable x1, 20 hinzufuegen
			x2 = x2 - 20; //von der Variable x2, 20 abziehn
		} while (x2 >= 0); //solange wiederholen, wie x2 groesser gleich 0 
	}
}
