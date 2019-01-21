package BinaryTreePackage;

public class BinaryTreeClass {

//Jede Node bekommt eine ID zugewiesen. Siehe Node Klasse
	public Node head = null;
	public Node tail = null;
	
	
	public void add(int value) //funktioniert
	{	
		if(head == null) { 	
            head = new Node(value);	
            System.out.print("New element with value "+value+" added.\n");
            return;
        }
		
	   Node node=head;
	 
	   while( node.getRight()!=null || 	node.getLeft()!=null)
	   {
	   		if(value > node.getValue())
	   		{
	   			if(node.getRight()==null) 
	   			{
	   				node.setRight(new Node(value)); 
	   				
	   				System.out.print("New element with value "+value+" added.\n");
	   				return;
	   			}
	   			node = node.getRight();
	   			
	   		}
	   	
	   		if(value < node.getValue())
	   		{
	   			if(node.getLeft()==null) 
	   			{
	   				node.setLeft(new Node(value)); 
	   				System.out.print("New element with value "+value+" added.\n");
	   				return;
	   			}
	   			node = node.getLeft();
	   		}
	   }
	    
	   if(node.getRight()==null && value>node.getValue()) {node.setRight(new Node(value));}
	   if(node.getLeft()==null && value<node.getValue()) {node.setLeft(new Node(value));}
	   
	  System.out.print("New element with value "+value+" added.\n");
	}
	
	
	public Node search(int value) 
	{		
		Node n=head;
	
		while(value != n.getValue()) 
		{
			if(value > n.getValue()) 
			{
				n=n.getRight();
			
			}
		
			if(value < n.getValue()) 
			{
				n=n.getLeft();
			}
		}
		
		return n;
	}
	
	
	public void delete(int value) 
	{
		Node n=search(value);
		Node nodeParent=searchParent(value);
		
		//1.Fall: Leave löschen
		if(n.getRight()==null && n.getLeft()==null) 
		{
			if(value>nodeParent.getValue()) 
			{
				nodeParent.setRight(null);
			}
			
			if(value<nodeParent.getValue()) 
			{
				nodeParent.setLeft(null);
			}
			
		System.out.print("\nLeave: Element with value="+value+" has been deleted.");	
		}
		
		//2.Fall: Wert mit einem Nachfolger
		
		if(n.getRight()!=null ^ n.getLeft()!=null) 
		{
			if(n.getRight()!=null && n.getLeft()==null) 
			{
				nodeParent.setRight(n.getRight());
				System.out.print("\nFall 2: Element with value="+value+" has been deleted.");

			}
			
			if(n.getLeft()!=null && n.getRight()==null) 
			{
				nodeParent.setLeft(n.getLeft());
				System.out.print("\nFall 2: Element with value="+value+" has been deleted.");

			}
		}	
		
		

	}
	
	
	public Node searchParent(int value) 
	{
		Boolean lel=true;
		Node n=head;
		
		while(true==lel) 
		{
			if(value > n.getValue()) 
			{
				if(n.getRight().getValue()==value) 
				{
					return n;
				}
				
				n=n.getRight();
			
			}
		
			if(value < n.getValue()) 
			{	
				if(n.getLeft().getValue()==value) 
				{
					return n;
				}
				n=n.getLeft();
			}
		}
			
		
		
		return n;
			
	}
}

