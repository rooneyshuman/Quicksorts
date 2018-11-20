public abstract class QuickAbstract {

  // Used by QuickInsert, Quicksort
  int partition(List list, int firstIndex, int lastIndex) {
    int pivot = list.getVal(lastIndex);
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

  //Takes in a list and swaps with a random pivot between indices, then calls the partition function.
  int randomPartition(List list, int firstIndex, int lastIndex){
    int randomPivot = firstIndex + (int)(Math.random() * ((lastIndex - firstIndex) + 1));
    swap(list, randomPivot, lastIndex);
    return (partition(list, firstIndex, lastIndex));
  }

  // Used by Quick3 and Quick3Insert and Quicksort
  public void swap(List list, int i, int j) {
    int temp = list.getVal(i);
    list.setVal(i, list.getVal(j));
    list.setVal(j, temp);
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
