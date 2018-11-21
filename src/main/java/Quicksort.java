public class Quicksort extends QuickAbstract {

  Quicksort() {
    super();
  }

  public void sort(List list, int firstIndex, int lastIndex) {
    if (firstIndex < lastIndex) {
      int partIndex = partition(list, firstIndex, lastIndex);
      sort(list, firstIndex, partIndex - 1);
      sort(list, partIndex + 1, lastIndex);
    }
  }
}
