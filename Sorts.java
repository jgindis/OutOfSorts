public class Sorts{
  /**Bubble sort of an int array.
  *@postcondition The array will be modified such that the elements will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void bubbleSort(int[] data) {
    for (int i = 0; i < data.size(); i++) {
      int cur = 0;
      for(int i = 0; i < data.length; i++){
        for(int j = i++; j < data.length; j++){
          if(data[i] > data[j]){
            cur = data[i];
            data[i] = data[j];
            data[j] = cur;
          }
        }
      }
    }
  }

  public static void selectionSort(int[] data) {
    for (int i = 0; i < data.length-1; i++) {
            int index = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] < data[index]) {
                    index = j;
                }
            }
            int smallest = data[index];
            data[index] = data[i];
            data[i] = smallerNumber;
    }
  }


}
