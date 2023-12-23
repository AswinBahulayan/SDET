package classRoom;

import org.junit.Assert;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.*;

public class ArrayInternals {

    public static void main(String[] args) {
        String[] strings = {"a", "bc"};
        System.out.println(String.join("",strings));
       /* String a="Test";
        System.out.println(Arrays.toString(a.split("\\s")));*/
       /* Map<String,String> map=new HashMap<>();
        int a = 20, b =10, c=30;
        *//*System.out.println(a++);
        System.out.println(a<b);
        System.out.println(a++>c);*//*
        System.out.println(a<b && a++>c);
        System.out.println(a);*/
        int length=16;
        String b="John";
        int hash = b.hashCode();
        int boxedValue=hash>>>16;
        System.out.println(Integer.toBinaryString(hash));
        System.out.println(boxedValue);
        System.out.println(length-1&boxedValue);
//        int length=16;
         b="Joe";
         hash = b.hashCode();
         boxedValue=hash>>>16;
        System.out.println(Integer.toBinaryString(hash));
        System.out.println(boxedValue);
        System.out.println(length-1&boxedValue);
       /* Map<Integer,Integer> map=new HashMap<>();
        Map<Integer,Integer> map1=new HashMap<>();*/
       /* int count=0;
       map.equals(map1);
       map.isEmpty();*/
    }

    public Map<Character,Integer> getMap(String s){
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }else{
                map.put(s.charAt(i),1);
            }
        }
        return map;
    }

    @Test
    public void test(){
        Assert.assertArrayEquals(new int[]{1,2},fairCandySwap(new int[]{1,1},new int[]{2,2}));
    }

    @Test
    public void test1(){
        Assert.assertArrayEquals(new int[]{5,4},fairCandySwap(new int[]{1,2,5},new int[]{2,4}));
    }

    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int left=0 ,right=0,sum1=0,sum2=0,average=0;
        sum1=sum(aliceSizes);
        sum2=sum(bobSizes);
        average=sum1+sum2;
        average/=2;
        Set<Integer> set=new HashSet<>();
        for (int a:
             bobSizes) {
            set.add(a);
        }
        for (int i = 0; i < aliceSizes.length; i++) {
            if(set.contains(average-aliceSizes[i])){
                int one=average-aliceSizes[i];
                int two=sum2-one;
                return new int[]{one,two};
            }
        }
        return new int[]{0,0};
    }

    public void swap(int[] aliceSizes,int[] bobSizes,int right,int left){
        int temp=aliceSizes[right];
        aliceSizes[right]=bobSizes[left];
        bobSizes[left]=temp;
    }

    public int sum(int[] a){

        int sum=0;
        for (int each:
                a) {
            sum+=each;
        }
        return sum;
    }
}
