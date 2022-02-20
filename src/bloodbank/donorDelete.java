package bloodbank;

import java.io.*;


// Donor Class Which Delete the Donor information
public final class donorDelete  implements Donation{
    //Contructor Call the Details method
    donorDelete(){
        Details();
    }
    // Override the method of interface
    @Override
    public void Details() {
       // Code for deleting the content from file 
       try{
           
       FileOutputStream Fin = new FileOutputStream("File.txt");
       PrintWriter writer = new PrintWriter(Fin);
       
       writer.print("");
       writer.close();
       
       }catch(IOException ex){
           System.out.println("Excption occur");
       }
    } 
}
