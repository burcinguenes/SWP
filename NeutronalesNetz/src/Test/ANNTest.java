package Test;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import Funktionen.ANN;

class ANNTest {

	@Test
	public void createANN() 
	{
		float[]input = {4};
		float[]output = {4};

		float[] hiddenlayer = {3,2};
		
		ANN test = new ANN(input,hiddenlayer,output);
	}

}
