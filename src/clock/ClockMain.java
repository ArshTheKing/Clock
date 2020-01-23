package clock;

import java.awt.HeadlessException;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ClockMain extends JFrame{

    public ClockMain() throws HeadlessException, IOException {
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.bgCharge();
        this.setLocationRelativeTo(null);
    }
    
    private void bgCharge(){
        JLabel background;
        String backgroudClock ="/image/imgClock.jpg";
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(getClass().getResource(backgroudClock)).getImage());
        background=new JLabel("",imageIcon, JLabel.CENTER);
        background.setBounds(0,0,imageIcon.getIconHeight(),imageIcon.getIconWidth());
        add(background);
        this.setSize(imageIcon.getIconHeight(), imageIcon.getIconWidth());
    }

    public static void main(String[] args) throws IOException {
        new ClockMain().exec();
    }
    
    private void exec(){
        this.setVisible(true);
    }
}
