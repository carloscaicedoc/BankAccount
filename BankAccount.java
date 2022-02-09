import java.util.Random;

public class BankAccount {
    
    private String accountNum;
    private double checking;
    private double savings;

    private static int numberOfAccounts = 0;
    private static double totalMoney = 0;

    // CONSTRUCTOR
    public BankAccount(){
        this.checking = 0;
        this.savings = 0;
        numberOfAccounts++;
        this.accountNum = BankAccount.randomNumAccount();

    }

    // Account Num
    private static String randomNumAccount() {
        Random rand = new Random();
		
		int minRange = 100000000, maxRange= 500000000;
        int value = rand.nextInt(maxRange - minRange) + minRange; //nextInt(30) returns a random number between 0 and 29. // nextInt(maxRange - minRange) returns a random number between 4000.
        String stringValue = Integer.toString(value);  	         //+ 1 then makes that a number between 1 and 30.        //+ minRange then makes that a number between 1000 and 5000.
        return stringValue;
    }

    // Getters 
    public double getChecking() {
        return this.checking;
    }

    public double getSavings() {
        return this.savings;
    }

    // Methods 
    public static int howManyAccounts() {
        return numberOfAccounts;
    }

    public void deposit (double amount, String account) {
        String sentence = account;
        if (sentence.indexOf("savings") == 0) {
            this.savings += amount;
        } else if (sentence.indexOf("checking") == 0) {
            this.checking += amount;
        }

        BankAccount.totalMoney += amount;
    }

    public void withdraw (double amount, String account) {
        String sentence = account;
        if (sentence.indexOf("savings") == 0) {
            if (amount <= this.savings) {
                this.savings -= amount;
                BankAccount.totalMoney -= amount;
            } else {
                System.out.println("Insufficient Funds: Your current savings balance is: " + this.getSavings() + "." + " And you are trying to withdraw: " + amount + "." );
            }
            
        } 
        else if( sentence.indexOf("checking") == 0 ) {
			if( amount <= this.checking ) {
				this.checking -= amount;
				BankAccount.totalMoney -= amount;
			}
			else {
				System.out.println("Insufficient Funds: Your current savings balance is: " + this.getChecking() + "." + " And you are trying to withdraw: " + amount + "." );
			}
		}
    }

    //PrintInfo
    public void printAccounts() {
	    System.out.println("Bank Account ID: " + this.accountNum + "." +  " Current savings balance: $" + this.getSavings()  + "." + " Current cheking balance: $" + this.getChecking()); 
    }
	
	public static void  totalAmountStored() {
		System.out.println("Total current balance among all users's accounts: $" + totalMoney);
		//return totalMoney;
	 }

}