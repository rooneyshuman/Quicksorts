public class Quicksort extends QuickAbstract {

  public void sort(List list, int firstIndex, int lastIndex) {
    System.out.println("in sort");
    System.out.println(firstIndex);
    System.out.println(lastIndex);
    if (firstIndex < lastIndex) {
      System.out.println("in partition");
      int partIndex = partition(list, firstIndex, lastIndex);
      sort(list, firstIndex, partIndex - 1);
      sort(list, partIndex + 1, lastIndex);
    }
  }
}
