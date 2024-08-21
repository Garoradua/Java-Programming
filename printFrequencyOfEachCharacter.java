import java.util.Scanner;

import java.util.*;
public class printFrequencyOfEachCharacter {
    public static void findOccurence(String str){
        int[] total = new int[26];
        for(int i=0; i<str.length(); i++){
            total[str.charAt(i)-'a']++;
        }
        for(int i=0; i<26; i++){
            if(total[i]>0){
                System.out.println((char)(i+97) + " " +total[i] );
                // System.out.println(total[i]);
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        findOccurence(name);
    }
}
