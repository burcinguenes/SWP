package rechner;

//1.Schritt Matrizen befüllen Funktion 
//2 Schritt Funktion testen 

//3. Schritt 	Multiplikation 
//				Addition
//				Matrize mal Zahl

//4. Schritt Sigmoid-Funktion einbauen

public class Matrizen{

	public float[][] matrize;
	
	private float[] weight;
	private float[] bias;
	private float[] hiddenValues;

	
	
	public Matrizen(float [][] a) throws InvalidMatrixException
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
	
	public float getZeilen() {
		return matrize.length;
	}
	
	/*public void getMatrize() 
	{
		System.out.prfloatln();
		for(float i=0;i<=this.matrize.length-1;i++) 
		{
			for(float j=0;j<=this.matrize.length-1;j++) 
			{
				System.out.prfloat(matrize[i][j]+" ");
			}
			
			System.out.prfloatln();
		}
	}*/
	
	public Matrizen MatrAddition(Matrizen m2) throws InvalidMatrixException 
	{	
		float [][] summe = new float[this.matrize.length][this.matrize.length];
		
		//if weil beide Summanten gleich viele Spalten und Zeilen haben müssen
		
		for(int i=0;i<=this.matrize.length-1;i++) 
		{
			for(int j=0;j<=this.matrize.length-1;j++) 
			{
				summe[i][j] = this.matrize[i][j] + m2.matrize[i][j];
			}		
		}
		
		Matrizen sum = new Matrizen(summe);
		return sum;
	}
	
	public Matrizen MatrMultZahl(int zahl) throws InvalidMatrixException 
	{
		float [][] produkt = new float[this.matrize.length][this.matrize.length];
		
		for(int i=0;i<=this.matrize.length-1;i++) 
		{
			for(int j=0;j<=this.matrize.length-1;j++) 
			{
				produkt[i][j] = this.matrize[i][j] * zahl;
			}		
		}
		
		Matrizen prod = new Matrizen(produkt);
		return prod;
		
	}
	
	public Matrizen MatrMult(Matrizen m2) throws InvalidMatrixException 
	{
		float [][] skalar = new float[this.matrize.length][m2.matrize[1].length];
		
		   for (int i = 0; i < m2.matrize[1].length; i++)
            {
                for (int j = 0; j < this.matrize.length; j++)
                {
                    for (int k = 0; k < m2.matrize.length; k++)
                    {
                        skalar[j][i]+= this.matrize[j][k] * m2.matrize[k][i];
                    }
                }
            }
		   
		   Matrizen ska = new Matrizen(skalar);
		   return ska;
	}
	

	public boolean equals(Matrizen matr) {
		
		for(int i=0;i<=this.matrize.length-1;i++) 
		{
			for(int j=0;j<=this.matrize.length-1;j++) 
			{
				if(matr.matrize[i][j] != this.matrize[i][j]) return false;
			}		
		}
		
		return true;
	}
	
	
}
