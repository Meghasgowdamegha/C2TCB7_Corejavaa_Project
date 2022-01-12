package exception_handlingThrows_12_Jan;
import java.io.IOException;

public class ExceptionHandlingDemo6 {
		void m()throws IOException
		{
		throw new IOException("device error");//checked exception
		}
		void n()throws IOException
		{
		m();
		}
		void p()
		{
		try
		{
		n();
		}
		catch(Exception e){System.out.println("exception handled");}
		}
		public static void main(String args[])
		{
	  ExceptionHandlingDemo6 obj=new ExceptionHandlingDemo6();
		obj.p();
		System.out.println("normal flow...");
		}

	}

	
