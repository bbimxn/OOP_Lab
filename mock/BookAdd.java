import javax.swing.*;
import  java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class BookAdd implements ActionListener{
    public JFrame fr;
    public JTextField n,p,order;
    public JLabel name,price,type;
    public JComboBox general;
    public String[] gen = {"General","Computer","Math&Sci","Photo"};
    public JButton insert;
    public JPanel pn1,pn2;
    
    public BookAdd(){
        fr = new JFrame();
        n = new JTextField();
        p = new JTextField();
        order = new JTextField(5);
        name = new JLabel("Name");
        price = new JLabel("Price");
        type = new JLabel("Type");
        general = new JComboBox(gen);
        insert = new JButton("Insert");
        pn1 = new JPanel();
        pn2 = new JPanel();
        insert.addActionListener(this);
        
        pn1.setLayout(new GridLayout(3,2));
        pn1.add(name); pn1.add(n);
        pn1.add(price); pn1.add(p);
        pn1.add(type); pn1.add(general);
        
        pn2.setLayout(new FlowLayout());
        pn2.add(insert);
        
        fr.setLayout(new BorderLayout());
        fr.add(pn1,BorderLayout.CENTER);
        fr.add(pn2,BorderLayout.SOUTH);
        
        
        fr.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        fr.setSize(200,150);
        fr.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(insert)) {
               JOptionPane.showMessageDialog(null, "Done it.", "", JOptionPane.DEFAULT_OPTION);
            }
        }
    }  

