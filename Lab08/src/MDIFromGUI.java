import javax.swing.*;

public class MDIFromGUI extends JFrame {

    private final JDesktopPane jdp;
    private final JInternalFrame app1, app2, app3;
    private final JMenuBar mb;
    private final JMenu f, e, v, ne;
    private final JMenuItem open, save, exit;
    private final JMenuItem win, ms;

    public MDIFromGUI() {
        jdp = new JDesktopPane();

        mb = new JMenuBar();
        f = new JMenu("File");
        e = new JMenu("Edit");
        v = new JMenu("View");

        this.setJMenuBar(mb);
        mb.add(f);
        mb.add(e);
        mb.add(v);

        ne = new JMenu("New");
        open = new JMenuItem("Open");
        save = new JMenuItem("Save");
        exit = new JMenuItem("Exit");

        f.add(ne);
        f.add(open);
        f.addSeparator();
        f.add(save);
        f.addSeparator();
        f.add(exit);

        win = new JMenuItem("Window");
        ms = new JMenuItem("Message");

        ne.add(win);
        ne.addSeparator();
        ne.add(ms);

        app1 = new JInternalFrame("Appliction 1", true, true, true, true);
        app2 = new JInternalFrame("Appliction 2", true, true, true, true);
        app3 = new JInternalFrame("Appliction 3", true, true, true, true);

        app1.setVisible(true);
        app1.setSize(300, 150);
        app1.setLocation(20, 400);
        app2.setVisible(true);
        app2.setSize(250, 200);
        app2.setLocation(350, 170);
        app3.setVisible(true);
        app3.setSize(300, 300);
        app3.setLocation(600, 400);

        jdp.add(app1);
        jdp.add(app2);
        jdp.add(app3);

        this.add(jdp);

        this.setTitle("SubMenuItem Demo");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setSize(1000, 1000);
        this.setVisible(true);
    }
}
