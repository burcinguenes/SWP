
public class LinkedList {
	
	static int size=0;
    private Node head = null; 

    public void add(int value){
        size++;
    	Node node = new Node(value); 
        
        //List empty
        if(head == null) { 	
            head = node;	
            return;
        }

        Node tmp = head; 
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
    	int i; 			
    	
    	Node temp=head; 	
    	for(i=0;i<=index-1;i++)
    	{
    		temp=temp.getNext(); 
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
