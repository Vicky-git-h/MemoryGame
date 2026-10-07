
/**
 * Beschreiben Sie hier die Klasse BlumenPaare.
 * 
 * @author Victoria 
 * @version 1.0
 */
public class BlumenPaare
{
    // Blumenfeld
    public Blume[][] blumenFeld = new Blume[10][10];
    // IDs die vergeben werden
    int zahlenPool[] = new int[100];

    // public Blume[] Paar = new Blume[2];
    int n = 0;
    BlumenPaare()
    {
        // auffüllen IDs in zahlenPool
        for (int i = 0; i < 50; i++){
            zahlenPool [i]=i;
            zahlenPool [i+50]=i;
        }
        // Erstellung Blumen
        for (int blumenNummerX = 0; blumenNummerX < 10; blumenNummerX = blumenNummerX +1)
        {
            for (int blumenNummerY = 0; blumenNummerY < 10; blumenNummerY += 1)
            {

                Blume blume = new Blume(50*blumenNummerX+2, 50*blumenNummerY+2, zahlenPool[n]);
                blumenFeld[blumenNummerX][blumenNummerY] = blume;
                n++;
            }
        }
    }

}