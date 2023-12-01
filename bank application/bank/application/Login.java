package bank.application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class Login extends JFrame implements ActionListener   {
    
    JButton signup , login , clear;
    JTextField textfield1 ;
    JPasswordField textfield2;
    
    Login(){
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel logo= new JLabel(i3);
        logo.setBounds(70,10,100,100);
        add(logo);
        
        JLabel text=new JLabel("WELCOME TO ATM");
        text.setFont(new Font("Osward",Font.BOLD,38));
        text.setBounds(200,40,400,40);
        add(text);
        
        JLabel cardno=new JLabel("Card No.:");
        cardno.setFont(new Font("Raleway",Font.BOLD,28));
        cardno.setBounds(120,150,150,30);
        add(cardno);
        
        textfield1=new JTextField();
        textfield1.setBounds(300,150,230,30);
        textfield1.setFont(new Font("Arial",Font.BOLD,14));
        add(textfield1);
        
        JLabel pin=new JLabel("PIN:");
        pin.setFont(new Font("Raleway",Font.BOLD,28));
        pin.setBounds(120,220,150,30);
        add(pin);
        
        textfield2=new JPasswordField();
        textfield2.setBounds(300,220,230,30);
        textfield2.setFont(new Font("Arial",Font.BOLD,14));
        add(textfield2);
        
         login=new JButton("SIGN IN");
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        login.setBounds(300,270,100,30);
        add(login);
        
        
          clear=new JButton("CLEAR");
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        clear.setBounds(430,270,100,30);
        add(clear);
        
        
         signup=new JButton("SIGN UP");
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        signup.setBounds(300,320,230,30);
        add(signup);
        
        getContentPane().setBackground(Color.WHITE);
        
        
        setSize(750,500);
        setVisible(true);
        setLocation(200,120);
        setTitle("Bank Starter Page");
           }
    
    public void actionPerformed(ActionEvent ae)    {
        if(ae.getSource() == clear)  {
            textfield1.setText("");
            textfield2.setText("");
        }  else if(ae.getSource() == login) {
            
            Conn co= new Conn();
            String cardnumber =textfield1.getText();
            String pinnumber= textfield2.getText();
            
            String query = "select * from login where card_number= '"+cardnumber+"' and pin_number = '"+ pinnumber +"'";
            
            try  {
              ResultSet rs=  co.s.executeQuery(query);
              if(rs.next())
              {
                  setVisible(false);
                  new Transaction(pinnumber).setVisible(true);
              }
              else {
                  JOptionPane.showMessageDialog(null,"incorrect Card Number Or Pin");
              }
            }
            catch (Exception e) {
                System.out.println(e);
            } 
                
            
        } else if( ae.getSource() == signup)  {
            setVisible(false);
            new signupone().setVisible(true);            
        }
    }
    public static void main(String[] args)
    {
        new Login();
    }
}
