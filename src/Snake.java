import java.awt.Color;
import java.awt.Graphics;

public class Snake {
	Node head = null;
	Node tail = null;
	int size = 0;
	
	
	private class Node {
		int w = Yard.BLOCK_SIZE;
		int h = Yard.BLOCK_SIZE;
		int row, col;
		
		Node(int row, int col) {
			this.row = row;
			this.col = col;
		}
		
		void draw(Graphics g) {
			Color c = g.getColor();
			g.setColor(Color.BLACK);
			g.fillRect(Yard.BLOCK_SIZE * row, Yard.BLOCK_SIZE * col, w, h);
			g.setColor(c);
		}
	}
	
}
