public class Quick3Insert extends Quick3Abstract {
  Quick3Insert() {
    super();
  }

  public void sort(List list, int lp, int hp) {
    if (hp <= lp)
      return;
    if (hp - lp < 15) {
      insertionSort(list, lp, hp + 1);
    } else {
      q3sort(list, lp, hp);
    }
  }
}
