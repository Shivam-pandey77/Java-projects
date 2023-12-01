package employeesystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class login extends JFrame{
    
    JTextField tfuser;
    JPasswordField tfpass;
    login()  {
        
        setLayout(null);
        
        JLabel lbluser = new JLabel("Username : ");
        lbluser.setFont(new Font("SERIF",Font.BOLD,16));
        lbluser.setBounds(50,80,100,30);
        add(lbluser);
        
        tfuser = new JTextField();
        tfuser.setBounds(170,80,200,30);
        add(tfuser);
        
        
        JLabel lblpass = new JLabel("Password : ");
        lblpass.setFont(new Font("SERIF",Font.BOLD,16));
        lblpass.setBounds(50,130,100,30);
        add(lblpass);
        
        tfpass = new JPasswordField();
        tfpass.setBounds(170,130,200,30);
        add(tfpass);
        
        
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
        Image i2= i1.getImage().getScaledInstance(400, 350, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(450,0,400,350);
        add(image);
        
        JButton clear = new JButton("Clear");
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                tfpass.setText("");
                tfuser.setText("");
                        
            }
        });
        clear.setBounds(240,220,150,30);
        add(clear);
                
        JButton login = new JButton("Login");
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                Conn c= new Conn();
                
                String pass= tfpass.getText();
                String user= tfuser.getText();
                
                try {
                    String query ="select * from login where username= '"+user+"' and password= '"+pass+"'";
                    
                    ResultSet rs= c.s.executeQuery(query);
                    
                    if(rs.next()) {
                        setVisible(false);
//                        new Home().setVisible(true);
                    }
                    else 
                        JOptionPane.showMessageDialog(null, "Invalid Username or Password");
                }  catch(Exception e) {
                    e.printStackTrace();
                }
                
                        
            }
        });
        login.setBounds(60,220,150,30);
        add(login);
                
        
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,400);
        setLocation(240,100);
        setVisible(true);   
    }
    
    
    public static void main(String args[])  {
        new login();
    }
}
