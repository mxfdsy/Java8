import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 小武 on 2018/7/26.
 */
public class TTT {
    public static void main(String[] args) {
        try {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String s = sdf.format(new Date());
            Date d = sdf.parse("s");
            System.out.println(d);
        }catch(Exception e){
            System.out.println(e);
        }

    }
}
