public class QuickInsert extends QuickAbstract {

  public void sort(List list, int firstIndex, int lastIndex) {
    if (firstIndex < lastIndex) {
      if ((lastIndex - firstIndex) < 5) {//TODO: make this constant a global or pass in argument
        insertionSort(list, firstIndex, lastIndex + 1);    // Run insertion TODO: do i need to do a +s?
      } else {
        int partIndex = partition(list, firstIndex, lastIndex);
        sort(list, firstIndex, partIndex - 1);
        sort(list, partIndex + 1, lastIndex);
      }
    }
  }

  public void randomSort(List list, int firstIndex, int lastIndex) {
    if (firstIndex < lastIndex) {
      if ((lastIndex - firstIndex) < 5) {
        insertionSort(list, firstIndex, lastIndex + 1);
      } else {
        int partIndex = randomPartition(list, firstIndex, lastIndex);
        randomSort(list, firstIndex, partIndex - 1);
        randomSort(list, partIndex + 1, lastIndex);
      }
    }
  }
}
