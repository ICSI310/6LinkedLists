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
     // just add to head of list for now
    newNode.setNext(this.head);
    newNode.debug();
    this.head = newNode; 
    this.head.debug();
  }
  
  public void insert(int index, Node newNode) {
    if (index == 0) this.add(newNode);
    else{
      // traverse to new node
      // set newnode's next
      newNode.setNext(????);
      // set node before newnode's next to newnode
    } 
  }
  
  public Node get(int index) {
    this.current = this.head;
    // how do we fix this so it stops at index?
    // add a counter?
    while(null != this.current){
      this.current = this.current.getNext();
    }
    return(this.current);
  }
  
  // traverses and prints
  public void print() {
    System.out.println("MyList: print");
    this.current = this.head;
    this.current.debug();
    while(null != this.current){
      this.current.debug();
      this.current.print();
      this.current = this.current.getNext();
    }
  }
  
} // class myList
