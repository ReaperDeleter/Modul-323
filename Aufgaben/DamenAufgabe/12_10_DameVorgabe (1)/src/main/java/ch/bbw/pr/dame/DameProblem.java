package ch.bbw.pr.dame;

/**
 * DameProbelm
 * 
 * @author Peter Rutschmann
 * @version 07.11.2019
 */
public class DameProblem {
	private static final int FIELD_FREE = 0;
	private static final int FIELD_OCCUPIED = 1;

	private int size;
	private int[][] board;

	public int[][] getBoard() {
		return board;
	}

	public DameProblem(int size) {
		super();
		this.size = size;
		this.board = new int[size][size];
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				board[i][j] = FIELD_FREE;
			}
		}
	}

	public boolean setQueen(int row) {
		if (row >= size) {
			return true;
		}

		for (int col = 0; col < size; col++) {
			if (isValid(row, col)) {
				board[row][col] = FIELD_OCCUPIED;
				if (setQueen(row + 1)) {
					return true;
				}
				board[row][col] = FIELD_FREE;
			}
		}

		return false;
	}

	private boolean isValid(int r, int c) {
		// Nach oben suchen
		for (int row = r - 1; row >= 0; row--) {
			if (board[row][c] == FIELD_OCCUPIED) {
				return false;
			}
		}

		// Nach oben-links diagonal suchen
		for (int row = r - 1, col = c - 1; row >= 0 && col >= 0; row--, col--) {
			if (board[row][col] == FIELD_OCCUPIED) {
				return false;
			}
		}

		// Nach oben-rechts diagonal suchen
		for (int row = r - 1, col = c + 1; row >= 0 && col < size; row--, col++) {
			if (board[row][col] == FIELD_OCCUPIED) {
				return false;
			}
		}

		return true;
	}
}






