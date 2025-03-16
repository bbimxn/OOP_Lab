import java.awt.*;
import javax.swing.*;

public class MDI {
    private JDesktopPane desktopPane;
    private JFrame fr;
    private JMenuBar mb;
    private JMenu m1, m2, m3, submenu1;
    private JMenuItem i2, i3, i4, sub1, sub2;
    private JInternalFrame if1, if2, if3;
    
    public MDI() {
        fr = new JFrame("SubMenuItem Demo");
        desktopPane = new JDesktopPane();
        mb = new JMenuBar();
        m1 = new JMenu("File");
        m2 = new JMenu("Edit");
        m3 = new JMenu("View");
        submenu1 = new JMenu("New");
        i2 = new JMenuItem("Open");
        i3 = new JMenuItem("Save");
        i4 = new JMenuItem("Exit");
        sub1 = new JMenuItem("Window");
        sub2 = new JMenuItem("Message");
        if1 = new JInternalFrame("Application 01", true,true,true,true);
        if2 = new JInternalFrame("Application 02", true,true,true,true);
        if3 = new JInternalFrame("Application 03", true,true,true,true);
        
        fr.setJMenuBar(mb);
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        m1.add(submenu1);
        m1.add(i2);
        m1.addSeparator();
        m1.add(i3);
        m1.addSeparator();
        m1.add(i4);
        submenu1.add(sub1);
        submenu1.addSeparator();
        submenu1.add(sub2);

        if1.setSize(230,150);
        if1.setVisible(true);
        
        if2.setSize(220,180);
        if2.setVisible(true);
        
        if3.setSize(300,220);
        if3.setVisible(true);
        
        int x2 = if1.getX() + if1.getWidth() + 10;
        int y2 = if1.getY();
        if2.setLocation(x2, y2);
        
        int x3 = if2.getX() + if2.getWidth() + 10;
        int y3 = if2.getY();
        if3.setLocation(x3, y3);
        
        desktopPane.add(if1);
        desktopPane.add(if2);
        desktopPane.add(if3);
        
        fr.add(desktopPane, BorderLayout.CENTER);
        fr.setMinimumSize(new Dimension(800,560));
        desktopPane.setBackground(Color.black);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);

    }
    
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
       new MDI();
    }
}
