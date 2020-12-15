package jojo;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class ImgTest1 extends Frame{
	Image img;
	public ImgTest1() {
		img=Toolkit.getDefaultToolkit().getImage("lenna.PNG");
		setSize(300,300);
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	public void paint(Graphics g) {
		g.drawImage(img, 0, 0, this);
	}
}
