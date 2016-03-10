 
public class Node 
{  
  // Properties
  public String data;
  public Node next;
    
  // Constructors
  public Node() {
    this.data = "";
    this.next = null;
  }
   
  public Node(String newData, Node newNext) {
    this.data = data;
    this.next = newNext;
  }
  
  // Getters/Setters
  public Node getNext() {
    return this.next;
  }
  
  public void setNext(Node newNext) {
    this.next = newNext;
  }
  
  public String getData() {
    return this.data;
  }
  
  public void setData(String newData) {
    this.data = newData;
  }
  
  // Methods
  
  
} // class Node
