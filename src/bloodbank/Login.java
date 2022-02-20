
package bloodbank;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

//Login class or main class
public class Login extends JFrame{
    //instance variables
    JLabel l1,l2;
    JTextField t1;
    JPasswordField t2;
    JButton b1,b2;
    //Contructor
    Login(){

        super("Login");

        setLayout(null);

        l1 = new JLabel("Username");
        l1.setBounds(40,20,100,30);
        add(l1);
        
        l2 = new JLabel("Password");
        l2.setBounds(40,70,100,30);
        add(l2);
 
        t1=new JTextField();
        t1.setBounds(150,20,150,30);
        add(t1);

        t2=new JPasswordField();
        t2.setBounds(150,70,150,30);
        add(t2);
        //Login Button code
        b1 = new JButton("Login");
        b1.setBounds(40,140,120,30);
        b1.setFont(new Font("serif",Font.BOLD,15));
        
        
        b1.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent ae){
           if(t1.getText().equals("bbms")&&t2.getText().equals("admin"))
       {
          setVisible(false);// Make login page invisible
          new Main().setVisible(true);// Open Main Page
          
       }
       else{
       JOptionPane.showMessageDialog(null, "Invalid Entry");
       }
        }});
        
        //Close Button code
        b1.setBackground(Color.GRAY);
        b1.setForeground(Color.WHITE);
        add(b1);

        b2=new JButton("Close");
        b2.setBounds(180,140,120,30);
        b2.setFont(new Font("serif",Font.BOLD,15));
        b2.setBackground(Color.GRAY);
        b2.setForeground(Color.WHITE);
        add(b2);

        b2.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae){
        int a = JOptionPane.showConfirmDialog(null,"Do You Really Want to Close the Application","Select", JOptionPane.YES_NO_OPTION);
        if(a==0)
           System.exit(0);
         }});
        
        // Set backgound of login Page
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("\\bloodbank\\java31\\loginpage.jpg"));
        Image i2 = i1.getImage().getScaledInstance(508,339,Image.SCALE_DEFAULT);
        ImageIcon i3 =  new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,508,339);
        add(l3);
        
        //Code for Window Functions
        setResizable(true);
        setVisible(true);
        setSize(525,320);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] arg){
        new Login();//Calling the login page Constructor
    }

       
}
