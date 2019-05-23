package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import rechner.InvalidMatrixException;
import rechner.Matrizen;

public class TestMatrMultiplikation {

	@Test
	public void addMatrize() throws InvalidMatrixException {
		
		Matrizen n = new Matrizen(new int [][] {{2,3} ,{5,4}}); 
		n.getMatrize();
	}
	
	@Test(expected=InvalidMatrixException.class)
	public void addInvalidMatrize() throws InvalidMatrixException {
		
		Matrizen n = new Matrizen(new int [][] {{2,3} ,{5}}); 
	}
	
	
	@Test
	public void adMatrizen() throws InvalidMatrixException 
	{
		Matrizen m1 = new Matrizen(new int [][] {{2,3} ,{5,4}});
		Matrizen m2 = new Matrizen(new int [][] {{2,3} ,{5,4}});

		m1.MatrAddition(m2);
	}
	
	@Test(expected=InvalidMatrixException.class)
	public void invalidAdMatrizen() throws InvalidMatrixException 
	{
		Matrizen m1 = new Matrizen(new int [][] {{2,3} ,{5,4,6}});
		Matrizen m2 = new Matrizen(new int [][] {{2,3} ,{5,4}});

		m1.MatrAddition(m2);
	}
	
	@Test
	public void multMatrizen() throws InvalidMatrixException 
	{
		Matrizen m1 = new Matrizen(new int [][] {{2,3} ,{5,4}});
		int zahl = 3;
		
		m1.MatrMultiplikation(zahl);
	}
	
	
	/*@Test
	public void multMatrizen() throws InvalidMatrixException 
	{
		Matrizen m1 = new Matrizen(new int [][] {{2,3} ,{5,4}}); 
		Matrizen m2 = new Matrizen(new int [][] {{2,3} ,{5,4}}); 
		
		m1.MatrMultiplikation(m2);

	}*/
	
	

}
