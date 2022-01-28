package multithreading_synchronization_27_Jan;

import multi_threading_26_Jan.AClass;

public class DepositThread extends Thread {
	AClass obj;
	int amt;
	String msg;
	
	public DepositThread(AClass obj, int amt,String msg) {	
		this.obj = obj;
		this.amt = amt;
		this.msg=msg;
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
		obj.deposit(amt);
	}
	

}