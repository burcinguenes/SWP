import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		int n=13;
		Random random1 = new Random();
		
		ArrayList <Integer> zahlen= new ArrayList<Integer>();
		zahlen=getRandomList(n,random1);
		
				
		System.out.print(zahlen+"\n");
		
		
		System.out.print(QuickSort(zahlen));
		
		QuickSort2(zahlen);
	}
	
	public static ArrayList<Integer> QuickSort(ArrayList <Integer>zahlenliste) 
	{	
		ArrayList <Integer> links= new ArrayList<Integer>();
		ArrayList <Integer> rechts= new ArrayList<Integer>();
		
		if(zahlenliste.size()<=1)return zahlenliste;
		
		
		
		Random random = new Random();
		int n=zahlenliste.size();
		
		int p=random.nextInt(n);
		int pivot = zahlenliste.get(p);
		

		for(int i=0;i<=zahlenliste.size()-1;i++) 
		{
			if(zahlenliste.get(i)>pivot) {rechts.add(zahlenliste.get(i));}
			if(zahlenliste.get(i)<pivot) {links.add(zahlenliste.get(i));}

		}
		
	   // System.out.print(links+" "+pivot+" "+rechts+"\n");
		links=QuickSort(links);
		rechts=QuickSort(rechts);
		links.add(pivot);
		links.addAll(rechts);
		
		//System.out.print(links+" "+pivot+" "+rechts+"\n");		
		return links;
		


	}
	
	public static ArrayList<Integer> QuickSort2(ArrayList<Integer> a)
	{
		int i=a.get(a.size()-1);
		
		if(a.get(0)>a.get(1)) 
		{
			
		}
		
		return a;
	}

	public static ArrayList <Integer> getRandomList(int size, Random random)
	{
		ArrayList  <Integer> zahlen = new ArrayList<Integer>();
		
		
		for(int i=0;i<=size-1;i++) 
		{
			zahlen.add(random.nextInt(20));
		}
		
		return zahlen;
	}
}
