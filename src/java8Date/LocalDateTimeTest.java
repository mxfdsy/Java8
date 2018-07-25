package java8Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class LocalDateTimeTest {
    public static void main(String[] args) throws ParseException {

        //Get current date time
        LocalDateTime now = LocalDateTime.now();

        System.out.println("Before : " + now);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        String formatDateTime = now.format(formatter);

        System.out.println("After : " + formatDateTime);


        ZoneId defaultZoneId = ZoneId.systemDefault();

        LocalDate localDate = new Date().toInstant().atZone(defaultZoneId).toLocalDate();
        System.out.println("------------下面----");
        LocalDate localDate1 = new Date().toInstant().atZone(defaultZoneId).toLocalDate();
        LocalDateTime localDateTime1 = LocalDateTime.now();
        System.out.println(localDate1);
        System.out.println(localDateTime1);
        System.out.println(localDate1.isBefore(ChronoLocalDate.from(localDateTime1)));

        System.out.println("-----------------------------------");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String s = sdf.format(new Date());
        Date newDate = sdf.parse(s);
        System.out.println(newDate.before(new Date()));
        System.out.println("------------上面----");


    }
}