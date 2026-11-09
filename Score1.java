
/**
 * Beschreiben Sie hier die Klasse Score1.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Score1 extends Text
{
    public void setScore (int Score1, int Score2){
        TextSetzen("Spieler Rot: "+ Score1+"        Spieler Blau: "+Score2);
    }

    Score1()
    {
        this.PositionSetzen(500, 20);
        TextSetzen("Spieler Rot: 0        Spieler Blau: 0");
    }

}
