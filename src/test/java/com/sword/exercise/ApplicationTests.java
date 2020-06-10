package com.sword.exercise;

import com.sword.exercise.calculator.Calculator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

	@Test
	public void test13ShortDistance() {
		 final String[][] board = {
				{"A",".",".",".",".",".","."},
				{".",".",".",".",".",".","."},
				{"o","o","o","o","o",".","o"},
				{"o",".",".",".",".",".","o"},
				{"o","o","o","o",".","o","o"},
				{".",".",".",".",".",".","."},
				{".",".",".",".",".",".","B"}};

		final String[][] solution = {
				{"A","x","x","x","x","x","."},
				{".",".",".",".",".","x","."},
				{"o","o","o","o","o","x","o"},
				{"o",".",".",".","x","x","o"},
				{"o","o","o","o","x","o","o"},
				{".",".",".",".","x","x","."},
				{".",".",".",".",".","x","B"}};

		Calculator calc = new Calculator();
		int result = calc.calculateShortestPath(board);
		Assert.assertEquals(13,result);

	}

	@Test
	public void test17shortDistance() {
		final String[][] board = {
				{"A",".",".",".",".",".","."},
				{".",".",".",".",".",".","."},
				{"o","o","o","o",".","o","o"},
				{"o",".",".",".",".",".","o"},
				{"o",".","o","o","o","o","o"},
				{".",".",".",".",".",".","."},
				{".",".",".",".",".",".","B"}};

		final String[][] solution = {
				{"A","x","x","x","x",".","."},
				{".",".",".",".","x",".","."},
				{"o","o","o","o","x","o","o"},
				{"o","x","x","x","x",".","o"},
				{"o","x","o","o","o","o","o"},
				{".","x","x","x","x","x","."},
				{".",".",".",".",".","x","B"}};

		Calculator calc = new Calculator();
		int result = calc.calculateShortestPath(board);
		Assert.assertEquals(17,result);

	}

	@Test
	public void testNoWay() {
		final String[][] board = {
				{"A","o",".",".",".",".","."},
				{"o","o",".",".",".",".","."},
				{"o","o","o",".",".",".","o"},
				{"o",".",".",".",".",".","o"},
				{"o",".","o","o","o","o","o"},
				{".",".",".",".",".",".","."},
				{".",".",".",".",".",".","B"}};



		Calculator calc = new Calculator();
		int result = calc.calculateShortestPath(board);
		Assert.assertEquals(-1,result);

	}


}
