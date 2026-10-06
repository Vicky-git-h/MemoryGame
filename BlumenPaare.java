
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
    int zahlenPool []= new int [102];
    public Blume[] Paar = new Blume[2];
    int n = 0;
    public void BlumenPaare()
    {
        for (int i =0;i<102;i++){
            if (i%2 == 0){    
                zahlenPool [i]=i;
                zahlenPool [i+1]=i;
            }
            for (int blumenNummerX = 0; blumenNummerX < 10; blumenNummerX = blumenNummerX +1)
            {
                for (int blumenNummerY = 0; blumenNummerY < 10; blumenNummerY += 1)
                {
                    Blume Blume = new Blume(50*blumenNummerX+2, 50*blumenNummerY+2);
                    blume[blumenNummerX][blumenNummerY] = Blume;
                    if (blume[blumenNummerX][blumenNummerY] != null){
                        //blume[blumenNummerX][blumenNummerY].setid(zahlenPool [n]);
                        blume[blumenNummerX][blumenNummerY].setid((int)(Math.random() *51)); 
                    }
                    n++;
                }
            }
        }
    }
}