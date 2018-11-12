// Madeleine
//This class sorts a list using the dual pivot sort.
public class Quick3 {

    public void sort(List list, int lp, int hp) {
        if (hp <= lp)
            return;

        int lowPivot = list.getVal(lp);
        int highPivot = list.getVal(hp);

        if (highPivot < lowPivot) {
            swap(list, lp, hp);
            lowPivot = list.getVal(lp);
            highPivot = list.getVal(hp);
        }

        int i = lp + 1;
        int lessTerm = lp + 1;
        int greaterTerm = hp - 1;

        while (i <= greaterTerm) {
            if (list.getVal(i) < lowPivot)
                swap(list, lessTerm++, i++);
            else if (highPivot < list.getVal(i))
                swap(list, i, greaterTerm--);
            else
                i++;
        }

        swap(list, lp, --lessTerm);
        swap(list, hp, ++greaterTerm);

        //Recursively call the sort method on three sub-lists
        sort(list, lp, lessTerm - 1);
        if (list.getVal(lessTerm) < list.getVal(greaterTerm))
            sort(list, lessTerm + 1, greaterTerm - 1);
        sort(list, greaterTerm + 1, hp);
    }

    //This function swaps two values in a list
    public void swap(List list, int i, int j) {
        int temp = list.getVal(i);
        list.setVal(i, list.getVal(j));
        list.setVal(j, temp);
    }

}
