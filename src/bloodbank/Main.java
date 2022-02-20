package bloodbank;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

//Main Page Class

public class Main extends JFrame{
    //Instance Variable of Main class
    JButton b1,b2,b3,b4;
    
    // Contructor
        Main(){
            //Code for Add Donor Button which call the donorAdd class constructor
                b1 = new JButton("Add Donor");
                b1.addActionListener(new ActionListener(){@Override
                public void actionPerformed(ActionEvent ae){
                   {  new donorAdd().j.setVisible(true);}

                }});
                
            //Code for Add Donor Button which call the donorDelete class constructor
                b2 = new JButton("Clear Details");
                b2.addActionListener(new ActionListener(){@Override
                public void actionPerformed(ActionEvent ae){
                  {new donorDelete();
                  JOptionPane.showMessageDialog(null, "Data Is Cleared");}
               }});
                
            //Code for Add Donor Button which call the Login class constructor
                b3 = new JButton("Logout");
                b3.addActionListener(new ActionListener(){@Override
                public void actionPerformed(ActionEvent ae){
                  {
                  int a = JOptionPane.showConfirmDialog(null,"Do You Really Want to Logout","Select", JOptionPane.YES_NO_OPTION);
                  if(a==0){
                    setVisible(false);
                    new Login().setVisible(true);
                }}}});
                
             //Code for Add Donor Button which close the Application
               b4=new JButton("Close");
               b4.addActionListener(new ActionListener(){
                @Override
                   public void actionPerformed(ActionEvent ae){
                   int a = JOptionPane.showConfirmDialog(null,"Do You Really Want to Close the Application","Select", JOptionPane.YES_NO_OPTION);
                if(a==0)
                   System.exit(0);
                }});
        // Set the Properties of all buttons and add them 
        b1.setBounds(90,60,120,30);
        b1.setFont(new Font("serif",Font.BOLD,15));
        b1.setBackground(Color.WHITE);
        b1.setForeground(Color.RED);
        
        b2.setBounds(90,100,120,30);
        b2.setFont(new Font("serif",Font.BOLD,15));
        b2.setBackground(Color.WHITE);
        b2.setForeground(Color.RED);
        
        b3.setBounds(90,140,120,30);
        b3.setFont(new Font("serif",Font.BOLD,15));
        b3.setBackground(Color.WHITE);
        b3.setForeground(Color.RED);
        
        b4.setBounds(90,180,120,30);
        b4.setFont(new Font("serif",Font.BOLD,15));
        b4.setBackground(Color.WHITE);
        b4.setForeground(Color.RED);
        
        add(b1);
        add(b2);
        add(b3);   
        add(b4); 
        
        //Set Background
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("\\bloodbank\\java31\\home.png"));
        Image i2 = i1.getImage().getScaledInstance(600,315,Image.SCALE_DEFAULT);
        ImageIcon i3 =  new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,600,315);
        add(l3);
        
        //Code for Window
        setLayout(null);
        setResizable(false);
        setVisible(true);
        setSize(600,315);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    
    
}
