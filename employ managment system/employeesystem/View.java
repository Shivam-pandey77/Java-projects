package employeesystem;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.print.PrinterException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.proteanit.sql.DbUtils;

public class View extends JFrame implements ActionListener {
    
    Choice choose;
    JButton search , print,update;
    JTable table;
    
    View()  {
        
        setLayout(null);
        
        JLabel top = new JLabel(" Here you can find your employee's details");
        top.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
        top.setBounds(470,15,800,40);
        add(top);

        
        JLabel top1 = new JLabel("WELCOME !");
        top1.setFont(new Font("SAN_SERIF",Font.PLAIN,28));
        top1.setBounds(300,15,800,40);
        add(top1);
        
        JLabel searchlbl = new JLabel("Search employee by ID :");
        searchlbl.setBounds(70,50,150,30);
        add(searchlbl);
        
        
        choose = new Choice();
        choose.setBounds(250,55,200,30);
        choose.add("All");
        add(choose);
        
        try {
             Conn c = new Conn();
             
             String query = "select * from employ";
             
             ResultSet rs =c.s.executeQuery(query);
             
             while(rs.next())  {
                 choose.add(rs.getString("employid"));
             }
             
        }   catch(Exception e)  {
            e.printStackTrace();
        }
        
        
        table = new JTable();
        
        try {
            
            Conn c=new Conn();

            ResultSet rs= c.s.executeQuery("select * from employ");
            
            table.setModel(DbUtils.resultSetToTableModel(rs));

                       
        }  catch(Exception e)  {
            e.printStackTrace();
        } 
        
        JScrollPane scroll= new JScrollPane(table);
        scroll.setBounds(20,150,1045,405);
        add(scroll);
        
           
        JSeparator sep = new JSeparator();
        sep.setBounds(40,100,1000,10);
        add(sep);
        
        
        
        
        search= new JButton("Search");
        search.setBounds(60,120,80,20);
        search.addActionListener(this);
        search.setBackground(Color.BLACK);
        search.setForeground(Color.WHITE);
        add(search);
        
       JButton back= new JButton("Back");
        back.setBounds(360,120,80,20);
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);
                new Home().setVisible(true);
            }
        });
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        add(back);

        
        update= new JButton("Update");
        update.setBounds(260,120,80,20);
        update.addActionListener(this);
        update.setBackground(Color.BLACK);
        update.setForeground(Color.WHITE);
        add(update);
        
        print= new JButton("Print");
        print.setBounds(160,120,80,20);
        print.addActionListener(this);
        print.setBackground(Color.BLACK);
        print.setForeground(Color.WHITE);
        add(print);
        
        
        
        getContentPane().setBackground(Color.WHITE);
        setBounds(150,50,1100,600);
        setVisible(true);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent ae)  {
        
        if(ae.getSource() == update)  {
            setVisible(false);
            //new Update().setVisible(true);
        }
        else if(ae.getSource() == search) {
            
            if(choose.getSelectedIndex()==0) {
                 try {
                
                Conn c = new Conn();
                
                ResultSet rs =c.s.executeQuery("select * from employ");
                
                table.setModel(DbUtils.resultSetToTableModel(rs));
            }  catch(Exception e) {
                e.printStackTrace();
            }
            }
            else {
            
            try {
                
                Conn c = new Conn();
                
                ResultSet rs =c.s.executeQuery("select * from employ where employid ='"+choose.getSelectedItem()+"'");
                
                table.setModel(DbUtils.resultSetToTableModel(rs));
            }  catch(Exception e) {
                e.printStackTrace();
            }
            }
            
        }
        else if(ae.getSource() == print) {
            try {
                table.print();
            } catch (PrinterException ex) {
                Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
    public static void main(String[] args)  {
        new View();
    }
}
