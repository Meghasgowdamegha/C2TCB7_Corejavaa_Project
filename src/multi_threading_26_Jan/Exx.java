package multi_threading_26_Jan;

public class Exx extends Thread {
int st;
String msg;

public Exx( String msg,int st) {
	this.st = st;
	this.msg = msg;
}

@Override
public void run() {
	for (int i=1;i<=10;i++)
	{
		try
	{
			Thread.sleep(st);
	}
	catch(Exception e)
	{
		
	}
	System.out.println(msg + i);
}
}
}
