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
                    new CreateAccount(scanner, last_acc_id, accounts);
                    break;
                case 2:
                    new Login(scanner, accounts);
                    break;
            }
        } while (i != 3);


    }

}