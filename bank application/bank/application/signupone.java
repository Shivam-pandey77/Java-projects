package bank.application;
import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class signupone extends JFrame implements ActionListener {
    
    long random;
    JButton next;
    JTextField nameText, fnameText,emailText,pinText,addressText,cityText,stateText;
    JRadioButton unmarried,married,other,male,female;
    JDateChooser date;
    
    signupone(){
        setLayout(null);
     
        Random ran=new Random();
         random=Math.abs((ran.nextLong() %9000L)+1000L) ;
        
        JLabel formno=new JLabel("APPLICATION FORM NO.   "+random);
        formno.setFont(new Font("raleway",Font.BOLD,36));
        formno.setBounds(140,20,600,40);
        add(formno);
        
        
        JLabel personal=new JLabel("PAGE-1 : Personal Details");
        personal.setFont(new Font("raleway",Font.BOLD,22));
        personal.setBounds(290,80,400,30);
        add(personal);
        
        JLabel name=new JLabel("Name :");
        name.setFont(new Font("raleway",Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);
        
        nameText=new JTextField();
        nameText.setFont(new Font("raleway",Font.BOLD,14));
        nameText.setBounds(300,140,400,30);
        add(nameText);
        
        
        
         JLabel fname=new JLabel("Fathers Name :");
        fname.setFont(new Font("raleway",Font.BOLD,20));
        fname.setBounds(100,190,200,30);
        add(fname);
        
         fnameText=new JTextField();
        fnameText.setFont(new Font("raleway",Font.BOLD,14));
        fnameText.setBounds(300,190,400,30);
        add(fnameText);
        
  
         JLabel dob=new JLabel("Date Of Birth :");
        dob.setFont(new Font("raleway",Font.BOLD,20));
        dob.setBounds(100,240,200,30);
        add(dob);
        
         date= new JDateChooser();
        date.setBounds(300,240,400,30);
        date.setForeground(new Color(105,105,105));
        add(date);
        
        
         JLabel gender=new JLabel("Gender :");
        gender.setFont(new Font("raleway",Font.BOLD,20));
        gender.setBounds(100,290,200,30);
        add(gender);
        
        
         male=new JRadioButton("Male");
        male.setBounds(300,290,60,30);
        male.setBackground(Color.WHITE);
        add(male);
        
        
         female=new JRadioButton("Female");
        female.setBounds(450,290,120,30);
        female.setBackground(Color.WHITE);
        add(female);
        
        ButtonGroup buttongrp=new ButtonGroup();
        buttongrp.add(male);
        buttongrp.add(female);
        
        
         JLabel email=new JLabel("Email :");
        email.setFont(new Font("raleway",Font.BOLD,20));
        email.setBounds(100,340,200,30);
        add(email);
        
         emailText=new JTextField();
        emailText.setFont(new Font("raleway",Font.BOLD,14));
        emailText.setBounds(300,340,400,30);
        add(emailText);
        
        
         JLabel marital=new JLabel("Marital Status :");
        marital.setFont(new Font("raleway",Font.BOLD,20));
        marital.setBounds(100,390,200,30);
        add(marital);
        
          married=new JRadioButton("Married");
        married.setBounds(300,390,100,30);
        married.setBackground(Color.WHITE);
        add(married);
        
        
         unmarried=new JRadioButton("UnMarried");
        unmarried.setBounds(450,390,100,30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);
        
         other=new JRadioButton("Others");
        other.setBounds(630,390,100,30);
        other.setBackground(Color.WHITE);
        add(other);
        
        ButtonGroup buttongrp2=new ButtonGroup();
        buttongrp2.add(married);
        buttongrp2.add(female);
        buttongrp2.add(other);
        
         JLabel address=new JLabel("Address :");
        address.setFont(new Font("raleway",Font.BOLD,20));
        address.setBounds(100,440,200,30);
        add(address); 
        
        addressText=new JTextField();
        addressText.setFont(new Font("raleway",Font.BOLD,14));
        addressText.setBounds(300,440,400,30);
        add(addressText);
        
        JLabel city=new JLabel("City :");
        city.setFont(new Font("raleway",Font.BOLD,20));
        city.setBounds(100,490,200,30);
        add(city);
        
         cityText=new JTextField();
        cityText.setFont(new Font("raleway",Font.BOLD,14));
        cityText.setBounds(300,490,400,30);
        add(cityText);
        
        
        JLabel state=new JLabel("State :");
        state.setFont(new Font("raleway",Font.BOLD,20));
        state.setBounds(100,540,200,30);
        add(state);


         stateText=new JTextField();
        stateText.setFont(new Font("raleway",Font.BOLD,14));
        stateText.setBounds(300,540,400,30);
        add(stateText);

        
       JLabel pincode=new JLabel("PIN Code :");
        pincode.setFont(new Font("raleway",Font.BOLD,20));
        pincode.setBounds(100,590,200,30);
        add(pincode);  
     
        
        pinText=new JTextField();
        pinText.setFont(new Font("raleway",Font.BOLD,14));
        pinText.setBounds(300,590,400,30);
        add(pinText);
        
        
        next=new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("raleway",Font.BOLD,14));
        next.setBounds(620,640,80,30);
        next.addActionListener(this);
        add(next);

        
        
        setSize(850,730);
        setLocation(350,5);
        setVisible(true);
        setTitle("");
       
        getContentPane().setBackground(Color.WHITE);
}

    public void actionPerformed(ActionEvent ae){
        
        String formno=""+random;
        String name= nameText.getText();
        String fname=fnameText.getText();
        String dob= ((JTextField) date.getDateEditor().getUiComponent()).getText();
        String gender=null;
        if(male.isSelected()){
            gender="Male";
        }
        else if(female.isSelected()){
            gender="Female";
        }
        
        String email=emailText.getText();
        
        String marital=null;
        if(married.isSelected()){
            marital="Married";
        }
        else if(unmarried.isSelected()){
            marital="UnMarried";
        }
        else if(other.isSelected()){
            marital="Other";
        }
        
        String address=addressText.getText();
        String city= cityText.getText();
        String state=stateText.getText();   
        String pin=pinText.getText();
        
        try {
            if(name.equals(""))
                JOptionPane.showMessageDialog(null,"Name is Required");
            else if(fname.equals(""))
                JOptionPane.showMessageDialog(null,"Father's Name is Required");
            else if(city.equals(""))
                JOptionPane.showMessageDialog(null,"City is Required");
            else if(state.equals(""))
                JOptionPane.showMessageDialog(null,"State is Required");
            else if(address.equals(""))
                JOptionPane.showMessageDialog(null,"Address is Required");
            else if(pin.equals(""))
                JOptionPane.showMessageDialog(null,"PIN code is Required");
            else if(email.equals(""))
                JOptionPane.showMessageDialog(null,"Email is Required");
            else{
               Conn c =new Conn(); 
            String query = "insert into signup values('" + formno + "', '" + name + "', '" + fname + "', '" + dob + "', '" + gender + "', '" + email + "', '" + marital +  "', '" + address + "', '" + city + "', '" + state + "', '" + pin + "')";
             
            c.s.executeUpdate(query);
            
            setVisible(false);
            new signupTwo(formno).setVisible(true);
            }
        } catch(Exception e)  {
           System.out.println(e);   
        }
    
    }

    public static void main(String args[]) {
        new signupone();

    }

       }

