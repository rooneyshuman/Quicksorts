// Jenn
public class QuickInsert extends QuickAbstract {

  public void sort(List list, int firstIndex, int lastIndex) {
    if(firstIndex < lastIndex) {
      if((lastIndex - firstIndex) < 5) {//TODO: make this constant a global or pass in argument
        insertionSort(list, firstIndex, lastIndex + 1);    // Run insertion TODO: do i need to do a +s?
      }
      else {
        int partIndex = partition(list, firstIndex, lastIndex);
        sort(list, firstIndex, partIndex - 1);
        sort(list, partIndex + 1, lastIndex);
      }
    }
  }

  private void insertionSort(List list, int firstIndex, int lastIndex){
    for (int x = firstIndex +1; x < lastIndex; ++x){
      int value = list.getVal(x);
      int j = x-1;
      while (j >= 0 && value < list.getVal(j)){
        list.setVal(j + 1, list.getVal(j));
        --j;
      }
      list.setVal(j + 1, value);
    }
  }
}

