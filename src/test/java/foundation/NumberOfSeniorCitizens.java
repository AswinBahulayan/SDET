package foundation;

public class NumberOfSeniorCitizens {

    public static void main(String[] args) {
        countSeniors(new String[]{"7868190130M7522","5303914400F9211","9273338290F4010"});
    }

    public static int countSeniors(String[] details) {
        String age="";
        for (int i = 0; i < details.length; i++) {
            if(details[i].contains("M")){
                String[] ms = details[i].split("M") ;
                for (int j = 0; j <2 ; j++) {
                   age += ms[ms.length - 1].charAt(j);
                }
                details[i]=age;
                age="";
            }else {
                String[] ms = details[i].split("F");
                for (int j = 0; j <2 ; j++) {
                    age += ms[ms.length - 1].charAt(j);
                }
                details[i]=age;
                age="";
            }
        }
        int count=0;
        for (int i = 0; i <details.length ; i++) {
            if(Integer.valueOf(details[i])>60){
                count++;
            }
        }
        return count;
    }

}
