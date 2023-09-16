import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //create a new instance of class Account, an object named first
//        Account first = new Account();

        //set all information account
//        first.setInformationAccount();
//
//        first.getInformationAccount();
//
//        first.withdraw(3000);
//        System.out.println(first.deposite(1000));
//
//        first.getInformationAccount();


        Account second = new Account(9999999, 53234.23, "Miguel", "miguel@test.com", "91000000");

        Account bruno = new Account();

        bruno.getInformationAccount();

        Account tim = new Account("Tim", "tim@email.com", "91000000");

        tim.getInformationAccount();


    }



}
