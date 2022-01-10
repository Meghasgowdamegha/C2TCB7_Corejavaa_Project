package constructor_03_Jan;

public class Students {
String usn;
String name;
String Branch;
double percentage;
public Students()
{
}
public Students(String usn) {
	this.usn=usn;
}
public Students(String usn,String name, String branch,double percentage) {
this.usn=usn;
this.name=name;
Branch=branch;
this.percentage=percentage;
}
public String Data()
{
	String
	str="("+usn+","+name+","+Branch+","+percentage+")";
return str;
}
	public static void main(String[] args) {
	Students s1=new Students();
	s1.usn="2021b7";
	s1.name="Sumeha";
	s1.Branch="TCE";
	s1.percentage=80;
	System.out.println(s1.Data());
	Students s2=new Students("2022b8","Anisha","TCE",90);
	System.out.println(s2.Data());
	}
}
