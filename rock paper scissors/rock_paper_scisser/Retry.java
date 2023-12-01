package rock_paper_scisser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Retry extends JFrame{
    
    Retry()  {
        setLayout(null);
        
        JLabel t = new JLabel("Give it a try once more");
        t.setForeground(Color.blue);
        t.setFont(new Font("Ink free",Font.PLAIN,40));
        t.setBounds(80,20,400,40);
        add(t);      
        
        
        
        JButton next = new JButton("Retry");
        next.setBounds(130,130,100,25);
        next.setBackground( new Color(112,128,144));
        next.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);
                new Home().setVisible(true);
            }
        });
        next.setForeground( Color.WHITE);
        add(next);
        
        
        JButton back = new JButton("Exit");
        back.setBounds(280,130,100,25);
        back.setBackground(new Color(112,128,144));
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });
        back.setForeground( Color.WHITE);
        add(back);
        
        
        getContentPane().setBackground(Color.white);
        
        setBounds(80,50,550,230);
        setUndecorated(true);
        setVisible(true);
    }
    
    
    public static void main(String[] args)  {
        new Retry();
    }
}
