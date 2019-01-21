package BinaryTreePackage;

public class BTMain {

	public static void main(String[] args) {
		
		BinaryTreeClass test = new BinaryTreeClass();
		test.add(10);
		test.add(20);
		test.add(30);
		test.add(40);
		
		test.add(15);
		test.add(35);
		test.add(32);
		test.add(38);
		test.add(8);
		
		//SEARCH

		System.out.print("\nThe item with value 35 is: "+test.search(35));
		
		//DELETE 
			//Leaves
		//test.delete(15);
		test.delete(38);

			//Fall 2
		test.delete(40);
		test.delete(30); //sollte gehen eigentlich
		
		test.delete(20);
		
		
	
		

	}

}
