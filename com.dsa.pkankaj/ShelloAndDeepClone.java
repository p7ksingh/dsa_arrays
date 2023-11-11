/*  shallow cloning of arrays
 in java pass by value hoti hai due to pass by value create a array copy and
 pass into changeArray()

 in premative data type case heap me kuch hota nhi hai sub stack me hi hota
 hai eslie data change nhi hota hai
 shallow clone- here address one and variable two and both variable pointing
 deep clone - both variable pointing different different locations
 */

import java.util.Arrays;

public class ShelloAndDeepClone {

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void changeArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }

    }

    static void changeInteger(int number) {
        for (int i = 0; i < number; i++) {

            number = 0;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 60;
        arr[4] =50;
        // changeArray(arr);
      //  System.out.println("Original array: " + Arrays.toString(arr));
         printArray(arr);//10 20 30 60 50 

        // shello clone
        // int[] arr_1 = arr;
        // System.out.println("Shallow clone: " + Arrays.toString(arr_1));
        // printArray(arr_1);
        // arr[0] = 0;
        // arr[1] = 0;
        // deep clone

        // int[] arr_2 = arr.clone();
        // System.out.println("Deep clone: " + Arrays.toString(arr_2));
        // printArray(arr_2);

        // int[] arr_3 = Arrays.copyOf(arr, arr.length);
        // printArray(arr_3);

        //in this methos first one is includes but last one excluded
        // int[] arr_4 = Arrays.copyOfRange(arr, 1, 5);
        // printArray(arr_4);
      //in this methos first one is includes but last one excluded
        int[] arr_4 = Arrays.copyOfRange(arr, 1, arr.length);
        printArray(arr_4);//20 30 60 50 
        

    }
}
