package multithreading_synchronization;

	import java.util.Scanner;
	public class Withdraw extends Thread
	{
	    public static void main(String args[] )
	    { 
	        int balance = 10000, withdraw, deposit;
	        Scanner s = new Scanner(System.in);
	        while(true)
	        {
	            System.out.println("ATM");
	            System.out.println("Select 1 for Withdraw");
	            System.out.println("Select 2 for Deposit");
	            System.out.println("Select 3 for Check Balance");
	            System.out.println("Select 4 for EXIT");
	            System.out.print("Select the numbers to perform:");
	            int n = s.nextInt();
	            switch(n)
	            {
	                case 1:
	                System.out.print("Enter the money to be withdrawn:");
	                withdraw = s.nextInt();
	                if(balance >= withdraw)
	                {
	                    balance = balance - withdraw;
	                    System.out.println("Please collect your cash");
	                }
	                else
	                {
	                    System.out.println("Your Balance is insufficient");
	                }
	                System.out.println("");
	                break;
	 
	                case 2:
	                System.out.print("Enter money to be deposited:");
	                deposit = s.nextInt();
	                balance = balance + deposit;
	                System.out.println("Your Money has been successfully deposited");
	                System.out.println("");
	                break;
	 
	                case 3:
	                System.out.println("Balance : "+balance);
	                System.out.println("");
	                break;
	 
	                case 4:
	                System.exit(0);
	            }
	        }
	    }
	}	