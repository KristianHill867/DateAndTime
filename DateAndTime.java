import java.util.Locale;
import java.time.ZoneId;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;

public class DateAndTime
{
    public static void main(String[] args)
    {
        LocalTime currentTime = LocalTime.now();
        LocalDate pastDate = LocalDate.of(2006, 9, 7);
        MonthDay monthDay = MonthDay.from(pastDate);
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss a");

        String formattedTime = currentTime.format(formatter);
        String dayOfWeek = today.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
        String month = today.getMonth().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
        int year = today.getYear();
        int dayOfMonth = today.getDayOfMonth();

        long yearsPassed = ChronoUnit.YEARS.between(pastDate, today);
        long days = ChronoUnit.DAYS.between(pastDate, today);

        System.out.println("=".repeat(70));

        if (MonthDay.from(today).equals(monthDay))
        {
            System.out.println("Happy Birthday, Kristian! Today is " + dayOfWeek + ", " + month + " " + dayOfMonth + ", " + year);
        }

        else if (!MonthDay.from(today).isAfter(MonthDay.of(6, 16)) || !MonthDay.from(today).isBefore(MonthDay.of(8, 1)))
        {
            System.out.println("Hello, Kristian! Time to hit the books and study hard for school! \nToday is " + dayOfWeek + ", " + month + " " + dayOfMonth + ", " + year);
        }

        else
        {
            System.out.println("Hello, Kristian! Today is"  + dayOfWeek + ", " + month + " " + dayOfMonth + ", " + year);
        }

        System.out.println("The current time is " + formattedTime);
        System.out.println("-".repeat(65));
        System.out.println("Years since September 7, 2006: " + yearsPassed);
        System.out.println("Days since September 7, 2006: " + days);
        System.out.println("=".repeat(70));
    }
}
