import java.util.Scanner;

public class ArraysInsideFindElement {
    int x = 4;
    int count = 0;

    // void printArrays(int arr[]) {
    // for (int i = 0; i < arr.length; i++) {
    // if (arr[i] == x) {
    // count++;
    // }
    // }
    // System.out.println(count);
    // }
    static int countOccurrence(int[] arr, int x) {
        int count = 0;
       // by using for loop
        for (int i = 0; i < arr.length; i++) {
        if (arr[i] == x)
        count++;
        }
        // by using foreach loop
        // for (int i : arr) {
        // if (arr[i] == x) {
        // count++;

        // }

        // by using while loop
        // int i = 0;
        // while (i < arr.length) {
        //     if (arr[i] == x) {
        //         count++;
        //     }
        //     i++;

        // }

        return count;

    }

    public static void main(String[] args) {
        // int[] arr = new int[10];
        // arr[0] = 1;
        // arr[1] = 2;
        // arr[2] = 3;
        // arr[3] = 4;
        // arr[4] = 5;
        // arr[5] = 4;
        // arr[6] = 4;
        // arr[7] = 5;
        // arr[8] = 5;
        // arr[9] = 5;

        // ArraysInsideFindElement find = new ArraysInsideFindElement();
        // find.printArrays(arr);

        // int x = countOccurrence(arr, 5);
        // System.out.println(x);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size Of Array ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Find element in array x");
        int x = sc.nextInt();
        System.out.println("Count of x: " + countOccurrence(arr, x));

    }
}
