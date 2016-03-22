// declare the class.
public class Main 
{
  // the main method
  public static void main(String[] args) {
    MyList list = new MyList();
    
    list.head.setData("thing0");
    list.add(new Node("thing1", null));
    list.add(new Node("thing2", null));
    list.add(new Node("thing3", null));
    System.out.println(
                       list.head.getData() + " " +
                       list.head.getNext().getData()+ " " +
                       list.head.getNext().getNext().getData()+ " " +
                       list.head.getNext().getNext().getNext().getData()
                       );

    list.print();
    list.get(2).print(); //thing1
    list.insert(2, new Node("thing4", null));
    list.get(2).print(); // thing4
  }
  
} // class Main
