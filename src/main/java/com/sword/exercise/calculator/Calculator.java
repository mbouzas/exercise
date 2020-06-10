package com.sword.exercise.calculator;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Calculator {
	
	public int calculateShortestPath(String[][] board) {


		// TODO: start of implementation here
		Node source = new Node(0, 0, 0);
		Queue<Node> queue = new LinkedList<Node>();

		queue.add(source);

		while(!queue.isEmpty()) {
			Node poped = queue.poll();

			if(board[poped.x][poped.y] == "B" ) {
				return poped.distanceFromSource -1;
			}
			else {
				board[poped.x][poped.y]="x";

				List<Node> neighbourList = addNeighbours(poped, board);
				if (neighbourList.size()>0) {
					queue.addAll(neighbourList);
				}else {
					return -1;
				}

			}
		}
		return -1;
    }

	private static List<Node> addNeighbours(Node poped, String[][] matrix) {

		List<Node> list = new LinkedList<Node>();

		if((poped.x-1 > 0 && poped.x-1 < matrix.length) && matrix[poped.x-1][poped.y] != "o") {
			list.add(new Node(poped.x-1, poped.y, poped.distanceFromSource+1));
		}
		if((poped.x+1 > 0 && poped.x+1 < matrix.length) && matrix[poped.x+1][poped.y] != "o") {
			list.add(new Node(poped.x+1, poped.y, poped.distanceFromSource+1));
		}
		if((poped.y-1 > 0 && poped.y-1 < matrix.length) && matrix[poped.x][poped.y-1] != "o") {
			list.add(new Node(poped.x, poped.y-1, poped.distanceFromSource+1));
		}
		if((poped.y+1 > 0 && poped.y+1 < matrix.length) && matrix[poped.x][poped.y+1] != "o") {
			list.add(new Node(poped.x, poped.y+1, poped.distanceFromSource+1));
		}
		return list;
	}
}

		class Node {
			int x;
			int y;
			int distanceFromSource;

			Node(int x, int y, int dis) {
				this.x = x;
				this.y = y;
				this.distanceFromSource = dis;
			}

		}

