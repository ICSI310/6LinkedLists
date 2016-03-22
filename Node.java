 
public class Node 
{  
  // Properties
  public String data;
  public Node next;
    
  // Constructors
  public Node() {
    //System.out.println("Node: Default Constructor");
    this.data = "";
    this.next = null;
  }
   
  public Node(String newData, Node newNext) {
    //System.out.println("Node: Constructor");
    this.data = newData;
    this.next = newNext;
  }
  
  // Getters/Setters
  public Node getNext() {
    //System.out.println("Node: getNext");
    return this.next;
  }
  
  public void setNext(Node newNext) {
    //System.out.println("Node setNext");
    this.next = newNext;
  }
  
  public String getData() {
    //System.out.println("Node: getData");
    return this.data;
  }
  
  public void setData(String newData) {
    //System.out.println("Node: setData");
    this.data = newData;
  }
  
  // Methods
  public void debug() {
    System.out.println( "Node " + this + " Data " + this.data + " Next " + this.next);
  }
  
  public void print() {
    System.out.println(this.data);
  }
  
  
} // class Node
