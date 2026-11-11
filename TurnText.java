
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
        TextGrößeSetzen (15);
        this.PositionSetzen(500, 35);
        TextSetzen("Spieler Rot");
        if (Spielfeld.getturn()) TextSetzen("Spieler Rot");
        else TextSetzen("Spieler Blau");
    }
}