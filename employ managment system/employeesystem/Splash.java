package employeesystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Splash extends JFrame{
    
    
    Splash()  {
        
        setLayout(null);
        
        JLabel heading = new JLabel("EMPLOY MANAGMENT SYSTEM");
        heading.setFont(new Font("SERIF",Font.BOLD,44));
        heading.setForeground(Color.red);
        heading.setBounds(220,30,900,70);
        add(heading);
        
        
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/front.jpg"));
        Image i2= i1.getImage().getScaledInstance(1100, 500, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setLayout(null);
        image.setBounds(25,100,1100,500);
        add(image);
        
        JButton go = new JButton("Click To Continue");
        go.setBackground(Color.BLACK);
        go.setForeground(Color.WHITE);
        go.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);
                new login().setVisible(true);
                        
            }
        });
        go.setBounds(330,370,400,70);
        image.add(go);
        
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(1150,650);
        setLocation(150,50);
        setVisible(true);  
        
        
        while(true) {
            heading.setVisible(true);
            
            try {
                 Thread.sleep(500);
            } catch(Exception e)  {
                e.printStackTrace();
            }
            heading.setVisible(false);
            
             try {
                 Thread.sleep(500);
            } catch(Exception e)  {
                e.printStackTrace();
            }
            
           
        }
        
    }
    
    
    public static void main(String args[])  {
        new Splash();
    }
}
