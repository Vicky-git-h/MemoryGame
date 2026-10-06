
/**
 *  Blume, die darauf wartet gesammelt zu werden
 * 
 * @author Peter Brichzin
 * @version 1.0
 */
public class Blume extends Figur
{
    private int id;
   /**
   * Der Konstruktor1 erzeugt eine Blume an der Pixel-Position (225/125). 
    */
    Blume (int xLinksOben, int yLinksOben)
    {
       super();
       this.FigurteilFestlegenEllipse(0, 0, 25, 25, "gelb");
       this.FigurteilFestlegenEllipse(0, -20, 20, 20, "weiss");
       this.FigurteilFestlegenEllipse(20, -10, 20, 20, "weiss");
       this.FigurteilFestlegenEllipse(20, 10, 20, 20, "weiss");
       this.FigurteilFestlegenEllipse(0, 20, 20, 20, "weiss");
       this.FigurteilFestlegenEllipse(-20, -10, 20, 20, "weiss");
       this.FigurteilFestlegenEllipse(-20, 10, 20, 20, "weiss");
       this.PositionSetzen( xLinksOben+15, yLinksOben+15);
       this.GanzNachVornBringen();
    }
    public void setid(int id) {
        this.id = id;
    }
}
   