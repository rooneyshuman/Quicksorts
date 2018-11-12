
public class Main {
  public static void main(String[] args) {

    int listSize = 20;
    Quicksort quick = new Quicksort();
    QuickInsert insert = new QuickInsert();
    Quick3 dualPivot = new Quick3();
    long startTime, endTime, totalTime;

    // Backwards list sorted with regular quicksort
    List backList = new List(listSize);
    backList.backwardsList();         //generate backwards list
    System.out.println("Backwards List - Unsorted");
    backList.display();
    startTime = System.nanoTime();
    quick.sort(backList, 0, backList.getSize() - 1);
    endTime = System.nanoTime();
    System.out.println("Backwards List - Sorted with Quick");
    backList.display();
    System.out.print("Sorting time: ");
    totalTime = endTime - startTime;
    System.out.println(totalTime);
    System.out.println();

    // Random list sorted with quickinsert
    List randomList = new List(listSize);
    randomList.randomList();        //generate random list
    System.out.println("Random List - Unsorted");
    randomList.display();
    startTime = System.nanoTime();
    insert.sort(randomList, 0, randomList.getSize() - 1);
    endTime = System.nanoTime();
    System.out.println("Random List - Sorted with QuickInsert");
    randomList.display();
    System.out.print("Sorting time: ");
    totalTime = endTime - startTime;
    System.out.println(totalTime);
    System.out.println();

    // Almost sorted list sorted with regular quicksort
    List almostList = new List(listSize);
    almostList.almostSort(4);       //generate almost sorted list
    System.out.println("Almost Sorted List - Unsorted");
    almostList.display();
    startTime = System.nanoTime();
    insert.sort(almostList, 0, almostList.getSize() - 1);
    endTime = System.nanoTime();
    System.out.println("Almost Sorted List - Sorted with QuickInsert");
    almostList.display();
    System.out.print("Sorting time: ");
    totalTime = endTime - startTime;
    System.out.println(totalTime);
    System.out.println();

    //Backwards list sorted with dual pivot quicksort
    List backList2 = new List(listSize);
    backList2.backwardsList();         //generate backwards list
    System.out.println("Backwards List - Unsorted");
    backList2.display();
    startTime = System.nanoTime();
    dualPivot.sort(backList2, 0, backList2.getSize() - 1);
    endTime = System.nanoTime();
    System.out.println("Backwards List - Sorted with Dual Pivot");
    backList2.display();
    System.out.print("Sorting time: ");
    totalTime = endTime - startTime;
    System.out.println(totalTime);
    System.out.println();

    backList.saveList("backwardsArray.data");

    List testList = new List(listSize);
    testList.loadList("backwardsArray.data");
    System.out.println("Loaded Backwards List");
    testList.display();

    Integer[] myArray = testList.convertToArray();

/*
    List randomList = new List(listSize);
    randomList.randomList();
    randomList.display();

    List almostList = new List(listSize);
    almostList.almostSort(4);
    almostList.display();

    */

  }
}
