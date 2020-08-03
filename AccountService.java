import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

interface Service
{
	public Account deposit(int amount);
	public Account withdraw(int amount);
	public int getbalance();
	public int emptybalance();
	
}




public class AccountService implements Service {
	
	private static int account=0;
	public Account deposit(int amount)
	{
		
		account +=amount;
		return null;
	
	}

	@Override
	public Account withdraw(int amount) {
		
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



