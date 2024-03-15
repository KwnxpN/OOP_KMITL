import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
public class Poring extends Thread implements MouseListener{
    private static int count = 0;
    private JFrame frame;
    private JPanel panel;
    private JLabel poringLabel;
    private ImageIcon poringImage;
    public Poring(){
        count += 1;
        Random random = new Random();
        frame = new JFrame();
        panel = new JPanel(new FlowLayout());
        poringImage = new ImageIcon("poringjaa.png");
        poringLabel = new JLabel(poringImage);
        poringLabel.setText(String.valueOf(count));
        poringLabel.addMouseListener(this);
        panel.add(poringLabel);
        
        frame.add(panel);
        frame.pack();
        frame.setLocation(random.nextInt(700), random.nextInt(700));
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
        
        
    }
    @Override
    public void run(){
        while (true){
            try {
                Poring.sleep(100);
                frame.setLocation(frame.getX() +7, frame.getY() + 7);
                Poring.sleep(100);
                frame.setLocation(frame.getX() -7, frame.getY() - 7);
                Poring.sleep(100);
                frame.setLocation(frame.getX() +5, frame.getY() + 5);
                Poring.sleep(100);
                frame.setLocation(frame.getX() -5, frame.getY()  - 5);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        frame.dispose();

    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
//    public static void main(String[] args) {
//       new Poring().start();
//    }
}