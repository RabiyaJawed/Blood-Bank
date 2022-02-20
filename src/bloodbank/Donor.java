package bloodbank;

// Donor Class which Store the information of donor

public class Donor {

    
    //private instance variables
    private String ID;
    private String name;
    private String Fathername; 
    private String Mothername; 
    private String Email; 
    private String PhoneNum; 
    private String Adress; 
    private String BloodGroup;
    private String NIC; 
    private String Gender; 
    //Constructor Set the Default value to the variables
    
    Donor(){
        
        ID=null;    
        name=null;
        Fathername=null; 
        Mothername=null; 
        Email=null; 
        PhoneNum=null; 
        Adress=null; 
        BloodGroup=null; 
        NIC=null;
        Gender=null;

    }
    
    /*
    Getter and Setter for Private Feilds
    */
    
    public String getID() {
        return ID;
    }

    
    public void setID(String ID) {
        this.ID = ID;
    }
    
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    
    public String getFathername() {
        return Fathername;
    }

    
    public void setFathername(String Fathername) {
        this.Fathername = Fathername;
    }

    
    public String getMothername() {
        return Mothername;
    }

    
    public void setMothername(String Mothername) {
        this.Mothername = Mothername;
    }

    public String getEmail() {
        return Email;
    }

    
    public void setEmail(String Email) {
        this.Email = Email;
    }

    
    public String getPhoneNum() {
        return PhoneNum;
    }

    
    public void setPhoneNum(String PhoneNum) {
        this.PhoneNum = PhoneNum;
    }

    
    public String getAdress() {
        return Adress;
    }

    
    public void setAdress(String Adress) {
        this.Adress = Adress;
    }

    
    public String getBloodGroup() {
        return BloodGroup;
    }

    
    public void setBloodGroup(String BloodGroup) {
        this.BloodGroup = BloodGroup;
    }
    
    
    public String getNIC() {
        return NIC;
    }
    
    
    public void setNIC(String NIC) {
        this.NIC = NIC;
    }
    
    
    public String getGender() {
        return Gender;
    }

    
    public void setGender(String Gender) {
        this.Gender = Gender;
    }


}
