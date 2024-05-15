abstract class vehicle{
    String colour = "blue";
    String gear;
    public void gear(){
        this.gear= "manual";
    }
}

class Audi extends vehicle{

    String colour = "Red";

    public void gear(){
        this.gear = "Automatic";
    }
}
public class masterca{
    public static void main(){

    }
}


class Employee{
    int id;
    String firstname;
    String Lastname;
    double salary;
}
emplist;

List<long> salaries = new ArrayList<>();
salaries = emplist.stream().map( {
    foreach(long salary : emplist){
        salary += emplist.salary
    }
})





class Node{
    int data;
    Node next;
    int length = 0;

    Node(int val){
        this.data = val;
        next = null;
        length++;
    }
}
// lengthList(Node head){
//     int length =0;
//     Node temp = head;
//     while(temp!=null){
//         length++;
//         temp = temp.next;
//     }
//     return length;
// }

printList(Node head, int middle){
    Node slowPointer = head;
    Node firstPointer = head;

    while(firstpointer.next!=null){
        firstpointer = fastpointer.next.next;
        slowPointer = slowpointer.next;
    }
    slowPointer = slowPointer.next;
    sout(slowPointer.data);

    // Node temp = head;
    // for(int i=1; i<=middle; i++){
    //     temp = temp.next;
    // }
    // sout(temp.data);
}
main(){
    Node head = new Node(1);
    head.next = mew Node(2);
    head.next.next = new Node(1);
    head.next.next.next = mew Node(2);

    // int length = lengthList(head);
    // int middle = length/2;

    printList(head)
}



String abc = "fdfndjfnjggfd"

map<char, Integer> newMap = new HashMap<>();
char character;
int value = 0;
foreach(int i=0; i<abc.length(); i++){
    character = abc.charAt(i);
    value = newmap(character).getValue();
    value++;
    newMap.add(character, value );
}
newMap.sort(character, value);

Eomployee
id 
name
salary
departmnt 


select MAX(salary) from epmployee Group BY Department order by Salary DESC ;

select * from Employee order By salary DESC LIMIT(3,1)