package jojo;
import java.io.File;
import java.io.IOException;
import java.util.Date;
public class Dir1 {
	public static void main(String[] args) throws IOException{
		File dir = new File(".");
	System.out.println(dir.getAbsolutePath());
	System.out.println(dir.getCanonicalPath());
	System.out.println(dir.lastModified());
	System.out.println(dir.length());
	System.out.println(dir.canRead());
	System.out.println(dir.canWrite());
		
	}
}
