package employeesystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Home extends JFrame implements ActionListener{
    
    JButton view,add,update,remove;
    
    Home()  {
        setLayout(null);
        
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i2= i1.getImage().getScaledInstance(1200, 630, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setLayout(null);
        image.setBounds(0,0,1200,630);
        add(image);
        
         JLabel heading = new JLabel("WELCOME TO HOME PAGE");
        heading.setFont(new Font("SERIF",Font.BOLD,27));
        heading.setBounds(750,30,400,40);
        image.add(heading);
        
        add = new JButton("Add Employee");
        add.setBounds(770,100,150,35);
        add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add2.png")));
//        add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add2.png"))); 

        add.addActionListener(this);
        add.setBackground(new Color(192,192,192));
        image.add(add);
        
        view = new JButton("View Employee");
        view.setBounds(950,100,150,35);     
        view.addActionListener(this);
        view.setBackground(new Color(192,192,192));
        image.add(view);
        
        
        update = new JButton("Update Employee");
        update.setBounds(770,150,150,35);
        update.addActionListener(this);
        update.setBackground(new Color(192,192,192));
        image.add(update);
        
        remove = new JButton("Remove Employee");
        remove.setBounds(950,150,150,35);
        remove.addActionListener(this);
        remove.setBackground(new Color(192,192,192));
        image.add(remove);
        
        
        getContentPane().setBackground(Color.WHITE);
        
        ImageIcon i9= new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
        Image set=i9.getImage();
        setIconImage(set);
        setSize(1200,630);
        setLocation(100,30);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        
        if(ae.getSource() == view){
        setVisible(false);
//        new View().setVisble(true);
            
        } else if( ae.getSource() == remove) {
            setVisible(false);
//        new Remove().setVisble(true);

        } else if( ae.getSource() == add) {
            setVisible(false);
           new Add().setVisible(true);

        } else  {
            setVisible(false);
//        new View().setVisble(true);
        }
    }
    
     public static void main(String args[])  {
        new Home();
    }
    
}
