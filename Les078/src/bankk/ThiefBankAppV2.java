package bankk;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ThiefBankAppV2 {

    public static void main(String[] args) {

        ZoneId zoneIdBelgie = ZoneId.of("GMT+2");
        ZonedDateTime zoneBelgie = ZonedDateTime.of(2021, 9, 21, 13, 32, 50, 0, zoneIdBelgie);
        System.out.println(zoneBelgie);

        ZoneId zoneIdNetherlands = ZoneId.of("GMT+2");
        ZonedDateTime zoneNetherlands = ZonedDateTime.of(2021, 9, 21, 13, 32, 50, 0, zoneIdNetherlands);
        System.out.println(zoneNetherlands);

        ZoneId zoneIdJapan = ZoneId.of("GMT+9");
        ZonedDateTime zoneJapan = ZonedDateTime.of(2021, 9, 21, 13, 32, 50, 0, zoneIdJapan);
        System.out.println(zoneJapan);



    }
}
