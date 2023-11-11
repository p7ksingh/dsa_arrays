
// data structre which store a collection of homoginious iteams.
//indexing based
//contiguonis memeory
// memory - stack -primative, reference, function call
//memory - heap -object
//shallow copy - means two address pointing same memory location in heap
//deepshallow - means two address pointing different memory locations in heap memory we can achive by using .clone()
//address and primative data type and method call store in stack memory
import java.util.Scanner;

class ArrayExample5 {
    void serchInArray() {
        int x = 20;
        int[] ar = { 10, 1, 2, 3, 4, 5, 6, 7, 0, 8 };
        int index = -1;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == x) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.err.println("Not Found");

        } else {
            System.out.println("found " + x + " at index " + index);
        }
    }
}

class ArrayExample4 {
    void maxArrayInsideElement() {
        int[] num = { 1, 3, 8, 5, 4, 40 };
        int ans = 0;
        for (int i : num) {
            if (i >= ans) {
                ans = i;

            }
        }
        System.out.println(ans);

    }
}

class ArrayExample3 {
    void sumOfArray() {
        int[] array = { 1, 2, 3, 4, 5 };
        int sum = 0;
        // for (int i = 0; i < array.length; i++) {
        // sum = sum + array[i];
        // }

        // for (int i : array) {
        // sum = sum + i;
        // }
        int i = 0;
        while (i < array.length) {
            sum = sum + array[i];
            i = i + 1;
        }
        System.out.println("sum of array = " + sum);
    }
}

class MultiArray {
    void printMuliArray() {
        int[][] mArray = { { 0, 1, 2, 3, 4 }, { 6, 7, 8, 9, 10 } };
        // for (int i = 0; i < 2; i++) {
        // for (int j = 0; j < 5; j++) {
        // System.out.println(mArray[i][j]);
        // }

        for (int i = 0; i < mArray.length; i++) {
            for (int j = 0; j < mArray[i].length; j++) {
                System.out.println(mArray[i][j]);
            }
        }
    }
}

class ArrayExample2 {
    void printArray() {
        int[] array = new int[5];
        array[0] = 10;
        array[1] = 20;
        array[2] = 5;
        array[3] = 40;
        array[4] = 50;
        // System.out.println(array);

        // for loop in array
        // for (int i = 0; i < array.length; i++) {
        // System.out.println(array[i]);
        // }

        // foreach llop in array
        // for (int j : array) {
        // System.out.println(j);
        // }

        // while loop in array
        int i = 0;
        while (i < array.length) {
            System.out.println(array[i]);
            i++;

        }

        // System.out.println(array.length);

    }
}

// how to take input in array in java
class InputArray {
    void userInputArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter " + n + " Size of Array elements");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

class ArrayExample {
    void demoArray() {
        // how to decleaar the array
        int[] ages = new int[3];
        String[] names = new String[3];
        float[] weights = new float[3];

        // how to assign vale in array
        // ages
        ages[0] = 60;
        ages[1] = 70;
        ages[2] = 80;
        // ages[3] = 90; // ArrayIndexOutOfBoundsException
        System.out.println(ages[2]);
        // names
        names[0] = "Pankaj";
        names[1] = "Rohan";
        names[2] = "Sohan";
        System.out.println(names[0]);
        // weights
        weights[0] = 60.50f;
        weights[1] = 70.50f;
        weights[2] = 80.5f;
        System.out.println(weights[0]);

    }
}

class ArrayExample6 {
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

public class ArraysExample1 {
    public static void main(String[] args) {
        // ArrayExample aExample = new ArrayExample();
        // aExample.demoArray();
        // ArrayExample2 aExample = new ArrayExample2();
        // aExample.printArray();
        // MultiArray mArray1 = new MultiArray();
        // mArray1.printMuliArray();
        // ArrayExample3 aExample = new ArrayExample3();
        // aExample.sumOfArray();
        // ArrayExample4 aExample = new ArrayExample4();
        // aExample.maxArrayInsideElement();
        // ArrayExample5 aExample = new ArrayExample5();
        // aExample.serchInArray();
        // InputArray mArray1 = new InputArray();
        // mArray1.userInputArray();
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        //shallow copy-why-bcz- ye khokala kam kiya eslie
      //  int[] arr1 = arr; //copy one array to another array

        // deep shallow 
        int[] arr1 = arr.clone();//allocate new memory in heap
        System.out.println("print array arr");
        ArrayExample6.printArray(arr);
         System.out.println("print array arr1");
        ArrayExample6.printArray(arr1);

        //changeing some value of arr1
        arr1[0]=0;
        arr1[1]=0;
        System.out.println("print array arr after changing arr1");
        ArrayExample6.printArray(arr);

        System.out.println("print array arr1 after changing arr1");
        ArrayExample6.printArray(arr1);

    }
}
