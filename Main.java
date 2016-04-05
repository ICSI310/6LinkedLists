import java.io.*;
import java.util.Scanner;

// declare the class.
public class Main 
{
  // the main method
  public static void main(String[] args) throws IOException{
    MyList list = new MyList();
    int sharks = 0;
    Scanner input = null;

        try {
            input = new Scanner(new BufferedReader(new FileReader("heroList.txt")));
            // assume first line is number of sharks (int)
            sharks = input.nextInt();
            System.out.println("sharks = " + sharks);
            while (input.hasNext()) {// find out if there's another hero
                String heroName = input.next();
                int nemesis = input.nextInt();
                double timeToArrive = input.nextDouble();
                Node tmp = new Node(heroName, nemesis, timeToArrive);
                list.enqueue(tmp);
            }
        } finally {
            if (input != null) {
                input.close();
            }
        }
        list.dequeueAll();
    
    
    /*list.head.setData("0");
    list.enqueue(new Node("1"));
    list.enqueue(new Node("2"));
    list.enqueue(new Node("3"));*/
    //list.dequeue().print();
    //list.dequeue().print();
    //list.dequeueAll();
    //list.popAll();
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
