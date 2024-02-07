package practice.reverseArray;
import java.util.Arrays;
import java.util.Scanner;
public class ReverseArray {
//public String[] strings = {};
    public static String[] reverse(String[] strings) {
String[] line = strings;
        for (int i = 0; i < strings.length/2; i++) {
            String a = strings[i];
            strings[i] =  strings[strings.length-1 - i];
            strings[strings.length-1-i] = a;
        }
        return strings;
    }

}