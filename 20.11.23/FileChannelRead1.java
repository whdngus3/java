package jojo;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileChannelRead1 {
	public static void main(String[] args) throws IOException{
		Path path = Paths.get("c:/java/file.txt");
		FileChannel fc = FileChannel.open(path, StandardOpenOption.READ);
		ByteBuffer bf = ByteBuffer.allocate(100);
		Charset ch = Charset.defaultCharset();
		String str="";
		int byteCount = 0;
		while(true) {
			byteCount = fc.read(bf);
			if (byteCount == -1) break;
			bf.flip();
			str += ch.decode(bf).toString();
			bf.clear();
		}
		fc.close();
		System.out.println(str);
	}
}
