// declare the class.
public class Main 
{
  // the main method
  public static void main(String[] args) {
    MyList list = new MyList();
    
    list.head.setData("thing0");
    list.addToFront(new Node("thing1", null));
    list.addToFront(new Node("thing2", null));
    list.addToFront(new Node("thing3", null));
    /*list.print();
    list.get(2).print(); //thing1
    list.insert(2, new Node("thing4", null));
    list.get(2).print(); // thing4
    System.out.println("printing entire list:");
    list.print();*/
    list.remove(2).print();
    System.out.println("list after remove");
    list.print();
  }
  
} // class Main
