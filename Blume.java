
/**
 *  Blume, die darauf wartet gesammelt zu werden
 * 
 * @author Peter Brichzin
 * @version 1.0
 */
public class Blume extends Figur
{
    private int ID;
   /**
   * Der Konstruktor1 erzeugt eine Blume an der Pixel-Position (225/125). 
    */
    Blume (int ID)
    {
       super();
       this.FigurteilFestlegenEllipse(0, 0, 25, 25, "gelb");
       this.FigurteilFestlegenEllipse(0, -20, 20, 20, "weiss");
       this.FigurteilFestlegenEllipse(20, -10, 20, 20, "weiss");
       this.FigurteilFestlegenEllipse(20, 10, 20, 20, "weiss");
       this.FigurteilFestlegenEllipse(0, 20, 20, 20, "weiss");
       this.FigurteilFestlegenEllipse(-20, -10, 20, 20, "weiss");
       this.FigurteilFestlegenEllipse(-20, 10, 20, 20, "weiss");
       this.PositionSetzen(225, 125);
       this.ID = ID;
    }

   /**
   * ID zuweisung der Farben
   * 
   */
   Blume (int xNeu, int yNeu)
    {
       super();
       this.FigurteilFestlegenEllipse(0, 0, 25, 25, "gelb");
       this.FigurteilFestlegenEllipse(0, -20, 20, 20, "rot");
       this.FigurteilFestlegenEllipse(20, -10, 20, 20, "rot");
       this.FigurteilFestlegenEllipse(20, 10, 20, 20, "rot");
       this.FigurteilFestlegenEllipse(0, 20, 20, 20, "rot");
       this.FigurteilFestlegenEllipse(-20, -10, 20, 20, "rot");
       this.FigurteilFestlegenEllipse(-20, 10, 20, 20, "rot");
       this.GanzNachVornBringen();
       
       if(xNeu<10 && xNeu>=0 && yNeu<10 && yNeu>=0)
       {
             this.PositionSetzen(xNeu*50 +25, yNeu*50 +25);
       }
    }
}
   