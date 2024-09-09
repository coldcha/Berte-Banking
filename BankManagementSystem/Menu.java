package BankManagementSystem;

import java.util.Scanner;

public class Menu {

    public Menu(Scanner scanner, Account acc){
        System.out.println("Welcome" + acc.getFirstName()+ acc.getLastName());
        System.out.println("1. Deposit\n2. Withdraw\n3. Balance");
        int j = scanner.nextInt();
        switch (j){
            case 1:
                new Deposit(scanner, acc);
                break;
            case 2:
                new Withdraw(scanner, acc);
            case 3:
                System.out.println("Your Balance is $"+ acc.getBalance());
        }
    }
}
