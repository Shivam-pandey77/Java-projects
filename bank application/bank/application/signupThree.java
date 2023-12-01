package bank.application;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class signupThree extends JFrame implements ActionListener {

    
     JRadioButton r1,r2,r3,r4;
     JCheckBox c1,c2,c3,c4,c5,c6,c7;
     JButton submit,cancel;
     String formno;
     
    signupThree(String formno){
        
        formno = this.formno;
        setLayout(null);
        
        
        JLabel l1= new JLabel("Page-3 Account Details");
        l1.setBounds(280,10,400,40);
        l1.setFont(new Font("raleway",Font.BOLD,22));
        add(l1);
        
        JLabel type= new JLabel("Account Type");
        type.setBounds(100,110,200,30);
        type.setFont(new Font("raleway",Font.BOLD,22));
        add(type);
        
       
        r1=new JRadioButton("Saving Account");
        r1.setFont((new Font("raleway",Font.BOLD,16)));
        r1.setBackground(Color.white);
        r1.setBounds(100,150,250,20);
        add(r1);
        
        r2=new JRadioButton("Fixed Deposit Account");
        r2.setFont((new Font("raleway",Font.BOLD,16)));
        r2.setBackground(Color.white);
        r2.setBounds(350,150,250,20);
        add(r2);
        
        r3=new JRadioButton("Current Account");
        r3.setFont((new Font("raleway",Font.BOLD,16)));
        r3.setBackground(Color.white);
        r3.setBounds(100,190,250,20);
        add(r3);
        
        r4=new JRadioButton("Recurring Deposit Account");
        r4.setFont((new Font("raleway",Font.BOLD,16)));
        r4.setBackground(Color.white);
        r4.setBounds(350,190,250,20);
        add(r4);
        
        ButtonGroup btngroup=new ButtonGroup();
        btngroup.add(r1);
        btngroup.add(r2);
        btngroup.add(r3);
        btngroup.add(r4);
        
        
        JLabel card= new JLabel("Card Number :");
        card.setBounds(100,270,200,30);
        card.setFont(new Font("raleway",Font.BOLD,22));
        add(card);
        
        JLabel number= new JLabel("XXXX-XXXX-XXXX-4184");
        number.setBounds(330,270,300,30);
        number.setFont(new Font("raleway",Font.BOLD,22));
        add(number);
        
        JLabel carddetail= new JLabel("Your 16 Digit card Number");
        carddetail.setBounds(100,300,300,20);
        carddetail.setFont(new Font("raleway",Font.BOLD,12));
        add(carddetail);
        
        JLabel pin= new JLabel("Pin :");
        pin.setBounds(100,340,200,30);
        pin.setFont(new Font("raleway",Font.BOLD,22));
        add(pin);
        
        JLabel pnumber= new JLabel("XXXX");
        pnumber.setBounds(330,340,300,30);
        pnumber.setFont(new Font("raleway",Font.BOLD,22));
        add(pnumber);
        
        JLabel pindetails= new JLabel("Your 4 Digit Password");
        pindetails.setBounds(100,370,300,20);
        pindetails.setFont(new Font("raleway",Font.BOLD,12));
        add(pindetails);
        
        
        JLabel service= new JLabel("Services Required :");
        service.setBounds(100,420,200,30);
        service.setFont(new Font("raleway",Font.BOLD,22));
        add(service);
        
        c1= new JCheckBox("ATM Card");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("ralway",Font.BOLD,16));
        c1.setBounds(100,470,200,30);
        add(c1);
        
        c2= new JCheckBox("Internet Banking");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("ralway",Font.BOLD,16));
        c2.setBounds(350,470,200,30);
        add(c2);
        
        c3= new JCheckBox("Mobile Banking");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("ralway",Font.BOLD,16));
        c3.setBounds(100,520,200,30);
        add(c3);
        
        c4= new JCheckBox("Email & SMS Alert");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("ralway",Font.BOLD,16));
        c4.setBounds(350,520,200,30);
        add(c4);
        
        c5= new JCheckBox("Check Book");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("ralway",Font.BOLD,16));
        c5.setBounds(100,570,200,30);
        add(c5);
        
        c6= new JCheckBox("E-Statment");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("ralway",Font.BOLD,16));
        c6.setBounds(350,570,200,30);
        add(c6);
               
        c7= new JCheckBox("I Here By Declare The Above Details Are Correct To Beat Of My Knowledge");
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("ralway",Font.BOLD,12));
        c7.setBounds(100,610,600,30);
        add(c7);
        
          cancel = new JButton("CANCEL");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        cancel.setFont(new Font("raleway",Font.BOLD,14));
        cancel.setBounds(220, 660,100,30);
        add(cancel);
        
        submit = new JButton("SUBMIT");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setFont(new Font("raleway",Font.BOLD,14));
        submit.setBounds(420, 660,100,30);
        add(submit);
        
        
        
        setVisible(true);
        setLocation(350,0);
        setSize(850,820);
        
        getContentPane().setBackground(Color.WHITE);
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
          
        if(ae.getSource() == submit)
        {
            String AccountTy = null;
            if(r1.isSelected())
            AccountTy="Savings Account";
            else if( r2.isSelected())
                AccountTy="Fixed Deposit";
            else if( r3.isSelected())
                AccountTy="Current Account";
            else if(r4.isSelected())
                AccountTy="Recurring Deposit Account";
            
            
            Random random= new Random();
        String cardno= ""+Math.abs((random.nextLong() %90000000L) +5040936000000000L);
        String pinno=""+ Math.abs((random.nextLong()) %9000L + 1000L);
        
        String facility="";
        if(c1.isSelected()) 
            facility= facility+" ATM CARD";
        else if(c2.isSelected()) 
            facility= facility+" INTERNET BANKING";
        else if(c3.isSelected()) 
            facility= facility+" MOBILE BANKING";
        else if(c4.isSelected()) 
            facility= facility+" EMAIL & SMS ALERT";
        else if(c5.isSelected()) 
            facility= facility+" CHEQUE BOOK";
        else if(c6.isSelected()) 
            facility= facility+" E-STATMENT";
        

       try {        
        
           if(AccountTy.equals("")) {
               JOptionPane.showMessageDialog(null, "Account Type is Required");
            }
           else {
               Conn c= new Conn();
               String query1 = "insert into signupthree values('"+formno+"' , '"+AccountTy+"' , '"+cardno+"' , '"+pinno+"' , '"+facility+"' )" ;
               String query2 = "insert into login values('"+formno+"' , '"+cardno+"' , '"+pinno+"' )" ;
               
               
               c.s.executeUpdate(query2);
               c.s.executeUpdate(query1);
               
               JOptionPane.showMessageDialog(null, "Card Number :"+cardno+"\nPin :"+pinno);
           }
               setVisible(false);
               new Deposit(pinno).setVisible(true);
           
           
        }
        catch(Exception e) {
             System.out.println(e);
                }
            
        }
        else if(ae.getSource() == cancel)
        {
            setVisible(false);
            new Login().setVisible(true);
        }
        
    }
    public static void main(String args[]) {
    new signupThree("");  
    
    }
}
