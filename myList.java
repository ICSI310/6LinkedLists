 public class MyList 
{  
  // Properties
  public Node head;
  public Node tail;
  public Node current;
  
  // Constructors
  public MyList() {
    //System.out.println("MyList: Default constructor");
    this.head = new Node();
    this.tail = head;
    this.current = head;
  }
  
  // Methods
  public void addToFront(Node newNode) {
    //System.out.println("MyList: addToFront");
    //this.head.debug();
    //newNode.debug();
     // just add to head of list for now
    newNode.setNext(this.head);
    this.head.setPrev(newNode);
    //newNode.debug();
    this.head = newNode; 
    //this.head.debug();
  }
  
  public void insert(int index, Node newNode) {
    System.out.println("insert: " + index);
    if (index == 0) {
      System.out.println("if index == 0");
      this.addToFront(newNode);
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
  
  public Node remove(int index){
    // make sure index is legal
    if (index < 0) {
      System.out.println("Index is less than 0.");
      return null;
    }
    // store the removed node
    Node removedNode = this.get(index);
    // make sure removed node exists
    if (removedNode == null) {
      System.out.println("Index is out of bounds.");
      return null;
    }
    // set the next of the previous to removedNodes's next
    removedNode.getPrev().setNext(removedNode.getNext());
    // set removedNode's next's prev to removedNode's previous
    removedNode.getNext().setPrev(removedNode.getPrev());
    // get the node before the node
    // Node tmp = this.get(index-1);
    // set the next from node before the index 
    // to the node after the index
    // tmp.setNext(tmp.getNext().getNext());
    // return removed node
    return removedNode;
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
    //System.out.println("MyList: print");
    System.out.print("forwards: ");
    this.current = this.head;
    //this.current.debug();
    while(null != this.current){
      //this.current.debug();
      //this.current.print();
      System.out.print(this.current.getData() + " ");
      this.current = this.current.getNext();
    }
    System.out.print("\n");
    System.out.print("backwards: ");
    this.current = this.tail;
    //this.current.debug();
    while(null != this.current){
      //this.current.debug();
      //this.current.print();
      System.out.print(this.current.getData() + " ");
      this.current = this.current.getPrev();
    }
  }
  
} // class myList
