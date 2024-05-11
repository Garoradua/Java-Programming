class Solution {
    public ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        // code here
        int D = b*b - 4*a*c;
        ArrayList<Integer> roots = new ArrayList<>();
        if(D<0){
            roots.add(-1);
            return roots;
        }else{
            double first = -b + Math.sqrt(D);
            first = Math.floor(first/(2*a));
            double second = -b - Math.sqrt(D);
            second = Math.floor(second/(2*a));
            roots.add((int)Math.max(first, second));
            roots.add((int)Math.min(first, second));
            return roots;
        }
    }
}
