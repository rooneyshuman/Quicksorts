import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Quick3Test {

  @Test
  public void testQuick3Correctness_backList() {
    Quick3 quick3 = new Quick3();
    int listSize = 1000;
    List testList = new List(listSize);
    List compList = new List(listSize);

    //Load data into testing lists
    testList.loadList("backList_1k.data");
    compList.loadList("backList_1k.data");

    //Library sort
    Collections.sort(compList.getList());

    //Project sort
    quick3.sort(testList, 0, listSize - 1);

    //Assert lists are sorted equally
    for (int i = 0; i < listSize; ++i) {
      assertEquals(testList.getVal(i), compList.getVal(i));
    }
  }

  @Test
  public void testQuick3Correctness_random() {
    Quick3 quick3 = new Quick3();
    int listSize = 1000;
    List testList = new List(listSize);
    List compList = new List(listSize);

    //Load data into testing lists
    testList.loadList("random_1k.data");
    compList.loadList("random_1k.data");

    //Library sort
    Collections.sort(compList.getList());

    //Project sort
    quick3.sort(testList, 0, listSize - 1);

    //Assert lists are sorted equally
    for (int i = 0; i < listSize; ++i) {
      assertEquals(testList.getVal(i), compList.getVal(i));
    }
  }

  @Test
  public void testQuick3Correctness_almostSort1() {
    Quick3 quick3 = new Quick3();
    int listSize = 1000;
    List testList = new List(listSize);
    List compList = new List(listSize);

    //Load data into testing lists
    testList.loadList("almostSort1_1k.data");
    compList.loadList("almostSort1_1k.data");

    //Library sort
    Collections.sort(compList.getList());

    //Project sort
    quick3.sort(testList, 0, listSize - 1);

    //Assert lists are sorted equally
    for (int i = 0; i < listSize; ++i) {
      assertEquals(testList.getVal(i), compList.getVal(i));
    }
  }

  @Test
  public void testQuick3Correctness_almostSort2() {
    Quick3 quick3 = new Quick3();
    int listSize = 1000;
    List testList = new List(listSize);
    List compList = new List(listSize);

    //Load data into testing lists
    testList.loadList("almostSort2_1k.data");
    compList.loadList("almostSort2_1k.data");

    //Library sort
    Collections.sort(compList.getList());

    //Project sort
    quick3.sort(testList, 0, listSize - 1);

    //Assert lists are sorted equally
    for (int i = 0; i < listSize; ++i) {
      assertEquals(testList.getVal(i), compList.getVal(i));
    }
  }
}
