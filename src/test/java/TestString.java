import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Locale;

public class TestString {

    @Test
    public void testSimpleString() {
        String str1 = "Hello";
        String str2 = "JAVA";
        String str3 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
        String str4 = new String(new char[]{'w', 'e', 'l', 'c', 'o', 'm', 'e'}, 3, 4);
        //3 -начальный индекс, 4 -кол-во символов
        String resultString = str1 + str2;

        System.out.println(resultString);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
    }

    @Test
    public void testStringMethodIsEmpty() {
        String str1 = "";
        if (str1.isEmpty()) System.out.println("String is empty");
    }

    @Test
    public void testStringMethodConcat() {
        String first = "Hello";
        String second = "JAVA";
        String str1 = first.concat(second);
        System.out.println(str1);
    }

    @Test
    public void testMethodJoin() {
        String str1 = "Hello";
        String str2 = "JAVA";
        String str3 = String.join(" ", str1, str2);
        String str4 = String.join(", ", str2, str1);
        System.out.println(str3);
        System.out.println(str4);
    }

    @Test
    public void testVolumeNull() {
        String str5 = null;

        if (str5 != null)
            System.out.println("String is empty");
        else System.out.println("String is not empty");
    }

    @Test
    public void testVolumeNull2() {
        String str6 = null;

        if (str6 != null && str6.length() == 0) System.out.println("String is empty");
        else System.out.println("String is not empty");
    }

    @Test
    public void testChar() {
        String str6 = "Java";
        char str7 = str6.charAt(3);
        System.out.println(str7);
    }

    @Test
    public void testCompareAndEquals() {
        String str7 = "Java";
        String str8 = "Java forever";
        String str9 = "java";

        int compareString = str7.compareTo(str8);

        System.out.println(compareString);
        System.out.println(str8.compareTo(str7));

        System.out.println(str7.equals(str8));
        System.out.println(str7.equalsIgnoreCase(str9));
        System.out.println(str7.equals(str9));

    }

    @Test
    public void testCompare() {
        String str1 = "Hello Java ";
        String str2 = "Java forever";

        boolean result = str1.regionMatches(6, str2, 3, 0);
        System.out.println(result);
    }

    @Test
    public void testIndexSearch() {
        String str = "How are you?";
        int index1 = str.indexOf('a');
        int index2 = str.indexOf("ar");
        int index3 = str.lastIndexOf('o');

        System.out.println(index1);
        System.out.println(index2);
        System.out.println(index3);
    }

    @Test
    public void testReplace() {
        String str = "Hello Masha!";
        String replStr1 = str.replace('M', 'D');
        System.out.println(replStr1);
    }

    @Test
    public void testSubstring() {
        String str = "Hello Masha!";
        String subStr1 = str.substring(3);
        String subStr2 = str.substring(6, 11);

        System.out.println(subStr1);
        System.out.println(subStr2);
    }

    @Test
    public void testLowerAndUpperCase() {
        String str = "Hello Java ";

        String result1 = str.toLowerCase(Locale.ROOT);
        String result3 = str.toLowerCase();
        String result2 = str.toUpperCase();

        System.out.println(result1);
        System.out.println(result3);
        System.out.println(result2);
    }

    @Test
    public void testSplitMethod() {
        String str = "How are you";
        String[] words = str.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
        String newString = "";
        for (String word2 : words) {
            newString += " " + word2;
        }
        System.out.println(newString);
        System.out.println(str);
    }

    @Test
    public void testSplitMethod2() {
        String str = "How are you?";
        String[] words = str.split(" ");
        String[] array1 = {"1,2,3,4,5"};

        for (String wod : words) {
            System.out.println(wod);
        }
        System.out.println(str);
        System.out.println(Arrays.toString(words));
        System.out.println(words.length);
    }
}
