package bank.application;


import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class pinchange extends JFrame implements ActionListener {

    
    JPasswordField textfield2, textfield1;
    JButton change,back;
    String pinnumber;
    pinchange(String pinnumber) {
        this.pinnumber = pinnumber;
        
        setLayout(null);
        
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/img2.jpg"));
        Image i2= i1.getImage().getScaledInstance(900, 750, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,900,750);
        add(image);
        
        JLabel text= new JLabel("CHANGE YOUR PIN");
        text.setBounds(210,250,700,25);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,15));
        image.add(text);
        
        JLabel pintext= new JLabel("NEW PIN :");
        pintext.setBounds(165,290,200,25);
        pintext.setForeground(Color.WHITE);
        pintext.setFont(new Font("System",Font.BOLD,13));
        image.add(pintext);
        
         textfield1= new JPasswordField();
        textfield1.setBounds(350,290,150,25);
        textfield1.setFont(new Font("raleway",Font.BOLD,25));
        image.add(textfield1);
        
        JLabel repintext= new JLabel("RE-ENTER YOUR PIN :");
        repintext.setBounds(165,320,200,25);
        repintext.setForeground(Color.WHITE);
        repintext.setFont(new Font("System",Font.BOLD,13));
        image.add(repintext);
        
        
         textfield2= new JPasswordField();
        textfield2.setBounds(350,320,150,25);
        textfield2.setFont(new Font("raleway",Font.BOLD,25));
        image.add(textfield2);
        
        
          back= new JButton("BACK");
        back.setBounds(350,431,150,25);
        back.addActionListener(this);
        image.add(back);
        
        
        
          change= new JButton("CHANGE");
        change.setBounds(350,403,150,25);
        change.addActionListener(this);
        image.add(change);
        
        
        
        setSize(900,750);
        setLocation(300,0);
        setUndecorated(true);
        
        
    }
    
    
    
    public void actionPerformed(ActionEvent ae)  {
        
        if(ae.getSource() == change)  {
        try {
            String pin = textfield1.getText();
            String repin = textfield2.getText();
            
            if(!pin.equals(repin)) {
                JOptionPane.showMessageDialog(null,"ENTER PIN DOES NOT MATCH");
                return;
            }
            
            if(pin.equals("") ) {
                  JOptionPane.showMessageDialog(null,"PLEASE ENTER NEW PIN NUMBER");
            }
            
            if(repin.equals("") ) {
                  JOptionPane.showMessageDialog(null,"PLEASE RE-ENTER NEW PIN NUMBER");
            }

            
            Conn c= new Conn();
            
            String query1= "Update bank set pin= '"+repin+"' where pin= '"+pinnumber+"'";
            String query2= "Update login set pin_number= '"+repin+"' where pin_number= '"+pinnumber+"'";
            String query3= "Update signupthree set pin_number= '"+repin+"' where pin_number= '"+pinnumber+"'";

            
            c.s.executeUpdate(query1);
            c.s.executeUpdate(query2);
            c.s.executeUpdate(query3);
            
            JOptionPane.showMessageDialog(null,"PIN NUMBER ENTER SUCCESFULLY");

            setVisible(false);
            new Transaction(repin).setVisible(true);

            
        }  catch(Exception e)  {
            System.out.println(e);
        }
        
        }  else if(ae.getSource() == back)  {
           setVisible(false);
           new Transaction(pinnumber).setVisible(true);
        }
        
        
    }
    
    public static void main(String args[]) {
       
        
        new pinchange("").setVisible(true);
    }
}
