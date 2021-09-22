package book;

import java.time.Instant;

public class InstantApp {

    public static void main(String[] args) {

        Instant instant = Instant.now();

        System.out.println(instant);
        System.out.println(instant.getEpochSecond());
        System.out.println(instant.getNano());
        int oneMin = 60;
        int oneHour = oneMin * 60;
        int oneDay = oneHour * 24;
        System.out.println(instant.plusSeconds(oneHour));

    }
}
