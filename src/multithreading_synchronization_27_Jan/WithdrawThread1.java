package multithreading_synchronization_27_Jan;


public class WithdrawThread1 extends Thread {
	AClass obj;
	int amt;
	//String msg;
	
	public WithdrawThread1(AClass obj, int amt,String msg) {	
		this.obj = obj;
		this.amt = amt;
	    //this.msg=msg;
	}

	@Override
	public void run() {
		try
		{
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			
		}
		//System.out.println("First");
		obj.withdraw(amt);
	}
	
}