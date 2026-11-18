
/**
 * Beschreiben Sie hier die Klasse Score1.
 * 
 * @author Victoria, Miguel, Jonathan, Lenny
 */
public class Score1 extends Text
{
    public void setScore (int Score1, int Score2){
        TextSetzen("Spieler Rot: " + Score1 + "                      Spieler Blau: " + Score2);
        TextGrößeSetzen (20);
    }

    Score1()
    {
        this.PositionSetzen(500, 20);
        TextSetzen("Spieler Rot: 0                      Spieler Blau: 0");
        TextGrößeSetzen (20);
    }

}
