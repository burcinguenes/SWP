import java.lang.reflect.Array;
import java.util.ArrayList;

public class PFmain {

	public static void main(String[] args) {
		
		long startTime_faculty=System.nanoTime();
		
		int n = 8;
		System.out.print(n+"! = "+faculty(n));
		
		long stopTime_faculty=System.nanoTime();
		System.out.print("	Gemessene Zeit: "+(stopTime_faculty-startTime_faculty)+" nanoSekunden");

		String name="Anna";
		System.out.print("\nPalindrom: "+isPalindrom(name));
		
		int zeile=10;
		int position=10;
		System.out.print("\nPaskalsche Pyramide von ("+zeile+"/"+position+") = "+PascalPyramid(zeile,position));
		
		int index=8;
		System.out.print("\nFibonacciZahlen: "+FibonacciZahlen(index));
		
		long startTime_fact=System.nanoTime();
		
		int x = 8;
		System.out.print("\n"+x+"! = "+fact(x));
		
		long stopTime_fact=System.nanoTime();
		System.out.println("	Gemessene Zeit: "+(stopTime_fact-startTime_fact)+" nanoSekunden");

		
	}
	
	
	
	public static int faculty(int n) 
	{
		if((n==1)||(n==0)) { return 1; }
		
		return n*faculty(n-1);
	}
	
	//is oder has bei boolean Funtkionen, ansonsten normale Funktionen
	public static boolean isPalindrom(String s) 
	{
		s = s.toLowerCase(); //damit Programm nicht mehr zwischen Groﬂ- und Kleinbuchstaben unterscheidet 
		
		if((s.length()==0)||(s.length()==1)) { return true; }
		
		//Wenn der erste und letzte Buchstabe eines String nicht dieselben sind, kann es kein Palindrom sein. 
		if(s.charAt(0) != s.charAt(s.length()-1)) { return false; }
		
		return isPalindrom(s.substring(1, s.length()-1)); 
	}
	
	
	public static int PascalPyramid(int n, int n1) 
	{
		if((n==0)||(n1==0)) { return 1; }
		if(n==n1) { return 1; }
		
		return (PascalPyramid(n-1,n1-1)+PascalPyramid(n-1,n1));
	}
	
	/*public static int PascalPyramidInterativ(int n, int n1) 
	{
		int ergebnis;
		
		if((n==0)||(n1==0)) { ergebnis=1; }
		if(n==n1) { ergebnis=1; }
		
		ergebnis=
		
		return 0;
		
	}*/
	
	public static int FibonacciZahlen(int n) 
	{
		if(n<2)return 1;
		return FibonacciZahlen(n-1)+FibonacciZahlen(n-2);
	}
	
	//EndRekursive Fakult‰t 
	public static int fact(int n) 
	{
		int ergebnis=1;
		if((n==1)||(n==0)) { return 1; }
		
		return fact(n-1)*(ergebnis*n);
	}
	

}
