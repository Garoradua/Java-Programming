public class searchInSortedMatrix {
    public static void main(String[] args){
        int[][] arr = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int row = arr.length-1;
        int col = arr[0].length-1;
        int i = 0;
        int j = col;
        int target = 100;
        while(i<=row && j>=0){
            if(arr[i][j]==target){
                System.out.println(i+""+j);
                return;
            }else if(arr[i][j]<target){
                i++;
            }else{
                j--;
            }
        }
        System.out.println("Not found");
    }
}
