
/**
 * Beschreiben Sie hier die Klasse Spieler2.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Spieler2 extends Figur
{
    
    Spieler2()
{
    super();
    this.FigurteilFestlegenEllipse(-20, -15, 40, 60,"weiss");
    this.FigurteilFestlegenDreieck(0, 0, 0, 30, 18, 15,"blau");
    this.PositionSetzen(75, 60);
    }
    void TasteGedrückt(char taste)
    {
        if (Spielfeld.getturn())return;
        if (taste == 'q')
        {
            Spielfeld.auswahl(XPositionGeben(), YPositionGeben());
            
        }
        if (taste == 'u')
        {
            Spielfeld.karteUmdrehen();
        }
    }

    void SonderTasteGedrückt (int taste)
    {    
        if (Spielfeld.getturn())return;
        if (taste == 37)
        {
            Drehen(180);
            Gehen(10);
            Drehen(-180);
        }

        if (taste == 38)
        {
            Drehen(90);
            Gehen(10);
            Drehen(-90);
        }

        if (taste == 39)
        {
            Gehen(10);
        }

        if (taste == 40)
        {
            Drehen(-90);
            Gehen(10);
            Drehen(90);
        }
    }
}
