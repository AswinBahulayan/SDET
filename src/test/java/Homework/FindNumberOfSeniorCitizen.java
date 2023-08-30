package Homework;

public class FindNumberOfSeniorCitizen {
    public static void main(String[] args) {
        System.out.println(countSeniors(new String[]{"7868190130M7522","5303914400F9211","9273338290F4010"}));
    }

    public static int countSeniors(String[] details) {
        String age="";
        int count=0;
        for (int i = 0; i < details.length; i++) {
            String ms = details[i].substring(11,13);
            details[i]=ms;
            if(Integer.parseInt(details[i]) > 60 )count++;
        }
        return count;
    }
}
