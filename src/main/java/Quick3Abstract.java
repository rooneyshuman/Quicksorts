
import java.util.Random;

public abstract class Quick3Abstract extends QuickAbstract {
  private Random rand;
  public void q3sort(List list, int lowIndex, int highIndex) {
    if (highIndex <= lowIndex)
      return;
    int randLow = rand.nextInt((highIndex - lowIndex) + 1)/2 + lowIndex;
    int randHigh = rand.nextInt((highIndex - lowIndex) + 1)/2 + (highIndex-lowIndex)/2 + lowIndex; // TODO:This is most likely a mess..
    int lowPivot = list.getVal(randLow);
    int highPivot = list.getVal(randHigh);

    if (highPivot < lowPivot) {
      swap(list, randLow, randHigh);
      lowPivot = list.getVal(randLow);
      highPivot = list.getVal(randHigh);
    }

    int i = lowIndex + 1;
    int lessTerm = lowIndex + 1;
    int greaterTerm = highIndex - 1;

    while (i <= greaterTerm) {
      if (list.getVal(i) < lowPivot)
        swap(list, lessTerm++, i++);
      else if (highPivot < list.getVal(i))
        swap(list, i, greaterTerm--);
      else
        i++;
    }
    swap(list, lowIndex, --lessTerm);
    swap(list, highIndex, ++greaterTerm);

    //Recursively call the sort method on three sub-lists
    sort(list, lowIndex, lessTerm - 1);
    if (list.getVal(lessTerm) < list.getVal(greaterTerm))
      sort(list, lessTerm + 1, greaterTerm - 1);
    sort(list, greaterTerm + 1, highIndex);
  }

  // Used by Quick3 and Quick3Insert
  public void swap(List list, int i, int j) {
    int temp = list.getVal(i);
    list.setVal(i, list.getVal(j));
    list.setVal(j, temp);
  }
}
