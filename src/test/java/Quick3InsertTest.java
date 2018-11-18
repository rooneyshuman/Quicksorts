import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Quick3InsertTest {
  @Test
  public void testQuick3InsertCorrectness_backList() {
    Quick3Insert quick3Insert = new Quick3Insert();
    int listSize = 1000;
    List testList = new List(listSize);
    List compList = new List(listSize);

    //Load data into testing lists
    testList.loadList("backList_1k.data");
    compList.loadList("backList_1k.data");

    //Library sort
    Collections.sort(compList.getList());

    //Project sort
    quick3Insert.sort(testList, 0, listSize - 1);

    //Assert lists are sorted equally
    for (int i = 0; i < listSize; ++i) {
      assertEquals(testList.getVal(i), compList.getVal(i));
    }
  }

  @Test
  public void testQuick3InsertCorrectness_random() {
    Quick3Insert quick3Insert = new Quick3Insert();
    int listSize = 1000;
    List testList = new List(listSize);
    List compList = new List(listSize);

    //Load data into testing lists
    testList.loadList("random_1k.data");
    compList.loadList("random_1k.data");

    //Library sort
    Collections.sort(compList.getList());

    //Project sort
    quick3Insert.sort(testList, 0, listSize - 1);

    //Assert lists are sorted equally
    for (int i = 0; i < listSize; ++i) {
      assertEquals(testList.getVal(i), compList.getVal(i));
    }
  }

  @Test
  public void testQuick3InsertCorrectness_almostSort1() {
    Quick3Insert quick3Insert = new Quick3Insert();
    int listSize = 1000;
    List testList = new List(listSize);
    List compList = new List(listSize);

    //Load data into testing lists
    testList.loadList("almostSort1_1k.data");
    compList.loadList("almostSort1_1k.data");

    //Library sort
    Collections.sort(compList.getList());

    //Project sort
    quick3Insert.sort(testList, 0, listSize - 1);

    //Assert lists are sorted equally
    for (int i = 0; i < listSize; ++i) {
      assertEquals(testList.getVal(i), compList.getVal(i));
    }
  }

  @Test
  public void testQuick3InsertCorrectness_almostSort2() {
    Quick3Insert quick3Insert = new Quick3Insert();
    int listSize = 1000;
    List testList = new List(listSize);
    List compList = new List(listSize);

    //Load data into testing lists
    testList.loadList("almostSort2_1k.data");
    compList.loadList("almostSort2_1k.data");

    //Library sort
    Collections.sort(compList.getList());

    //Project sort
    quick3Insert.sort(testList, 0, listSize - 1);

    //Assert lists are sorted equally
    for (int i = 0; i < listSize; ++i) {
      assertEquals(testList.getVal(i), compList.getVal(i));
    }
  }
}
