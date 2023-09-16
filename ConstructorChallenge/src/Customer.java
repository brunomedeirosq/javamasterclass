public class Customer {

    //private fields (state) from class Customer that will be instantiated when objects are created from this template/blueprint
    private String name;
    private double creditLimit;
    private String emailAddress;


    //getters
    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    //constructor with all parameters to instantiate an object from class Customer
    public Customer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public Customer() {
        this("New Customer","newCustomer@gmail.com");
    }

    public Customer(String name, String emailAddress) {
        this(name,100,emailAddress);
    }


}
