import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Ex4 {

    public static void main(String[] args) throws IOException {

        System.out.println("Drengenavne i alt : " + Files.lines(Paths.get("drengenavne.txt")).count());
        System.out.println("Pigenavne i alt : " + Files.lines(Paths.get("pigenavne.txt")).count());

        System.out.println("Drengenavne med \"p\" i  alt : " + Files.lines(Paths.get("drengenavne.txt")).filter(name -> name.substring(0,1).contains("P")).count());

        System.out.println("Top 10 drengenavne som starter med \"p\" i  alt : " );  Files.lines(Paths.get("drengenavne.txt")).filter(name -> name.substring(0,1).contains("P")).limit(10).forEach(System.out::println);

        System.out.println();

        System.out.println("Alle drengenavne med \"p\", men første 400 er skippet. i  alt : " );  Files.lines(Paths.get("drengenavne.txt")).filter(name -> name.substring(0,1).contains("P")).skip(400).forEach(System.out::println);

        System.out.println();

        System.out.println("Alle drengenavne med Peter i, i  alt : " );  Files.lines(Paths.get("drengenavne.txt")).filter(name -> name.contains("Peter")).forEach(System.out::println);

        System.out.println();

        System.out.println("Alle pigenavne med Anna i, i  alt : " );  Files.lines(Paths.get("pigenavne.txt")).filter(name -> name.contains("Anna")).forEach(System.out::println);

        System.out.println();

        System.out.println("Alle drengenavne med peter i, i  alt : " );  Files.lines(Paths.get("drengenavne.txt")).filter(name -> name.contains("peter")).forEach(System.out::println);

        System.out.println();

        System.out.println("Alle pigenavne med anna i, i  alt : " );  Files.lines(Paths.get("pigenavne.txt")).filter(name -> name.contains("anna")).forEach(System.out::println);

        System.out.println();

        System.out.println("Alle drengenavne med Peter eller peter i, i  alt : " );  Files.lines(Paths.get("drengenavne.txt")).filter(name -> name.contains("Peter") || name.contains("peter")).forEach(System.out::println);

        System.out.println();

        System.out.println("Alle pigenavne med Anna eller anna i, i  alt : " );  Files.lines(Paths.get("pigenavne.txt")).filter(name -> name.contains("Anna") || name.contains("anna")).forEach(System.out::println);


    }
}
