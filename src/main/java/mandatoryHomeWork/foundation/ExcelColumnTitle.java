package mandatoryHomeWork.foundation;

public class ExcelColumnTitle {

    public static void main(String[] args) {
        convertToTitle(701);
    }
    /*1.if colNum is 28 28/26 gives the first char which is A('A'+28/26-1) and second digit is B('A'+28%26-1)
      2.*/
    public static String convertToTitle(int columnNumber) {
        String columnTitle="";
        int lastChar=0;
       while(columnNumber>0){
           lastChar=columnNumber%26;
         if(lastChar>0){
             columnTitle=columnTitle+(char)('A'+lastChar-1);
             columnNumber=columnNumber/26;
         }else{
             columnTitle=columnTitle+'Z';
             columnNumber=columnNumber/26-1;
         }
       }
       String temp="";
        for (int j = columnTitle.length()-1; j >=0; j--) {
            temp+=columnTitle.charAt(j);
        }
        return temp;
    }
}
