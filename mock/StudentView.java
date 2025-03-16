import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
public class StudentView implements ActionListener, WindowListener {
    public JFrame frame;
    public JPanel pn, info, show;
    public JTextField id, name, money;
    public JLabel ID, Name, Money;
    public JButton dep, with;
    public File f;
    public Student std;
    public StudentView(){
        std = new Student();
        f = new File("StudentM.dat");
        frame = new JFrame();
        pn = new JPanel();
        info = new JPanel();
        show = new JPanel();
        ID = new JLabel("    ID :");
        Name = new JLabel("    Name :");
        Money  = new JLabel("    Money :");
        id = new JTextField(String.valueOf(std.getID()));
        name = new JTextField(std.getName());
        money = new JTextField(String.valueOf(std.getMoney()));
        money.setEditable(false);
        dep = new JButton("Deposit");
        with = new JButton("Withdraw");
        
        dep.addActionListener(this);
        with.addActionListener(this);
        
        info.setLayout(new GridLayout(3, 2));
        info.add(ID);
        info.add(id);
        info.add(Name);
        info.add(name);
        info.add(Money);
        info.add(money);

        pn.add(dep);
        pn.add(with);
        frame.setLayout(new BorderLayout());
        frame.add(info);
        frame.add(pn, BorderLayout.SOUTH);
        
        
        frame.setSize(260,150);
        frame.addWindowListener(this);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
        
        if (f.exists()) {
            try {
                f.createNewFile();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(dep)){
            std.setMoney(std.getMoney() + 100);
            money.setText(String.valueOf(std.getMoney()));
        }
        else if (e.getSource().equals(with)){
            if (std.getMoney() > 0){
                std.setMoney(std.getMoney() - 100);
                money.setText(String.valueOf(std.getMoney()));
            }
        }
    }
    
    @Override
    public void windowOpened(WindowEvent e) {
        try{
            FileInputStream fin = new FileInputStream(f); 
            ObjectInputStream iout = new ObjectInputStream(fin);
            
            std = (Student)iout.readObject();
            
            id.setText(String.valueOf(std.getID()));
            name.setText(std.getName());
            money.setText(String.valueOf(std.getMoney()));
            
            iout.close();
            fin.close();
        }catch(IOException ex){
            ex.printStackTrace();
        }catch(ClassNotFoundException ex){
            ex.printStackTrace();
        }
    }

    @Override
    public void windowClosing(WindowEvent e) {
        try{
            std.setID((Integer.parseInt(id.getText())));
            std.setName(name.getText());
            std.setMoney(Integer.parseInt(money.getText()));
            FileOutputStream fout = new FileOutputStream(f);
            ObjectOutputStream oout = new ObjectOutputStream(fout);
            
            oout.writeObject(std);
            
            oout.close();
            fout.close();
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }

    @Override
    public void windowClosed(WindowEvent e) {}

    @Override
    public void windowIconified(WindowEvent e) {}

    @Override
    public void windowDeiconified(WindowEvent e) {}

    @Override
    public void windowActivated(WindowEvent e) {}

    @Override
    public void windowDeactivated(WindowEvent e) {}
    
    
    
    public static void main(String[] args) {
        new StudentView();
    }
 
}
