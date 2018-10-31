import java.util.Random;

public class List {
    public void BackwardsList(int n){
        int [] backwardsList = new int[n];
        int count = n-1;
        for (int i = 0; i < n; i++)
        {
           backwardsList[i]= count;
           --count;
        }
    }
}



