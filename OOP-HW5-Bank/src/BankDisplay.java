import java.awt.event.WindowEvent;
import javax.swing.JFrame;

public class BankDisplay extends JFrame {

	public void refresh() {;
	}
	
	public void close()
	{
		dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
	}

}
