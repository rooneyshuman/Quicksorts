public class QuickInsert extends QuickAbstract {

  QuickInsert() {
    super();
  }

  public void sort(List list, int firstIndex, int lastIndex) {
    if (firstIndex < lastIndex) {
      if ((lastIndex - firstIndex) < 5) {
        insertionSort(list, firstIndex, lastIndex + 1);    // Run insertion
      } else {
        int partIndex = partition(list, firstIndex, lastIndex);
        sort(list, firstIndex, partIndex - 1);
        sort(list, partIndex + 1, lastIndex);
      }
    }
  }
}

