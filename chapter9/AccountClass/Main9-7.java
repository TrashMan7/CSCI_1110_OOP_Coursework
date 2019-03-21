
public class Main {

	public static void main(String[] args) {
		Account joe = new Account(1122, 20000, .45);
		joe.withdraw(2500);
		joe.deposit(3000);
		
		System.out.println("The balance in the account is: " + joe.getBalance());
		System.out.println("The Monthly Interest is: " + joe.getMonthlyInterest(0));
		System.out.println("The Account was created: " + joe.getdate(null));
	}
	
}
