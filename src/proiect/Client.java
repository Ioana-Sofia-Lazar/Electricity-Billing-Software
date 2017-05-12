package proiect;

public class Client {
    private final int id;
    private final String last_name;
    private final String first_name;
    private final String address;
    private final String phone;
      
    public Client(int id, String last_name, String first_name, String address, String phone) {
        this.id = id;
        this.last_name = last_name;
        this.first_name = first_name;
        this.address = address;
        this.phone = phone;
    }
    
    public int getId() {
        return this.id;
    }
    
    public String getLastName() {
        return this.last_name;
    }
    
    public String getFirstName() {
        return this.first_name;
    }
    
    public String getAddress() {
        return this.address;
    }
    
    public String getPhone() {
        return this.phone;
    }  
    
}
