/**
 * Legt das Spielfeld an. 
 * 
 * @author Victoria, Lenny
 * @version 1.0
 */
class Spielfeld
{
    private static int zähler = 0;
    private static boolean turn = true; //true spieler 1 und false spieler 2
    private static Karte[][] karten = new Karte[10][10]; //erstellen des Spielfelds
    private static Karte[] ausgewählt = new Karte[2]; //merken der Karten

    private static Blume[][]blumenFeld = new Blume[10][10];
    private static Blume[] paar = new Blume[2];
    // IDs die vergeben werden
    int zahlenPool[] = new int[100];
    int n = 0;

    Spielfeld()
    {
        // auffüllen IDs in zahlenPool
        for (int i = 0; i < 50; i++){
            zahlenPool [i]=i;
            zahlenPool [i+50]=i;
        }
        // Diesen Abschnitt ignorieren, es werden die 10x10 Zellen der Welt erzeugt und positioniert
        for (int kartenNummerX = 0; kartenNummerX < 10; kartenNummerX = kartenNummerX +1)
        {
            for (int kartenNummerY = 0; kartenNummerY < 10; kartenNummerY += 1)
            {
                Karte karte = new Karte(50*kartenNummerX+2, 50*kartenNummerY+2);
                karten[kartenNummerX][kartenNummerY] = karte;
                Blume blume = new Blume(50*kartenNummerX+2, 50*kartenNummerY+2, zahlenPool[n]);
                blumenFeld[kartenNummerX][kartenNummerY] = blume;
                n++;
            }
        }

        new Spieler1();
        new Spieler2();
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
        
        if (paar[0].getid() != paar[1].getid()) {
            ausgewählt[0].SichtbarkeitSetzen(true);
            ausgewählt[1].SichtbarkeitSetzen(true);
        }

        zähler = 0;
        turn = !turn;
    }

    public static boolean getturn() {
        return turn;
    }

}
