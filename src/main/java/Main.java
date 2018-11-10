import java.util.Date;

public class Main {

  public static void main(String[] args) {

    int listSize = 20;
    Quicksort quick = new Quicksort();
    QuickInsert insert = new QuickInsert();
    Date date = new Date();

    // Backwards list sorted with regular quicksort
    List backList = new List(listSize);
    backList.backwardsList();         //generate backwards list
    System.out.println("Backwards List - Unsorted");
    backList.display();

    long start = date.getTime();
    quick.sort(backList,0, backList.getSize() - 1);
    long end = date.getTime();
    System.out.println("Backwards List - Sorted");
    System.out.println("Backwards List end - start");
    long total = end - start;
    System.out.println(total);
    backList.display();
    System.out.println();

    // Random list sorted with quickinsert
    List randomList = new List(listSize);
    randomList.randomList();        //generate random list
    System.out.println("Random List - Unsorted");
    randomList.display();
    insert.sort(randomList,0, randomList.getSize() - 1);
    System.out.println("Insert Random List - Sorted");
    randomList.display();
    System.out.println();

    // Almost sorted list sorted with regular quicksort
    List almostList = new List(listSize);
    almostList.almostSort(4);       //generate almost sorted list
    System.out.println("Almost Sorted List - Unsorted");
    almostList.display();
    insert.sort(almostList, 0, almostList.getSize() - 1);
    System.out.println("Insert Almost Sorted List - Sorted");
    almostList.display();
    System.out.println();

    /*

    backList.saveList("backwardsArray.data");

    List testList = new List(listSize);
    testList.loadList("backwardsArray.data");
    testList.display();

    Integer[] myArray = testList.convertToArray();


    List randomList = new List(listSize);
    randomList.randomList();
    randomList.display();

    List almostList = new List(listSize);
    almostList.almostSort(4);
    almostList.display();*/

  }
}
