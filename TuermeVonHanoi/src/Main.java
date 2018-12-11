import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		int n=3;
		
		ArrayList<Integer> src = new ArrayList<Integer>();
		ArrayList<Integer> aux = new ArrayList<Integer>();
		ArrayList<Integer> target = new ArrayList<Integer>();

		for(int i=n;i>0;i--)src.add(i);
		
		move(n,src,aux,target);
		printStatus(src,aux,target);
	}
	
	
	private static void printStatus(ArrayList<Integer> src, ArrayList<Integer> aux, ArrayList<Integer> target) {
		System.out.print(src+" "+aux+" "+target+"\n");
		
	}


	public static void move(int n, ArrayList<Integer> src,ArrayList<Integer> aux, ArrayList<Integer> target) 
	{
		if(n==0) {return;}
		
		move(n-1,src,target,aux);					printStatus(src,aux,target);
		target.add(src.remove(src.size()-1));		printStatus(src,aux,target);
		
		move(n-1,aux,src,target);					printStatus(src,aux,target);
	}

}
