import java.util.*;
import java.util.stream.Collectors;
public class ListOperations {
    public static void main(String[] args){
    //     List<String> list = Arrays.asList("banana", "cherry", "amrud", "apple");
    //     List<String> newList  = list.stream().filter(a -> a.startsWith("a")).map(a -> a+a).collect(Collectors.toList());
    //     System.out.println(newList);
    // }

//     List<List<String>> listOfLists = Arrays.asList(
//     Arrays.asList("apple", "banana"),
//     Arrays.asList("cherry", "date")
// );
// List<String> flattenedList = listOfLists.stream()
//                                          .flatMap(List :: stream)
//                                          .collect(Collectors.toList());
// System.out.println(flattenedList);

Integer[] arr = {1,2,3,4,5,6,78,9,0,5,4,34,4};
List<Integer> list = Arrays.asList(arr);
List<Integer> newList = list.stream().filter(n->n>5).collect(Collectors.toList());
System.out.println(newList);
}
}
