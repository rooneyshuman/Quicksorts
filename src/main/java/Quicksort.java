public class Quicksort extends QuickAbstract {

  public void sort(List list, int firstIndex, int lastIndex) {
    if (firstIndex < lastIndex) {
      int partIndex = partition(list, firstIndex, lastIndex);
      sort(list, firstIndex, partIndex - 1);
      sort(list, partIndex + 1, lastIndex);
    }
  }

  //Sorts with random pivots generated between indices
  public void randomSort(List list, int firstIndex, int lastIndex){
    if (firstIndex < lastIndex){
        int partIndex = randomPartition(list, firstIndex, lastIndex);
        randomSort(list, firstIndex, partIndex - 1);
        randomSort(list, partIndex + 1, lastIndex);
    }

  }
}
