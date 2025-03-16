import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.*;
import java.io.*;
public class ChatDemo implements ActionListener, WindowListener {
    public JFrame frame;
    public JTextArea area;
    public JTextField text;
    public JPanel back, pan;
    public JButton submit, reset;
    public File f ;
    
    public ChatDemo(){ 
        f = new File("ChatDemo.dat");
        frame = new JFrame();
        area = new JTextArea();
        //area.setSize();
        area.setEditable(false);
        text = new JTextField();
        //tx.setSize();
        back = new JPanel();
        pan = new JPanel();
        submit = new JButton("Submit");
        reset = new JButton("Reset");
        
        submit.addActionListener(this);
        reset.addActionListener(this);
        
        frame.setLayout(new BorderLayout());
        frame.add(area, BorderLayout.CENTER);
        back.setLayout(new BorderLayout());
        back.add(text, BorderLayout.NORTH);
        pan.add(submit);
        pan.add(reset);
        back.add(pan, BorderLayout.SOUTH);
        frame.add(back, BorderLayout.SOUTH);
        
        frame.setSize(450,450);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.addWindowListener(this);
        frame.setVisible(true);
        
        if (f.exists()){
            try {
                f.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(submit)){
            String txt = text.getText();
            text.setText(null);
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            String dt = dtf.format(LocalDateTime.now());
            area.append( dt + " : " + txt + '\n');
        }
        else if (e.getSource().equals(reset)){
            area.setText(null);
        }
    }
        
    @Override
    public void windowOpened(WindowEvent e) {
        try{
            FileInputStream fin = new FileInputStream(f); 
            DataInputStream din = new DataInputStream(fin);
                
            String line = din.readUTF();
                
            area.append(line);
                
            din.close();
            fin.close();
        }catch(IOException ex){
            ex.printStackTrace();
        }     
    }

    @Override
    public void windowClosing(WindowEvent e) {
        try{
            FileOutputStream fout = new FileOutputStream(f);
            DataOutputStream dout = new DataOutputStream(fout);
            
            dout.writeUTF(area.getText());

            dout.close();
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
        new ChatDemo();
    }
}
