import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Calculate {

    public static Calendar c = Calendar.getInstance();

    public static String getToday()
    {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("MM-dd-yyyy");

        return format.format(date);
    }

    public static String getUD()
    {
        Date date = c.getTime();
        SimpleDateFormat format = new SimpleDateFormat("MM-dd-yyyy");

        return format.format(date);
    }

    public static void setUD(String date) throws ParseException
    {
        Date data = new SimpleDateFormat("MM-dd-yyyy").parse(date);
        c.setTime(data);
    }

    public static String getDay()
    {
        SimpleDateFormat format = new SimpleDateFormat("EEEE");

        return format.format(c.getTime()).toUpperCase();
    }

    public static void main(String[] args) throws ParseException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your birthday");

        Boolean set = true;

        while(set){

            String userDate = scanner.nextLine();
            Calculate.setUD(userDate);
            System.out.println("Test" + Calculate.getUD());
            Calculate.getDay();

            set = false;

            Calculate.getToday();



        }
    }
}

