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
  }
  
} // class Main
