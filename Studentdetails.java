import java.util.*;

interface Details{
// Scanner sc1 = new Scanner(System.in);
	 // public: 
		public String stuname(int i);
		int marks(int i);
		String favsub1(int i);

}

class Stdetails implements Details{
	Scanner sc = new Scanner(System.in);
	public  String stuname(int i){
				System.out.println("Enter name of "+(i+1)+" student");
					String str = sc.next();
					return(str);
						}
			public int marks(int i){
				System.out.println("Enter marks of "+(i+1)+" student");
					int mark = sc.nextInt();
					return mark;
						}
		   public  String favsub1(int i){
				System.out.println("Enter favourite subject of "+(i+1)+" student");
					String str1 = sc.next();
					return str1;
						}
}
class Studentdetails{
	public static void main(String[] args){
		// Scanner sc = new Scanner(System.in);
			System.out.println("Enter number of students ?");
			Scanner sc = new Scanner(System.in);
			int total = sc.nextInt();
			String strname[] = new String[total];
			int marks[] = new int[total];
			String favsub[] = new String[total];
			
			Stdetails d = new Stdetails();
			for(int i=0; i<total; i++){
				strname[i] = d.stuname(i);
				marks[i] = d.marks(i);
				favsub[i] = d.favsub1(i);
			}
		
		for(int i=0; i<total; i++){
			System.out.println("Name is "+strname[i]+" marks is "+marks[i]+" favourite subject is "+favsub[i]);
		}
	
}}