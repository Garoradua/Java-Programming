import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class streamAPi2 {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNos = numbers.stream().map(n-> n%2==0?n+1:n-1).collect(Collectors.toList());
        System.out.println(evenNos);
    }
    
}
