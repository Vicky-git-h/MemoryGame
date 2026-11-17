
/**
 * Beschreiben Sie hier die Klasse Win.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Win extends Text
{

    public Win()
    {
        if (Spielfeld.getScore1() > Spielfeld.getScore2())  TextSetzen("Spieler Rot hat gewonnen");
                else TextSetzen("Spieler Blau hat gewonnen");
    }
}