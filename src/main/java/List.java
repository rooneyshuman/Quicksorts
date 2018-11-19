import java.util.*;
import java.io.*;

public class List {
  private ArrayList<Integer> theList;
  private int size;

  List(int size) {
    this.size = size;
    theList = new ArrayList<>();
  }

  int getSize(){
    return this.size;   //TODO: need to check that the functions aren't expecting this to be +1'
  }

  int getVal(int index) {
    return theList.get(index);
  }

  ArrayList<Integer> getList () {
    return theList;
  }

  void setVal(int index, int newVal) {
    theList.set(index, newVal);
  }

  void backwardsList() {
    for (int i = 0; i < this.size; ++i) {
      theList.add(this.size - i);
    }
  }

  void randomList() {
    for (int i = 1; i < this.size + 1; ++i)
      theList.add(i);

    Collections.shuffle(theList);
  }

  //This will not fill the list to the exact size of the list but to sizeParts *n < sizeList  TODO: Can be changed
  void almostSort1(int sizeParts) {
    int whereAt = 1;

    while (this.size > whereAt) {
      ArrayList<Integer> toAdd = new ArrayList<>();

      for (int i = whereAt; i < whereAt + sizeParts; ++i) {
        toAdd.add(i);
      }

      Collections.shuffle(toAdd);
      theList.addAll(toAdd);
      whereAt += sizeParts;
    }
  }

  // Almost sorted except for 5 swapped items
  void almostSort2() {
    for (int i = 1; i < this.size + 1; ++i)
      theList.add(i);

    int index1, index2, temp;
    Random rn = new Random();

    for (int j = 0; j < 5; ++j) {
      // Randomize indices of items to swap
      index1 = rn.nextInt(size - 1);
      index2 = rn.nextInt(size - 1);
      // Swap items
      temp = theList.get(index1);
      theList.set(index1, theList.get(index2));
      theList.set(index2, temp);
    }
  }


  void multiList(int multiNum) {//multiNum is the number of repeats expected.
    for (int i = 1; i < this.size + 1; ++i) {
      for (int j = 0; j < multiNum; ++j) {
        theList.add(i);
      }
    }
    Collections.shuffle(theList);
  }

  public void loadList(String fileName) {
    try {
      FileInputStream fis = new FileInputStream(fileName);
      ObjectInputStream ois = new ObjectInputStream(fis);
      theList = (ArrayList) ois.readObject();
      ois.close();
    } catch (IOException | ClassNotFoundException e) {
      e.printStackTrace();
    }
  }

  public Integer[] convertToArray() {
    Integer toSort[] = new Integer[theList.size()];
    return theList.toArray(toSort);
  }

  public void saveList(String fileName) {
    try {
      FileOutputStream fos = new FileOutputStream(fileName);
      ObjectOutputStream oos = new ObjectOutputStream(fos);
      oos.writeObject(theList);
      oos.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  void display() {
    System.out.println("List: " + theList);
  }


  public static void main(String[] args) {
    int listSize;

    /* BACKLIST GENERATIONS */

    // Backlist 1k
    listSize = 1000;
    List backList_1k = new List(listSize);
    backList_1k.backwardsList();
    backList_1k.display();
    backList_1k.saveList("backList_1k.data");

    // Backlist 10k
    listSize *= 10;
    List backList_10k = new List(listSize);
    backList_10k.backwardsList();
    backList_10k.display();
    backList_10k.saveList("backList_10k.data");

    // Backlist 100k
    listSize *= 10;
    List backList_100k = new List(listSize);
    backList_100k.backwardsList();
    backList_100k.display();
    backList_100k.saveList("backList_100k.data");

    // Backlist 1m
    listSize *= 10;
    List backList_1m = new List(listSize);
    backList_1m.backwardsList();
    backList_1m.display();
    backList_1m.saveList("backList_1m.data");


    /* RANDOM GENERATIONS */

    // Random 1k
    listSize = 1000;
    List random_1k = new List(listSize);
    random_1k.randomList();
    random_1k.display();
    random_1k.saveList("random_1k.data");

    // Random 10k
    listSize *= 10;
    List random_10k = new List(listSize);
    random_10k.randomList();
    random_10k.display();
    random_10k.saveList("random_10k.data");

    // Random 100k
    listSize *= 10;
    List random_100k = new List(listSize);
    random_100k.randomList();
    random_100k.display();
    random_100k.saveList("random_100k.data");

    // Random 1m
    listSize *= 10;
    List random_1m = new List(listSize);
    random_1m.randomList();
    random_1m.display();
    random_1m.saveList("random_1m.data");


    /* ALMOST SORT 1 GENERATIONS */

    // AlmostSort1 1k
    listSize = 1000;
    List almostSort1_1k = new List(listSize);
    almostSort1_1k.almostSort1(4);
    almostSort1_1k.display();
    almostSort1_1k.saveList("almostSort1_1k.data");

    // AlmostSort1 10k
    listSize *= 10;
    List almostSort1_10k = new List(listSize);
    almostSort1_10k.almostSort1(4);
    almostSort1_10k.display();
    almostSort1_10k.saveList("almostSort1_10k.data");

    // AlmostSort1 100k
    listSize *= 10;
    List almostSort1_100k = new List(listSize);
    almostSort1_100k.almostSort1(4);
    almostSort1_100k.display();
    almostSort1_100k.saveList("almostSort1_100k.data");

    // AlmostSort1 1m
    listSize *= 10;
    List almostSort1_1m = new List(listSize);
    almostSort1_1m.almostSort1(4);
    almostSort1_1m.display();
    almostSort1_1m.saveList("almostSort1_1m.data");


    /* ALMOST SORT 2 GENERATIONS */

    // AlmostSort2 1k
    listSize = 1000;
    List almostSort2_1k = new List(listSize);
    almostSort2_1k.almostSort2();
    almostSort2_1k.display();
    almostSort2_1k.saveList("almostSort2_1k.data");

    // AlmostSort2 10k
    listSize *= 10;
    List almostSort2_10k = new List(listSize);
    almostSort2_10k.almostSort2();
    almostSort2_10k.display();
    almostSort2_10k.saveList("almostSort2_10k.data");

    // AlmostSort2 100k
    listSize *= 10;
    List almostSort2_100k = new List(listSize);
    almostSort2_100k.almostSort2();
    almostSort2_100k.display();
    almostSort2_100k.saveList("almostSort2_100k.data");

    // AlmostSort2 1m
    listSize *= 10;
    List almostSort2_1m = new List(listSize);
    almostSort2_1m.almostSort2();
    almostSort2_1m.display();
    almostSort2_1m.saveList("almostSort2_1m.data");
  }
}



