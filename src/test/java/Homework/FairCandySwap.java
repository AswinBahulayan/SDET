package Homework;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FairCandySwap {

    @Test
    public void test(){
        fairCandySwap(new int[]{1,1},new int[]{2,2});
    }


    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA=0,sumB=0,average=0;
        List<Integer> list=new ArrayList<>();
        Set<Integer> alice=new HashSet<>();
        Set<Integer> bob=new HashSet<>();
        int[] out=new int[2];
        for(int e:aliceSizes){
            sumA+=e;
            alice.add(e);
        }
        for(int e:bobSizes){
            sumB+=e;
            bob.add(e);
        }
        average=sumA+sumB;
        average=average/2;
        if(bob.contains(average-(sumA)) && alice.contains(average-(sumB))){
            out[0]=average-(sumA);
            out[1]=average-(sumB);
            return out;
        }else{
            return new int[]{0,0};
        }
    }
}
