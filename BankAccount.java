
public class BankAccount {
    // MEMBER VARIABLES
    private double checkingBalance;
    private double savingsBalance;
    public static int numberOfAccounts = 0;
    public static double totalAmount = 0;

    // CONSTRUCTOR
    public BankAccount(){
        this.checkingBalance = 0;
        this.savingsBalance = 0;
        numberOfAccounts++; 
    }

    //METHODS
    public void depositMoney(String account, double deposit){
        if(account == "checking")
        setCheckingBalance(getCheckingBalance() + deposit);
        if(account == "savings")
        setSavingsBalance(getSavingsBalance() + deposit);
    }

    public void withdrawMoney(String account, double deposit){
        if(account == "checking")
        setCheckingBalance(getCheckingBalance() - deposit);
        if(account == "savings")
        setSavingsBalance(getSavingsBalance() - deposit);
    }

    public void displayBalance(){
        System.out.printf("\nYour checking balance is %s", getCheckingBalance());
        System.out.printf("\nYour savings balance is %s", getSavingsBalance());
    }

    //GETTERS & SETTERS
    public double getCheckingBalance() {
        return this.checkingBalance;
    }

    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

    public double getSavingsBalance() {
        return this.savingsBalance;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public static int numberOfAccounts(){
        return numberOfAccounts;
    }

}