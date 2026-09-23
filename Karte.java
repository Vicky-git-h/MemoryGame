
/**
 * Rückseite der Karten (Immer sichtbar)
 * 
 * @author Lenny, Victoria
 * @version 1.0
 */
public class Karte extends Rechteck
{

    public Karte(int xLinksOben, int yLinksOben)
    {
        super();
        this.PositionSetzen(xLinksOben, yLinksOben);
        this.GrößeSetzen(46, 46);
        this.FarbeSetzen("grau");
    }

    public void umdrehen() {
        this.GanzNachHintenBringen();
    }
}