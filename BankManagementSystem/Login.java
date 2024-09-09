package BankManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Login {

    public Login(Scanner scanner, ArrayList<Account> accounts){
        System.out.println("Enter Account Number:");
        int account_number = scanner.nextInt();
        System.out.println("Enter Passcode:");
        int passcode = scanner.nextInt();
        Account account = new Account();
        boolean exist = false;
        for (Account acc: accounts){
            if (acc.getAccount_number() == account_number && acc.getPasscode() == passcode){
                exist = true;
                account = acc;
            }
        }
        if(exist){
            new Menu(scanner, account);
        }else{
            System.out.println("Account does not exist.");
        }
    }
}
