import java.util.*;
import java.io.*;



public class List {
    private ArrayList<Integer> theList;
    int size;
    int nums[];

    public List(int size){
        this.size = size;
        this.nums = new int[size];
        theList = new ArrayList<Integer>();
    }

    public void backwardsList(){
        for (int i = 0; i < this.size; i++)
        {
            theList.add(this.size-i);
        }
    }

    public void randomList(){
        for (int i = 0; i < this.size; ++i)
        theList.add(i);

        Collections.shuffle(theList);
    }

    //This will not fill the list to the exact size of the list but to sizeParts *n < sizeList  TODO: Can be changed
    public void almostSort(int sizeParts){
        int whereAt = 0;

        while (this.size > whereAt) {
            ArrayList<Integer> toAdd = new ArrayList<Integer>();

            for (int i = whereAt; i < whereAt + sizeParts; ++i) {
                toAdd.add(i);
            }

            Collections.shuffle(toAdd);
            theList.addAll(toAdd);
            whereAt +=sizeParts;
        }
    }

    public void loadList(String fileName){
        try {
            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);
            theList = (ArrayList) ois.readObject();
            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Integer[] convertToArray(){
        Integer toSort[] = new Integer[theList.size()];
        return theList.toArray(toSort);
    }

    public void saveList(String fileName){
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


/*
  public List(int size){
    this.size = size;
    this.nums = new int[size];
  }

  void generateRandom(){
    Random rand = new Random();
    for(int i =0; i < size; ++i) {
      int rand_num = rand.nextInt(100);
      nums[i] = rand_num;
    }
  }

  void generateReverse(){
    for (int i = 0; i < size; ++i) {
      nums[i] = size - i;
    }
  }

  */
}



