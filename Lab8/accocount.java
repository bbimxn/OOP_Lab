import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class TellerGUI implements ActionListener{
    public Account account = new Account();
    private JFrame fr;
    private JLabel l,l2;
    private JTextField tf,tf2;
    private JButton b1,b2,b3;
    
    public TellerGUI(){
        
        JPanel panel = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        
        fr = new JFrame("Teller GUI");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        l = new JLabel("Balance");
        l2 = new JLabel("Amount");
        tf = new JTextField((int)account.balance+"");
        tf.setEditable(false);
        tf2 = new JTextField();
        b1 = new JButton("Deposit");
        b2 = new JButton("Withdraw");
        b3 = new JButton("Exit");
        
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
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(b1)){
            //faak
            account.deposit(Integer.parseInt(tf2.getText()));
            tf.setText((int)account.balance+"");
            tf2.setText("");
        }
        else if (e.getSource().equals(b2)){
            //ton
            account.withdraw(Integer.parseInt(tf2.getText()));
            tf.setText((int)account.balance+"");
            tf2.setText("");
        }
        else if (e.getSource().equals(b3)){
            //aok
            System.exit(0);
        }
    }
    
    public static void main(String[] args) {
        new TellerGUI();
    }
}

