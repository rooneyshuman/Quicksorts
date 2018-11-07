// Belén
public class Quicksort {

  public int partition(List list, int firstIndex, int lastIndex) {
    int pivot = list.getVal(lastIndex);
    int i = (firstIndex - 1);
    for (int j = firstIndex; j < lastIndex; ++j){
      if(list.getVal(j) <= pivot) {
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

  public void sort(List list, int firstIndex, int lastIndex) {
    if(firstIndex < lastIndex) {
      int partIndex = partition(list, firstIndex, lastIndex);
      sort(list, firstIndex, partIndex - 1);
      sort(list, partIndex + 1, lastIndex);
    }
  }

}
