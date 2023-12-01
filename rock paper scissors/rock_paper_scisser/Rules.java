package rock_paper_scisser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame {

    String name;
    Rules(String name)  {
        this.name = name;
        setLayout(null);
        
        JLabel welcome = new JLabel("Welcome "+name);
        welcome.setFont(new Font("Ink free", Font.PLAIN,50));
        welcome.setBounds(380,10,600,60);
        welcome.setForeground(new Color(30,144,254));
        welcome.setForeground( Color.white);
        add(welcome);
        
        JLabel rule1 = new JLabel();
        rule1.setFont(new Font("sens-serif",Font.PLAIN,16));
        rule1.setBounds(50,80,900,30);
        //rule1.setForeground( Color.WHITE);
        add(rule1);
        
        ImageIcon i13 = new ImageIcon(ClassLoader.getSystemResource("icons/haheboy.png"));
        Image i14 = i13.getImage().getScaledInstance(70, 90, Image.SCALE_DEFAULT);
        ImageIcon i15 = new ImageIcon(i14);
        JLabel image4 = new JLabel(i15);
        //image4.setForeground( Color.WHITE);
        image4.setBounds(720,65,70,90);
        add(image4);
        
        
        JLabel rule2 = new JLabel();
        rule2.setFont(new Font("sens-serif",Font.PLAIN,16));
        rule2.setBounds(50,150,900,30);
        //rule2.setForeground( Color.WHITE);
        add(rule2);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/quantom.png"));
        Image i2 = i1.getImage().getScaledInstance(200, 180, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        //image.setForeground( Color.WHITE);
        image.setBounds(850,80,200,180);
        add(image);
        
        
        JLabel rule3 = new JLabel();
        rule3.setFont(new Font("sens-serif",Font.PLAIN,16));
        rule3.setBounds(350,270,800,30);
        //rule3.setForeground( Color.WHITE);
        add(rule3);
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/overthik.png"));
        Image i5 = i4.getImage().getScaledInstance(250, 180, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image1 = new JLabel(i6);
        //image1.setForeground( Color.WHITE);
        image1.setBounds(50,200,250,180);
        add(image1);
        
        JLabel rule4 = new JLabel();
        rule4.setFont(new Font("sens-serif",Font.PLAIN,16));
        rule4.setBounds(50,430,900,30);
        //image4.setForeground( Color.WHITE);
        add(rule4);
        
        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("icons/crying.png"));
        Image i8 = i7.getImage().getScaledInstance(200, 180, Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        JLabel image2 = new JLabel(i9);
        //image2.setForeground( Color.WHITE);
        image2.setBounds(850,360,200,180);
        add(image2);
        
        JLabel rule5 = new JLabel();
        rule5.setFont(new Font("sens-serif",Font.PLAIN,16));
        rule5.setBounds(350,560,600,60);
        //rule5.setForeground( Color.WHITE);
        add(rule5);
        
        ImageIcon i10 = new ImageIcon(ClassLoader.getSystemResource("icons/muscle.png"));
        Image i11 = i10.getImage().getScaledInstance(250, 220, Image.SCALE_DEFAULT);
        ImageIcon i12 = new ImageIcon(i11);
        JLabel image3 = new JLabel(i12);
        //image3.setForeground( Color.WHITE);
        image3.setBounds(50,440,250,220);
        add(image3);       
        
        
        rule1.setText(
                " This is a simple rock paper scissor game made to play fairly, occasional chearting are allowed"
                );
         rule2.setText(
                " This is a simple game, no big rocket science so dont apply quatam mechicans here"
                );
        rule3.setText(
                " Dont overthink just say 'jai mata di' and click any thing as the other party is also doing the same"
                );
        
        rule4.setText(
                " There is no need to cry after you loose the game as you can always restart it but not your life so go and study"
                );
        
         rule5.setText(
                "<html> If you think you are a champian at is game than give it a try and dont destroy your house <br>after lossing the game<html>"
                );
         
         
         JButton next = new JButton("Next");
        next.setBounds(900,620,120,28);
        next.setBackground(Color.black);
        next.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);
                new Home().setVisible(true);
            }
        });
        next.setForeground( Color.WHITE);
        add(next);
        
        getContentPane().setBackground(new Color(116,139,151));
        setBounds(100,20,1100,700);
        setVisible(true);
    }
    public static void main(String args[]) {
       new Rules("User");
    }
}
