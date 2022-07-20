import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
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
    int [] myArray1 ={55,66,77};
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
    public void addElementToArray (){
        int n=5;
        int q;
        int [] myArray = {11,22,33,44,55};
        System.out.println(Arrays.toString(myArray));
//    List inlist=new ArrayList(Arrays.asList(myArray));
//    inlist.add(n);
//       Arrays.asList(inlist);
//    int [] myArray1 = inlist.toArray(inlist);
//       System.out.println(Arrays.toString(myArray1));
    }
}
