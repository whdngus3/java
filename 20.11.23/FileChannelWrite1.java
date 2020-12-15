package jojo;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.io.IOException;


public class FileChannelWrite1 {
	public static void main(String[] args)  throws IOException{
		Path path = Paths.get("c:/java/file.txt");
		FileChannel fc = FileChannel.open(path, StandardOpenOption.CREATE,
				StandardOpenOption.WRITE);
		String str ="안녕 바보들!";
		Charset ch = Charset.defaultCharset();
		ByteBuffer bf = ch.encode(str);
		int byteCount = fc.write(bf);
		System.out.println("저장완료:" +byteCount);
		fc.close();
	}
}
