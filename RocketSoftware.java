class RocketSoftware{
	public static void main(String[] args){
		String str = "my name is gourav";
		int len = str.length();
		int arr[] = new int[128];
		for(int i=0; i<len; i++){
			if(str.charAt(i)==' '){
				continue;
			}
			int x = str.charAt(i)-'a';
			arr[x]++;
		}
		for(int i=0; i<128; i++){
			if(arr[i]!=0){
				System.out.println(i+'a');
				System.out.print(arr[i]); 
			}
		}
	}
} 