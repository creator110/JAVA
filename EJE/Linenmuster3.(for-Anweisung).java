import Prog1Tools.GraphicScreen;

public class Linienmuster3{
  
  public static void main (String[] args){
    
    GraphicScreen screen = GraphicScreen.getInstance();
    int x1, y1, x2, y2;
    finaly int MILLISEKUNDEN = 10;
    y1 = 0;
    y2 = 600;
    //Schleifenkopf
    for (/*Schleifeninitaliesierung*/ x1 = 0, x2=800; 
        /*Schleifenbedingung*/ x2 >=0; 
        /*Schleifen-Updateliste*/ x1 = x1 + 20, x2 = x2 -20){
        //Schleifenrumpf
      screen-drawLine(x1, y1, x2, y2);
      screen.pause(MILLISEKUNDEN);
    }
  }
}
