package com.mygame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class main {
    public static void main() {
        Mygame game = new Mygame();
        
    }
}


public class Mygame extends main implements ActionListener{

    Random random= new Random();
    JFrame frame= new JFrame();
    JPanel title_panel= new JPanel();
    JPanel button_panel= new JPanel();
    JLabel textField= new JLabel();
    JButton[] buttons= new JButton[9];
    boolean player1_turn;
    
    
   Mygame() {
       
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(800,720);
       frame.getContentPane().setBackground(new Color(50,50,50));
       frame.setLayout(new BorderLayout());
       frame.setBounds(200,10,800,720);
       frame.setVisible(true);
       
       textField.setBackground(new Color(25,25,25));
       textField.setForeground(new Color(25,255,0));
       textField.setFont(new Font("Ink free",Font.BOLD,75));
       textField.setHorizontalAlignment(JLabel.CENTER);
       textField.setText("Tic-Tak-Toe");
       textField.setOpaque(true);
       
       
       title_panel.setLayout(new BorderLayout());
       title_panel.setBounds(0,0,800,100);
       title_panel.add(textField);
       frame.add(title_panel,BorderLayout.NORTH);
       
       for(int i=0;i<9;i++)  {
           buttons[i] = new JButton();
           buttons[i].setFont(new Font("MV Boli",Font.BOLD,120));
           buttons[i].setFocusable(false);
           buttons[i].addActionListener(this);
           button_panel.add(buttons[i]);
     
       }
       
       
       button_panel.setLayout(new GridLayout(3,3));
       button_panel.setBackground(new Color(150,150,150));
       frame.add(button_panel);
             
           firstturn();
       
   }
   
   public void actionPerformed(ActionEvent ae){
       for(int i=0 ;i<9;i++)  {
           if(ae.getSource() == buttons[i])  {
               if(player1_turn)  {
                   if(buttons[i].getText() == "")
                   {
                       buttons[i].setForeground(new Color(255,0,0));
                       buttons[i].setText("X");
                       player1_turn = false;
                       textField.setText("O turn");
                       check();
                   }
               }
                   else  {
                        buttons[i].setForeground(new Color(0,0,255));
                       buttons[i].setText("O");
                       player1_turn = true;
                       textField.setText("X turn");
                       check();
                      } 
                    }
           } 
   }
    
   public void firstturn(){
       try{
       Thread.sleep(2000);
       } catch (Exception e){
           System.out.println(e);
       }
       if(random.nextInt(2) == 0)  {
           player1_turn= true;
          textField.setText("X turn");    
       }
       else {
            player1_turn= false;
          textField.setText("O turn");    
       }
           
   }
   
   public void check(){
       
       if((buttons[0].getText()== "X") &&
          (buttons[1].getText()== "X") &&
          (buttons[2].getText()== "X") ) {
           xwins(0,1,2);
           }
       
        if((buttons[3].getText()== "X") &&
          (buttons[4].getText()== "X") &&
          (buttons[5].getText()== "X") ) {
           xwins(3,4,5);
           }
        
         if((buttons[6].getText()== "X") &&
          (buttons[7].getText()== "X") &&
          (buttons[8].getText()== "X") ) {
           xwins(6,7,8);
           }
         
          if((buttons[0].getText()== "X") &&
          (buttons[3].getText()== "X") &&
          (buttons[6].getText()== "X") ) {
           xwins(0,3,6);
           }
          
          if((buttons[1].getText()== "X") &&
          (buttons[4].getText()== "X") &&
          (buttons[7].getText()== "X") ) {
           xwins(1,4,7);
           }
          
          if((buttons[2].getText()== "X") &&
          (buttons[5].getText()== "X") &&
          (buttons[8].getText()== "X") ) {
           xwins(2,5,8);
           }
          
          if((buttons[0].getText()== "X") &&
          (buttons[4].getText()== "X") &&
          (buttons[8].getText()== "X") ) {
           xwins(0,4,8);
           }
          
          if((buttons[2].getText()== "X") &&
          (buttons[4].getText()== "X") &&
          (buttons[6].getText()== "X") ) {
           xwins(2,4,6);
           }
          
          
          
          
          
          
          if((buttons[0].getText()== "O") &&
          (buttons[1].getText()== "O") &&
          (buttons[2].getText()== "O") ) {
           owins(0,1,2);
           }
       
        if((buttons[3].getText()== "O") &&
          (buttons[4].getText()== "O") &&
          (buttons[5].getText()== "O") ) {
           owins(3,4,5);
           }
        
         if((buttons[6].getText()== "O") &&
          (buttons[7].getText()== "O") &&
          (buttons[8].getText()== "O") ) {
           owins(6,7,8);
           }
         
          if((buttons[0].getText()== "O") &&
          (buttons[3].getText()== "O") &&
          (buttons[6].getText()== "O") ) {
           owins(0,3,6);
           }
          
          if((buttons[1].getText()== "O") &&
          (buttons[4].getText()== "O") &&
          (buttons[7].getText()== "O") ) {
           owins(1,4,7);
           }
          
          if((buttons[2].getText()== "O") &&
          (buttons[5].getText()== "O") &&
          (buttons[8].getText()== "O") ) {
           owins(2,5,8);
           }
          
          if((buttons[0].getText()== "O") &&
          (buttons[4].getText()== "O") &&
          (buttons[8].getText()== "O") ) {
           owins(0,4,8);
           }
          
          if((buttons[2].getText()== "O") &&
          (buttons[4].getText()== "O") &&
          (buttons[6].getText()== "O") ) {
           owins(2,4,6);
           }
       
   }
   
   public void xwins(int a, int b ,int c){
       buttons[a].setBackground(Color.GREEN);
        buttons[b].setBackground(Color.GREEN);
         buttons[c].setBackground(Color.GREEN);
       
       
         for(int i=0;i<9;i++){
             buttons[i].setEnabled(false);
         }
         textField.setText("X Wins");
       
   }
   
   public void owins(int a , int b , int c ) {
        buttons[a].setBackground(Color.GREEN);
        buttons[b].setBackground(Color.GREEN);
         buttons[c].setBackground(Color.GREEN);
       
       
         for(int i=0;i<9;i++){
             buttons[i].setEnabled(false);
         }
         textField.setText("O Wins");
       
   }
   
    public static void main(String args[]) {
       
        new Mygame();
       
        
    }
}
