import java.util.*;
import java.util.stream.*;

public class App {
    public static void main(String[] args) throws Exception {
        List<Integer> list=Arrays.asList(1,2,3,4,9,8,7,6,5,0);

        list.stream().forEach(num->System.out.print(num+" "));
        System.out.println();

        list.stream().map(num->2*num).forEach(num->System.out.print(num+" "));
        System.out.println();

        List<Integer> newList=list.stream().collect(Collectors.toList());

        System.out.println(newList);

        List<Integer> evenNums=list.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(evenNums);

        System.out.println("First even number in list: "+list.stream().filter(n->n%2==0).findFirst());
    }
}
