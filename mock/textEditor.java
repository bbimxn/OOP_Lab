import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.lang.module.ModuleDescriptor;
import javax.swing.*;

public class textEditor implements ActionListener{
    private JFrame fr;
    private JMenuBar bar;
    private JMenu file;
    private JMenuItem n,o,s,c;
    private JTextArea area;
    private File f;

    public textEditor(){
        this.fr = new JFrame();
        JMenuBar bar = new JMenuBar();
        file = new JMenu("File");
        n = new JMenuItem("New");
        o = new JMenuItem("Open");
        s = new JMenuItem("Save");
        c = new JMenuItem("Close");
        area = new JTextArea();
        
        n.addActionListener(this);
        o.addActionListener(this);
        s.addActionListener(this);
        c.addActionListener(this);
        
        file.add(n);
        file.add(o);
        file.add(s);
        file.addSeparator();
        file.add(c);
        
        bar.add(file);
        fr.setJMenuBar(bar);
        fr.add(area);
        
        fr.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        fr.setSize(200,300);
        fr.setVisible(true);
    }
    
    public static void main(String[] args) {
        new textEditor();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(n)){
            area.setText(null);
        }
        if (e.getSource().equals(c)){
            System.exit(0);
        }
        if (e.getSource().equals(o)){
            JFileChooser fc =new JFileChooser();
            fc.showOpenDialog(fr);
            File f = fc.getSelectedFile();
        }
        if (e.getSource().equals(s)){
            JFileChooser fc =new JFileChooser();
            fc.showSaveDialog(fr);
            File f = fc.getSelectedFile();
        }
    }
}
