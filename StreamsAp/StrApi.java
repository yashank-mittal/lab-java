package StreamsAp;

import java.util.stream.*;
import java.util.*;

public class StrApi {
    public static void main(String[] args)
    {
        List<Integer> l = Arrays.asList(1,3,2,4,6,5,8,7,9);
        Stream<Integer> streamData = l.stream();
        Stream<Integer> finalStream = streamData.filter(n->n%2!=0).sorted();
        finalStream.forEach(n->System.out.println(n));
    }
}
