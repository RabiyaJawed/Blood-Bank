package bloodbank;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.*;
import static java.lang.Character.isDigit;
import javax.swing.*;

// This Class Store the Details of Donor into file
public class donorAdd extends Donor implements Donation {
    
// Instance Variable
JTextField t1,t2,t3,t4,t5,t6,t7,t8;
JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
JButton b1;
JFrame j;
JRadioButton r1,r2;
    //Constructor
    donorAdd(){
        // Code Set the Properties of JFrame , JLable , JButton , JTextField
        j=new JFrame("ADD DONOR");
        l1=new JLabel("ID");
        l2=new JLabel("Name");
        l3=new JLabel("FatherName");
        l4=new JLabel("MotherName");
        l5=new JLabel("Email");
        l6=new JLabel("CNIC");
        l7=new JLabel("Address");
        l8=new JLabel("Phone");
        l9=new JLabel("Gender");
        l10=new JLabel("Blood Group");
        r1=new JRadioButton("Male");    
        r2=new JRadioButton("Female"); 
        
        ButtonGroup bg=new ButtonGroup();    
        bg.add(r1);bg.add(r2);
        
        l1.setFont(new Font("serif",Font.BOLD,15));
        l1.setBounds(40,20,100,20);
        l1.setForeground(Color.WHITE);
        j.add(l1);
        
        t1 = new JTextField(20);
        t1.setBounds(150,20,140,20);
        j.add(t1);
        
        l2.setFont(new Font("serif",Font.BOLD,15));
        l2.setBounds(40,60,100,20);
        l2.setForeground(Color.WHITE);
        j.add(l2);
        
        t2 = new JTextField(20);
        t2.setBounds(150,60,140,20);
        j.add(t2);
        
        l3.setFont(new Font("serif",Font.BOLD,15));
        l3.setBounds(40,100,100,20);
        l3.setForeground(Color.WHITE);
        j.add(l3);
        
        
        t3 = new JTextField(20);
        t3.setBounds(150,100,140,20);
        j.add(t3);
        
        l4.setFont(new Font("serif",Font.BOLD,15));
        l4.setBounds(40,140,100,20);
        l4.setForeground(Color.WHITE);
        j.add(l4);
        
        t4 = new JTextField(20);
        t4.setBounds(150,140,140,20);
        j.add(t4);
        
        l5.setFont(new Font("serif",Font.BOLD,15));
        l5.setBounds(40,180,100,20);
        l5.setForeground(Color.WHITE);
        j.add(l5);
        
        t5 = new JTextField(20);
        t5.setBounds(150,180,140,20);
        j.add(t5);
        
        l6.setFont(new Font("serif",Font.BOLD,15));
        l6.setBounds(40,220,100,20);
        l6.setForeground(Color.WHITE);
        j.add(l6);
        
        t6 = new JTextField(20);
        t6.setBounds(150,220,140,20);
        j.add(t6);
        
        l7.setFont(new Font("serif",Font.BOLD,15));
        l7.setBounds(40,260,100,20);
        l7.setForeground(Color.WHITE);
        j.add(l7);
        
        t7 = new JTextField(20);
        t7.setBounds(150,260,140,20);
        j.add(t7);
        
        l8.setFont(new Font("serif",Font.BOLD,15));
        l8.setBounds(40,300,100,20);
        l8.setForeground(Color.WHITE);
        j.add(l8);
    
        
        t8 = new JTextField(20);
        t8.setBounds(150,300,140,22);
        j.add(t8);
        
        l9.setFont(new Font("serif",Font.BOLD,15));
        l9.setBounds(40,340,100,20);
        l9.setForeground(Color.WHITE);
        j.add(l9);
        
        r1.setBounds(150,340,70,22);
        r2.setBounds(220,340,70,22);
        j.add(r1);j.add(r2);
        
        l10.setFont(new Font("serif",Font.BOLD,15));
        l10.setBounds(40,380,100,20);
        l10.setForeground(Color.WHITE);
        j.add(l10);

        String BloodGroup[]= { "A-", "B-", "A+","B+","O-","O+","AB+","AB-" };
        final JComboBox cb1 = new JComboBox(BloodGroup);
        cb1.setBounds(150,380,140,22);
        cb1.setSize(140, 25);
        j.add(cb1);
        
        
        b1=new JButton("SAVE");
        b1.setBounds(40,420,250,30);
        b1.setFont(new Font("serif",Font.BOLD,15));
        b1.setBackground(Color.WHITE);
        b1.setForeground(Color.RED);
        //Validation Cose
        t8.addKeyListener(new KeyAdapter(){
            public void keyPressed(KeyEvent e){

                char ch = e.getKeyChar();
                if(Character.isDigit(ch)){
                }
                else{
                    JOptionPane.showMessageDialog(null, "Only numbers are allowed!");
                    t8.setText(" ");
                }
            }
});   
                t1.addKeyListener(new KeyAdapter(){
            public void keyPressed(KeyEvent e){

                char ch = e.getKeyChar();
                if(Character.isDigit(ch)){
                }
                else{
                    JOptionPane.showMessageDialog(null, "Only numbers are allowed!");
                    t1.setText(" ");
                }
            }
});   
                
                
                
                t2.addKeyListener(new KeyAdapter(){
            public void keyPressed(KeyEvent e){

                char ch = e.getKeyChar();
                if(!Character.isDigit(ch)){
                }
                else{
                    JOptionPane.showMessageDialog(null, "Numbers are not allowed!");
                    t2.setText(" ");
                }
            }
});   
                t3.addKeyListener(new KeyAdapter(){
            public void keyPressed(KeyEvent e){

                char ch = e.getKeyChar();
                if(!Character.isDigit(ch)){
                }
                else{
                    JOptionPane.showMessageDialog(null, "Numbers are not allowed!");
                    t3.setText(" ");
                }
            }
});   
                t4.addKeyListener(new KeyAdapter(){
            public void keyPressed(KeyEvent e){

                char ch = e.getKeyChar();
                if(!Character.isDigit(ch)){
                }
                else{
                    JOptionPane.showMessageDialog(null, "Numbers are not allowed!");
                    t4.setText(" ");
                }
            }
});   
          
            t6.addKeyListener(new KeyAdapter(){
            public void keyPressed(KeyEvent e){

                char ch = e.getKeyChar();
                if(Character.isDigit(ch)){
                }
                else{
                    JOptionPane.showMessageDialog(null, "Only numbers are allowed!");
                    t6.setText(" ");
                }
            }
});    
        // Button Function
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(t5.getText().contains("@")){
                setID(t1.getText());
                setName(t2.getText());
                setFathername(t3.getText());
                setMothername(t4.getText());
                setEmail(t5.getText());
                setNIC(t6.getText());
                setAdress(t7.getText());
                setPhoneNum(t8.getText());
                setBloodGroup(cb1.getSelectedItem().toString());
                if(r1.isSelected()){
                setGender("Female");
                }else if(r2.isSelected()){
                setGender("Female");
                }
                
                JOptionPane.showMessageDialog(null, "Your Data is Save!!");
                Details();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Invalid Email");
                    t5.setText(" ");
                }
                
                }
            
        });
        j.add(b1);
        
        // Set Background
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("\\bloodbank\\java31\\FORM2.png"));
        Image i2 = i1.getImage().getScaledInstance(680,500,Image.SCALE_DEFAULT);
        ImageIcon i3 =  new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,680,500);   
        j.add(l3);
    
    // Window Code
    j.setResizable(false);
    j.setVisible(true);
    j.setSize(690,530);
    j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    }
    
    
    // Override the method of interface
    @Override
    public void Details() {
        
        // Code For Writing content into file
        try{
        
        FileOutputStream Fout = new FileOutputStream("File.txt",true);
        DataOutputStream fileval= new DataOutputStream(Fout);
        
            
        fileval.writeChars("Name: "+getName());
        fileval.writeChars("\nFather Name: "+getFathername());
        fileval.writeChars("\nMother Name: "+getMothername());
        fileval.writeChars("\nPhone: "+getPhoneNum());
        fileval.writeChars("\nEmail: "+getEmail());
        fileval.writeChars("\nID: "+getID());
        fileval.writeChars("\nAddress: "+getAdress());
        fileval.writeChars("\nCNIC: " +getNIC());
        fileval.writeChars("\nGender: " +getGender());
        fileval.writeChars("\nBlood Group: " +getBloodGroup());
        fileval.writeChars(" ");
        
        
       }catch(IOException ex){
           System.out.println("Excption Occur");
       }
       
       
    }
    
    
   
}
