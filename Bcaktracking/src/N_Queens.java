import java.util.ArrayList;
import java.util.List;


class N_Queens {
    public static List<List<String>> QueensSol (int n){
        List<List<String>> allBoard = new ArrayList<>();

        char[][] board = new char[n][n];
        helper(board, allBoard, 0);
        return allBoard;
    }
    //recursive function
    static void helper(char[][] board, List<List<String>> allBoard, int col) {
        if (col == board.length) {
            saveboard(board, allBoard);
            return;
        }
        for (int row = 0; row < board.length; row++) {
            if (isSafe(row, col, board)) {
                board[row][col] = 'Q';
                helper(board, allBoard, col + 1);
                board[row][col] = '.';
            }
        }
    }

    static void saveboard(char[][] board, List<List<String>> allBoard) {
        String row;
        List<String> newBoards = new ArrayList<>();
        for (char[] chars : board) {
            row = "";
            for (int j = 0; j < board[0].length; j++) {
                if (chars[j] == 'Q') {
                    row += 'Q';
                } else {
                    row += '.';
                }
                newBoards.add(row);
            }
            allBoard.add(newBoards);
        }
    }


    private static boolean isSafe(int row, int col, char[][] board) {
        //horizontal line
        for (int H = 0; H < board.length; H++) {
            if (board[row][H] == 'Q') {
                return false;
            }
        }
        //vertical line
        for (int V = 0; V < board[0].length; V++) {
            if (board[V][col] == 'Q') {
                return false;
            }
        }
        //Upper Left
        int r = row;
        for (int c = col; c >= 0 && r >= 0; c--, r--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }
        //Upper right
        r = row;
        for (int c = col; c < board.length && r >= 0; r--, c++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }
        //lower left
        r = row;
        for (int c = col; c >= 0 && r < board.length; r++, c--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }
        //lower right
        r = row;
        for (int c = col; c < board.length && r < board.length; r++, c++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }
        return true;
    }
}