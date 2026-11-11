import java.util.Collections;
import java.util.*;
/**
 * Legt das Spielfeld an. 
 * 
 * @author Victoria, Lenny, Miguel, Jonathan
 * @version 1.0
 */
class Spielfeld extends Ereignisbehandlung
{
    private static int zähler = 0;
    private static boolean turn = true; //true spieler 1 und false spieler 2
    private int Score1=0; // Score von Spieler 1
    private int Score2=0; // Score von Spieler 2
    private static Karte[][] karten = new Karte[10][10]; //erstellen des Spielfelds
    private static Karte[] ausgewählt = new Karte[2]; //merken der Karten
    private static List<Karte> umgedrehteKarten = new ArrayList();
    private static Score1 score = new Score1();
    private static Blume[][]blumenFeld = new Blume[10][10];
    private static Blume[] paar = new Blume[2];

    private static Spieler1 spieler1;
    private static Spieler2 spieler2;

    private static long t = 0; // t = Zeit
    private static long s = 0; // start zeit
    // IDs die vergeben werden
    Integer zahlenPool[] = new Integer[100];
    int n = 0;

    Spielfeld()
    {
        // auffüllen IDs in zahlenPool
        for (int i = 0; i < 50; i++){
            zahlenPool [i]=i;
            zahlenPool [i+50]=i;
        }
        List<Integer> intList = Arrays.asList(zahlenPool);
        //Collections.shuffle(intList);
        intList.toArray(zahlenPool);
        // 10x10 Karten und Blumen erzeugt und positioniert
        for (int kartenNummerX = 0; kartenNummerX < 10; kartenNummerX = kartenNummerX +1)
        {
            for (int kartenNummerY = 0; kartenNummerY < 10; kartenNummerY += 1)
            {
                Karte karte = new Karte(50*kartenNummerX+2, 50*kartenNummerY+2);
                karten[kartenNummerX][kartenNummerY] = karte;
                karte.SichtbarkeitSetzen(false);
                Blume blume = new Blume(50*kartenNummerX+2, 50*kartenNummerY+2, zahlenPool[n]);
                blumenFeld[kartenNummerX][kartenNummerY] = blume;
                n++;
            }
        }
        s = System.currentTimeMillis();
        Starten();
        TaktdauerSetzen (1000);
        
    }

    // Sucht die Karte aus der Liste raus anhand von Koordinaten (x,y)
    public static Karte getKarte(int x, int y) {
        return karten[x][y];
    }
    // Sucht die Blume aus der liste
    public static Blume getBlume(int x, int y) {
        return blumenFeld[x][y];
    }
    // Karte auswählen
    public static void auswahl(int xPos, int yPos) {
        if (zähler < 2) {

            double x = Math.floor(xPos/50);
            double y = Math.floor(yPos/50);
            if (zähler == 1 && getKarte((int)x,(int)y) == ausgewählt[0]) return;
            if (zähler == 1 && getBlume((int)x,(int)y) == paar[0]) return;
            if (umgedrehteKarten.contains(getKarte((int)x,(int)y))) return;
            ausgewählt[zähler] = getKarte((int)x,(int)y);
            paar[zähler] = getBlume((int)x,(int)y);
            getKarte((int)x,(int)y).FarbeSetzen("gold");
            zähler++;

        }
    }
    // Ausgewählte Karten umdrehen
    public static void karteUmdrehen() {
        if (zähler != 2) return;
        ausgewählt[0].SichtbarkeitSetzen(false);
        ausgewählt[1].SichtbarkeitSetzen(false);
        spieler1.SichtbarkeitSetzen(false);
        spieler2.SichtbarkeitSetzen(false);
        t= System.currentTimeMillis();

    }

    public void TaktImpulsAusführen (){
        if (umgedrehteKarten.size() >= 100) {
        
        }
        if (s!=0) {
            if ((System.currentTimeMillis()-s)>=5000) {
                for (int kartenNummerX = 0; kartenNummerX < 10; kartenNummerX = kartenNummerX +1)
                {
                    for (int kartenNummerY = 0; kartenNummerY < 10; kartenNummerY += 1)
                    {
                        karten[kartenNummerX][kartenNummerY].SichtbarkeitSetzen(true);
                    }
                }
                s=0;
                spieler1 = new Spieler1();
                spieler2 = new Spieler2();

            }
        }
        if (t==0) return;
        if ((System.currentTimeMillis()-t)>=2000){
            if (paar[0].getid() != paar[1].getid()) {
                ausgewählt[0].SichtbarkeitSetzen(true);
                ausgewählt[1].SichtbarkeitSetzen(true);
                ausgewählt[0].FarbeSetzen("grau");
                ausgewählt[1].FarbeSetzen("grau");
                turn = !turn;
            }else {
                if (turn) Score1++;
                else Score2++;
                score.setScore (Score1, Score2);
                umgedrehteKarten.add(ausgewählt[0]);
                umgedrehteKarten.add(ausgewählt[1]);
            }
            spieler1.SichtbarkeitSetzen(true);
            spieler2.SichtbarkeitSetzen(true);
            zähler = 0;
            t=0;
        }

    }

    public static boolean getturn() {
        return turn;
    }

}
