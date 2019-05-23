package rechner;

//1.Schritt Matrizen befüllen Funktion 
//2 Schritt Funktion testen 

//3. Schritt 	Multiplikation 
//				Addition
//				Matrize mal Zahl

public class Matrizen{

	public int[][] matrize;
		
	
	public Matrizen(int [][] a) throws InvalidMatrixException
	{
		for(int i=0;i<=a.length-1;i++) 
		{
			if(a[i].length != a.length)
			{
				throw new InvalidMatrixException();
			}
		}
		
		matrize=a;
	}
	
	public int getZeilen() {
		return matrize.length;
	}
	
	public void getMatrize() 
	{
		System.out.println();
		for(int i=0;i<=this.matrize.length-1;i++) 
		{
			for(int j=0;j<=this.matrize.length-1;j++) 
			{
				System.out.print(matrize[i][j]+" ");
			}
			
			System.out.println();
		}
	}
	
	public void MatrAddition(Matrizen m2) throws InvalidMatrixException 
	{	
		int [][] summe = new int[this.matrize.length][this.matrize.length];
		
		for(int i=0;i<=this.matrize.length-1;i++) 
		{
			for(int j=0;j<=this.matrize.length-1;j++) 
			{
				summe[i][j] = this.matrize[i][j] + m2.matrize[i][j];
			}		
		}
		
		Matrizen sum = new Matrizen(summe);
		sum.getMatrize();
	}
	
	public void MatrMultiplikation(int zahl) throws InvalidMatrixException 
	{
		int [][] produkt = new int[this.matrize.length][this.matrize.length];
		
		for(int i=0;i<=this.matrize.length-1;i++) 
		{
			for(int j=0;j<=this.matrize.length-1;j++) 
			{
				produkt[i][j] = this.matrize[i][j] * zahl;
			}		
		}
		
		Matrizen prod = new Matrizen(produkt);
		prod.getMatrize();
	}
	
	/*	
	public void MatrSkalar(Matrizen m2) 
	{
		
	}
	*/
	
}
