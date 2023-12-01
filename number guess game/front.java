package number_game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class front extends JFrame implements ActionListener {
    
    JTextField tf;
    JButton btn,exit;
 
    front()
    {
        
        setLayout(null);
        
        JPanel p1= new JPanel();
        p1.setBounds(0,0,350,500);
        p1.setLayout(null);
        p1.setBackground(Color.BLACK);
        add(p1);
        
        JLabel lbl= new JLabel("<html>NUMBER<br>GUSSING<br>GAME<html>");
        lbl.setForeground(Color.white);
        lbl.setFont(new Font("Ink Free",Font.BOLD,48));
        lbl.setBounds(50,50,300,300);
        p1.add(lbl);
        
        
         JPanel p2= new JPanel();
        p2.setBounds(350,0,450,500);
        p2.setLayout(null);
        add(p2);
        
        JLabel name= new JLabel("Enter Your Name");
        name.setForeground(new Color(30,144,254));
        p2.setBackground(Color.white);
        name.setFont(new Font("Ink free",Font.PLAIN,38));
        name.setBounds(100,140,300,50);
        p2.add(name);        
        
        
        tf= new JTextField();
        tf.setBounds(115,220,250,30);
        tf.setFont(new Font("Serif",Font.PLAIN,26));
        p2.add(tf);
        
        
        btn= new JButton("Play");
        btn.setBackground(new Color(30,144,254));
        btn.setForeground(Color.white);
        btn.addActionListener(this);
        btn.setBounds(130,280,100,30);
        p2.add(btn);
        
         exit= new JButton("Exit");
        exit.setBackground(new Color(30,144,254));
        exit.setForeground(Color.white);
        exit.addActionListener(this);
        exit.setBounds(250,280,100,30);
        p2.add(exit);
        
        
        getContentPane().setBackground(Color.white);
        
        setSize(800,500);
        setLocation(200,100);
        setTitle("Number Gussing Game");
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        
        if(ae.getSource()==exit)
        {
            System.exit(0);
        }
        else
        {
           setVisible(false);
           new home(tf.getText()).setVisible(true);
        }
    }
    
    public static void main(String[] args)
    {
        new front();
    }
}
