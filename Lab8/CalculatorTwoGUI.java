import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CalculatorTwoGUI implements ActionListener {
    private JFrame fr;
    private JTextField tf;
    
    public CalculatorTwoGUI() {
        JPanel panel = new JPanel();
        
        fr = new JFrame("My Calculator");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JButton b1 = new JButton("7");
        JButton b2 = new JButton("8");
        JButton b3 = new JButton("9");
        JButton b4 = new JButton("+");
        JButton b5 = new JButton("4");
        JButton b6 = new JButton("5");
        JButton b7 = new JButton("6");
        JButton b8 = new JButton("-");
        JButton b9 = new JButton("1");
        JButton b10 = new JButton("2");
        JButton b11 = new JButton("3");
        JButton b12 = new JButton("x");
        JButton b13 = new JButton("0");
        JButton b14 = new JButton("c");
        JButton b15 = new JButton("=");
        JButton b16 = new JButton("/");
        
        
        tf = new JTextField();
        fr.setLayout(new BorderLayout());
        fr.add(tf,BorderLayout.NORTH);
        
        panel.setLayout(new GridLayout(4,4));
        panel.add(b1); panel.add(b2); panel.add(b3); panel.add(b4);
        panel.add(b5); panel.add(b6); panel.add(b7); panel.add(b8);
        panel.add(b9); panel.add(b10); panel.add(b11); panel.add(b12);
        panel.add(b13); panel.add(b14); panel.add(b15); panel.add(b16);
        fr.add(panel);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        

        fr.setSize(250,300);
        fr.setVisible(true);
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(b4)){
            System.out.println("+");
        }
        else if (e.getSource().equals(b8)){
             System.out.println("-");
        }
    }
}