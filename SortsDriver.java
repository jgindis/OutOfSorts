import java.lang.Math;
public class SortsDriver{

  public static void main(String[] args) {

  }

  public static int[] generateArr(int length, int seed) {
    int[] array = new int[length];
    for (int i = 0; i < length; i++) {
      Random rng = new Random();
      array[i] = rng.nextInt();
    }
    return array;
  }

}
