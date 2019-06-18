package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import rechner.InvalidMatrixException;
import rechner.Matrizen;

public class TestMatrMultiplikation {
	
	@Test
	public void adMatrizen() throws InvalidMatrixException 
	{
		Matrizen m1 = new Matrizen(new float [][] {{2,3} ,{5,4}});
		Matrizen m2 = new Matrizen(new float [][] {{2,3} ,{5,4}});

		m1.MatrAddition(m2);
		
		Matrizen ergebnis = new Matrizen(new float [][] {{4,6} ,{10,8}});
		
		assertTrue(ergebnis.equals(m1.MatrAddition(m2)));
	}
		
	
	@Test(expected=InvalidMatrixException.class)
	public void invalidAdMatrizen() throws InvalidMatrixException 
	{
		Matrizen m1 = new Matrizen(new float [][] {{2,3} ,{5,4,6}});
		Matrizen m2 = new Matrizen(new float [][] {{2,3} ,{5,4}});

		m1.MatrAddition(m2);
	}
	
	@Test
	public void MatrizenMultZahl() throws InvalidMatrixException 
	{
		Matrizen m1 = new Matrizen(new float [][] {{2,3} ,{5,4}});
		int zahl = 3;
		
		Matrizen ergebnis = new Matrizen(new float [][] {{6,9} ,{15,12}});
		
		assertTrue(ergebnis.equals(m1.MatrMultZahl(zahl)));
	}
	
	@Test
	public void MatrizenMult() throws InvalidMatrixException 
	{
		Matrizen m1 = new Matrizen(new float [][] {{2,3} ,{5,4}}); 
		Matrizen m2 = new Matrizen(new float [][] {{5,7} ,{6,9}}); 
		
		Matrizen ergebnis = new Matrizen(new float [][] {{28,41} ,{49,71}});
		
		assertTrue(ergebnis.equals(m1.MatrMult(m2)));

	}
	
	//sollte nicht funktionieren excepted 
	public void invalidMatrizenMult() throws InvalidMatrixException 
	{
		Matrizen m1 = new Matrizen(new float [][] {{2,3} ,{5,4}}); 
		Matrizen m2 = new Matrizen(new float [][] {{5,7} ,{6,9}}); 
		
		Matrizen ergebnis = new Matrizen(new float [][] {{28,41} ,{49,71}});
		
		assertTrue(ergebnis.equals(m2.MatrMult(m1)));

	}
	
	
	
		
}
