import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Ex4 {

    public static void main(String[] args) throws IOException {

        System.out.println("Drengenavne i alt : " + Files.lines(Paths.get("drengenavne.txt")).count());
        System.out.println("Pigenavne i alt : " + Files.lines(Paths.get("pigenavne.txt")).count());

        System.out.println("Drengenavne med \"p\" i  alt : " + Files.lines(Paths.get("drengenavne.txt")).map(name -> name.charAt(0)).count());
    }
}
