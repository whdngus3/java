package jojo;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class File1 {
	public static void main(String[] args) throws IOException{
		Path path = Paths.get("src/jojo/test.txt");
		Stream<String> stream = Files.lines(path,Charset.defaultCharset());
		stream.forEach(System.out::println);
		stream.close();
	}
}
