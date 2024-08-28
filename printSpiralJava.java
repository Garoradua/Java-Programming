public class printSpiralJava {
    public static void main(String[] args){
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},{17,18,19,20}};
        int row = arr.length;
        int column = arr[0].length;
        int top = 0;
        int bottom = row-1;
        int right = column-1;
        int left = 0;
        while(top<=bottom && left <= right){ 
        for(int i=left; i<=right; i++){
            System.out.print(arr[top][i] + " ");
        }
        top++;
        for(int i=top; i<=bottom; i++){
            System.out.print(arr[i][right] + " ");
        }
        right--;
        if(top<=bottom){
        for(int i=right; i>=left; i--){
            System.out.print(arr[bottom][i] + " ");
        }
    }
        bottom--;
        if(left<=right){
        for(int i=bottom; i>=top; i--){
            System.out.print(arr[i][left] + " ");
        }
    }
        left++;
    }
    }
}
