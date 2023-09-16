import java.util.Scanner;

public class Account {

    //private instance fields
    //all strings that should be parsed and validated
    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public Account(int accountNumber, double accountBalance, String customerName, String email, String phoneNumber) {
        System.out.println("Account constructor with parameters called");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    //constructor chaining
    public Account() {
        //special use of this with () and parameters that match in order the type from the constructor with same name but with the specified parameters
        this(5876, 2.5, "Bruno", "brunoq@gmail.com", "916905477");
        System.out.println("Empty constructor called");
    }

    public Account(String customerName, String email, String phoneNumber) {
        this(9999, 100.55, customerName, email, phoneNumber);
//        this.customerName = customerName;
//        this.email = email;
//        this.phoneNumber = phoneNumber;
    }

    //setters and getters to access instance fields
    private void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    private void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    private void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    private void setEmail(String email) {
        this.email = email;
    }

    private void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    private int getAccountNumber() {
        return accountNumber;
    }

    private double getAccountBalance() {
        return accountBalance;
    }

    private String getCustomerName() {
        return customerName;
    }

    private String getEmail() {
        return email;
    }

    private String getPhoneNumber() {
        return phoneNumber;
    }

    public void setInformationAccount() {
        //create a new instance of class Scanner to read input from user
        Scanner scanner = new Scanner(System.in);

        boolean validAccountNumber = false;
        boolean validAccountBalance = false;

        while (!validAccountNumber || !validAccountBalance) {

            //parse from string to int and double but with try catch to control the NumberFormatException
            try {

                if (!validAccountNumber) {
                    //set account number
                    System.out.println("Please insert a valid account number:");
                    this.setAccountNumber(Integer.parseInt(scanner.nextLine()));
                    System.out.println(this.getAccountNumber() + " is valid.");
                    validAccountNumber = true;
                }

                if (!validAccountBalance) {
                    //set account balance
                    System.out.println("Please insert account balance for the account number " + this.getAccountNumber() + ":");
                    this.setAccountBalance(Double.parseDouble(scanner.nextLine()));
                    validAccountBalance = true;
                }

                //set customer name
                System.out.println("Please insert client name for the account number " + this.getAccountNumber() + ":");
                this.setCustomerName(scanner.nextLine());

                //set email
                System.out.println("Please insert client email for the account number " + this.getAccountNumber() + ":");
                this.setEmail(scanner.nextLine());

                //set phone number
                System.out.println("Please insert client phone number for the account number " + this.getAccountNumber() + ":");
                this.setPhoneNumber(scanner.nextLine());

            } catch (NumberFormatException nfe) {
                System.out.println("Not valid information.");
            }

        }

    }

    public void getInformationAccount() {
        System.out.println("Account number: " + this.getAccountNumber());
        System.out.println("Account balance: " + this.getAccountBalance());
        System.out.println("Customer name: " + this.getCustomerName());
        System.out.println("Customer email: " + this.getEmail());
        System.out.println("Customer phone number: " + this.getPhoneNumber());
    }

    public void withdraw(double amount) {
        if ((accountBalance - amount) < 0) {
            System.out.println("Insufficient founds");
        } else {
            accountBalance -= amount;
            System.out.println("Account balance: " + accountBalance);
        }
    }

    public double deposite(double amount) {
        accountBalance += amount;
        return accountBalance;
    }

}
