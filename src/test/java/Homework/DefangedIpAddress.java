package Homework;

public class DefangedIpAddress {

    public static void main(String[] args) {
        System.out.println(defangedIpAddress1("1.1.1.1.1"));
    }

    public static String defangedIpAddress(String ip){
        String op="";
        String[] split = ip.split("\\.");
        for (int i=0;i<split.length;i++) {
            if(i!=split.length-1) {
                op += split[i] + "[.]";
            }else{
                op+=split[i];
            }
        }
        return op;
    }

    public static String defangedIpAddress1(String ip){
        String op="";
        String[] split = ip.split("\\.");
        for (int i=0;i<ip.length();i++) {
           if(ip.charAt(i)!=46 && i!=ip.length()-1){
                op+=ip.charAt(i)+"[.]";
           }else if (i==ip.length()-1){
               op+=ip.charAt(i);
           }
        }
        return op;
    }
}
