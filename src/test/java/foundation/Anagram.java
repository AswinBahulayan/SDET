package foundation;

import java.util.Arrays;

public class Anagram {


    public static void main(String[] args) {
        System.out.println(isAnagram("a","ab"));
    }
    public static boolean isAnagram(String s, String t) {
        boolean flag=true;
        char[] arr1=s.toCharArray();
        char[] arr2=t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(arr1.length==arr2.length){
            for(int i=0;i<arr1.length;i++){
                if(arr1[i]!=arr2[i]){
                    return false;
                }
            }
        }else{
                for (int i = 0; i < arr1.length; i++) {
                    for (int j = 0; j < arr2.length; j++) {
                        if(arr1[i]!=arr2[j]){
                            return false;
                        }
                    }
                }
            }
        return  false;
        }
}
