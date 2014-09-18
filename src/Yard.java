import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Yard extends Frame {

	private static final int ROWS = 100;
	private static final int COLS = 100;
	private static final int BLOCK_SIZE = 5;
	
	//image 
	
	public void launch() {
		this.setLocation(200, 200);
		this.setSize(COLS * BLOCK_SIZE, ROWS * BLOCK_SIZE);
		this.addWindowListener(new WindowAdapter(){

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		this.setVisible(true);
	}
	
	// 12 minites
	
	public static void main(String[] args) {
		new Yard().launch();

	}

}
