import java.util.Random;

public abstract class QuickAbstract {
  protected Random rand;

  QuickAbstract() {
    rand = new Random();
  }

  int partition(List list, int firstIndex, int lastIndex) {
    int pivIndex = rand.nextInt((lastIndex - firstIndex) + 1) + firstIndex;

    int temp = list.getVal(pivIndex);
    list.setVal(pivIndex, list.getVal(lastIndex));
    list.setVal(lastIndex, temp);

    int pivot = list.getVal(lastIndex);
    int i = (firstIndex - 1);

    for (int j = firstIndex; j < lastIndex; ++j) {
      if (list.getVal(j) <= pivot) {
        ++i;
        swap(list, i, j);
      }
    }

    swap(list, i + 1, lastIndex);

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

  // Used by all derived classes
  public void swap(List list, int i, int j) {
    int temp = list.getVal(i);
    list.setVal(i, list.getVal(j));
    list.setVal(j, temp);
  }

  // Implemented by all derived classes
  public abstract void sort(List list, int first, int last);
}
