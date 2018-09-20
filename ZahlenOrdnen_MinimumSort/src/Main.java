import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList  <Integer> zahlen = new ArrayList<Integer>();
		zahlen.add(-8); zahlen.add(7); zahlen.add(4); zahlen.add(10); zahlen.add(3); zahlen.add(-4); zahlen.add(17); zahlen.add(11); 
	
		ArrayList <Integer> geordneteZahlen = new ArrayList<Integer>();
		
		int ausgabenzaehler=1;
		
		for(int j=0;j<=7;j++) 
		{
			int minimumzahl = zahlen.get(0);
			int minimumzahl_index=0;
			
			for(int i=1;i<=zahlen.size()-1;i++) 
		{
				if(zahlen.get(i)<minimumzahl) { minimumzahl=zahlen.get(i); minimumzahl_index=i; }
				
		}
		
		System.out.print("\n"+ausgabenzaehler+".)\n"+"Zahlen Array: "+zahlen.toString()+"\n");
		
		geordneteZahlen.add(minimumzahl);
		System.out.print("Minimumzahl lautet: "+minimumzahl+"\n");
		
		System.out.print("Geordnete Zahlen Array: "+geordneteZahlen.toString()+"\n");
		
		zahlen.remove(minimumzahl_index);	//System.out.print("Zahlen Array: "+zahlen.toString()+"\n");
		ausgabenzaehler++;

		}
	
	}
	
	

}
