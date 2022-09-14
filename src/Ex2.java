import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex2 {

    public static void main(String[] args) {


        // Udprinter antal tal der er i rangen
       // System.out.println(IntStream.range(1,21).count());

        // udprinter totalen af tallene
        //System.out.println(IntStream.range(1,21).sum());

        // udprinter gennemsnittet
        // System.out.println( IntStream.range(1,21).average().getAsDouble());



       // IntStream.range(1,21).map(number -> number * number ).limit(6).forEach(System.out::println);

        IntStream.range(1,21).map(number -> number * number ).filter(number -> number % 2 ==0).forEach(System.out::println);



        //IntStream stream = IntStream.range().map()


        //IntStream.iterate(1,i -> (int) (i^2)).limit(6).forEach(System.out::println);


    }
}
