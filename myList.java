 public class MyList 
{  
  // Properties
  public Node head;
  public Node current;
  
  // Constructors
  public MyList() {
    //System.out.println("MyList: Default constructor");
    this.head = new Node();
    this.current = head;
  }
  
  // Methods
  public void add(Node newNode) {
    //System.out.println("MyList: add");
    this.head.debug();
    newNode.debug();
     // just add to head of list for now
    newNode.setNext(this.head);
    newNode.debug();
    this.head = newNode; 
    this.head.debug();
  }
  
  public void insert(int index, Node newNode) {
    System.out.println("insert: " + index);
    if (index == 0) {
      System.out.println("if index == 0");
      this.add(newNode);
    }
    else{
      System.out.println("else");
      // traverse to new node
      this.current = this.get(index-1); 
      System.out.println("got index: " + this.current);
      // set newnode's next
      newNode.setNext(current.getNext()); // shouldn't be self
      this.current.setNext(newNode);
      System.out.println("set newNode");
      // set node before newnode's next to newnode
    } 
  }
  
  public Node get(int index) {
    //System.out.println("get: " + index);
    this.current = this.head;
    //System.out.println("current: " + this.current);
    int counter = 0;
    while(null != this.current){
      //System.out.println("counter: " + counter);
      if (counter == index) break;
      this.current = this.current.getNext();
      counter++;
      //System.out.println("current: " + this.current);
    }
    //System.out.println("Traversal finished");
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
