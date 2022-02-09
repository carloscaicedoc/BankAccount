
public class BankAccountTest {

	public static void main(String[] args) {

        System.out.println("****************Creating BankAccount: Customer3*********************\n");
        BankAccount customer3 = new BankAccount();
        customer3.deposit(15000, "checking");
        customer3.deposit(5000, "savings");

        BankAccount customer4 = new BankAccount();
        customer4.deposit(3700, "checking");
        customer4.deposit(6350, "savings");

        customer3.printAccounts();
        customer3.getChecking();
        customer3.getSavings();
        customer3.totalAmountStored();
        System.out.println("Total accounts: " + BankAccount.howManyAccounts() + "\n") ;

        customer3.withdraw(450, "savings");
		customer3.printAccounts();
		customer3.withdraw(150, "savings");
		BankAccount.totalAmountStored();
		customer3.withdraw(1200, "checking");
		customer3.printAccounts();
		customer3.withdraw(245, "checking");
		BankAccount.totalAmountStored();

        customer3.printAccounts();
		customer3.getChecking();
		customer3.getSavings();
		BankAccount.totalAmountStored();


		System.out.println("Total accounts: " + BankAccount.howManyAccounts());

		
		System.out.println("****************Creating BankAccount: Person1*********************\n");
		
		BankAccount Person1 = new BankAccount( );
		
		Person1.deposit( 1000, "savings" );
		Person1.deposit( 1000, "checking" );
		
		Person1.printAccounts();
		Person1.getChecking();
		Person1.getSavings();
		BankAccount.totalAmountStored();
		System.out.println( "Total accounts: " + BankAccount.howManyAccounts() );
		
		System.out.println("****************Actions: Person1****************\n");
		
		Person1.withdraw(300, "savings");
		Person1.printAccounts();
		Person1.withdraw(20000, "savings");
		BankAccount.totalAmountStored();
		Person1.withdraw(500, "checking");
		Person1.printAccounts();
		Person1.withdraw(25000, "checking");
		BankAccount.totalAmountStored();
		
		System.out.println("****************Summary: Person1 BankAccounts****************C");
		
		Person1.printAccounts();
		Person1.getChecking();
		Person1.getSavings();
		BankAccount.totalAmountStored();
		System.out.println( "Total accounts: " + BankAccount.howManyAccounts() );

		System.out.println("****************Creating BankAccount: Person2****************");
		
		BankAccount Person2 = new BankAccount( );
		Person2.deposit( 80000, "savings" );
		Person2.deposit( 75000, "checking" );
		
		Person2.printAccounts();
		Person2.getChecking();
		Person2.getSavings();
		BankAccount.totalAmountStored();
		System.out.println( "Total accounts: " + BankAccount.howManyAccounts() );
		
		System.out.println("****************Actions: Person2****************");
		
		Person2.withdraw(1100, "savings");
		Person2.printAccounts();
		Person2.withdraw(90000, "savings");
		BankAccount.totalAmountStored();
		Person2.withdraw(18000, "checking");
		Person2.printAccounts();
		Person2.withdraw(95000, "checking");
		BankAccount.totalAmountStored();
		
		System.out.println("****************Summary: Person2 BankAccounts******************");
		
		Person2.printAccounts();
		Person2.getChecking();
		Person2.getSavings();
		BankAccount.totalAmountStored();
		System.out.println( "Total accounts: " + BankAccount.howManyAccounts() );
		
	}
	
	
}