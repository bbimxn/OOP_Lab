import java.awt.*;
import javax.swing.*;

public class TellerGUI {
    private JFrame fr;
    private JLabel l,l2;
    private JTextField tf,tf2;
    
    public TellerGUI(){
        
        JPanel panel = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        
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
        
        fr.setLayout(new GridLayout(4,1));
        
        
        panel2.setLayout(new GridLayout(1,2));
        panel2.add(l);
        panel2.add(tf);
        fr.add(panel2);
        
        panel3.setLayout(new GridLayout(1,2));
        panel3.add(l2);
        panel3.add(tf2);
        fr.add(panel3);
        
        panel.setLayout(new FlowLayout());
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        fr.add(panel);

        fr.setSize(270,200);
        fr.setVisible(true);
    }
    public static void main(String[] args) {
        new TellerGUI();
    }
}

