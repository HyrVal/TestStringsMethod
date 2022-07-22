import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestArray {

    @Test
    public void testIntArray() {
        String str = "How create Array?";
        int a = 1;
        int[] myArray;
        myArray = new int[10];
        myArray[0] = 2;
        myArray[1] = a;
        int[] myArray1 = {55, 66, 77};
        System.out.println(a + str);
        System.out.println(Arrays.toString(myArray));

        for (int i = 0; i < myArray.length; i++) {
            System.out.println("myArray[" + i + "]:" + myArray[i]);
        }
        System.out.println("myArray1 : " + Arrays.toString(myArray1));
    }

    @Test
    public void testStringArray() {
        int amountElem = 0;
        String str1 = "Hello java;  ";
        String[] stringsArray;
        stringsArray = new String[5];

        stringsArray[0] = str1;
        stringsArray[2] = str1.substring(0, 5);
        stringsArray[3] = str1.substring(7);

        for (int i = 0; i < stringsArray.length; i++) {
            if (stringsArray[i] == null)
                amountElem++;
        }
        System.out.println("Amount elements = " + amountElem);
        System.out.println("Size of the given array: " + stringsArray.length);
        System.out.println(Arrays.toString(stringsArray));
    }

    @Test
    public void addElementToArray() {
        int n = 5;
        int q;
        int[] myArray = {11, 22, 33, 44, 55};
        System.out.println(Arrays.toString(myArray));
//    List inlist=new ArrayList(Arrays.asList(myArray));
//    inlist.add(n);
//       Arrays.asList(inlist);
//    int [] myArray1 = inlist.toArray(inlist);
//       System.out.println(Arrays.toString(myArray1));
    }

    @Test
    public void testMultidimensionalArray() {
        int[][] nums = new int[][]{
                {1, 2, 3, 4},
                {4, 5, 6, 7},
                {7, 8, 9, 0}
        };
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.println("id(" + i + ":" + j + ") " + nums[i][j] + " ");
            }
            System.out.println();
        }
        int colum = 0;
        for (int[] line : nums) {
            for (int i : line) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    @Test
    public void replacementVolumeElements() {
        int[] array = new int[]{1, 2, 3, 4, 5};
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * 10;
            System.out.println(array[i]);
        }
        int[] wel = array;

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(wel));
    }

    @Test
    public void reverseArray() {

        int[] newArr = new int[]{1, 2, 3, 4, 5};
        int[] newArray2 = new int[newArr.length];

        for (int i = newArr.length; i > 0; i--) {

            for (int j = 0; j < newArr.length; j++) {
                newArr[i] = newArray2[j];
            }
        }
        System.out.println(Arrays.toString(newArray2));
        for (int i : newArr) {
            System.out.println(newArray2.toString());
        }
    }

    @Test
    public void reverseArray2() {
        Integer[] even_Array = {2, 4, 6, 8, 10};
        System.out.println("Original Array:" + Arrays.asList(even_Array));
        Collections.reverse(Arrays.asList(even_Array));
        System.out.println("Reversed Array:" + Arrays.asList(even_Array));
    }

    @Test
    public void cloneArray() {
        int num_Array[] = {5, 10, 15, 20, 25, 30};
        int clone_Array[] = num_Array.clone();
        System.out.println("Original num_Array:" + Arrays.toString(num_Array));
        System.out.println("Cloned num_Array:" + Arrays.toString(clone_Array));
    }

    @Test
    public void sortArray() {
        int[] num_Array = {115, 32, 56, 78, 94, 108, 100, 63};
        System.out.println("Original Array: " + Arrays.toString(num_Array));
        Arrays.sort(num_Array);
        System.out.println("Sorted Array: " + Arrays.toString(num_Array));
    }
}


