package jojo;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.net.MalformedURLException;
import java.net.URL;
import java.awt.event.WindowAdapter;

public class ImgTest2 extends Frame{
	Image img;
	public ImgTest2() {
		String str="https://cndreams.com/dir_attach/img_news/news_img1_1448912807.jpg";
		try{URL url = new URL(str);
			img = Toolkit.getDefaultToolkit().getImage(url);
		} catch (MalformedURLException e) {}
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		setSize(300,300);
		setVisible(true);
				
	}
	public void paint(Graphics g) {
		g.drawImage(img, 0, 20, this);
	}
	public static void main(String[] args) {
		new ImgTest2();
	}
}
