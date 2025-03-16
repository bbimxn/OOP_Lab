import javax.swing.*;
import  java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class BookView implements ActionListener{
    public JFrame fr;
    public JTextField n,p,order;
    public JLabel name,price,type;
    public JComboBox general;
    public String[] gen = {"General","Computer","Math&Sci","Photo"};
    public JButton left,right,add,update,delete;
    public JPanel pn1,pn2,pn3,pn4;
    
    public BookView(){
        fr = new JFrame();
        n = new JTextField();
        p = new JTextField();
        order = new JTextField(5);
        name = new JLabel("Name");
        price = new JLabel("Price");
        type = new JLabel("Type");
        general = new JComboBox(gen);
        left = new JButton("<<<");
        right = new JButton(">>>");
        add = new JButton("Add");
        update = new JButton("Update");
        delete = new JButton("Delete");
        pn1 = new JPanel();
        pn2 = new JPanel();
        pn3 = new JPanel();
        pn4 = new JPanel();
        
        pn1.setLayout(new GridLayout(3,2));
        pn1.add(name); pn1.add(n);
        pn1.add(price); pn1.add(p);
        pn1.add(type); pn1.add(general);
        
        pn2.setLayout(new FlowLayout());
        pn2.add(left);
        pn2.add(order);
        pn2.add(right);
        
        pn3.setLayout(new FlowLayout());
        pn3.add(add);
        pn3.add(update);
        pn3.add(delete);
        
        add.addActionListener(this);
        update.addActionListener(this);
        delete.addActionListener(this);

        pn4.setLayout(new GridLayout(2,1));
        pn4.add(pn2);
        pn4.add(pn3);
       
                
        fr.setLayout(new GridLayout(2,1));
        fr.add(pn1);
        fr.add(pn4);
        
        
        fr.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
        
    }
    
    public static void main(String[] args) {
        new BookView();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(add)){
            new  BookAdd();
        }
    }
    }
        
        
       

