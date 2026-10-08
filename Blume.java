
/**
 *  Blume, die darauf wartet gesammelt zu werden
 * 
 * @author Peter Brichzin
 * @version 1.0
 */
public class Blume extends Figur
{
    private static int id;
    /**
     * Der Konstruktor1 erzeugt eine Blume an der Pixel-Position (225/125). 
     */
    Blume (int xLinksOben, int yLinksOben, int ID)
    {
        super();
        this.id = ID;
        this.PositionSetzen( xLinksOben+15, yLinksOben+15);

        switch (id) {
            case 0:
                this.FigurteilFestlegenEllipse(0, 0, 25, 25, "schwarz");
                this.FigurteilFestlegenEllipse(0, -20, 20, 20, "weiss");
                this.FigurteilFestlegenEllipse(20, -10, 20, 20, "weiss");
                this.FigurteilFestlegenEllipse(20, 10, 20, 20, "weiss");
                this.FigurteilFestlegenEllipse(0, 20, 20, 20, "weiss");
                this.FigurteilFestlegenEllipse(-20, -10, 20, 20, "weiss");
                this.FigurteilFestlegenEllipse(-20, 10, 20, 20, "weiss");
                break;
            case 1:
                this.FigurteilFestlegenEllipse(0, 0, 25, 25, "schwarz");
                this.FigurteilFestlegenEllipse(0, -20, 20, 20, "rot");
                this.FigurteilFestlegenEllipse(20, -10, 20, 20, "rot");
                this.FigurteilFestlegenEllipse(20, 10, 20, 20, "rot");
                this.FigurteilFestlegenEllipse(0, 20, 20, 20, "rot");
                this.FigurteilFestlegenEllipse(-20, -10, 20, 20, "rot");
                this.FigurteilFestlegenEllipse(-20, 10, 20, 20, "rot");
                break;
            case 2:
                this.FigurteilFestlegenEllipse(0, 0, 25, 25, "schwarz");
                this.FigurteilFestlegenEllipse(0, -20, 20, 20, "blau");
                this.FigurteilFestlegenEllipse(20, -10, 20, 20, "blau");
                this.FigurteilFestlegenEllipse(20, 10, 20, 20, "blau");
                this.FigurteilFestlegenEllipse(0, 20, 20, 20, "blau");
                this.FigurteilFestlegenEllipse(-20, -10, 20, 20, "blau");
                this.FigurteilFestlegenEllipse(-20, 10, 20, 20, "blau");
                break;
            case 3:
                this.FigurteilFestlegenEllipse(0, 0, 25, 25, "schwarz");
                this.FigurteilFestlegenEllipse(0, -20, 20, 20, "gelb");
                this.FigurteilFestlegenEllipse(20, -10, 20, 20, "gelb");
                this.FigurteilFestlegenEllipse(20, 10, 20, 20, "gelb");
                this.FigurteilFestlegenEllipse(0, 20, 20, 20, "gelb");
                this.FigurteilFestlegenEllipse(-20, -10, 20, 20, "gelb");
                this.FigurteilFestlegenEllipse(-20, 10, 20, 20, "gelb");
                break;
            case 4:
                this.FigurteilFestlegenEllipse(0, 0, 25, 25, "schwarz");
                this.FigurteilFestlegenEllipse(0, -20, 20, 20, "grün");
                this.FigurteilFestlegenEllipse(20, -10, 20, 20, "grün");
                this.FigurteilFestlegenEllipse(20, 10, 20, 20, "grün");
                this.FigurteilFestlegenEllipse(0, 20, 20, 20, "grün");
                this.FigurteilFestlegenEllipse(-20, -10, 20, 20, "grün");
                this.FigurteilFestlegenEllipse(-20, 10, 20, 20, "grün");
                break;
            case 5:
                this.FigurteilFestlegenEllipse(0, 0, 25, 25, "schwarz");
                this.FigurteilFestlegenEllipse(0, -20, 20, 20, "braun");
                this.FigurteilFestlegenEllipse(20, -10, 20, 20, "braun");
                this.FigurteilFestlegenEllipse(20, 10, 20, 20, "braun");
                this.FigurteilFestlegenEllipse(0, 20, 20, 20, "braun");
                this.FigurteilFestlegenEllipse(-20, -10, 20, 20, "braun");
                this.FigurteilFestlegenEllipse(-20, 10, 20, 20, "braun");
                break;
            case 6:
                this.FigurteilFestlegenEllipse(0, 0, 25, 25, "schwarz");
                this.FigurteilFestlegenEllipse(0, -20, 20, 20, "magenta");
                this.FigurteilFestlegenEllipse(20, -10, 20, 20, "magenta");
                this.FigurteilFestlegenEllipse(20, 10, 20, 20, "magenta");
                this.FigurteilFestlegenEllipse(0, 20, 20, 20, "magenta");
                this.FigurteilFestlegenEllipse(-20, -10, 20, 20, "magenta");
                this.FigurteilFestlegenEllipse(-20, 10, 20, 20, "magenta");
                break;
            case 7:
                this.FigurteilFestlegenEllipse(0, 0, 25, 25, "schwarz");
                this.FigurteilFestlegenEllipse(0, -20, 20, 20, "grau");
                this.FigurteilFestlegenEllipse(20, -10, 20, 20, "grau");
                this.FigurteilFestlegenEllipse(20, 10, 20, 20, "grau");
                this.FigurteilFestlegenEllipse(0, 20, 20, 20, "grau");
                this.FigurteilFestlegenEllipse(-20, -10, 20, 20, "grau");
                this.FigurteilFestlegenEllipse(-20, 10, 20, 20, "grau");
                break;
            case 8:
                this.FigurteilFestlegenEllipse(0, 0, 25, 25, "schwarz");
                this.FigurteilFestlegenEllipse(0, -20, 20, 20, "cyan");
                this.FigurteilFestlegenEllipse(20, -10, 20, 20, "cyan");
                this.FigurteilFestlegenEllipse(20, 10, 20, 20, "cyan");
                this.FigurteilFestlegenEllipse(0, 20, 20, 20, "cyan");
                this.FigurteilFestlegenEllipse(-20, -10, 20, 20, "cyan");
                this.FigurteilFestlegenEllipse(-20, 10, 20, 20, "cyan");
                break;
            case 9:
                this.FigurteilFestlegenEllipse(0, 0, 25, 25, "schwarz");
                this.FigurteilFestlegenEllipse(0, -20, 20, 20, "orange");
                this.FigurteilFestlegenEllipse(20, -10, 20, 20, "orange");
                this.FigurteilFestlegenEllipse(20, 10, 20, 20, "orange");
                this.FigurteilFestlegenEllipse(0, 20, 20, 20, "orange");
                this.FigurteilFestlegenEllipse(-20, -10, 20, 20, "orange");
                this.FigurteilFestlegenEllipse(-20, 10, 20, 20, "orange");
                break;
            case 10:
                this.FigurteilFestlegenEllipse(0, 0, 25, 25, "weiss");
                this.FigurteilFestlegenEllipse(0, -20, 20, 20, "weiss");
                this.FigurteilFestlegenEllipse(20, -10, 20, 20, "weiss");
                this.FigurteilFestlegenEllipse(20, 10, 20, 20, "weiss");
                this.FigurteilFestlegenEllipse(0, 20, 20, 20, "weiss");
                this.FigurteilFestlegenEllipse(-20, -10, 20, 20, "weiss");
                this.FigurteilFestlegenEllipse(-20, 10, 20, 20, "weiss");
                break;
            case 11:
                this.FigurteilFestlegenEllipse(0, 0, 25, 25, "weiss");
                this.FigurteilFestlegenEllipse(0, -20, 20, 20, "rot");
                this.FigurteilFestlegenEllipse(20, -10, 20, 20, "rot");
                this.FigurteilFestlegenEllipse(20, 10, 20, 20, "rot");
                this.FigurteilFestlegenEllipse(0, 20, 20, 20, "rot");
                this.FigurteilFestlegenEllipse(-20, -10, 20, 20, "rot");
                this.FigurteilFestlegenEllipse(-20, 10, 20, 20, "rot");
                break;
            case 12:
                this.FigurteilFestlegenEllipse(0, 0, 25, 25, "weiss");
                this.FigurteilFestlegenEllipse(0, -20, 20, 20, "blau");
                this.FigurteilFestlegenEllipse(20, -10, 20, 20, "blau");
                this.FigurteilFestlegenEllipse(20, 10, 20, 20, "blau");
                this.FigurteilFestlegenEllipse(0, 20, 20, 20, "blau");
                this.FigurteilFestlegenEllipse(-20, -10, 20, 20, "blau");
                this.FigurteilFestlegenEllipse(-20, 10, 20, 20, "blau");
                break;
            case 13:
                this.FigurteilFestlegenEllipse(0, 0, 25, 25, "weiss");
                this.FigurteilFestlegenEllipse(0, -20, 20, 20, "gelb");
                this.FigurteilFestlegenEllipse(20, -10, 20, 20, "gelb");
                this.FigurteilFestlegenEllipse(20, 10, 20, 20, "gelb");
                this.FigurteilFestlegenEllipse(0, 20, 20, 20, "gelb");
                this.FigurteilFestlegenEllipse(-20, -10, 20, 20, "gelb");
                this.FigurteilFestlegenEllipse(-20, 10, 20, 20, "gelb");
                break;
            case 14:
                this.FigurteilFestlegenEllipse(0, 0, 25, 25, "weiss");
                this.FigurteilFestlegenEllipse(0, -20, 20, 20, "grün");
                this.FigurteilFestlegenEllipse(20, -10, 20, 20, "grün");
                this.FigurteilFestlegenEllipse(20, 10, 20, 20, "grün");
                this.FigurteilFestlegenEllipse(0, 20, 20, 20, "grün");
                this.FigurteilFestlegenEllipse(-20, -10, 20, 20, "grün");
                this.FigurteilFestlegenEllipse(-20, 10, 20, 20, "grün");
                break;
            case 15:
                this.FigurteilFestlegenEllipse(0, 0, 25, 25, "weiss");
                this.FigurteilFestlegenEllipse(0, -20, 20, 20, "braun");
                this.FigurteilFestlegenEllipse(20, -10, 20, 20, "braun");
                this.FigurteilFestlegenEllipse(20, 10, 20, 20, "braun");
                this.FigurteilFestlegenEllipse(0, 20, 20, 20, "braun");
                this.FigurteilFestlegenEllipse(-20, -10, 20, 20, "braun");
                this.FigurteilFestlegenEllipse(-20, 10, 20, 20, "braun");
                break;
            case 16:
                this.FigurteilFestlegenEllipse(0, 0, 25, 25, "weiss");
                this.FigurteilFestlegenEllipse(0, -20, 20, 20, "magenta");
                this.FigurteilFestlegenEllipse(20, -10, 20, 20, "magenta");
                this.FigurteilFestlegenEllipse(20, 10, 20, 20, "magenta");
                this.FigurteilFestlegenEllipse(0, 20, 20, 20, "magenta");
                this.FigurteilFestlegenEllipse(-20, -10, 20, 20, "magenta");
                this.FigurteilFestlegenEllipse(-20, 10, 20, 20, "magenta");
                break;
            case 17:
                this.FigurteilFestlegenEllipse(0, 0, 25, 25, "weiss");
                this.FigurteilFestlegenEllipse(0, -20, 20, 20, "grau");
                this.FigurteilFestlegenEllipse(20, -10, 20, 20, "grau");
                this.FigurteilFestlegenEllipse(20, 10, 20, 20, "grau");
                this.FigurteilFestlegenEllipse(0, 20, 20, 20, "grau");
                this.FigurteilFestlegenEllipse(-20, -10, 20, 20, "grau");
                this.FigurteilFestlegenEllipse(-20, 10, 20, 20, "grau");
                break;
            case 18:
                this.FigurteilFestlegenEllipse(0, 0, 25, 25, "weiss");
                this.FigurteilFestlegenEllipse(0, -20, 20, 20, "cyan");
                this.FigurteilFestlegenEllipse(20, -10, 20, 20, "cyan");
                this.FigurteilFestlegenEllipse(20, 10, 20, 20, "cyan");
                this.FigurteilFestlegenEllipse(0, 20, 20, 20, "cyan");
                this.FigurteilFestlegenEllipse(-20, -10, 20, 20, "cyan");
                this.FigurteilFestlegenEllipse(-20, 10, 20, 20, "cyan");
                break;
            case 19:
                this.FigurteilFestlegenEllipse(0, 0, 25, 25, "weiss");
                this.FigurteilFestlegenEllipse(0, -20, 20, 20, "orange");
                this.FigurteilFestlegenEllipse(20, -10, 20, 20, "orange");
                this.FigurteilFestlegenEllipse(20, 10, 20, 20, "orange");
                this.FigurteilFestlegenEllipse(0, 20, 20, 20, "orange");
                this.FigurteilFestlegenEllipse(-20, -10, 20, 20, "orange");
                this.FigurteilFestlegenEllipse(-20, 10, 20, 20, "orange");
                break;
            case 20:
                this.FigurteilFestlegenEllipse(0, 0, 25, 25, "rot");
                this.FigurteilFestlegenEllipse(0, -20, 20, 20, "weiss");
                this.FigurteilFestlegenEllipse(20, -10, 20, 20, "weiss");
                this.FigurteilFestlegenEllipse(20, 10, 20, 20, "weiss");
                this.FigurteilFestlegenEllipse(0, 20, 20, 20, "weiss");
                this.FigurteilFestlegenEllipse(-20, -10, 20, 20, "weiss");
                this.FigurteilFestlegenEllipse(-20, 10, 20, 20, "weiss");
                break;
            case 21:
                this.FigurteilFestlegenEllipse(0, 0, 25, 25, "rot");
                this.FigurteilFestlegenEllipse(0, -20, 20, 20, "rot");
                this.FigurteilFestlegenEllipse(20, -10, 20, 20, "rot");
                this.FigurteilFestlegenEllipse(20, 10, 20, 20, "rot");
                this.FigurteilFestlegenEllipse(0, 20, 20, 20, "rot");
                this.FigurteilFestlegenEllipse(-20, -10, 20, 20, "rot");
                this.FigurteilFestlegenEllipse(-20, 10, 20, 20, "rot");
                break;
            case 22:
                this.FigurteilFestlegenEllipse(0, 0, 25, 25, "rot");
                this.FigurteilFestlegenEllipse(0, -20, 20, 20, "blau");
                this.FigurteilFestlegenEllipse(20, -10, 20, 20, "blau");
                this.FigurteilFestlegenEllipse(20, 10, 20, 20, "blau");
                this.FigurteilFestlegenEllipse(0, 20, 20, 20, "blau");
                this.FigurteilFestlegenEllipse(-20, -10, 20, 20, "blau");
                this.FigurteilFestlegenEllipse(-20, 10, 20, 20, "blau");
                break;
            case 23:
                this.FigurteilFestlegenEllipse(0, 0, 25, 25, "rot");
                this.FigurteilFestlegenEllipse(0, -20, 20, 20, "gelb");
                this.FigurteilFestlegenEllipse(20, -10, 20, 20, "gelb");
                this.FigurteilFestlegenEllipse(20, 10, 20, 20, "gelb");
                this.FigurteilFestlegenEllipse(0, 20, 20, 20, "gelb");
                this.FigurteilFestlegenEllipse(-20, -10, 20, 20, "gelb");
                this.FigurteilFestlegenEllipse(-20, 10, 20, 20, "gelb");
                break;
            case 24:
                this.FigurteilFestlegenEllipse(0, 0, 25, 25, "rot");
                this.FigurteilFestlegenEllipse(0, -20, 20, 20, "grün");
                this.FigurteilFestlegenEllipse(20, -10, 20, 20, "grün");
                this.FigurteilFestlegenEllipse(20, 10, 20, 20, "grün");
                this.FigurteilFestlegenEllipse(0, 20, 20, 20, "grün");
                this.FigurteilFestlegenEllipse(-20, -10, 20, 20, "grün");
                this.FigurteilFestlegenEllipse(-20, 10, 20, 20, "grün");
                break;
            case 25:
                this.FigurteilFestlegenEllipse(0, 0, 25, 25, "rot");
                this.FigurteilFestlegenEllipse(0, -20, 20, 20, "braun");
                this.FigurteilFestlegenEllipse(20, -10, 20, 20, "braun");
                this.FigurteilFestlegenEllipse(20, 10, 20, 20, "braun");
                this.FigurteilFestlegenEllipse(0, 20, 20, 20, "braun");
                this.FigurteilFestlegenEllipse(-20, -10, 20, 20, "braun");
                this.FigurteilFestlegenEllipse(-20, 10, 20, 20, "braun");
                break;
            case 26:
                this.FigurteilFestlegenEllipse(0, 0, 25, 25, "rot");
                this.FigurteilFestlegenEllipse(0, -20, 20, 20, "magenta");
                this.FigurteilFestlegenEllipse(20, -10, 20, 20, "magenta");
                this.FigurteilFestlegenEllipse(20, 10, 20, 20, "magenta");
                this.FigurteilFestlegenEllipse(0, 20, 20, 20, "magenta");
                this.FigurteilFestlegenEllipse(-20, -10, 20, 20, "magenta");
                this.FigurteilFestlegenEllipse(-20, 10, 20, 20, "magenta");
                break;
            case 27:
                this.FigurteilFestlegenEllipse(0, 0, 25, 25, "rot");
                this.FigurteilFestlegenEllipse(0, -20, 20, 20, "grau");
                this.FigurteilFestlegenEllipse(20, -10, 20, 20, "grau");
                this.FigurteilFestlegenEllipse(20, 10, 20, 20, "grau");
                this.FigurteilFestlegenEllipse(0, 20, 20, 20, "grau");
                this.FigurteilFestlegenEllipse(-20, -10, 20, 20, "grau");
                this.FigurteilFestlegenEllipse(-20, 10, 20, 20, "grau");
                break;
            case 28:
                this.FigurteilFestlegenEllipse(0, 0, 25, 25, "rot");
                this.FigurteilFestlegenEllipse(0, -20, 20, 20, "cyan");
                this.FigurteilFestlegenEllipse(20, -10, 20, 20, "cyan");
                this.FigurteilFestlegenEllipse(20, 10, 20, 20, "cyan");
                this.FigurteilFestlegenEllipse(0, 20, 20, 20, "cyan");
                this.FigurteilFestlegenEllipse(-20, -10, 20, 20, "cyan");
                this.FigurteilFestlegenEllipse(-20, 10, 20, 20, "cyan");
                break;
            case 29:
                this.FigurteilFestlegenEllipse(0, 0, 25, 25, "rot");
                this.FigurteilFestlegenEllipse(0, -20, 20, 20, "orange");
                this.FigurteilFestlegenEllipse(20, -10, 20, 20, "orange");
                this.FigurteilFestlegenEllipse(20, 10, 20, 20, "orange");
                this.FigurteilFestlegenEllipse(0, 20, 20, 20, "orange");
                this.FigurteilFestlegenEllipse(-20, -10, 20, 20, "orange");
                this.FigurteilFestlegenEllipse(-20, 10, 20, 20, "orange");
                break;
            case 30:
                this.FigurteilFestlegenEllipse(0, 0, 25, 25, "blau");
                this.FigurteilFestlegenEllipse(0, -20, 20, 20, "weiss");
                this.FigurteilFestlegenEllipse(20, -10, 20, 20, "weiss");
                this.FigurteilFestlegenEllipse(20, 10, 20, 20, "weiss");
                this.FigurteilFestlegenEllipse(0, 20, 20, 20, "weiss");
                this.FigurteilFestlegenEllipse(-20, -10, 20, 20, "weiss");
                this.FigurteilFestlegenEllipse(-20, 10, 20, 20, "weiss");
                break;
            case 31:
                this.FigurteilFestlegenEllipse(0, 0, 25, 25, "blau");
                this.FigurteilFestlegenEllipse(0, -20, 20, 20, "rot");
                this.FigurteilFestlegenEllipse(20, -10, 20, 20, "rot");
                this.FigurteilFestlegenEllipse(20, 10, 20, 20, "rot");
                this.FigurteilFestlegenEllipse(0, 20, 20, 20, "rot");
                this.FigurteilFestlegenEllipse(-20, -10, 20, 20, "rot");
                this.FigurteilFestlegenEllipse(-20, 10, 20, 20, "rot");
                break;
            case 32:
                this.FigurteilFestlegenEllipse(0, 0, 25, 25, "blau");
                this.FigurteilFestlegenEllipse(0, -20, 20, 20, "blau");
                this.FigurteilFestlegenEllipse(20, -10, 20, 20, "blau");
                this.FigurteilFestlegenEllipse(20, 10, 20, 20, "blau");
                this.FigurteilFestlegenEllipse(0, 20, 20, 20, "blau");
                this.FigurteilFestlegenEllipse(-20, -10, 20, 20, "blau");
                this.FigurteilFestlegenEllipse(-20, 10, 20, 20, "blau");
                break;
            case 33:
                this.FigurteilFestlegenEllipse(0, 0, 25, 25, "blau");
                this.FigurteilFestlegenEllipse(0, -20, 20, 20, "gelb");
                this.FigurteilFestlegenEllipse(20, -10, 20, 20, "gelb");
                this.FigurteilFestlegenEllipse(20, 10, 20, 20, "gelb");
                this.FigurteilFestlegenEllipse(0, 20, 20, 20, "gelb");
                this.FigurteilFestlegenEllipse(-20, -10, 20, 20, "gelb");
                this.FigurteilFestlegenEllipse(-20, 10, 20, 20, "gelb");
                break;
            case 34:
                this.FigurteilFestlegenEllipse(0, 0, 25, 25, "blau");
                this.FigurteilFestlegenEllipse(0, -20, 20, 20, "grün");
                this.FigurteilFestlegenEllipse(20, -10, 20, 20, "grün");
                this.FigurteilFestlegenEllipse(20, 10, 20, 20, "grün");
                this.FigurteilFestlegenEllipse(0, 20, 20, 20, "grün");
                this.FigurteilFestlegenEllipse(-20, -10, 20, 20, "grün");
                this.FigurteilFestlegenEllipse(-20, 10, 20, 20, "grün");
                break;
            case 35:
                this.FigurteilFestlegenEllipse(0, 0, 25, 25, "blau");
                this.FigurteilFestlegenEllipse(0, -20, 20, 20, "braun");
                this.FigurteilFestlegenEllipse(20, -10, 20, 20, "braun");
                this.FigurteilFestlegenEllipse(20, 10, 20, 20, "braun");
                this.FigurteilFestlegenEllipse(0, 20, 20, 20, "braun");
                this.FigurteilFestlegenEllipse(-20, -10, 20, 20, "braun");
                this.FigurteilFestlegenEllipse(-20, 10, 20, 20, "braun");
                break;
            case 36:
                this.FigurteilFestlegenEllipse(0, 0, 25, 25, "blau");
                this.FigurteilFestlegenEllipse(0, -20, 20, 20, "magenta");
                this.FigurteilFestlegenEllipse(20, -10, 20, 20, "magenta");
                this.FigurteilFestlegenEllipse(20, 10, 20, 20, "magenta");
                this.FigurteilFestlegenEllipse(0, 20, 20, 20, "magenta");
                this.FigurteilFestlegenEllipse(-20, -10, 20, 20, "magenta");
                this.FigurteilFestlegenEllipse(-20, 10, 20, 20, "magenta");
                break;
            case 37:
                this.FigurteilFestlegenEllipse(0, 0, 25, 25, "blau");
                this.FigurteilFestlegenEllipse(0, -20, 20, 20, "grau");
                this.FigurteilFestlegenEllipse(20, -10, 20, 20, "grau");
                this.FigurteilFestlegenEllipse(20, 10, 20, 20, "grau");
                this.FigurteilFestlegenEllipse(0, 20, 20, 20, "grau");
                this.FigurteilFestlegenEllipse(-20, -10, 20, 20, "grau");
                this.FigurteilFestlegenEllipse(-20, 10, 20, 20, "grau");
                break;
            case 38:
                this.FigurteilFestlegenEllipse(0, 0, 25, 25, "blau");
                this.FigurteilFestlegenEllipse(0, -20, 20, 20, "cyan");
                this.FigurteilFestlegenEllipse(20, -10, 20, 20, "cyan");
                this.FigurteilFestlegenEllipse(20, 10, 20, 20, "cyan");
                this.FigurteilFestlegenEllipse(0, 20, 20, 20, "cyan");
                this.FigurteilFestlegenEllipse(-20, -10, 20, 20, "cyan");
                this.FigurteilFestlegenEllipse(-20, 10, 20, 20, "cyan");
                break;
            case 39:
                this.FigurteilFestlegenEllipse(0, 0, 25, 25, "blau");
                this.FigurteilFestlegenEllipse(0, -20, 20, 20, "orange");
                this.FigurteilFestlegenEllipse(20, -10, 20, 20, "orange");
                this.FigurteilFestlegenEllipse(20, 10, 20, 20, "orange");
                this.FigurteilFestlegenEllipse(0, 20, 20, 20, "orange");
                this.FigurteilFestlegenEllipse(-20, -10, 20, 20, "orange");
                this.FigurteilFestlegenEllipse(-20, 10, 20, 20, "orange");
                break;
            case 40:
                this.FigurteilFestlegenEllipse(0, 0, 25, 25, "gelb");
                this.FigurteilFestlegenEllipse(0, -20, 20, 20, "weiss");
                this.FigurteilFestlegenEllipse(20, -10, 20, 20, "weiss");
                this.FigurteilFestlegenEllipse(20, 10, 20, 20, "weiss");
                this.FigurteilFestlegenEllipse(0, 20, 20, 20, "weiss");
                this.FigurteilFestlegenEllipse(-20, -10, 20, 20, "weiss");
                this.FigurteilFestlegenEllipse(-20, 10, 20, 20, "weiss");
                break;
            case 41:
                this.FigurteilFestlegenEllipse(0, 0, 25, 25, "gelb");
                this.FigurteilFestlegenEllipse(0, -20, 20, 20, "rot");
                this.FigurteilFestlegenEllipse(20, -10, 20, 20, "rot");
                this.FigurteilFestlegenEllipse(20, 10, 20, 20, "rot");
                this.FigurteilFestlegenEllipse(0, 20, 20, 20, "rot");
                this.FigurteilFestlegenEllipse(-20, -10, 20, 20, "rot");
                this.FigurteilFestlegenEllipse(-20, 10, 20, 20, "rot");
                break;
            case 42:
                this.FigurteilFestlegenEllipse(0, 0, 25, 25, "gelb");
                this.FigurteilFestlegenEllipse(0, -20, 20, 20, "blau");
                this.FigurteilFestlegenEllipse(20, -10, 20, 20, "blau");
                this.FigurteilFestlegenEllipse(20, 10, 20, 20, "blau");
                this.FigurteilFestlegenEllipse(0, 20, 20, 20, "blau");
                this.FigurteilFestlegenEllipse(-20, -10, 20, 20, "blau");
                this.FigurteilFestlegenEllipse(-20, 10, 20, 20, "blau");
                break;
            case 43:
                this.FigurteilFestlegenEllipse(0, 0, 25, 25, "gelb");
                this.FigurteilFestlegenEllipse(0, -20, 20, 20, "gelb");
                this.FigurteilFestlegenEllipse(20, -10, 20, 20, "gelb");
                this.FigurteilFestlegenEllipse(20, 10, 20, 20, "gelb");
                this.FigurteilFestlegenEllipse(0, 20, 20, 20, "gelb");
                this.FigurteilFestlegenEllipse(-20, -10, 20, 20, "gelb");
                this.FigurteilFestlegenEllipse(-20, 10, 20, 20, "gelb");
                break;
            case 44:
                this.FigurteilFestlegenEllipse(0, 0, 25, 25, "gelb");
                this.FigurteilFestlegenEllipse(0, -20, 20, 20, "grün");
                this.FigurteilFestlegenEllipse(20, -10, 20, 20, "grün");
                this.FigurteilFestlegenEllipse(20, 10, 20, 20, "grün");
                this.FigurteilFestlegenEllipse(0, 20, 20, 20, "grün");
                this.FigurteilFestlegenEllipse(-20, -10, 20, 20, "grün");
                this.FigurteilFestlegenEllipse(-20, 10, 20, 20, "grün");
                break;
            case 45:
                this.FigurteilFestlegenEllipse(0, 0, 25, 25, "gelb");
                this.FigurteilFestlegenEllipse(0, -20, 20, 20, "braun");
                this.FigurteilFestlegenEllipse(20, -10, 20, 20, "braun");
                this.FigurteilFestlegenEllipse(20, 10, 20, 20, "braun");
                this.FigurteilFestlegenEllipse(0, 20, 20, 20, "braun");
                this.FigurteilFestlegenEllipse(-20, -10, 20, 20, "braun");
                this.FigurteilFestlegenEllipse(-20, 10, 20, 20, "braun");
                break;
            case 46:
                this.FigurteilFestlegenEllipse(0, 0, 25, 25, "gelb");
                this.FigurteilFestlegenEllipse(0, -20, 20, 20, "magenta");
                this.FigurteilFestlegenEllipse(20, -10, 20, 20, "magenta");
                this.FigurteilFestlegenEllipse(20, 10, 20, 20, "magenta");
                this.FigurteilFestlegenEllipse(0, 20, 20, 20, "magenta");
                this.FigurteilFestlegenEllipse(-20, -10, 20, 20, "magenta");
                this.FigurteilFestlegenEllipse(-20, 10, 20, 20, "magenta");
                break;
            case 47:
                this.FigurteilFestlegenEllipse(0, 0, 25, 25, "gelb");
                this.FigurteilFestlegenEllipse(0, -20, 20, 20, "grau");
                this.FigurteilFestlegenEllipse(20, -10, 20, 20, "grau");
                this.FigurteilFestlegenEllipse(20, 10, 20, 20, "grau");
                this.FigurteilFestlegenEllipse(0, 20, 20, 20, "grau");
                this.FigurteilFestlegenEllipse(-20, -10, 20, 20, "grau");
                this.FigurteilFestlegenEllipse(-20, 10, 20, 20, "grau");
                break;
            case 48:
                this.FigurteilFestlegenEllipse(0, 0, 25, 25, "gelb");
                this.FigurteilFestlegenEllipse(0, -20, 20, 20, "cyan");
                this.FigurteilFestlegenEllipse(20, -10, 20, 20, "cyan");
                this.FigurteilFestlegenEllipse(20, 10, 20, 20, "cyan");
                this.FigurteilFestlegenEllipse(0, 20, 20, 20, "cyan");
                this.FigurteilFestlegenEllipse(-20, -10, 20, 20, "cyan");
                this.FigurteilFestlegenEllipse(-20, 10, 20, 20, "cyan");
                break;
            case 49:
                this.FigurteilFestlegenEllipse(0, 0, 25, 25, "gelb");
                this.FigurteilFestlegenEllipse(0, -20, 20, 20, "orange");
                this.FigurteilFestlegenEllipse(20, -10, 20, 20, "orange");
                this.FigurteilFestlegenEllipse(20, 10, 20, 20, "orange");
                this.FigurteilFestlegenEllipse(0, 20, 20, 20, "orange");
                this.FigurteilFestlegenEllipse(-20, -10, 20, 20, "orange");
                this.FigurteilFestlegenEllipse(-20, 10, 20, 20, "orange");
                break;
        }
    }

    public void setid(int id) {
        this.id = id;
    }

    public static int getid() {
        return id;
    }
}
 