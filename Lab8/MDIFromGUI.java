import java.awt.*;
import javax.swing.*;

public class MDIFromGUI {
    private JFrame fr;
    private JMenuBar mb;
    private JMenu m1,m2,m3,ms1;
    private JMenuItem mi2,mi3,mi4,msi1,msi2;
    
    private JDesktopPane desktopPane;
    private JInternalFrame frame1 ,frame2 ,frame3;
    
    
    public MDIFromGUI(){
        fr = new JFrame("SubMenuItem Demo");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        mb = new JMenuBar();
        m1 = new JMenu("File");
        m2 = new JMenu("Edit");
        m3 = new JMenu("View");
        fr.setJMenuBar(mb);
        mb.add(m1); mb.add(m2); mb.add(m3);
        ms1 = new JMenu("New");
        mi2 = new JMenuItem("Open");
        mi3 = new JMenuItem("Save");
        mi4 = new JMenuItem("Exit");
        m1.add(ms1);
        m1.add(mi2);
        m1.addSeparator();
        m1.add(mi3);
        m1.addSeparator();
        m1.add(mi4);
        
        msi1 = new JMenuItem("Window");
        msi2 = new JMenuItem("Message");
        ms1.add(msi1);
        ms1.addSeparator();
        ms1.add(msi2);
        
        desktopPane = new JDesktopPane();
        desktopPane.setBackground(Color.BLACK);

        frame1 = new JInternalFrame("Application01", true, true, true, true);
        frame1.setSize(200, 100);
        frame1.setBounds(50,300,200,150);
        frame1.setVisible(true);
        desktopPane.add(frame1);

        frame2 = new JInternalFrame("Application02", true, true, true, true);
        frame2.setSize(200, 150);
        frame2.setVisible(true);
        frame2.setBounds(250,80,200,180);
        desktopPane.add(frame2);

        frame3 = new JInternalFrame("Application03", true, true, true, true);
        frame3.setSize(300, 300);
        frame3.setVisible(true);
        frame3.setBounds(500,300,300,200);
        desktopPane.add(frame3);

        desktopPane.setSize(900,600);
        desktopPane.setVisible(true);
        fr.add(desktopPane);
        fr.setSize(900,600);
        fr.setVisible(true);
    }
    public static void main(String[] args) {
        new MDIFromGUI();
    }
}
