package clock;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ClockMain extends JFrame{
    
    private final ClockTimer clocktimer;

    public ClockMain() throws HeadlessException, IOException {
        this.clocktimer= new ClockTimer();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1000, 1000);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        ClockHands clockHands = new ClockHands(clocktimer);
        this.bgCharge();
        this.add(clockHands);
    }
    
    private void bgCharge(){
        class Back extends JPanel{
            @Override
            public void paintComponent(Graphics g){
                Dimension tam =getSize();
                String backgroudClock ="/image/imgClock.jpg";
                ImageIcon imageIcon = new ImageIcon(new ImageIcon(getClass().getResource(backgroudClock)).getImage());
                g.drawImage(imageIcon.getImage(), 0, 0,tam.width, tam.height,null);
            }       
        }
        this.add(new Back());
    }

    public static void main(String[] args) throws IOException {
        new ClockMain().exec();
    }
    
    private void exec(){
        this.setVisible(true);
    }
}
