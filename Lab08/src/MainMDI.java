import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class MainMDI {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        SwingUtilities.invokeLater(() -> {
            MDIFromGUI frame = new MDIFromGUI();
        });
    }
}
