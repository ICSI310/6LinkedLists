 public class MyList 
{  
  // Properties
  public Node head;
  public Node current;
  
  // Constructors
  public MyList() {
    this.head = new Node();
    this.current = head;
  }
  
  // Methods
  public void add(Node newNode) {
    // just add to head of list for now
    newNode.setNext(this.head.getNext());
    this.head = newNode;  
  }
  
  public void print() {
    while(null != this.current.getNext()) {
      this.current.print();
      this.current = this.current.getNext();
    }
  }
  
} // class myList
