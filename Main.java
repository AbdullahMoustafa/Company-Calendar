import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

    //get data from the user
    Scanner in = new Scanner(System.in);
    System.out.print("Enter your name: ");
    String name = in.nextLine();
    System.out.print("Enter the current year: ");
    int current_year = in.nextInt();
    System.out.print("Enter the current month: ");
    int current_month = in.nextInt();

    Scanner nd = new Scanner(System.in);    //new Scanner
    System.out.print("Enter the first day of the month: ");
    String first_day = nd.nextLine();

    System.out.print("Enter the company name: ");
    String company_name = nd.nextLine();

    System.out.println("\n");
    System.out.println("********** " + name +" **********");



        // Create an instance of a GregorianCalendar
        Calendar calendar = new GregorianCalendar(current_year, current_month-1, 30);
        //Set the day of month to first day of the month
        calendar.set(Calendar.DAY_OF_MONTH, 1); 

        //get day of week for 1st of month
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK); 
        int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        //print month name and year
        System.out.println(new SimpleDateFormat(" MMMM YYYY").format(calendar.getTime()));
        System.out.println(" S  M  T  W  T  F  S");

        //print initial spaces
        String initialSpace = "";
        for (int i = 0; i < dayOfWeek - 1; i++) {
            initialSpace += "   ";
        }
        System.out.print(initialSpace);

        //print the days of the month starting from 1
        for (int i = 0, dayOfMonth = 1; dayOfMonth <= daysInMonth; i++) {
            for (int j = ((i == 0) ? dayOfWeek - 1 : 0); j < 7 && (dayOfMonth <= daysInMonth); j++) {
                System.out.printf("%2d ", dayOfMonth);
                dayOfMonth++;
            }
            System.out.println();
        }

    System.out.println("********** " + company_name +" **********");

    }
}