
public class LinkedList {
	static int size=0;
    private Node head = null; //Zeiger auf erstes Element

    public void add(int value){
        size++;
    	Node node = new Node(value); //neues Node (Speicher) wird erstellt.
        
        //List empty
        if(head == null) { 	//wenn Pointer auf nichts zeigt (erster Aufruf von add() )
            head = node;	//soll sie auf das neu erstellte, erste Node zeigen
            return;
        }

        Node tmp = head; //zweiter Pointer tmp, zeigt auf dasselbe Element wie head
        while (tmp.getNext()!=null) 
        {
            tmp = tmp.getNext();
          
        }
        
        tmp.setNext(node);
    }

   
    public int getValue(int index)
    {
        int i = 0;

        Node temp = head;
        while(temp.getNext()!= null && i!=index)
        {
            i++;
            temp=temp.getNext();
        }
        
        return temp.getValue();
    }
    
    
    public void delete(int index) 
    {
    	int i; 			//an diesem Index stoppt Programm
    	
    	Node temp=head; 	//von Beginn der Liste
    	for(i=0;i<=index-1;i++)
    	{
    		temp=temp.getNext(); //solange Index nicht erreicht,tmp nach nächstem Ziel ausrichten
    		//System.out.print(temp.getValue());
    	}
    	
   
    	if(index==0) {head=temp.getNext();}
    	if(index==this.getSize()-1) {temp.setNext(null);}
    	else {temp.setNext(temp.getNext().getNext());}
    	size--;
    		
    }
    
    public int getSize() 
    {
    	return size;
    }


}
