import java.util.Arrays;
import java.util.Scanner;

public class LastIndexOfArray {

    // static int strictlyGrater(int[] arr, int x) {
    //     int count = 0;
    //     for (int i = 0; i < arr.length; i++) {
    //         if (arr[i] > x)
    //             count++;
    //     }
    //     return count;
    // }

    // static int lastIndex(int[] arr, int x) {
    // int findIndex = -1;
    // for (int i = 0; i < arr.length; i++) {
    // if (arr[i] == x) {
    // findIndex = i;
    // }

    // }
    // return findIndex;

    // }
    static

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size Of Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " Elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        // System.out.println("Enter X Elements to find last Occurence");
        // int x = sc.nextInt();
        System.out.println("Enter X Elements to find strictly grater");
        int x = sc.nextInt();

        // System.out.println("Last Occurence of X Elements is : " + lastIndex(arr, x));
        System.out.println("Strictly Grater than X Elements : " + strictlyGrater(arr, x));
    }
}
