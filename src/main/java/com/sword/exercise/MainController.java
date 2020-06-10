package com.sword.exercise;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sword.exercise.calculator.Calculator;

@RestController
public class MainController {

    private final String[][] board = {
    		{"A",".",".",".",".",".","."},
    		{".",".",".",".",".",".","."},
    		{"o",".","o","o","o",".","o"},
    		{"o",".",".",".",".",".","o"},
    		{"o","o","o","o",".","o","o"},
    		{".",".",".",".",".",".","."},
    		{".",".",".",".",".",".","B"}};
    
    private String[][] __solutionDoNotUse = { 
    		{"A","x",".",".",".",".","."},
    		{".","x",".",".",".",".","."},
    		{"o","x","o","o","o",".","o"},
    		{"o","x","x","x","x",".","o"},
    		{"o","o","o","o","x","o","o"},
    		{".",".",".",".","x","x","."},
    		{".",".",".",".",".","x","B"}};

    @RequestMapping("/reset")
    public String[][] reset() {
    	
        return board;
    }
    
    @RequestMapping("/display")
    public String[][] display() {
    	
        return __solutionDoNotUse;
    }
    
    @RequestMapping("/shortest")
    public int shortestPath() {
    	
    	Calculator calc = new Calculator();
		int result = calc.calculateShortestPath(this.board);
		return result;
    }
    
    
}
