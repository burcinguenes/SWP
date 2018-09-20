import java.util.ArrayList;

public class Main {
	//ArrayList zahlen = new ArrayList <>();

	//{8,7,4,10,3,17,11,-4} Zahlen ordnen
	
	static int a[]={8,7,4,10,3,17,11,-4};
	
	public static void main(String[] args) {

		int zahl;
		int zahlvorher;

		printArray();

		for(int j=0;j<=7;j++) 
		{
			for(int i=0;i<=7;i++) 
			{
				zahl = a[i];
				
				if(i>=1) 
				{
					zahlvorher=a[i-1];
				
					if(zahl>zahlvorher)
					{
						a[i]=zahlvorher; 
						a[i-1]=zahl;
					}
					//if(zahlvorher>zahl);

				}
							
			}			
			
		}		
		printArray();
	}
	
	
	

	 public static void printArray() 
	{
		 for(int i=0;i<=7;i++)  { System.out.print(a[i]+" ");	}
		 
		 System.out.print("\n");
	}

}
