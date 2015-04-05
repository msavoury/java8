import java.util.function.*;
import java.util.*;

public class PredicatePlay {

    public static void main(String [] args) {
        List<String> list = new ArrayList<String>();
        list.add("erlang");
        list.add("python");
        list.add("java");
        list.add("ruby");
        list.add("scala");
        list.add("c++");
        list.add("c");

        printPass(list, s -> s.length() > 4);
    }

    public static <T> void printPass(List<T> list, Predicate<T>  p) {
        for(T t : list) {
            if (p.test(t))
                System.out.println( t +" passes the test");
        }
    }
}
