import java.util.Date;
public class Account {
	private int id;
	private double balance, annualInterestRate;
	private Date dateCreated;
	Account(){
		dateCreated = new Date();
	}
	Account(int Id, double Balance, double AnnualInterestRate){
		id = Id;
		balance = Balance;
		annualInterestRate = AnnualInterestRate;
		dateCreated = new Date();
	}
	public int getID(int ID) {
		return id;
		
	}
		
	public double getAIR(double AIR) {
		return annualInterestRate;
		
	}
	public void setID(int ID) {
		
	}
	public void setAIR(double AIR) {
		
		
	}
	public Date getdate(Date date) {
		date = this.dateCreated;
		return date;
		
	}
	public double getMonthlyInterestRate(double monthlyInterestRate) {
		monthlyInterestRate = annualInterestRate / 12;
		return monthlyInterestRate;
		
	}
	public double getMonthlyInterest(double monthlyInterest) {
		monthlyInterest = getBalance() * getMonthlyInterestRate(0);
		return monthlyInterest;
		
	}
	public void withdraw(double withdrawl) {
		setBalance(getBalance() - withdrawl);
		
		
	}
	public void deposit(double deposit) {
		setBalance(getBalance() + deposit);
		
		
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
