package classRoom;

import org.apache.groovy.parser.antlr4.GroovyParser;

import java.util.ArrayList;
import java.util.List;

public class CellsInRange {

    public static void main(String[] args) {
        cellsInRange("A1:F3");
    }

    public static List<String> cellsInRange(String s) {
        String[] split=s.split(":");
        int lowerLimit=Character.getNumericValue(split[0].charAt(split[0].length()-1));
        int upperLimit=Character.getNumericValue(split[1].charAt(split[1].length()-1));
        int lengthOfIteration=split[1].charAt(0)-split[0].charAt(0);
        int start=split[0].charAt(0);
        List<String> list=new ArrayList<>();
        for(int i=0;i<=lengthOfIteration;i++){
            for(int j=lowerLimit;j<=upperLimit;j++){
                int value=start+i;
                char col= (char) value;
                list.add(String.valueOf(col)+j);
            }
        }
        System.out.println(list);
        return list;
    }
}
