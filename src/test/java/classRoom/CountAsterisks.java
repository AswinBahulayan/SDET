package classRoom;

public class CountAsterisks {
/*
* https://leetcode.com/problems/count-asterisks/submissions/*/
    public int countAsterisks(String s) {
        char[] string=s.toCharArray();
        int count=0;
        int asterisks=0;
        boolean flag=false;
        for(int i=0;i<string.length;i++){
            if(count==0 && string[i]=='*'){
                asterisks++;
            }
            if(string[i]=='|'){
                count++;
                if(count%2==0){
                    flag=true;
                }else{
                    flag=false;
                }
            }
            if(flag){
                if(string[i]=='*'){
                    asterisks++;
                }
            }
        }
        return asterisks;
    }
}
