import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

import java.util.Collections;

public class QuicksortTest {

  @Test
  public void testQuicksortCorrectness_backList() {
    Quicksort quickSort = new Quicksort();
    int listSize = 1000;
    List testList = new List(listSize);
    List compList = new List(listSize);

    //Load data into testing lists
    testList.loadList("backList_1k.data");
    compList.loadList("backList_1k.data");

    //Library sort
    Collections.sort(compList.getList());

    //Project sort
    quickSort.sort(testList, 0, listSize - 1);

    //Assert lists are sorted equally
    for (int i = 0; i < listSize; ++i) {
      assertEquals(testList.getVal(i), compList.getVal(i));
    }
  }
}
