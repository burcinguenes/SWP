
public class Datentypen {

	public static void modifyPrimitive(int a) 
	{ a = 5; }
	
	public static void modifyString(String s) 
	{ s="hallo"; }
	
	public static void modifyObject(DtContainer c) 
	{
		c.a=4;
		c.s="hallo";
	}
	
	public static void modifyPrimitiveInteger(Integer a) 
	{
		a=5;
	}
	
	public static void main(String[] args) 
	{
		int a=8; 
		modifyPrimitive(a);
		System.out.print(a+"\n");
		
		String s="h";
		modifyString(s);
		System.out.print(s+"\n");
		
		DtContainer d = new DtContainer();
		modifyObject(d);
		System.out.print(d+"\n");
		
		int b=8; 
		modifyPrimitiveInteger(b);
		System.out.print(b+"\n");
 	}
}
