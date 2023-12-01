package bank.application;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;
import java.util.Date;



public class FastCash extends JFrame implements ActionListener{

    JButton hund,fivehund,thous,twothous,fivethous,tenthous,back;
    String pinnumber;
    
    FastCash(String pinnumber)     
    {
        this.pinnumber = pinnumber;
        
        setLayout(null);
        
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/img2.jpg"));
        Image i2= i1.getImage().getScaledInstance(900,750,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image= new JLabel(i3);
        image.setBounds(0,0,900,750);
        add(image);
        
        
        JLabel text= new JLabel("SELECT WITHDRAWL AMOUNT");
        text.setBounds(210,250,700,40);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,15));
        image.add(text);
        
        
        hund= new JButton("Rs 100");
        hund.setBounds(180,347,150,25);
        hund.addActionListener(this);
        image.add(hund);
        
        fivehund= new JButton("Rs 500");
        fivehund.setBounds(350,347,150,25);
        fivehund.addActionListener(this);
        image.add(fivehund);
        
        thous= new JButton("Rs 1000");
        thous.setBounds(180,375,150,25);
        thous.addActionListener(this);     
        image.add(thous);
        
        twothous= new JButton("Rs 2000");
        twothous.setBounds(350,375,150,25);
        twothous.addActionListener(this);
        image.add(twothous);
        
        fivethous= new JButton("Rs 5000");
        fivethous.setBounds(350,403,150,25);
        fivethous.addActionListener(this);
        image.add(fivethous);
        
        
        
        tenthous= new JButton("Rs 10000");
        tenthous.setBounds(180,403,150,25);
        tenthous.addActionListener(this);
        image.add(tenthous);
        
        
        back= new JButton("BACK");
        back.setBounds(350,431,150,25);
        back.addActionListener(this);
        image.add(back);
        
        
        
        setLocation(300,0);
        setSize(900,750);
        setUndecorated(true);
        setVisible(true);
    }
    
    
    public void actionPerformed(ActionEvent ae)  {
        
   
        if( ae.getSource() == back) {
            
            setVisible(false);
            new Transaction(pinnumber).setVisible(true);
        }
        else  {
            String Amount= ((JButton)ae.getSource()).getText().substring(3);
              Conn c= new Conn();
        
        
        try {
            ResultSet rs = c.s.executeQuery("select * from bank where pin = '"+pinnumber+"'");
            int balance= 0;
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
            System.out.println(balance);
            
            if(ae.getSource() != back && balance < Integer.parseInt(Amount))
            {
                JOptionPane.showMessageDialog(null,"Insufficient Balance");
                return ;
            }
            Date date = new Date();
            
            String query = "insert into bank values ('" +pinnumber + "' , '"+date+ "' , ' withdrawl' , '"+ Amount+ "' )";            c.s.executeUpdate(query);
            c.s.executeUpdate(query);
            
            JOptionPane.showMessageDialog(null,"Rs. "+Amount+" Debited Sucessfully");
            
            setVisible(false);
            new Transaction(pinnumber).setVisible(true);
        }  catch (Exception e)  {
            
            System.out.println(e);
        }
    }
    }
    
    public static void main(String args[]) {
        
        new FastCash("");
    }
}
