 public class MyList 
{  
  // Properties
  public Node head;
  public Node current;
  
  // Constructors
  public MyList() {
    System.out.println("MyList: Default constructor");
    this.head = new Node();
    this.current = head;
  }
  
  // Methods
  public void add(Node newNode) {
    System.out.println("MyList: add");
    // just add to head of list for now
    newNode.setNext(this.head.getNext());
    this.head = newNode;  
  }
  
  public void print() {
    System.out.println("MyList: print");
    while(null != this.current.getNext()) {
      this.current.print();
      this.current = this.current.getNext();
    }
  }
  
} // class myList
