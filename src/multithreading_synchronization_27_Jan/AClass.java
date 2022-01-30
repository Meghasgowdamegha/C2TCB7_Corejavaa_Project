package multithreading_synchronization_27_Jan;

public class AClass {
	int bal;
	
public synchronized void deposit(int amt)
{
	System.out.println("Getting balance...");
	int oldbal=getBalance();
	bal=oldbal+amt;
	setBalance(bal);
}
int getBalance()
{
	return Account.Balance;
}
void setBalance(int amt)
{
	try
	{
		Thread.sleep(3000);
	}
	catch(Exception e)
	{
		
	}
	Account.Balance=amt;
}
public void withdraw(int amt) {
	// TODO Auto-generated method stub
	
}
}
