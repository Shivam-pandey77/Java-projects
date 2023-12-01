package bank.application;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class balanceenquiry extends JFrame implements ActionListener {
    
    
    JButton back;
    String pinnumber;
    int balance;
    balanceenquiry(String pinnumber) {
       this.pinnumber= pinnumber;
       
       
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/img2.jpg"));
        Image i2= i1.getImage().getScaledInstance(900, 750, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,900,750);
        add(image);
        
       
         back= new JButton("BACK");
        back.setBounds(350,412,150,25);
        back.addActionListener(this);
        image.add(back);
        
                Conn c= new Conn();
        
        try {
    
             ResultSet rs = c.s.executeQuery("select * from bank where pin = '"+pinnumber+"'");
            balance= 0;
            while(rs.next())
            {
                if(rs.getString("type").equals(" withdrawl"))
                {
                    balance -= Integer.parseInt( rs.getString("amount"));
                }
                else {
                    balance += Integer.parseInt(rs.getString("amount"));
                }
            }
        }

        catch(Exception e) {
            System.out.println(e);
        }
        
        
        JLabel text= new JLabel("YOUR CURRENT ACCOUNT BALANCE IS:  Rs."+balance);
        text.setForeground(Color.WHITE);
        text.setBounds(170,280,400,30);
        image.add(text);
        
        
        
        
        
       
       
       setSize(900,750);
       setBounds(300,0,900,750);
       setVisible(true);
       setUndecorated(true);
       
       
    }


    public void actionPerformed(ActionEvent ae)  {
        setVisible(false);
        new Transaction(pinnumber).setVisible(true);
    }
    
    
    
    public static void main(String args[]) {
      new balanceenquiry("");
        
    }
}
