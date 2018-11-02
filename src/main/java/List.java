import java.util.*;


public class List {
    /*
    private int nums [];
    private int size;
    */

    public void backwardsList(int n){
        ArrayList<Integer> backwards = new ArrayList<Integer>();
        for (int i = 0; i < n; i++)
        {
            backwards.add(n-i);
        }
        System.out.println("Backwards List" + backwards);
    }

    public void randomList(int size){
        ArrayList<Integer> random = new ArrayList<Integer>();
        for (int i = 0; i < size; ++i)
        random.add(i);

        System.out.println("Original List: " + random);
        Collections.shuffle(random);
        System.out.println("Shuffled List: " + random);
    }

    //This will not fill the list to the exact size of the list but to sizeParts *n < sizeList  TODO: Can be changed
    public void almostSort(int sizeList, int sizeParts){
        ArrayList<Integer> almostSort = new ArrayList<Integer>();
        int whereAt = 0;

        while (sizeList > sizeParts) {
            ArrayList<Integer> toAdd = new ArrayList<Integer>();

            for (int i = whereAt; i < whereAt + sizeParts; ++i) {
                toAdd.add(i);
            }

            System.out.println("Original List: " + toAdd);
            Collections.shuffle(toAdd);
            System.out.println("Original List: " + toAdd);
            almostSort.addAll(toAdd);
            whereAt +=sizeParts;
            System.out.println("Original List: " + almostSort);

        }
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

  void display() {
    for (int j = 0; j < nums.length; ++j)
      System.out.print(nums[j] + " ");

    System.out.print("\n");
  }
  */
}



