// declare the class.
public class Main 
{
  // the main method
  public static void main(String[] args) {
    MyList list = new MyList();
    
    list.add(new Node("thing1", null));
    list.add(new Node("thing2", null));
    list.add(new Node("thing3", null));
    
    list.print();
  }
  
} // class Main
