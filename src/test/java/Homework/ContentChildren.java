package Homework;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class ContentChildren {

    @Test
    public void test(){
        Assert.assertEquals(2,findContentChildren(new int[]{1,2},new int[]{1,2,3}));
    }

    @Test
    public void test2(){
        Assert.assertEquals(1,findContentChildren(new int[]{1,2,3},new int[]{3}));
    }

    @Test
    public void test1(){
        Assert.assertEquals(99,findContentChildren(new int[]{262,437,433,102,438,346,131,160,281,34,219,373,466,275,51,118,209,32,108,57,385,514,439,73,271,442,366,515,284,425,491,466,322,34,484,231,450,355,106,279,496,312,96,461,446,422,143,98,444,461,142,234,416,45,271,344,446,364,216,16,431,370,120,463,377,106,113,406,406,481,304,41,2,174,81,220,158,104,119,95,479,323,145,205,218,482,345,324,253,368,214,379,343,375,134,145,268,56,206},new int[]{149,79,388,251,417,82,233,377,95,309,418,400,501,349,348,400,461,495,104,330,155,483,334,436,512,232,511,40,343,334,307,56,164,276,399,337,59,440,3,458,417,291,354,419,516,4,370,106,469,254,274,163,345,513,130,292,330,198,142,95,18,295,126,131,339,171,347,199,244,428,383,43,315,353,91,289,466,178,425,112,420,85,159,360,241,300,295,285,310,76,69,297,155,416,333,416,226,262,63,445,77,151,368,406,171,13,198,30,446,142,329,245,505,238,352,113,485,296,337,507,91,437,366,511,414,46,78,399,283,106,202,494,380,479,522,479,438,21,130,293,422,440,71,321,446,358,39,447,427,6,33,429,324,76,396,444,519,159,45,403,243,251,373,251,23,140,7,356,194,499,276,251,311,10,147,30,276,430,151,519,36,354,162,451,524,312,447,77,170,428,23,283,249,466,39,58,424,68,481,2,173,179,382,334,430,84,151,293,95,522,358,505,63,524,143,119,325,401,6,361,284,418,169,256,221,330,23,72,185,376,515,84,319,27,66,497}));
    }

    /**
     1.input is two array g[] (greed factor) of each child and s[](size of each cookie)
     2.if the number of cookies is greater than the greed factor then assign the difference to s[j] and make
      g[i] to ) indicating the kid is content
     3.finally find the number of Zeros in g[i] array which is the number of content kido/p */
    public int findContentChildren(int[] g, int[] s) {
        int count=0;
        Arrays.sort(g);
        for(int j=0;j<s.length;j++){
            for(int i=g.length-1;i>=0;i--){
                if(s[j]>=g[i]){//3>=3
                    s[j]=s[j]-g[i];
                    g[i]=0;
                }
            }
        }
        for(int each:g){
            if(each==0){
                count++;
            }
        }
        return count;
    }
}
