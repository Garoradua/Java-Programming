//Please mention coding question below 
import java.util.*;

public class Merge {
   /* 
    *   The class can only be Main
    */
  
	public static void main(String []args) {
		// code here
        int[] array1 = {1,2,5,8,9};
        int[] array2 = {3,4,6,7,10};
        // mergedArray = MergingArray(array1, array2, mergedArray);
        System.out.println(MergingArray(array1, array2));
    }


    public static int[] MergingArray(int[] array1, int[] array2){

        Arrays.sort(array1);
        Arrays.sort(array2);
        int[] mergedArray = new int[array1.length + array2.length];
        // int[] mergedArray = new int[array1.length + array2.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<array1.length && j<array2.length){
            if(array1[i] <= array2[i]){
                mergedArray[k++] = array1[i++];
            }else{
                mergedArray[k++] = array2[j++];
            }
        }

        return mergedArray;
    }

}