package jojo;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;
public class Directory1 {
	public static void main(String[] args) throws IOException {
		// ch19안에 src안에 ch19패키지에 있는 내용을 읽어서 path저장
		Path path = Paths.get("src/jojo/");
		Stream<Path> stream = Files.list(path);
		stream.forEach(p->System.out.println(p.getFileName()));
		stream.close();
	}
}
