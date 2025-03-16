import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.*;
import java.io.*;

public class ClientAChat implements ActionListener,WindowListene{
    public JFrame frame ;
    public JTextArea txt;
    public JTextField type;
    public JButton send;
    public JPanel pn ;
    public File f ;
    private ClientBChat bb;

    public ClientAChat(){
        JFrame frame = new JFrame("Chatbox - Client A");
        txt = new JTextArea();
        type = new JTextField();
        send = new JButton("Send");
        pn = new JPanel();

        bb = new ClientBChat(this);

        
        txt.setEditable(false);
        
        pn.setLayout(new BorderLayout());
        pn.add(type,BorderLayout.CENTER); 
        pn.add(send,BorderLayout.EAST);
        
        frame.setLayout(new BorderLayout());
        frame.add(txt,BorderLayout.CENTER);
        frame.add(pn,BorderLayout.SOUTH);


        send.addActionListener(this);
        type.addActionListener(this);
        
        frame.setSize(450,450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
 
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
            txt.append( "[ " + dt + "] A(You) : " + t + '\n');

            bb.getJTxt().append("[ " + dt + "] A : " + t + '\n');
        }
    }

}