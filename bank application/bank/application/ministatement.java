package bank.application;


import javax.swing.*;
import java.awt.*;
import java.sql.*;


public class ministatement extends JFrame {

    
    
    String pinnumber;
    ministatement(String pinnumber) {
        this.pinnumber = pinnumber;
        
        setLayout(null);
        
      JLabel mini= new JLabel();
      mini.setBounds(20,140,400,200);
      add(mini);
        
      
      JLabel bank= new JLabel("Indian Bank");
      bank.setBounds(150,20,100,20);
        add(bank);
        
        JLabel card= new JLabel();
      card.setBounds(20,80,300,20);
        add(card);
        
        JLabel balance= new JLabel();
        balance.setBounds(20,320,300,320);
        add(balance);
        
         int bal= 0;
        
        try{
            Conn c= new Conn();
            ResultSet rs= c.s.executeQuery("select * from login where pin_number='"+pinnumber+"'");
           while(rs.next()) {
               card.setText("Card Number: "+rs.getString("card_number").substring(0,4)+"-XXXX-XXXX-"+rs.getString("card_number").substring(12));
             
              }         
        }
        catch(Exception e) {
            System.out.println(e);
        }
        
        
        
         try{
            Conn c= new Conn();
            ResultSet rs= c.s.executeQuery("select * from bank where pin='"+pinnumber+"'");
           while(rs.next()) {
                 mini.setText(mini.getText()+ "<html>"+ rs.getString("date")+ "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+rs.getString("type")+ "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+ rs.getString("amount")+"<br><br><html>");
           
                  if(rs.getString("type").equals(" withdrawl"))
                {
                    bal -= Integer.parseInt( rs.getString("amount"));
                }
                else {
                    bal += Integer.parseInt(rs.getString("amount"));
                }
                  
           }
           balance.setText("Your Current Account Balance is : Rs. "+bal);
        }
        catch(Exception e) {
            System.out.println(e);
        }
        
       
        
        
        getContentPane().setBackground(Color.WHITE);  
        setSize(400,600);
        setLocation(20,02);
        setTitle("MINI STATEMENT");
        
        
    }
   
    
    public static void main(String args[]) {
       
        
        new ministatement("").setVisible(true);
    }
}
