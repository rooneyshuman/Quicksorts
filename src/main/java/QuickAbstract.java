import java.util.Random;
public abstract class QuickAbstract {
   private Random rand = new Random();
  // Used by QuickInsert, Quicksort
  int partition(List list, int firstIndex, int lastIndex) {
    int randomNum = rand.nextInt((lastIndex-firstIndex) + 1) + firstIndex;
    System.out.println(randomNum);

    int pivot = list.getVal(randomNum);
    int i = (firstIndex - 1);

    for (int j = firstIndex; j < lastIndex; ++j) {
      if (list.getVal(j) <= pivot) {
        ++i;
        int temp = list.getVal(i);
        list.setVal(i, list.getVal(j));
        list.setVal(j, temp);
      }
    }

    int temp = list.getVal(i + 1);
    list.setVal(i + 1, list.getVal(lastIndex));
    list.setVal(lastIndex, temp);

    return i + 1;
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
