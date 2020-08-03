

public class Account {
	
	public int id;
	public String name;
	public double balance;
	public long number;
	
	
	
	
	public Account(int id, String name, double balance, long number) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
		this.number = number;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	
	public static void main(String[] args)
	{
		//Account acc1 = new Account(1, "agil", 0, 20);
		
		AccountService service = new AccountService();
		service.deposit(100);
		service.withdraw(25);
		System.out.print(service.getbalance());
		
	}

}
