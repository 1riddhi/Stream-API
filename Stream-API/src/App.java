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

        System.out.println("Minimum even number in number stream: "+list.stream().filter(n->n%2==0).min(Integer::compareTo));
        System.out.println("Maximum even number in number stream: "+list.stream().filter(n->n%2==0).max(Integer::compare));

        System.out.println("Average: "+list.stream().mapToDouble(Integer::doubleValue).average());
        System.out.println("Sum: "+list.stream().reduce(0,(a,b)->a+b));

        System.out.println("All numbers are even: "+list.stream().allMatch(n->n%2==0));
        System.out.println("Atleast one number is even:"+list.stream().anyMatch(n->n%2==0));
        
        System.out.print("Sorted list: ");
        list.stream().sorted().forEach(n->System.out.print(n+" "));
        System.out.println();
    }
}

