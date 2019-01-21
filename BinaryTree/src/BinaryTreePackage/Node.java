package BinaryTreePackage;
public class Node {

	private int id = 0;
    private int value;
    private Node right = null;
    private Node left=null;

    public Node(int value)
    {
        this.value=value;
        id++;
    }

    public int getId() 
    {
    	return this.id;
    }
    
    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getRight() {
    	
        return this.right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

  public Node getLeft() {
    	
        return this.left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }
    
 
}

