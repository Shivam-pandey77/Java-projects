package bank.application;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class Transaction extends JFrame implements ActionListener{

    JButton deposit,withdrawl,fcash,ministat,pinchange,balance,exit;
    String pinnumber;
    Transaction(String pinnumber) 
    {
        this.pinnumber = pinnumber;
        
        setLayout(null);
        
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/img2.jpg"));
        Image i2= i1.getImage().getScaledInstance(900,750,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image= new JLabel(i3);
        image.setBounds(0,0,900,750);
        add(image);
        
        
        JLabel text= new JLabel("Please Select your of Transaction");
        text.setBounds(210,250,700,40);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,15));
        image.add(text);
        
        
        deposit= new JButton("Deposit");
        deposit.setBounds(180,347,150,25);
        deposit.addActionListener(this);
        image.add(deposit);
        
        withdrawl= new JButton("Withdrawl");
        withdrawl.setBounds(350,347,150,25);
        withdrawl.addActionListener(this);
        image.add(withdrawl);
        
        fcash= new JButton("Fast cash");
        fcash.setBounds(180,375,150,25);
        fcash.addActionListener(this);     
        image.add(fcash);
        
        ministat= new JButton("Mini statment");
        ministat.setBounds(350,375,150,25);
        ministat.addActionListener(this);
        image.add(ministat);
        
        balance= new JButton("Balance Inquiry");
        balance.setBounds(350,403,150,25);
        balance.addActionListener(this);
        image.add(balance);
        
        
        
        pinchange= new JButton("Pin change");
        pinchange.setBounds(180,403,150,25);
        pinchange.addActionListener(this);
        image.add(pinchange);
        
        
        exit= new JButton("Exit");
        exit.setBounds(350,431,150,25);
        exit.addActionListener(this);
        image.add(exit);
        
        
        
        setLocation(300,0);
        setSize(900,750);
        setUndecorated(true);
        setVisible(true);
    }
    
    
    public void actionPerformed(ActionEvent ae)  {
        
        if(ae.getSource() == deposit) {
            setVisible(false);
            new Deposit(pinnumber).setVisible(true);
            
        }
        else if( ae.getSource() == withdrawl) {
             setVisible(false);
            new Withdrawl(pinnumber).setVisible(true);
            
        }  
        else if( ae.getSource() == fcash) {
            setVisible(false);
            new FastCash(pinnumber).setVisible(true);
        }
        else if( ae.getSource() == ministat) {

            new ministatement(pinnumber).setVisible(true);
            
        }
        else if( ae.getSource() == pinchange) {
            setVisible(false);
            new pinchange(pinnumber).setVisible(true);
            
        }
        else if( ae.getSource() == balance) {
            setVisible(false);
           new balanceenquiry(pinnumber).setVisible(true);           
            
        }
        else if( ae.getSource() == exit) {
            
            System.exit(0);
        }
        
        try {
            
        }  catch (Exception e)  {
            
            System.out.println(e);
        }
    }
    
    public static void main(String args[]) {
        
        new Transaction("");
    }
}
