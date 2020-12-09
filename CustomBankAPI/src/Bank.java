// Complete class
// Java Bean class
// POJO - Plain Old Java Object

/** 
 * Class - keep data private. Methods may be private or public 

Method - No input & output statement 
                 Input --> via argument
                 Output --> through return 

When making a custom class/API --> 
Right click --> Source --> 
Generate constructors using fields / Generate Getters and Setters 

 * 
 * @author darre
 * @param <Public>
 *
 */

public class Bank {
	
	private int accNumber; 
	private String name; 
	private double balance; 
	
	Bank() {	
		
	}

	public Bank(int accNumber, String name, double balance) {
		this.accNumber = accNumber;
		this.name = name; 
		this.balance = balance; 
	}
	
	//Fetch data
	//Getter / Accessor method
	public int getAccNumber() {
		return accNumber; 
	}
	
	// Add / update / remove
	// Setter / Mutator method
	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber; 
	}
	
	public String getName() {
		return name; 
	}
	
	public void setName(String name) {
		this.name = name; 
	}
	
	public double getBalance() {
		return balance; 
	}
	
	private void setBalance(double balance) {
		this.balance = balance;
		}

		//Business Logic -- processing
		public boolean deposit(double amount) {
		if(amount < 0) {
		return false;
		}
		balance = balance + amount;
		return true;
		}

		public int withdraw(double amount) {
		if(amount < 0) {
		return -1;
		}
		if(amount > balance) {
		return 0;
		}
		balance = balance - amount;
		return 1;
		}

		@Override
		public String toString() {
		return "Bank [accNumber=" + accNumber + ", name=" + name + ", balance =" + balance + "]";
		}
}
