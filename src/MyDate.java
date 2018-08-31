import java.text.SimpleDateFormat;
import java.time.MonthDay;
import java.util.Calendar;
import java.util.Locale;

public class MyDate {
    public static void main(String args[]) {
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        Calendar calendar3 = Calendar.getInstance();
        SimpleDateFormat SDF_MONTH = new SimpleDateFormat("MMM dd", Locale.US);
        SimpleDateFormat SDF_YEAR = new SimpleDateFormat("yyyy", Locale.US);
        SimpleDateFormat SDF_DAY = new SimpleDateFormat("EEEEE", Locale.US);


        //calendar2.set(Calendar.WEEK_OF_MONTH,-1);
        //calendar2.set(Calendar.DAY_OF_MONTH,1);


        calendar2.set(Calendar.HOUR_OF_DAY,0);
        calendar2.set(Calendar.MINUTE,0);
        calendar2.set(Calendar.SECOND,0);
        calendar2.set(Calendar.MILLISECOND,0);

        System.out.println("Year: " + calendar.get(Calendar.YEAR)+" "+ calendar2.get(Calendar.YEAR));
        System.out.println("Month: " + calendar.get(Calendar.MONTH)+" "+ calendar2.get(Calendar.MONTH)); // jan =0, dec=11
        System.out.println("Date: " + calendar.get(Calendar.DATE)+" "+ calendar2.get(Calendar.DATE));
        System.out.println("DAY: " + SDF_DAY.format(calendar.getTime())+" "+ SDF_DAY.format(calendar2.getTime()));
        System.out.println("DAY_OF_WEEK: " + calendar.get(Calendar.DAY_OF_WEEK)+" "+ calendar2.get(Calendar.DAY_OF_WEEK));
        System.out.println("WEEK_OF_MONTH: " + calendar.get(Calendar.WEEK_OF_MONTH)+" "+ calendar2.get(Calendar.WEEK_OF_MONTH));
        System.out.println("WEEK_OF_YEAR: " + calendar.get(Calendar.WEEK_OF_YEAR)+" "+ calendar2.get(Calendar.WEEK_OF_YEAR));
        System.out.println("*********************************************************************");

        calendar2.set(Calendar.DAY_OF_WEEK,Calendar.SUNDAY);
        calendar2.add(Calendar.DATE,-1);//To get Actual Week of The Year

        System.out.println("WEEK_OF_YEAR: " + calendar.get(Calendar.WEEK_OF_YEAR)+" "+ calendar2.get(Calendar.WEEK_OF_YEAR));
        System.out.println("Month: " + calendar.get(Calendar.MONTH)+" "+ calendar2.get(Calendar.MONTH)); // jan =0, dec=11
        System.out.println("Date: " + calendar.get(Calendar.DATE)+" "+ calendar2.get(Calendar.DATE));
        System.out.println("DAY: " + SDF_DAY.format(calendar.getTime())+" "+ SDF_DAY.format(calendar2.getTime()));

        System.out.println("*********************************************************************");

        calendar3.set(Calendar.HOUR_OF_DAY,0);
        calendar3.set(Calendar.MINUTE,0);
        calendar3.set(Calendar.SECOND,0);
        calendar3.set(Calendar.MILLISECOND,0);

        System.out.println("Hour: " + calendar.get(Calendar.HOUR_OF_DAY)+" "+ calendar3.get(Calendar.HOUR_OF_DAY));
        System.out.println("Minute: " + calendar.get(Calendar.MINUTE)+" "+ calendar3.get(Calendar.MINUTE));
        System.out.println("Second: " + calendar.get(Calendar.SECOND)+" "+ calendar3.get(Calendar.SECOND));
        System.out.println("MilliSecond: " + calendar.get(Calendar.MILLISECOND)+" "+ calendar3.get(Calendar.MILLISECOND));
        System.out.println("MilliSecond Diff " + calendar.getTimeInMillis()+" - "+calendar3.getTimeInMillis()+" = "+(calendar.getTimeInMillis()-calendar3.getTimeInMillis()));

        System.out.println("*********************************************************************");

        System.out.println("Day Start:  " +calendar3.getTimeInMillis());
        calendar2.add(Calendar.DATE, -1);
        System.out.println("Previous Day:  " +calendar3.getTimeInMillis());
        // calendar.get(Calendar.get)
        System.out.println("MilliSecond:  " + calendar.getTimeInMillis());
        System.out.println("Current Time: " + System.currentTimeMillis());

        int t = calendar.get(Calendar.MILLISECOND) + calendar.get(Calendar.SECOND) * 1000 + calendar.get(Calendar.MINUTE) * 60 * 1000 + calendar.get(Calendar.HOUR_OF_DAY) * 60 * 60 * 1000;
        calendar.add(Calendar.DATE, -1);
        System.out.println("Day Diff :  " + (System.currentTimeMillis() - calendar.getTimeInMillis()) + " Today Time = " + t + " Day = " + 24 * 60 * 60 * 1000);


    }
}