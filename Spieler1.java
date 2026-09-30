
/**
 * Beschreiben Sie hier die Klasse Spieler1.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;






public class Spieler1 extends Figur
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int x;

    /**
     * Konstruktor für Objekte der Klasse Spieler1
     */
    
 void TasteGedrückt(char taste)
{
    if (taste == 'w')
    {
        Drehen(90);
        Gehen(10);
        Drehen(-90);
    }

    if (taste == 's')
    {
        Drehen(-90);
        Gehen(10);
        Drehen(90);
    }

    if (taste == 'a')
    {
        Drehen(180);
        Gehen(10);
        Drehen(-180);
    }

    if (taste == 'd')
    {
        Gehen(10);
    }
}

    
    
    
    
    public Spieler1()
    {    GrößeSetzen(20);
    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public int beispielMethode(int y)
    {
        // tragen Sie hier den Code ein
        return x + y;
    }
 
    
    
}