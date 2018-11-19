
public class Main {
  public static void main(String[] args) {

    quickRunTest("almostSort1_1k.data", 10, "almostSort1_1kOutput.txt");

  }
  public static void quickRunTest(String listFileName, int numRuns, String outputFileName) {
    Timer timer = new Timer();
    Quicksort quick = new Quicksort();
    for (int i = 0; i < numRuns; ++i) {
      List test = new List(0);
      test.loadList(listFileName);
      timer.start();
      quick.sort(test, 0, test.getSize());
      timer.stop();
      timer.saveTime(outputFileName);
    }
  }

  public static void quickInsertRunTest(String listFileName, int numRuns, String outputFileName) {
    QuickInsert insert = new QuickInsert();
    Timer timer = new Timer();
    for (int i = 0; i < numRuns; ++i) {
      List test = new List(0);
      test.loadList(listFileName);
      timer.start();
      insert.sort(test, 0, test.getSize());
      timer.stop();
      timer.saveTime(outputFileName);
    }
  }
  public static void dualRunTest(String listFileName, int numRuns, String outputFileName) {
    Timer timer = new Timer();
    Quick3 dualPivot = new Quick3();
    for (int i = 0; i < numRuns; ++i) {
      List test = new List(0);
      test.loadList(listFileName);
      timer.start();
      dualPivot.sort(test, 0, test.getSize());
      timer.stop();
      timer.saveTime(outputFileName);
    }
  }

  public static void dualInsertRunTest(String listFileName, int numRuns, String outputFileName) {
    Timer timer = new Timer();
    Quick3Insert dualInsert = new Quick3Insert();
    for (int i = 0; i < numRuns; ++i) {
      List test = new List(0);
      test.loadList(listFileName);
      timer.start();
      dualInsert.sort(test, 0, test.getSize());
      timer.stop();
      timer.saveTime(outputFileName);
    }
  }
    //List almost2 = new List(listSize);
    //almost2.almostSort2();
   // almost2.display();
/*
    // Backwards list sorted with regular quicksort
    List backList = new List(listSize);
    backList.backwardsList();         //generate backwards list
    System.out.println("Backwards List - Unsorted");
    backList.display();
    timer.start();
    quick.sort(backList, 0, backList.getSize() - 1);
    timer.stop();
    System.out.println("Backwards List - Sorted with Quick");
    backList.display();
    System.out.print("Sorting time: ");
    System.out.println(timer.totalTime);
    System.out.println();
    timer.saveTime("backListQuick.txt");


    // Random list sorted with quickInsert
    List randomList = new List(listSize);
    randomList.randomList();        //generate random list
    System.out.println("Random List - Unsorted");
    randomList.display();
    timer.start();
    insert.sort(randomList, 0, randomList.getSize() - 1);
    timer.stop();
    System.out.println("Random List - Sorted with QuickInsert");
    randomList.display();
    System.out.print("Sorting time: ");
    System.out.println(timer.totalTime);
    System.out.println();
    timer.saveTime("randomListQuickInsert.txt");

    // Almost sorted list sorted with quickInsert
    List almostList = new List(listSize);
    almostList.almostSort1(4);       //generate almost sorted list
    System.out.println("Almost Sorted List - Unsorted");
    almostList.display();
    timer.start();
    insert.sort(almostList, 0, almostList.getSize() - 1);
    timer.stop();
    System.out.println("Almost Sorted List - Sorted with QuickInsert");
    almostList.display();
    System.out.print("Sorting time: ");
    System.out.println(timer.totalTime);
    System.out.println();
    timer.saveTime("almostSortedQuickInsert.txt");

    //Backwards list sorted with dual pivot quicksort
    List backList2 = new List(listSize);
    backList2.backwardsList();         //generate backwards list
    System.out.println("Backwards List - Unsorted");
    backList2.display();
    timer.start();
    dualPivot.sort(backList2, 0, backList2.getSize() - 1);
    timer.stop();
    System.out.println("Backwards List - Sorted with Dual Pivot");
    backList2.display();
    System.out.print("Sorting time: ");
    System.out.println(timer.totalTime);
    System.out.println();
    timer.saveTime("backListDualPivot.txt");

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
