	package reference_28_Dec;

		public class Variables_Demo {
		     // class variable
			int a=1024;
			int b;
			
			void func1()
			{
				int c;
				c=10;
			    System.out.println("class variables "+a+" "+b);
				System.out.println("local variable "+c);
				a=7890;
				b=56;
				System.out.println("class variables "+a+" "+b);
			}
			
			void func2()
			{
				System.out.println("class variables "+a+" "+b);
			}
			
			public static void main(String[] args) {
				Variables_Demo obj=new Variables_Demo();
				obj.func1();
				obj.func2();
			}

}
