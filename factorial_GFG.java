class Solution {

    public long factorial(int N) {
        // Your code here
        long sum=1;
        while(N>0){
            sum = sum*N;
            N--;
        }
        return sum;
    }
}
