import java.awt.*;
import javax.swing.*;

public class CalculatorOneGUI {
    private JFrame fr;
    private JTextField ta,ta2,ta3;
    
    public CalculatorOneGUI(){
        JPanel panel = new JPanel();
        fr = new JFrame("เครื่องคิดเลข");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton b1 = new JButton("บวก");
        JButton b2 = new JButton("ลบ");
        JButton b3 = new JButton("คูณ");
        JButton b4 = new JButton("หาร");
        ta = new JTextField(25);
        ta2 = new JTextField(25);
        ta3 = new JTextField(25);
        fr.setLayout(new GridLayout(4,1));
        fr.add(ta);
        fr.add(ta2);
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);
        fr.add(panel);
        fr.add(ta3);
        fr.pack();
        fr.setSize(300,180);
        fr.setVisible(true);
        
    }
}
