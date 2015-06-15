import Prog1Tools . GraphicScreen ;
 public class HelloWorldGrafikbildschirm{
  // Deklaration und Initialisierung von
  // - globalen statischen Konstanten
  // - globalen statischen Variablen

  public static void main ( String [] args )
  {
    // Deklaration und Initialisierung von:
    // - lokalen Konstanten
    // - lokalen Variablen
    GraphicScreen screen = GraphicScreen . getInstance ();

    // Anweisungen
    screen . drawText (400, 300, " Hello World ");
  }
}
