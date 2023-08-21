package classRoom;


/*public void test(){
    Ass
        }*/
public class SumAndSubtract {

    public int[] sumAndSubtract(int[] a,int[] b){
        int sum=0;
        int[] output=new int[a.length];
        for (int i = 0; i < a.length; i++) { //o[n]
            for (int j = 0; j < b.length; j++) {//o[n]*o[n] =o[n^2]
                if(i!=j)sum+=b[j];
            }
            output[i]=sum-a[i];

        }
        return output;
    }
}
