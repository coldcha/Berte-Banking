package BankManagementSystem;

public class Account {

    private String firstName;
    private String lastName;
    private String proofID;
    private String proof_address;
    private int account_number;
    private int passcode;
    private double balance;

    public Account(String firstName, String lastName, String proofID, String proof_address, int account_number, int passcode, double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.proofID = proofID;
        this.proof_address = proof_address;
        this.account_number = account_number;
        this.passcode = passcode;
        this.balance = balance;
    }

    public Account() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getProofID() {
        return proofID;
    }

    public void setProofID(String proofID) {
        this.proofID = proofID;
    }

    public String getProof_address() {
        return proof_address;
    }

    public void setProof_address(String proof_address) {
        this.proof_address = proof_address;
    }

    public int getAccount_number() {
        return account_number;
    }

    public void setAccount_number(int account_number) {
        this.account_number = account_number;
    }

    public int getPasscode() {
        return passcode;
    }

    public void setPasscode(int passcode) {
        this.passcode = passcode;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}

