import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

interface Service
{
	public Account deposit(double amount);
	public Account withdraw(double amount);
	public int getbalance();
	public int emptybalance();
	
}




public class AccountService implements Service {
	
	private static double account=0.0;
	public Account deposit(double amount)
	{
		
		account +=amount;
		return null;
	
	}

	@Override
	public Account withdraw(double amount) {
		
	 account -=amount;
	 return null;
		
		
		
	}

	@Override
	public int getbalance() {
		
		return account;
	}

	@Override
	public int emptybalance() {
		
		account=0;
		return account;
	}

}



