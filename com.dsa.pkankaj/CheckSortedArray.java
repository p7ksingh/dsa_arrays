import java.util.Arrays;
import java.util.Scanner;

public class CheckSortedArray {
    static boolean isSorted(int[] arr) {
        boolean check = true; // if empty array then it already sorted
        //i = 1 becouse we comparing from i=0 to futher
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                //not sorted
                check = false;
                break;
            }
        }
        return check;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println(Arrays.toString(arr));

        System.out.println("Is Sorted :: " +isSorted(arr));

    }
}
