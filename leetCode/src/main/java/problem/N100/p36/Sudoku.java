package problem.N100.p36;

import java.util.Arrays;

public class Sudoku {

    public boolean isValidSudoku(char[][] board) {

        int length = 9;
        boolean[] line = new boolean[10];
        boolean[] column = new boolean[10];
        boolean[] rectangular = new boolean[10];

        int i=0;
        while (i< length){
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j]=='.') {
                    continue;
                }
                if (column[board[i][j]-'0']) {
                    return false;
                }
                column[board[i][j]-'0']=true;
            }
            Arrays.fill(column,false);
            for (char[] chars : board) {
                char c = chars[i];
                if (c == '.') {
                    continue;
                }
                if (line[c - '0']) {
                    return false;
                }
                line[c - '0'] = true;
            }
            Arrays.fill(line,false);
            i++;
        }
        int j=0;
        int k=0;
        while (true){
            for (int l = j; l < j + 3; l++) {
                for (int m = k; m < k + 3; m++) {
                    char c = board[l][m];
                    if (c =='.') {
                        continue;
                    }
                    if (rectangular[c -'0']) {
                        return false;
                    }
                    rectangular[c -'0']=true;
                }
            }
            Arrays.fill(rectangular,false);
            j+=3;
            if(j==9){
                if(k==6){
                    break;
                }
                j=0;
                k+=3;
            }
        }
        return true;
    }
}
