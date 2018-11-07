public class Main {

  public static void main(String[] args) {

    int listSize = 20;
    Quicksort quick = new Quicksort();

    List backList = new List(listSize);
    backList.backwardsList();
    System.out.println("Backwards List - Unsorted");
    backList.display();

    quick.sort(backList,0, backList.getSize() - 1);
    System.out.println("Backwards List - Sorted");
    backList.display();
    System.out.println();

    List randomList = new List(listSize);
    randomList.randomList();
    System.out.println("Random List - Unsorted");
    randomList.display();
    quick.sort(backList,0, randomList.getSize() - 1);
    System.out.println("Random List - Sorted");
    backList.display();
    System.out.println();

    List almostList = new List(listSize);
    almostList.almostSort(4);
    System.out.println("Almost Sorted List - Unsorted");
    almostList.display();
    quick.sort(almostList, 0, almostList.getSize() - 1);
    System.out.println("Almost Sorted List - Sorted");
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
