
/**
 * Accept 4 customers data and arrange them by their 
 * balance in descending order 
 * @author Darren
 *
 */

public class BankApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank[] customers = new Bank[4];
		
		customers[0] = new Bank(100, "Harish", 200);
		customers[1] = new Bank(101, "Michael", 3000);
		customers[2] = new Bank(102, "Sean", 20000); 
		customers[3] = new Bank(103, "Emmanuel", 2000); 
		
		Bank[] orderedCustomers = orderByBalance(customers);
				for(Bank b : orderedCustomers) { 
					System.out.println(b);
				}
	}

	public static Bank[] orderByBalance(Bank[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j <arr.length; j++) {
				Bank temp = null; 
				
				if(arr[i].getBalance() < arr[j].getBalance()) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
}
