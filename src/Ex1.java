import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Ex1 {

    public static void main(String[] args) {

        List<String> names= Arrays.asList("peter","jan","john","janne","celine");
       // names.stream().map(name -> name.toUpperCase()).forEach(System.out::println);

        // Printer ud så det første bogstav er stort
        names.stream().map(name -> name.substring(0,1).toUpperCase() + name.substring(1)).forEach(System.out::println);

        System.out.println();

        // Printer ud så de er i alfabetisk rækkefølge
        names.stream().map(name -> name.substring(0,1).toUpperCase() + name.substring(1)).sorted().forEach(System.out::println);

        System.out.println();

        // Printer ud så den er i omvendt rækkefølge
       // names.stream().map(name -> name.substring(0,1).toUpperCase() + name.substring(1)).distinct().forEach(System.out::println);

        System.out.println();

        // Printer ud så den er i omvendt rækkefølge
        names.stream().map(name -> name.substring(0,1).toUpperCase() + name.substring(1)).sorted(Comparator.reverseOrder()).forEach(System.out::println);


        System.out.println();

        String str = " \"Sorted names as String : " + names.stream().map(name -> name.substring(0,1).toUpperCase() + name.substring(1)).sorted(Comparator.reverseOrder()).collect(Collectors.joining(",")) + "\"";
        System.out.println(str);

        // Change the example above to return a single string, like this:
        //"Sorted names as String : Peter,John,Janne,Jan,Celine"



        /*
        Distinct virker ikke. Prøv at se den som den printer ud. Det er kun Peter og celine den sætter til sidst. Jan John og Jens er forkert indeni.
         */
    }

}
