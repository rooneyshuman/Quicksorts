import java.util.Random;
public abstract class QuickAbstract {
   private Random rand = new Random();
  // Used by QuickInsert, Quicksort
  int partition(List list, int firstIndex, int lastIndex) {
    int randomNum = rand.nextInt((lastIndex-firstIndex) + 1) + firstIndex;
    //int randomNum = lastIndex;
    int temp = list.getVal(lastIndex);
    list.setVal(lastIndex, list.getVal(randomNum));
    list.setVal(randomNum, temp);

    randomNum = lastIndex;

    int pivot = list.getVal(randomNum);
    int i = firstIndex -1;

    for (int j = firstIndex; j < lastIndex; ++j) {
      if (list.getVal(j) < pivot) {
        if(i != j) {
          i++;
          temp = list.getVal(i);
          list.setVal(i, list.getVal(j));
          list.setVal(j, temp);
        }
      }
    }

    i++;
    temp = list.getVal(i);
    list.setVal(i, list.getVal(randomNum));
    list.setVal(randomNum, temp);

    return i;
  }

  // Used by Quick3Insert and QuickInsert
  public void insertionSort(List list, int firstIndex, int lastIndex) {
    for (int x = firstIndex + 1; x < lastIndex; ++x) {
      int value = list.getVal(x);
      int j = x - 1;
      while (j >= 0 && value < list.getVal(j)) {
        list.setVal(j + 1, list.getVal(j));
        --j;
      }
      list.setVal(j + 1, value);
    }
  }

  // Implemented by all derived classes
  public abstract void sort(List list, int first, int last);
}
