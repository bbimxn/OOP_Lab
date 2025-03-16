import java.awt.*;
import javax.swing.*;

public class DisplayView {
    private JFrame fr;
    private JTextField jtxt;
    private MainView mgui;
    
    public DisplayView(MainView m){
        fr = new JFrame();
        jtxt = new JTextField("",50);
        
        mgui = m;
        
        fr.setLayout(new FlowLayout());
        fr.add(jtxt);

        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
    }

    public JTextField getJTxt() {
        return jtxt;
    }

    public void setJTxt(JTextField txt) {
        this.jtxt = txt;
    }

}