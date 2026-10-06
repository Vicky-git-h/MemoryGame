
/**
 * Beschreiben Sie hier die Klasse BlumenPaare.
 * 
 * @author Victoria 
 * @version 1.0
 */
public class BlumenPaare
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    public Blume[][] blume = new Blume[10][10];
    public Blume[] Paar = new Blume[2];
    BlumenPaare()
    {
        // Diesen Abschnitt ignorieren, es werden die 10x10 Zellen der Welt erzeugt und positioniert
        for (int blumenNummerX = 0; blumenNummerX < 10; blumenNummerX = blumenNummerX +1)
        {
            for (int blumenNummerY = 0; blumenNummerY < 10; blumenNummerY += 1)
            {
                Blume Blume = new Blume(50*blumenNummerX+2, 50*blumenNummerY+2);
                blume[blumenNummerX][blumenNummerY] = Blume;
            }
        }
    }
}