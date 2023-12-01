package rock_paper_scisser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Front extends JFrame {

    Front()  {
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/img2.png"));
        Image i2 = i1.getImage().getScaledInstance(600, 450, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(100,0,600,450);
        add(image);
        
        JLabel welcome = new JLabel("ROCK-PAPER-SCISSORS");
        welcome.setFont(new Font("Ink free", Font.PLAIN,32));
        welcome.setBounds(200,360,400,40);
        welcome.setForeground(new Color(30,144,254));
        add(welcome);
        
        JLabel name = new JLabel("Name: ");
        name.setFont(new Font("Sens-serif", Font.PLAIN,22));
        name.setBounds(220,440,100,30);
        name.setForeground(new Color(30,144,254));
        add(name);
        
        JTextField text= new JTextField();
        text.setBounds(320,440,250,30);
        add(text);
        
        JButton rules = new JButton("Rules");
        rules.setBounds(250,500,100,25);
        rules.setBackground(new Color(30,144,254));
        rules.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);
                new Rules(text.getText()).setVisible(true);
            }
        });
        rules.setForeground( Color.WHITE);
        add(rules);
        
        
        JButton back = new JButton("Exit");
        back.setBounds(400,500,100,25);
        back.setBackground(new Color(30,144,254));
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });
        back.setForeground( Color.WHITE);
        add(back);
        
        getContentPane().setBackground(Color.WHITE);
        setTitle("ROCK-PAPER-SCISSORS");
        setBounds(250,50,800,600);
        setVisible(true);
    }
    public static void main(String args[]) {
       new Front();
    }
}
