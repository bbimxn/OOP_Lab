import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.*;
import java.io.*;

public class ClientBChat implements ActionListener{
    public JFrame frame ;
    public JTextArea txt;
    public JTextField type;
    public JButton send;
    public JPanel pn ;
    public File f ;
    private ClientAChat aa;
    
    public ClientBChat(ClientAChat a){
        JFrame frame = new JFrame("Chatbox - Client B");
        txt = new JTextArea();
        type = new JTextField();
        send = new JButton("Send");
        pn = new JPanel();
        
        aa =a;

        txt.setEditable(false);
        
        pn.setLayout(new BorderLayout());
        pn.add(type,BorderLayout.CENTER); 
        pn.add(send,BorderLayout.EAST);
        
        frame.setLayout(new BorderLayout());
        frame.add(txt,BorderLayout.CENTER);
        frame.add(pn,BorderLayout.SOUTH);
        
        frame.setSize(450,450);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
      
        if (f.exists()){
            try {
                f.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
    
    
    public JTextArea getJTxt() {
        return txt;
    }

    public void setJTxt(JTextArea txt) {
        this.txt = txt;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(send)) {
            String t = type.getText();

            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            String dt = dtf.format(LocalDateTime.now());
            type.setText(null);
            txt.append( "[ " + dt + "] B(You) : " + t + '\n');

            aa.getJTxt().append("[ " + dt + "] B : " + t + '\n');
        }
    }
}