package BankManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class CreateAccount {

    public CreateAccount(Scanner scanner, int last_acc_id, ArrayList<Account> accounts){
        System.out.println("Enter first name:");
        String firstName = scanner.next();
        System.out.println("Enter last name:");
        String lastName = scanner.next();
        System.out.println("Enter Proof ID");
        String proofID = scanner.next();
        System.out.println("Proof Address");
        String proof_address = scanner.next();
        System.out.println("Enter Balance:");
        double balance = scanner.nextDouble();
        System.out.println("Enter Passcode: (Digits Only");
        int passcode = scanner.nextInt();
        System.out.println("Confirm Passcode:");
        int passcode_checker = scanner.nextInt();
        if (passcode != passcode_checker) {
            System.out.println("Passcodes Not Matching!\n");
            return;

        }
        int account_number = 1000000 + last_acc_id;
        last_acc_id = last_acc_id + 1;
        Account acc = new Account(firstName, lastName, proofID, proof_address, account_number, passcode, balance);
        accounts.add(acc);
        System.out.println("Your account id: "+ account_number);
        new Menu(scanner, acc);
    }
}
