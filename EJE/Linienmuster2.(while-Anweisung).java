import Prog1Tools.GraphicScreen;

Public class Linienmuster2{

  public static void main (String[] args){
    
    //neue Instanz von GraphicScreen erzeugen
    GraphicScreen screen = GraphicScreen.getInstance();
    // Variablen festlegen
    int x1, y1 x2, y2;
    final int MILLISEKUNDEN = 10;
    x1 = 0;
    y1 = 0;
    x2 = 800;
    y2 = 600;
    //Schleife wiederholen bis x2 kleiner gleich 0
    while (x2 >= 0){
      screen.drawLine(x1, y1,x2,y2);
      screen.pause(MILLISEKUNDEN);
      //x1 plus 20, x2 minus 20
      x1 = x1 + 20;
      x2 = x2 - 20;
    }
  }
}
