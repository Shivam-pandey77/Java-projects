package bank.application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class signupTwo extends JFrame implements ActionListener {
    
    JButton next;
    JTextField panText,aadharText;
    JRadioButton syes,sno,eyes,eno;
    JComboBox occupation,education,income,category,religion;
    String formno;

    
    signupTwo(String formno){
        this.formno= formno;
        setLayout(null);       
             
        
        JLabel additionalDetails=new JLabel("PAGE-2 : Additional Details");
        additionalDetails.setFont(new Font("raleway",Font.BOLD,22));
        additionalDetails.setBounds(290,80,400,30);
        add(additionalDetails);
        
        JLabel rel=new JLabel("Religion :");
        rel.setFont(new Font("raleway",Font.BOLD,20));
        rel.setBounds(100,140,100,30);
        add(rel);
        
        String valReligion[] = {"Hindu", "Muslim", "Sikh", "Christian", "Other"};
         religion= new JComboBox(valReligion);
        religion.setFont(new Font("raleway",Font.BOLD,14));
        religion.setBackground(Color.WHITE);
        religion.setBounds(300,140,400,30);
        add(religion);    
        
        
        
         JLabel cat=new JLabel("Catagory :");
        cat.setFont(new Font("raleway",Font.BOLD,20));
        cat.setBounds(100,190,200,30);
        add(cat);
        
        
        String valCategory[] ={"General", "OBC", "SC", "ST", "Other"};
         category=new JComboBox(valCategory);
        category.setBackground(Color.WHITE);
        category.setFont(new Font("raleway",Font.BOLD,14));
        category.setBounds(300,190,400,30);
        add(category);
      
        
  
         JLabel inc=new JLabel("Income :");
        inc.setFont(new Font("raleway",Font.BOLD,20));
        inc.setBounds(100,240,200,30);
        add(inc);
        
         String incomeCategory[] ={"0", "< 1,50,000", "< 2,50,000", "<5,00,000", "Upto 10,00,000"};
         income=new JComboBox(incomeCategory);
        income.setBackground(Color.WHITE);
        income.setFont(new Font("raleway",Font.BOLD,14));
        income.setBounds(300,240,400,30);
        add(income);
      
        
            
         JLabel edu=new JLabel("Educational ");
        edu.setFont(new Font("raleway",Font.BOLD,20));
        edu.setBounds(100,290,200,30);
        add(edu);
        
         JLabel qual=new JLabel("Qualification :");
        qual.setFont(new Font("raleway",Font.BOLD,20));
        qual.setBounds(100,315,200,30);
        add(qual);
        
         String educationValues[] ={"Non-Graduation", "Gradution", "Post-Graduation", "Doctrate", "Others"};
         education=new JComboBox(educationValues);
        education.setBackground(Color.WHITE);
        education.setFont(new Font("raleway",Font.BOLD,14));
        education.setBounds(300,315,400,30);
        add(education);
              
        
         JLabel occup=new JLabel("Occupation :");
        occup.setFont(new Font("raleway",Font.BOLD,20));
        occup.setBounds(100,390,200,30);
        add(occup);
        
        String occupationValues[] ={"Salaried", "Self-Employed", "Bussiness", "Student", "Retired","Others"};
         occupation=new JComboBox(occupationValues);
        occupation.setBackground(Color.WHITE);
        occupation.setFont(new Font("raleway",Font.BOLD,14));
        occupation.setBounds(300,390,400,30);
        add(occupation);
        
          
         JLabel pan=new JLabel("Pan Number :");
        pan.setFont(new Font("raleway",Font.BOLD,20));
        pan.setBounds(100,440,200,30);
        add(pan); 
        
        panText=new JTextField();
        panText.setFont(new Font("raleway",Font.BOLD,14));
        panText.setBounds(300,440,400,30);
        add(panText);
        
        
        
        JLabel aadhar=new JLabel("Aadhar Number :");
        aadhar.setFont(new Font("raleway",Font.BOLD,20));
        aadhar.setBounds(100,490,200,30);
        add(aadhar);
        
         aadharText=new JTextField();
        aadharText.setFont(new Font("raleway",Font.BOLD,14));
        aadharText.setBounds(300,490,400,30);
        add(aadharText);
        
        
        
        
        JLabel senior=new JLabel("Senior citizen :");
        senior.setFont(new Font("raleway",Font.BOLD,20));
        senior.setBounds(100,540,200,30);
        add(senior);
        
        syes=new JRadioButton("Yes");
        syes.setBounds(300,540,100,30);
        syes.setBackground(Color.WHITE);
        add(syes);
                
         sno=new JRadioButton("No");
        sno.setBounds(450,540,100,30);
        sno.setBackground(Color.WHITE);
        add(sno);
        
        ButtonGroup buttongrp1=new ButtonGroup();
        buttongrp1.add(syes);
        buttongrp1.add(sno);

        
        
       JLabel pincode=new JLabel("Existing Account :");
        pincode.setFont(new Font("raleway",Font.BOLD,20));
        pincode.setBounds(100,590,200,30);
        add(pincode);  
        
             eyes=new JRadioButton("Yes");
        eyes.setBounds(300,590,100,30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
        
         eno=new JRadioButton("No");
        eno.setBounds(450,590,100,30);
        eno.setBackground(Color.WHITE);
        add(eno);
        
        ButtonGroup buttongrp2=new ButtonGroup();
        buttongrp2.add(eyes);
        buttongrp2.add(eno);
     
        
        
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
        setTitle("NEW ACCOUNT APPLICATION PAGE-02");
       
        getContentPane().setBackground(Color.WHITE);
}

    public void actionPerformed(ActionEvent ae){
        
        String sreligion= "" +religion.getSelectedItem();
        String scategory= "" +category.getSelectedItem();
        String sincome= "" +income.getSelectedItem();
        String seducation= "" +education.getSelectedItem();
        String soccupation= "" +occupation.getSelectedItem();
        String ssenior=null;
        if(syes.isSelected()){
            ssenior="Yes";
        }
        else if(sno.isSelected()){
            ssenior="No";
        }
        
         String saccount=null;
        if(eyes.isSelected()){
            saccount="Yes";
        }
        else if(eno.isSelected()){
            saccount="No";
        }
        
        
        String span= panText.getText();
        
        String saadhar=aadharText.getText();
        
        try {
        
               Conn c =new Conn(); 
            String query = "insert into signuptwo values('" + formno + "', '" + sreligion + "', '" + scategory + "', '" + sincome + "', '" + seducation + "', '" +  soccupation+ "', '" + span +  "', '" + saadhar + "', '" +ssenior  + "', '" + saccount + "')";
             
            c.s.executeUpdate(query);
            
            //Signup3 class object
            setVisible(false);
            new signupThree(formno).setVisible(true);
        } catch(Exception e)  {
           System.out.println(e);   
        }
    
    }

    public static void main(String args[]) {
        new signupTwo("");

    }
}


        

