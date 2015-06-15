import Prog1Tools.GraphicScreen;

public class Linienmuster1{
	
	public static void main (String[] args){
		
		GraphicScreen screen = GraphicScreen.getInstance();
		int x1, y1, x2, y2;
		final int MILLISEKUNDEN = 10;
		x1 = 0;
		y1 = 0;
		x2 = 800;
		y2 = 600;
		do{
			screen.drawLine(x1, y1, x2, y2);
			screen.pause(MILLISEKUNDEN);
			x1 = x1 + 20;
			x2 = x2 - 20;
		} while (x2 >= 0);
	}
}
