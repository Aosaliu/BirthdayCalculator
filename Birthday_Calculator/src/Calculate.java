import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Calculate {

    public static Calendar c = Calendar.getInstance();

    public static void  getToday()
    {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("MM-dd-yyyy");

        System.out.println("And since today is " + format.format(date) + ",");
    }

    public static void getUD()
    {
        Date date = c.getTime();
        SimpleDateFormat format = new SimpleDateFormat("MM-dd-yyyy");

        System.out.println(format.format(date));
    }

    public static void setUD(String date) throws ParseException
    {
        Date data = new SimpleDateFormat("MM-dd-yyyy").parse(date);
        c.setTime(data);
    }

    public static void getDay()
    {
        SimpleDateFormat format = new SimpleDateFormat("EEEE");

        System.out.println("That means you were born on a " + format.format(c.getTime()).toUpperCase() + "!");
    }

    public static void getDayOfYear()
    {
        Date date = new Date();
        Calendar current  = new GregorianCalendar();
        current.setTime(date);

        int year = current.get(Calendar.YEAR);

        c.set(Calendar.YEAR, year);

        SimpleDateFormat format = new SimpleDateFormat("EEEE");
        System.out.println("This year it falls on a " + format.format(c.getTime()).toUpperCase() + "...");
    }

    public static void calculateDay()
    {

    }
}

