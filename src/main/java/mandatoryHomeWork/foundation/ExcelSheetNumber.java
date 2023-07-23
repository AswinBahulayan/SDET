package mandatoryHomeWork.foundation;

public class ExcelSheetNumber {

    /*
    * FXSHRXW
    *100000+
    * */
    public static void main(String[] args) {
        System.out.println(titleToNumber("FXSHRXW"));
    }
    public static int titleToNumber(String columnTitle) {
        int columnNumber=0;
        for (int i = 0; i < columnTitle.length(); i++) {
           columnNumber=columnNumber*26+(columnTitle.charAt(i)-'A'+1);
        }
        return columnNumber;
    }
}
