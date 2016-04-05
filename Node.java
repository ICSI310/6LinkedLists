 
public class Node 
{  
  // Properties
  //public String data;
  // Option 1: make a hero class
  //private Hero hero;
  // Option 2: put the data from the hero class in the node
  //private String heroName;
  //private int nemesis;
  //private double time;
  public Node next;
  public Node prev;
    
  // Constructors
  public Node() {
    //System.out.println("Node: Default Constructor");
    this.data = "";
    this.next = null;
    this.prev = null;
  }
  
  public Node(String newData) {
    this.data = newData;
    this.next = null;
    this.prev = null;
  }
  
  public Node(String newData, Node newNext, Node newPrev) {
    //System.out.println("Node: Constructor");
    this.data = newData;
    this.next = newNext;
    this.prev = newPrev;
  }
  
  // Getters/Setters
  public Node getNext() {
    //System.out.println("Node: getNext");
    return this.next;
  }
  
  public Node getPrev() {
    //System.out.println("Node: getNext");
    return this.prev;
  }
  
  public void setNext(Node newNext) {
    //System.out.println("Node setNext");
    this.next = newNext;
  }
  
  public void setPrev(Node newPrev) {
    //System.out.println("Node setNext");
    this.prev = newPrev;
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
    System.out.println( "Node " + this + " Data " + this.data + " Next " + this.next + " Prev " + this.prev);
  }
  
  public void print() {
    System.out.println(this.data);
  }
  
  
} // class Node
