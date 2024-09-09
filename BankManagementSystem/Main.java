package BankManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner scanner;
    static int last_acc_id = 0;
    private static ArrayList<Account> accounts;

    public static void main(String[] args) {

        accounts = new ArrayList<>();
        scanner = new Scanner(System.in);
        int i = 0;
        do {
            System.out.println("Welcome to Bank Management System");
            System.out.println("1. Create new account");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            i = scanner.nextInt();

            switch (i) {
                case 1:
                    createNewAcc();
                case 2:
                    login();
            }
        } while (i != 3);


    }

    private static void createNewAcc() {
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
            System.out.println("Passcodes Not Matching!");
            return;

        }
        int account_number = 1000000 + last_acc_id;
        last_acc_id = last_acc_id + 1;
        Account acc = new Account(firstName, lastName, proofID, proof_address, account_number, passcode, balance);
        showMenu(acc);
    }

    private static void login() {
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
            showMenu(account);
        }else{
            System.out.println("Account does not exist.");
        }
    }

    private static void showMenu(Account account) {
        System.out.println("Welcome" + account.getFirstName()+ "!");
    }

}