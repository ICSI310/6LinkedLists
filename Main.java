// declare the class.
public class Main 
{
  // the main method
  public static void main(String[] args) {
    MyList list = new MyList();
    
    
    list.head.setData("0");
    list.enqueue(new Node("1"));
    list.enqueue(new Node("2"));
    list.enqueue(new Node("3"));
    //list.dequeue().print();
    //list.dequeue().print();
    //list.dequeueAll();
    list.popAll();
    /*list.print();
    list.get(2).print(); //thing1
    list.insert(2, new Node("thing4", null));
    list.get(2).print(); // thing4
    System.out.println("printing entire list:");
    list.print();*/
    //list.print();
    //list.remove(2);
    //list.insert(4, new Node("4"));
    //System.out.println(list.remove(10));
    //System.out.println("list after remove");
    //list.print();
  }
  
  
  
} // class Main
