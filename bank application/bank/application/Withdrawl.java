package bank.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Withdrawl extends JFrame implements ActionListener {

     JTextField amount;
     JButton withdrawl,back;
     String pinnumber;
    Withdrawl( String pinnumber) 
    {
        this.pinnumber = pinnumber;

        
        setLayout(null);
        
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/img2.jpg"));
        Image i2= i1.getImage().getScaledInstance(900,750,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image= new JLabel(i3);
        image.setBounds(0,0,900,750);
        add(image);
        
        JLabel text= new JLabel("Enter the amount you want to withdraw");
        text.setBounds(210,250,400,40);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,15));
        image.add(text);
        
        
        amount= new JTextField();
        amount.setFont(new Font("releway",Font.BOLD,22));
        amount.setBounds(215,300,250,25);
        image.add(amount);
        
        
        withdrawl = new JButton("withdraw");
        withdrawl.setBounds(350,403,150,25);
        withdrawl.addActionListener(this);
        image.add(withdrawl);
        
        
        back = new JButton("BACK");
        back.setBounds(350,431,150,25);
        back.addActionListener(this);
        image.add(back);
        
        
        
        
        setLocation(300,0);
        setSize(900,750);
        setUndecorated(true);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if( ae.getSource() == back)
        {
            setVisible(false);
            new Transaction(pinnumber).setVisible(true);
        }
        else if( ae.getSource() == withdrawl )
        {
            String dep= amount.getText();
            Date date= new Date();
            if(dep.equals(""))
            {
                JOptionPane.showMessageDialog(null ,"Please enter the amount you want to withdrawl");
            }
            else 
            {
            try {
                 Conn c= new Conn(); 
                String query = "insert into bank values ('" +pinnumber + "' , '"+date+ "' , ' withdrawl' , '"+ dep+ "' )";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"RS "+dep+" withdraw Successfully");
                setVisible(false);
                new Transaction(pinnumber).setVisible(true); 
            }
            catch (Exception e) {
                
                System.out.println(e);
            }
            
            
        }
        
        }
    }
   
    public static void main(String args[]) {
        
        new Withdrawl("");
    }
}
