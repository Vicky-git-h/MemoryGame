
/**
 * Beschreiben Sie hier die Klasse Test32.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class MoveOnWKey extends Spieler1 implements KeyListener {

    private int posY = 100; // Startposition Y
    private final int steps = 10; // X Schritte (hier 10)

    public MoveOnWKey() {
        setTitle("W-Taste Bewegung");
        setSize(400, 300);
        setDefaultCloseOperation(Spieler1.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // KeyListener hinzufügen
        addKeyListener(this);
        setFocusable(true);
        setVisible(true);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // Prüfen, ob W gedrückt wurde
        if (e.getKeyCode() == KeyEvent.VK_W) {
            posY -= steps; // nach oben bewegen
            System.out.println("W gedrückt -> neue Y-Position: " + posY);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Nicht benötigt
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Nicht benötigt
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MoveOnWKey::new);
    }
}