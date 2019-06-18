package Funktionen;

import java.util.ArrayList;
import java.util.Random;

public class ANN {
	
	private float[] input;
	private float[] output;
	
	private float[][] weight;
	private float[] bias;

	private ArrayList<float[]> bV;
	private ArrayList<float[]> wM;
	
	private float[] hiddenLayer;
	
	
	public ANN(float[] input, float[] hidden, float[] output) 
	{			
		this.input = input;
		this.output = output;
		this.hiddenLayer=hidden;
		
		calculateLayer(this.input);

	}
	
		
	public float[] calculateLayer(float[] start) 
	{
		//Weight und Bias Zufallszahlen 
		Random r = new Random(); int max=1; int min=-1;
		
		//Weight muss zweidimensional sein, jedes Objekt eines Layers hat jeweils Zufallszahl
		for(int a=0;a<this.hiddenLayer.length+1;a++) 
		{
			this.weight[a][] = r.nextFloat() * (max-min) + min;
		}
		
		for(int b=0;b<this.hiddenLayer.length;b++) 
		{
			this.bias[b] = r.nextFloat() * (max-min) + min;
		}
		
		
		//berechneten Ergebnisse zwischenspeichern
		float[] solution = null;
		
		
		//Wenn der angegebene Layer dem Input-Layer entspricht 
		if(start == this.input) 
		{
			 for(int j=0;j<this.hiddenLayer[0];j++)
			{
				for(int i=0;i<start.length;i++) 
				{
					this.hiddenLayer[j] += start[i];
				}
				
				//erste Hiddenlayer berechnet mit weight 
				this.hiddenLayer[j] = (float) Sigmoid(this.hiddenLayer[j]*weight[0][]+bias[0]);
			}
		}
		
		
		return solution;
			
	}



	public double Sigmoid(double x) 
	{
		return (1/( 1 + Math.pow(Math.E,(-1*x))));
	}
	


	
}

/*for(int i=0;i<hiddenl.size();i++) 
{
	this.hiddenLayer.add(i, hiddenl.get(i));
}

//Weight befüllen
for(int i=0;i<= ;i++) 
{
	for(int j=0;j<= ;j++) 
	{
		
	}
}

//Bias befüllen 
for(int i=0;i<hiddenl.size();i++) 
{
		for(int j=0;j<= ;j++) 
		{
			
		}
}*/