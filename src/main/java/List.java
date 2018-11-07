import java.util.*;
import java.io.*;

public class List {
  private ArrayList<Integer> theList;
  private int size;

  public List(int size) {
    this.size = size;
    theList = new ArrayList<>();
  }

  public int getVal(int index) {
    return theList.get(index);
  }

  public int getSize() {
    return size;
  }

  public void setVal(int index, int newVal) {
    theList.set(index, newVal);
  }

  public void backwardsList() {
    for (int i = 0; i < this.size; i++) {
      theList.add(this.size - i);
    }
  }

  public void randomList() {
    for (int i = 0; i < this.size; ++i)
      theList.add(i);

    Collections.shuffle(theList);
  }

  //This will not fill the list to the exact size of the list but to sizeParts *n < sizeList  TODO: Can be changed
  public void almostSort(int sizeParts) {
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
}



