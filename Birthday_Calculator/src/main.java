import java.text.ParseException;
import java.util.Scanner;


public class main {

    public static Calculate birthCal;

    public static void main(String[] args) throws ParseException {

        birthCal = new Calculate();

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your birthday");

        Boolean set = true;

        while(set){

            String userDate = scanner.nextLine();
            birthCal.setUD(userDate);
            birthCal.getUD();
            birthCal.getDay();

            set = false;

            birthCal.getToday();



        }

    }
}
