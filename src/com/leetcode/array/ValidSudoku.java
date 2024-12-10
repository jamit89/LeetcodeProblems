package com.leetcode.array;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {

	public boolean isValidSudoku(char[][] board) {
		return true;
	}

	public static void main(String[] args) {
		ValidSudoku validator = new ValidSudoku();

		// Example of a valid Sudoku board
		char[][] board1 = { { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
				{ '6', '.', '.', '1', '9', '5', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
				{ '8', '.', '.', '8', '.', '.', '.', '3', '1' }, { '4', '.', '3', '6', '8', '1', '7', '.', '9' },
				{ '7', '6', '2', '9', '.', '5', '.', '1', '.' }, { '9', '.', '1', '.', '.', '.', '.', '8', '2' },
				{ '2', '.', '4', '.', '.', '9', '1', '.', '6' }, { '.', '8', '7', '3', '.', '.', '.', '2', '5' } };

		// Validate the boards
		System.out.println(validator.isValidSudoku(board1));

	}
}
