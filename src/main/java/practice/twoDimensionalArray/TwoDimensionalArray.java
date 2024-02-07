package practice.twoDimensionalArray;

public class TwoDimensionalArray {
    public static final char SYMBOL = 'X';

    public static char[][] getTwoDimensionalArray(int size) {
        char[][] symbolX = new char[size][size];
        int sym = 0;
        for (int row = 0; row < size; row++) {
            for (int cell = 0; cell < size; cell++) {
                symbolX[row][cell] = ' ';
            }
        }
        for (int row = 0; row < size; row++) {
            for (int cell = 0; cell < size; cell++) {
                if (row == cell || cell == size - row - 1) {
                    symbolX[row][cell] = SYMBOL;
                }
            }
        }
        return symbolX;
    }
}
