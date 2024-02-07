package practice.reverseArray;


import java.util.Arrays;
import java.util.Scanner;

public class Main {

    // используя данный метод, вы можете использовать ваши методы, и проверить их работу на разных
    // значений для проверки и отладки
    public static void main(String[] args) {
        String line = "1 2 3 4 5";
        String[] strings = line.split("\s+");
        System.out.println(Arrays.toString(ReverseArray.reverse(strings)));
    }
}
