import java.util.Random;

public class List {
  private int nums [];
  private int size;

  public List(int size){
    this.size = size;
    this.nums = new int[size];
  }

  void generateRandom(){
    Random rand = new Random();
    for(int i =0; i < size; ++i) {
      int rand_num = rand.nextInt(100);
      nums[i] = rand_num;
    }
  }

  void generateReverse(){
    for (int i = 0; i < size; ++i) {
      nums[i] = size - i;
    }
  }

  void display() {
    for (int j = 0; j < nums.length; ++j)
      System.out.print(nums[j] + " ");

    System.out.print("\n");
  }
}
