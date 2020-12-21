import java.lang.Math;
public class SortsDriver{

  public static void main(String[] args) {
    int[] array = generateArr(100,250);
    String bubble = arrToString(Sorts.bubbleSort(array));
    String selection = arrToString(Sorts.selectionSort(array));
    String insertion = arrToString(Sorts.insertionSort(array));
    System.out.println("Bubble sort: " + bubble);
    System.out.println("Selection sort: " + selection);
    System.out.println("Insertion sort: " + insertion);
  }

  public static int[] generateArr(int length, int seed) {
    int[] array = new int[length];
    for (int i = 0; i < length; i++) {
      Random rng = new Random(seed);
      array[i] = rng.nextInt();
    }
    return array;
  }

  public static String arrToString(int[] array) {
    String arr = "[";
    for (int i = 0; i < array.length; i++) {
      arr += array[i] + ", ";
    }
    arr += "]";
    return arr;
  }

}
