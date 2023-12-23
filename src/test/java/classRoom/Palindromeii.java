package classRoom;

public class Palindromeii {

    public void palindromeII(String a){
        int left=0,right=a.length()-1;
        char[] charArray = a.toCharArray();
        while (left<right){
            if((charArray[left]>=97 && charArray[left]<=122) && (charArray[right]>=97 && charArray[right]<=122)){
                char temp=charArray[left];
                charArray[left]=charArray[right];
                charArray[right]=temp;
                left++;
                right--;
            }else if((charArray[left]>=65 && charArray[left]<=90) && (charArray[right]>=65 && charArray[right]<=90)){
                charArray[left] = (char)(charArray[left] + 32);
                charArray[right] = (char)(charArray[right] + 32);
                char temp=charArray[left];
                charArray[left]=charArray[right];
                charArray[right]=temp;
                left++;
                right--;
            }else if((charArray[left]>=65 && charArray[left]<=90) && (charArray[right]>=97 && charArray[right]<=122)){
                charArray[left] = (char)(charArray[left] + 32);
                char temp=charArray[left];
                charArray[left]=charArray[right];
                charArray[right]=temp;
                left++;
                right--;
            }else if((charArray[left]>=97 && charArray[left]<=122) && (charArray[right]>=65 && charArray[right]<=90)){
                charArray[right] = (char)(charArray[right] + 32);
                char temp=charArray[left];
                charArray[left]=charArray[right];
                charArray[right]=temp;
                left++;
                right--;
            } else if (!(charArray[left]>=97 && charArray[left]<=122) || !(charArray[left]>=65 && charArray[left]<=90)) {
                left++;
            } else if(!(charArray[right]>=97 && charArray[right]<=122) || !(charArray[right]>=65 && charArray[right]<=90)){
                right--;
            }
        }
    }
}
