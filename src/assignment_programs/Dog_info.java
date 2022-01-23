package assignment_programs;
class Dog1{
String name="pug";
int age=2;
String color="Apricot";
}
class Dog2{
String name="Pomeranian";
int age=5;
String color="White";
}
class Dog3{
String name="German Shepherd";
int age=8;
String color="Black and Cream";
}
class Dog4{
String name="Golden Retriever";
int age=6;
String color="Dark golden";
}
class Dog5{
String name="Husky";
int age=9;
String color="Grey and white";
}
public class Dog_info {
	public static void main(String[]args)
	{
		Dog1 d1=new Dog1();
		System.out.println("# The name of d1 is:"+d1.name+",age is:"+d1.age+",and the color is :"+d1.color);
		Dog2 d2=new Dog2();
		System.out.println("# The name of d2 is:"+d2.name+",age is:"+d2.age+",and the color is :"+d2.color);
		Dog3 d3=new Dog3();
		System.out.println("# The name of d3 is:"+d3.name+",age is:"+d3.age+",and the color is :"+d3.color);
		Dog4 d4=new Dog4();
		System.out.println("# The name of d4 is:"+d4.name+",age is:"+d4.age+",and the color is :"+d4.color);
		Dog5 d5=new Dog5();
		System.out.println("# The name of d5 is:"+d5.name+",age is:"+d5.age+",and the color is :"+d5.color);
		System.out.println();		
	}
}
