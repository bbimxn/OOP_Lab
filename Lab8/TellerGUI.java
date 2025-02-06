import java.awt.*;
import javax.swing.*;

public class TellerGUI {
    private JFrame fr;
    private JLabel l,l2;
    private JTextField tf,tf2;
    
    public TellerGUI(){
        
        JPanel panel = new JPanel();
        
        fr = new JFrame("Teller GUI");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        l = new JLabel("Balance");
        l2 = new JLabel("Amount");
        tf = new JTextField("6000");
        tf.setEditable(false);
        tf2 = new JTextField();
        JButton b1 = new JButton("Deposit");
        JButton b2 = new JButton("Withdraw");
        JButton b3 = new JButton("Exit");
        
        fr.setLayout(new GridLayout(3,2));
        fr.add(l);
        fr.add(tf);
        fr.add(l2);
        fr.add(tf2);
        
        panel.setLayout(new FlowLayout());
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        fr.add(panel);
        
        fr.pack();
        fr.setSize(500,200);
        fr.setVisible(true);
    }
}
