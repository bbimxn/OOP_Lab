import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainView implements ActionListener {

    private JFrame fr;
    private JTextField txt;
    private JButton btn;
    private DisplayView dv;

    public MainView() {//DisplayView dv){
        fr = new JFrame();
        txt = new JTextField("", 50);
        btn = new JButton("Send");

        //  this.dv = dv;
        dv = new DisplayView(this);

        btn.addActionListener(this);

        fr.setLayout(new FlowLayout());
        fr.add(txt);
        fr.add(btn);

        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
    }

    public static void main(String[] args) {

        new MainView();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(btn)) {
            dv.getJTxt().setText(txt.getText());
            txt.setText(null);
        }
    }
}