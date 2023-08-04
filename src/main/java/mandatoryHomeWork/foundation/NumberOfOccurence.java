package mandatoryHomeWork.foundation;

public class NumberOfOccurence {

    /*
    * 1.a*/
    public int numberOfOccurence(int[] arr,int x){
        int count =0;
        if(arr.length==0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if(i==x){
                count++;
            }
        }
        return count;
    }
}
