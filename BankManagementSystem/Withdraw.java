package BankManagementSystem;

import java.util.Scanner;

public class Withdraw {

    public Withdraw(Scanner scanner, Account acc){
        System.out.println("Enter amount:");
        double amount = scanner.nextDouble();
        acc.setBalance(acc.getBalance()- amount);
        System.out.println("Operation done successfully!");
        System.out.println("Current Balance:" + acc.getBalance());
    }
}
