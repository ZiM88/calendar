import java.util.Date;
import java.util.Calendar;

public class CalenfdarExampl {
    public static void main(String[] args) {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.WEEK_OF_MONTH, 3);
        System.out.println(calendar.getTime());
    }
}
