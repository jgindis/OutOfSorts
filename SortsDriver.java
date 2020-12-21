import java.util.Arrays;
import java.lang.Math;
public class SortsDriver{

  public static void main(int length, int seed) {
    int[] array = generateArr(length,seed);
    String bubble = Arrays.toString(Sorts.bubbleSort(array));
    String selection = Arrays.toString(Sorts.selectionSort(array));
    String insertion = Arrays.toString(Sorts.insertionSort(array));
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


}
