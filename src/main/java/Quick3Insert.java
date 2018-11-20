public class Quick3Insert extends Quick3Abstract {
  public void sort(List list, int lp, int hp) {
    if (hp <= lp)
      return;
    if (hp - lp < 50) {
      insertionSort(list, lp, hp + 1);    // Run insertion TODO: do i need to do a +s?
    } else {
      q3sort(list, lp, hp);
    }
  }
}
