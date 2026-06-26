package ch.bbw.pr.dame;

import junit.framework.TestCase;

public class DameProblemTest extends TestCase {

    public void testSetQueenSolvesEightQueens() {
        DameProblem solver = new DameProblem(8);
        assertTrue(solver.setQueen(0));

        int[][] board = solver.getBoard();
        int queenCount = 0;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 1) {
                    queenCount++;
                }
            }
        }

        assertEquals(8, queenCount);

        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                if (board[row][col] == 1) {
                    assertTrue(isValid(board, row, col));
                }
            }
        }
    }

    private boolean isValid(int[][] board, int r, int c) {
        int size = board.length;

        for (int row = 0; row < size; row++) {
            if (row != r && board[row][c] == 1) {
                return false;
            }
        }

        for (int col = 0; col < size; col++) {
            if (col != c && board[r][col] == 1) {
                return false;
            }
        }

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (row == r || col == c) {
                    continue;
                }
                if (board[row][col] == 1 && Math.abs(row - r) == Math.abs(col - c)) {
                    return false;
                }
            }
        }

        return true;
    }
}
