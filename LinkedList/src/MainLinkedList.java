
public class MainLinkedList {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
        ll.add(4);
        ll.add(8);
        ll.add(2);
        ll.add(1);
        ll.add(100);

       ListeAusgabe(ll);
        
        ll.delete(4);
        //System.out.print(ll.getValue(2)+"\n");

        ListeAusgabe(ll);
        

	}
	
	public static void ListeAusgabe(LinkedList liste) 
	{
		System.out.print("Listenausgabe: ");
		
		 for(int i=0;i<liste.getSize();i++) 
	        {
			 	
	        	System.out.print(liste.getValue(i)+" ");
	        }
		 
		 System.out.print("\n");
	}

}
