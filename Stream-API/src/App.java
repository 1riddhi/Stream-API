import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        List<Integer> list=Arrays.asList(1,2,3,4,9,8,7,6,5,0);

        list.stream().forEach(num->System.out.println(num));
    }
}
