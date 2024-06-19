public class stockbuysell {
    public static void main(String[] args){
        int[] price = {1,5,3,8,12};
        int len = price.length;
        int profit = 0;
        for(int i=1; i<len; i++){
            if(price[i] > price[i-1]){
                profit += price[i]-price[i-1];
            }
        }
        System.out.println(profit);
    }
}
