package classes;

import java.util.Calendar;
import java.util.Date;

public class DateCalendarClass {
        public static void main(String[] args) {
                Date d = new Date(); // tanggal sekarang
                Date d2 = new Date(1599840000000L); // 12 september 2020
                long dm = d.getTime(); // milisecond waktu sekarang
                System.out.println(d);
                System.out.println(dm);
                System.out.println(d2);

                Calendar c = Calendar.getInstance();
                c.set(Calendar.YEAR, 1997);
                c.set(Calendar.MONTH, Calendar.JANUARY);
                c.set(Calendar.DAY_OF_MONTH, 20);

                // ubah jadi data tanggal
                Date r = c.getTime();
                System.out.println(r);
        }
}
