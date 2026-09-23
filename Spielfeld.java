/**
 * Legt das Spielfeld an. 
 * 
 * @author Victoria, Lenny
 * @version 1.0
 */
class Spielfeld
{
    public int zähler = 0;

    public Karte[][] karten = new Karte[10][10];
    public Karte[] ausgewählt = new Karte[2];

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
        // Abschnittsende
    }

    // Sucht die Karte aus der Liste raus anhand von Koordinaten (x,y)
    public Karte getKarte(int x, int y) {
        return karten[x][y];
    }

    // Karte auswählen
    public void auswahl(int x, int y) {
        if (zähler < 2) {
            ausgewählt[zähler] = getKarte(x,y);
            zähler++;
        }
    }

    // Ausgewählte Karten umdrehen
    public void karteUmdrehen() {
        ausgewählt[0].SichtbarkeitSetzen(false);
        ausgewählt[1].SichtbarkeitSetzen(false);
        zähler = 0;
    }
}
