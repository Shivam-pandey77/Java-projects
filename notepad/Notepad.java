package notepad;

import java.awt.Color;
import java.awt.*;
import java.awt.event.*;
import java.awt.print.PrinterException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class Notepad extends JFrame implements ActionListener {

     JTextArea area;
     String s="";
    
    Notepad() {
        
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("notepad/icons/notepad.png"));
        Image i2= i1.getImage();
        setIconImage(i2);
        
        Font fo= new Font("AERIAL",Font.PLAIN,14);

        
        JMenuBar menubar = new JMenuBar();       
        menubar.setBackground(Color.WHITE);

        
        JMenu file = new JMenu("File");
        file.setFont(fo);
        
        JMenuItem newdoc = new JMenuItem("New");
        newdoc.addActionListener(this);
        newdoc.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,ActionEvent.CTRL_MASK));
        file.add(newdoc);
        
        JMenuItem open = new JMenuItem("Open");
        open.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,ActionEvent.CTRL_MASK));
        open.addActionListener(this);
        file.add(open);
        
        JMenuItem save = new JMenuItem("Save");
        save.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,ActionEvent.CTRL_MASK));
        save.addActionListener(this);
        file.add(save);
        
        
        JMenuItem print = new JMenuItem("Print");
        print.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,ActionEvent.CTRL_MASK));
        print.addActionListener(this);
        file.add(print);
        
        JMenuItem exit = new JMenuItem("Exit");
        exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE,ActionEvent.CTRL_MASK));
        exit.addActionListener(this);
        file.add(exit);        
        
        JMenu edit = new JMenu("Edit");
        edit.setBackground(Color.WHITE);
        edit.setFont(fo);
        
        JMenuItem copy = new JMenuItem("Copy");
        copy.addActionListener(this);
        copy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,ActionEvent.CTRL_MASK));
        edit.add(copy);
        
        JMenuItem cut = new JMenuItem("Cut");
        cut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,ActionEvent.CTRL_MASK));
        cut.addActionListener(this);
        edit.add(cut);
        
        JMenuItem paste = new JMenuItem("Paste");
        paste.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V,ActionEvent.CTRL_MASK));
        paste.addActionListener(this);
        edit.add(paste);
        
        
        JMenuItem select = new JMenuItem("Select All");
        select.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,ActionEvent.CTRL_MASK));
        select.addActionListener(this);
        edit.add(select);
        
        
        JMenu helpmenu = new JMenu("Help");
        helpmenu.setFont(fo);
        
        JMenuItem help = new JMenuItem("About");
        help.addActionListener(this);
        help.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, ActionEvent.CTRL_MASK));
        helpmenu.add(help);      
                       
        
        
        menubar.add(file);
        menubar.add(edit);
        menubar.add(helpmenu);
        
        
        
        setJMenuBar(menubar);
        
        
        area = new JTextArea();
        add(area);
        area.setFont(new Font("san_sarif",Font.PLAIN,18));
        area.setWrapStyleWord(true);
        area.setLineWrap(true);

        
        JScrollPane scroll = new JScrollPane(area);
        scroll.setBorder(BorderFactory.createEmptyBorder());
        add(scroll);


        
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setTitle("Notepad");
        setVisible(true);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent ae)  {
        
        if(ae.getActionCommand().equalsIgnoreCase("Open"))  {
            
        }
        else if(ae.getActionCommand().equalsIgnoreCase("Save"))  {
            
        }
        else if(ae.getActionCommand().equalsIgnoreCase("Print"))  {
            try {
                area.print();
            } catch (PrinterException ex) {
                Logger.getLogger(Notepad.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(ae.getActionCommand().equalsIgnoreCase("New"))  {
            area.setText("");
        }
        else if(ae.getActionCommand().equalsIgnoreCase("Exit"))  {
            System.exit(0);
        }
        else if(ae.getActionCommand().equalsIgnoreCase("Cut"))  {
            s= area.getSelectedText();
            area.replaceRange("", area.getSelectionStart(), area.getSelectionEnd());
        }
        else if(ae.getActionCommand().equalsIgnoreCase("Paste"))  {
            area.insert(s, area.getCaretPosition());
        }
        else if(ae.getActionCommand().equalsIgnoreCase("Copy"))  {
            s = area.getSelectedText();
        }
        else if(ae.getActionCommand().equalsIgnoreCase("Select All"))  {
            area.selectAll();
        }
        else if(ae.getActionCommand().equalsIgnoreCase("About"))  {
            new About().setVisible(true); 
        }
    }
    
    public static void main(String[] args) {
        
        new Notepad();
        
    }
    
}
