
/**
 * Beschreiben Sie hier die Klasse StartMenue.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class StartMenue extends Figur
{
    private static Start start;
    StartMenue (){
        super();
        this.FigurteilFestlegenRechteck(0,0,600, 200,"weiss");
        this.PositionSetzen(250, 200);
        start = new Start();
    }
    void MausGeklickt (int x, int y, int anzahl)
    {
        new Spielfeld();
        start.Entfernen();
        this.Entfernen();
    }
}