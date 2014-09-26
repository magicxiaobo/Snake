import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

public class Snake {
	Node head = null;
	Node tail = null;
	int size = 0;
	
	public Snake (Node node) {
		head = node;
		tail = node;
		size = 1;
	}
	
	public void addToTail () {
		Node node = null;
		switch (tail.dir) {
			case L:
				node = new Node(tail.row, tail.col + 1, tail.dir);
				break;
			case U:
				node = new Node(tail.row + 1, tail.col, tail.dir);
				break;
			case R:
				node = new Node(tail.row, tail.col - 1, tail.dir);
				break;
			case D:
				node = new Node(tail.row - 1, tail.col, tail.dir);
				break;
		}
		tail.next = node;
		tail = node; 
	}
	
	public void addToHead () {
		Node node = null;
		switch (head.dir) {
			case L:
				node = new Node(head.row, head.col -	 1, head.dir);
				break;
			case U:
				node = new Node(head.row - 1, head.col, head.dir);
				break;
			case R:
				node = new Node(head.row, head.col + 1, head.dir);
				break;
			case D:
				node = new Node(head.row + 1, head.col, head.dir);
				break;
		}
		node.next = head;
		head = node; 
	}
	
	private class Node {
		int w = Yard.BLOCK_SIZE;
		int h = Yard.BLOCK_SIZE;
		int row, col;
		Dir dir = Dir.L;
		Node next;
		
		Node(int row, int col, Dir dir) {
			this.row = row;
			this.col = col;
			this.dir = dir;
		}
		
		void draw(Graphics g) {
			Color c = g.getColor();
			g.setColor(Color.BLACK);
			g.fillRect(Yard.BLOCK_SIZE * row, Yard.BLOCK_SIZE * col, w, h);
			g.setColor(c);
			
		}
	}
	
}
