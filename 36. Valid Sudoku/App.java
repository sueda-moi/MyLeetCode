import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("");
    }
}

class Solution {
    @SuppressWarnings("unchecked")
    public boolean isValidSudoku(char[][] board) {

        HashMap<Integer, Integer>[] row = new HashMap[9];
        HashMap<Integer, Integer>[] column = new HashMap[9];
        HashMap<Integer, Integer>[] threeX = new HashMap[9];
        // 1.Each row must contain the digits 1-9 without repetition.
        // 2.Each column must contain the digits 1-9 without repetition.
        // 3.Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9
        // without repetition.

        for (int i = 0; i < 9; i++) {
            row[i] = new HashMap<Integer, Integer>();
            column[i] = new HashMap<Integer, Integer>();
            threeX[i] = new HashMap<Integer, Integer>();
        }

        for (int i = 0; i < 9; i++) {

            for (int j = 0; j < 9; j++) {
                char a = board[i][j];

                if (a != '.') {
                    int b = (int) a;
                    int boxIndex = (i / 3) * 3 + j / 3;
                    row[i].put(b, row[i].getOrDefault(b, 0) + 1);
                    column[j].put(b, column[j].getOrDefault(b, 0) + 1);
                    threeX[boxIndex].put(b, threeX[boxIndex].getOrDefault(b, 0) + 1);

                    if (row[i].get(b) > 1 || column[j].get(b) > 1 || threeX[boxIndex].get(b) > 1) {
                        return false;
                    }

                }

            }
        }

        return true;

    }
}
