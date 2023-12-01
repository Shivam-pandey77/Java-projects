package notepad;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class About extends JFrame implements ActionListener{
    
    About() {
        
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("notepad/icons/windows.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 60, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel headerIcon = new JLabel(i3);
        headerIcon.setBounds(70,40,400,80);
        add(headerIcon);
        
        
        JSeparator sep= new JSeparator();
        sep.setBounds(50,135,490,10);
        add(sep);
        
        
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("notepad/icons/notepad.png"));
        Image i5 = i4.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel icon = new JLabel(i6);
        icon.setBounds(70,160,70,70);
        add(icon);
        
        JLabel text = new JLabel("<html>Microsoft Windows <br>Version 0.1.0 (OS Build 10945.3405)<br>&copy; Microsoft Windows. All Rights Reserved</html>");
        text.setBounds(170,50,500,300);
        text.setFont(new Font("san_serif",Font.PLAIN,14));
        add(text);
        
        
        JLabel text1 = new JLabel("<html>The Windows 10 Operating System and its Users inteface is protected<br>by trademark or other pending or existing rights<br>in the United States and other Countries/Regions.<html>");
        text1.setBounds(115,130,500,300);
        text1.setFont(new Font("san_serif",Font.PLAIN,14));
        add(text1);
        
        JButton b1 = new JButton("OK");
        b1.addActionListener(this);
        b1.setBounds(400, 390, 120, 25);
        add(b1);
        
        
        setSize(600,500);
        setLocation(300,100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
    }
    
    
    
    public static void main(String args[]) {
        new About();
    }
}
