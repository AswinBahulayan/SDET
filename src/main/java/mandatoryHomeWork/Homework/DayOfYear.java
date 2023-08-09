package mandatoryHomeWork.Homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DayOfYear {

    @Test
    public void test(){
        Assertions.assertEquals(9,dayOfYear("2019-01-09"));
    }


    @Test
    public void test1(){
        Assertions.assertEquals(41,dayOfYear("2019-02-10"));
    }
    public int dayOfYear(String date) {
        try {
            Date convertedDate = new SimpleDateFormat("yyyy-MM-dd").parse(date);
            Calendar cal=new GregorianCalendar();
            cal.setTime(convertedDate);
            return cal.get(Calendar.DAY_OF_YEAR);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
