
public class Quicksort {

  public static void main(String [] args) {

    int listSize = 20;

    List randomList = new List(listSize);
    randomList.generateRandom();
    randomList.display();

    List reverseList = new List(listSize);
    reverseList.generateReverse();
    reverseList.display();

  }
}
