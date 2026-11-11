
/**
 * Beschreiben Sie hier die Klasse TurnText.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class TurnText extends Text
{
    public TurnText()
    {
        TextGrößeSetzen (20);
        this.PositionSetzen(500, 50);
        if (Spielfeld.getturn()) TextSetzen("Spieler Rot");
        else TextSetzen("Spieler Blau");
    }
}