// Jenn
public class QuickInsert extends QuickAbstract {

  public void sort(List list, int firstIndex, int lastIndex) {
 //   System.out.println("first index");
 //   System.out.println(firstIndex);
 //   System.out.println("last index");
//    System.out.println(lastIndex);
    if(firstIndex < lastIndex) {
      if((lastIndex - firstIndex) < 5) {//TODO: make this constant a global or pass in argument
 //       System.out.println("Test Random List - Sending to Insertion Sort");
        list.display();
        insertionSort(list, firstIndex, lastIndex + 1);    // Run insertion TODO: do i need to do a +s?
      }
      else {
        int partIndex = partition(list, firstIndex, lastIndex);
        sort(list, firstIndex, partIndex - 1);
  //      System.out.println("Test Random List - After 1st sort recursive call Sort");
        list.display();
        sort(list, partIndex + 1, lastIndex);
   //     System.out.println("Test Random List - after 2nd sort recursive");
        list.display();
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

