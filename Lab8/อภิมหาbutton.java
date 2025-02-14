import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CalculatorTwoGUI implements ActionListener {
    private JFrame fr;
    private JTextField tf;
    private JButton b1 ,b2 ,b3 ,b4 ,b5,b6 ,b7 ,b8 ,b9 ,b10,b11 ,b12 ,b13 ,b14 ,b15,b16;
    private int num,num2;
    private String x;
    
    
    public CalculatorTwoGUI() {
        JPanel panel = new JPanel();
        
        fr = new JFrame("My Calculator");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        b1 = new JButton("7");
        b2 = new JButton("8");
        b3 = new JButton("9");
        b4 = new JButton("+");
        b5 = new JButton("4");
        b6 = new JButton("5");
        b7 = new JButton("6");
        b8 = new JButton("-");
        b9 = new JButton("1");
        b10 = new JButton("2");
        b11 = new JButton("3");
        b12 = new JButton("x");
        b13 = new JButton("0");
        b14 = new JButton("c");
        b15 = new JButton("=");
        b16 = new JButton("/");
        
        
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
            num = Integer.parseInt(tf.getText());
            x = "+";
            tf.setText("");
        }
        else if (e.getSource().equals(b8)){
            num = Integer.parseInt(tf.getText());
            x = "-";
            tf.setText("");
        }
        else if (e.getSource().equals(b16)){
            num = Integer.parseInt(tf.getText());
            x = "/";
            tf.setText("");
        }
        else if (e.getSource().equals(b12)){
            num = Integer.parseInt(tf.getText());
            x = "x";
            tf.setText("");
        }
        else if (e.getSource().equals(b15)){
            num2 = Integer.parseInt(tf.getText());
            tf.setText("");
            if (x.equals("+")){
                num += num2;
                tf.setText(Integer.toString(num));
            }
            else if(x.equals("-")){
                num -= num2;
                tf.setText(Integer.toString(num));
            }
            else if (x.equals("x")){
                num *= num2;
                tf.setText(Integer.toString(num));
            }
            else if (x.equals("/")){
                num /= num2;
                tf.setText(Integer.toString(num));
            }
        }
        else if (e.getSource().equals(b14)){
            tf.setText("");
        }
        else if (e.getSource().equals(b1)){
            tf.setText(tf.getText()+"7");
        }
        else if (e.getSource().equals(b2)){
            tf.setText(tf.getText()+"8");
        }
        else if (e.getSource().equals(b3)){
            tf.setText(tf.getText()+"9");
        }
        else if (e.getSource().equals(b5)){
            tf.setText(tf.getText()+"4");
        }
        else if (e.getSource().equals(b6)){
            tf.setText(tf.getText()+"5");
        }
        else if (e.getSource().equals(b7)){
            tf.setText(tf.getText()+"6");
        }
        else if (e.getSource().equals(b9)){
            tf.setText(tf.getText()+"1");
        }
        else if (e.getSource().equals(b10)){
            tf.setText(tf.getText()+"2");
        }
        else if (e.getSource().equals(b11)){
            tf.setText(tf.getText()+"3");
        }
        else if (e.getSource().equals(b13)){
            tf.setText(tf.getText()+"0");
        }
        
    }
    public static void main(String[] args) {
        new CalculatorTwoGUI();
    }
}
