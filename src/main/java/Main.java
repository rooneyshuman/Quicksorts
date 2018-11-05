public class Main {

  public static void main(String[] args) {

    int listSize = 20;

    List backList = new List(listSize);
    backList.backwardsList();
    backList.display();

    Quicksort quick = new Quicksort(backList);
    quick.sortList();

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
    almostList.display();

  }
}
