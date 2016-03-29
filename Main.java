// declare the class.
public class Main 
{
  // the main method
  public static void main(String[] args) {
    MyList list = new MyList();
    
    list.head.setData("0");
    list.addToFront(new Node("1"));
    list.addToFront(new Node("2"));
    list.addToFront(new Node("3"));
    /*list.print();
    list.get(2).print(); //thing1
    list.insert(2, new Node("thing4", null));
    list.get(2).print(); // thing4
    System.out.println("printing entire list:");
    list.print();*/
    list.print();
    list.remove(0);
    //System.out.println(list.remove(10));
    System.out.println("list after remove");
    list.print();
  }
  
} // class Main
