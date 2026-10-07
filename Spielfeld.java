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
    private static Karte[][] karten = new Karte[10][10];
    private static Karte[] ausgewählt = new Karte[2];

    //public Blume[][] blume = new Blume[10][10];
    //public Blume[] Paar = new Blume[2];

    Spielfeld()
    {
        // Diesen Abschnitt ignorieren, es werden die 10x10 Zellen der Welt erzeugt und positioniert
        for (int kartenNummerX = 0; kartenNummerX < 10; kartenNummerX = kartenNummerX +1)
        {
            for (int kartenNummerY = 0; kartenNummerY < 10; kartenNummerY += 1)
            {
                Karte karte = new Karte(50*kartenNummerX+2, 50*kartenNummerY+2);
                karten[kartenNummerX][kartenNummerY] = karte;
            }
        }

        new Spieler1();
        new Spieler2();
    }

    // Sucht die Karte aus der Liste raus anhand von Koordinaten (x,y)
    public static Karte getKarte(int x, int y) {
        return karten[x][y];
    }
    // Karte auswählen
    public static void auswahl(int xPos, int yPos) {
        if (zähler < 2) {
            double x = Math.floor(xPos/50);
            double y = Math.floor(yPos/50);
                   
            ausgewählt[zähler] = getKarte((int)x,(int)y);
            getKarte((int)x,(int)y).FarbeSetzen("gold");
            zähler++;
 
        
        
        
        }
        if (zähler == 1 && karte == ausgewählt[0]) 
        { return;
}
        
}

    }

    // Ausgewählte Karten umdrehen
    public static void karteUmdrehen() {
        if (zähler != 2) return;
        ausgewählt[0].SichtbarkeitSetzen(false);
        ausgewählt[1].SichtbarkeitSetzen(false);
        zähler = 0;
        turn = !turn;
    }

    
    
    public static boolean getturn() {
        return turn;

    
    
    
    
    }
    
    
}
