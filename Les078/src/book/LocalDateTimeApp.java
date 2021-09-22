package book;

import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class LocalDateTimeApp {

    public static void main(String[] args) {

        // now -> year, month, day, hours, minutes, seconds
        LocalDateTime ldt1 = LocalDateTime.now();

        System.out.println(ldt1);
        System.out.println("Year: " + ldt1.getYear());
        System.out.println("Month: " + ldt1.getMonthValue());
        System.out.println("Day of month: " + ldt1.getDayOfMonth());
        System.out.println("Day of year: " + ldt1.getDayOfYear());
        System.out.println("Day of week: " + ldt1.getDayOfWeek());

        String dayOfWeekInNL = ldt1.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.forLanguageTag("NL"));
        System.out.println("Day of week in NL: " + dayOfWeekInNL.toUpperCase());

        String dayOfWeekInFR = ldt1.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.forLanguageTag("FR"));
        System.out.println("Day of week in FR: " + dayOfWeekInFR.toUpperCase());


    }
}
