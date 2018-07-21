package java8Date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 小武 on 2018/7/6.
 */
public class Date1 {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/M/yyyy");
        String date = simpleDateFormat.format(new Date());
        System.out.println(date); //15/10/2013
    }
}
