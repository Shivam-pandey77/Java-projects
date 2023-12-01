package rock_paper_scisser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;


public class Home extends JFrame {
    
    Random random = new Random();
    JButton one,three,five;
    JLabel you,bot,pimage,result,tt;
    JPanel pmain ;
    static int value=0 ,f,b,r=0,br=0;

    Home()  {
        setLayout(null);
        
        JPanel panel1 = new JPanel();
        panel1.setBounds(0,0,480,650);
        panel1.setBackground(Color.black);
        add(panel1);
        
        
        JPanel panel2 = new JPanel();
        panel2.setBounds(0,-10,450,250);
        panel1.add(panel2);
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/img2.png"));
        Image i2 = i1.getImage().getScaledInstance(480, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,480,250);
        panel2.add(image);
        
        JLabel welcome = new JLabel("<html><br>ROCK PAPER <br>SCISSORS <br>GAME");
        welcome.setFont(new Font("Ink free", Font.PLAIN,42));
        welcome.setBounds(0,300,480,400);
        welcome.setForeground(Color.white);
        panel1.add(welcome);
        
        JPanel ptry = new JPanel();
        ptry.setBounds(480,0,620,50);
        ptry.setBackground(Color.black);
        ptry.setLayout(null);
        add(ptry);
        
        JLabel choose = new JLabel("Select to start");
        choose.setForeground(Color.white);
        choose.setFont(new Font("serif",Font.ITALIC,30));
        choose.setBounds(200,5,300,40);
        ptry.add(choose);
            
        
        
        pmain = new JPanel();
        pmain.setBounds(480,50,620,570);
        pmain.setBackground(Color.white);
        pmain.setLayout(null);
        add(pmain);
        
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/back.png"));
        Image i5 = i4.getImage().getScaledInstance(620, 570, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        pimage = new JLabel(i6);
        pimage.setBounds(0,0,620,570);
        pmain.add(pimage);
        
                
        
        
        
        result= new JLabel();
        result.setBounds(180,270,300,50);
        result.setFont(new Font("Railway",Font.PLAIN,48));
        pimage.add(result);
        
               
        
        
         fun();
                
        
        getContentPane().setBackground(Color.WHITE);
        setTitle("ROCK-PAPER-SCISSORS");
        setBounds(150,30,1100,650);
        setVisible(true);
    }
    
    
      
    
    void fun() {
        
        
        you= new JLabel("YOU: "+r);
        you.setBounds(80,20,200,50);
        you.setFont(new Font("Ink free",Font.PLAIN,32));
        you.setForeground(Color.black);
        pimage.add(you);
        
        bot= new JLabel("BOT: "+br);
        bot.setBounds(420,20,200,50);
        bot.setFont(new Font("Ink free",Font.PLAIN,32));
        bot.setForeground(Color.black);
        pimage.add(bot);
        
                  
            
//            try {
//                Thread.sleep(5000);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
//            }
            
        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("icons/rock2.png"));
        Image ii2 = ii1.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT);
        ImageIcon ii3 = new ImageIcon(ii2);
        
        JButton pan = new JButton(ii3);       
        pan.setBorder(BorderFactory.createEmptyBorder());
        pan.setBackground(Color.white); 
        pan.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                 f=1;
                 hey();
            }
        });                      
        pan.setBounds(50,400,120,120);
        pimage.add(pan);
        
        
        
        
         ImageIcon iii1 = new ImageIcon(ClassLoader.getSystemResource("icons/paper2.png"));
        Image iii2 = iii1.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT);
        ImageIcon iii3 = new ImageIcon(iii2);
        JButton pan1 = new JButton(iii3);       
                       
        pan1.setBackground(Color.white); 
        pan1.setBorder(BorderFactory.createEmptyBorder());
        pan1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                f=2;
                    hey();
            }
        });
        pan1.setBounds(250,400,120,120);
        pimage.add(pan1);
        
        
        
        
         ImageIcon iiii1 = new ImageIcon(ClassLoader.getSystemResource("icons/scissor2.png"));
        Image iiii2 = iiii1.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT);
        ImageIcon iiii3 = new ImageIcon(iiii2);
        JButton pan2 = new JButton(iiii3);       
        pan2.setBackground(Color.white); 
        pan2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                f=3;
                hey();
            }
        });
        pan2.setBorder(BorderFactory.createEmptyBorder());
        pan2.setBounds(460,400,120,120);
        pimage.add(pan2);
                
            
        repaint();
        validate();
        revalidate();
        
        

    }
    
    
    void botresult() {
        int a = random.nextInt(200);
        
        ImageIcon i1 ;
        if(a%3 ==0){
         i1 = new ImageIcon(ClassLoader.getSystemResource("icons/rock.png"));
         b=1;   
        }
        else if(a%2 == 0) {
         i1 = new ImageIcon(ClassLoader.getSystemResource("icons/paper.png")); 
         b=2;
        }
        else {
         i1 = new ImageIcon(ClassLoader.getSystemResource("icons/scissor.jpg"));   
         b=3;
        }
        
        Image i2 = i1.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        
        
        JLabel image = new JLabel(i3);
        image.setBounds(440,130,120,120);
            pimage.add(image);
            
        repaint();
        validate();
        revalidate();
        
        win();
    }
    
    
    public void hey()  {
        ImageIcon i1 ;
        if(f==1)  {
          i1 = new ImageIcon(ClassLoader.getSystemResource("icons/rock.png"));
         }
        else if(f ==2)  {
          i1 = new ImageIcon(ClassLoader.getSystemResource("icons/paper.png"));
        }

         else    {
           i1 = new ImageIcon(ClassLoader.getSystemResource("icons/scissor.jpg"));
        }

        Image i2 = i1.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        
        
        JLabel image = new JLabel(i3);
        image.setBounds(70,130,120,120);
            pimage.add(image);
            
        repaint();
        validate();
        revalidate();
        
        if(f!=-1)
        botresult();
    }
    
    
    void win()  {
        if((f==1 && b==3) || (f==2 && b==1) || (f==3 && b==2)) 
        {
            result.setForeground(Color.green);
            result.setText("You Won");
            f= -1;
            b= -1;
            r++;
        }
        else if((f==1 && b==1) || (f==2 && b==2) || (f==3 && b==3))  {
            result.setForeground(Color.blue);
            result.setText("It's a draw");
        }
        else {
            result.setForeground(Color.red);
            result.setText("You Lost");
            f= -1;
            b= -1;
            br++;
        }
        
        
         you.setText("You: "+r);
        bot.setText("Bot: "+br);
        
        
        
        try {
                 Thread.sleep(3000);
            } catch(Exception e)  {
                e.printStackTrace();
            }
        
        new Retry().setVisible(true);
    }
    
    
    public static void main(String args[]) {
       new Home();
    }
}
