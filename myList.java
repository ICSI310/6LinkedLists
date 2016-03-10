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
    this.head.debug();
    newNode.debug();
    //System.out.println("newNode: " + newNode + " Data: " + newNode.getData());
    //System.out.println("head: " + this.head + " Data: " + newNode.getData());
    // just add to head of list for now
    newNode.setNext(this.head);
    newNode.debug();
    this.head = newNode; 
    this.head.debug();
  }
  
  // traverses and prints
  public void print() {
    System.out.println("MyList: print");
    this.current = this.head;
    this.current.debug();
    while(null != this.current.getNext()) {
      this.current.debug();
      this.current.print();
      this.current = this.current.getNext();
    }
  }
  
} // class myList
