// Jenn
public class QuickInsert extends QuickAbstract {

  public void sort(List list, int firstIndex, int lastIndex) {
    if(firstIndex < lastIndex) {
      if((lastIndex - firstIndex) < 5)
        insertionSort();    // Run insertion
      else {
        int partIndex = partition(list, firstIndex, lastIndex);
        sort(list, firstIndex, partIndex - 1);
        sort(list, partIndex + 1, lastIndex);
      }
    }
  }

  private void insertionSort(){
    // TO IMPLEMENT
  }
}
