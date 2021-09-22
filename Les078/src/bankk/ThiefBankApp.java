package bankk;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ThiefBankApp {

    public static void main(String[] args) {

        Transaction transaction1 = new Transaction("yilmaz@mail.be", "justin@bieber.be", BigDecimal.valueOf(1000));

        transaction1.setDateAndTime(LocalDateTime.of(2021, 9, 21, 13, 32, 50));

        transaction1.setCountry("Netherlands");

        // transaction time from 1 : 13:32

        Transaction transaction2 = new Transaction("nikola@tesla.com", "elon@musk.com", BigDecimal.valueOf(2000));
        LocalDateTime transaction2LDT = LocalDateTime.of(2021, 9, 21, 13, 45, 50);
        transaction2.setDateAndTime(transaction2LDT);
        transaction2.setCountry("Belgium");

        // transaction time from 1 : 13:32

        Transaction transaction3 = new Transaction("marie@curie.be", "alex.de@croo.be", BigDecimal.valueOf(3000));
        LocalDateTime transaction3LDT = LocalDateTime.of(2021, 9, 21, 13, 45, 50);
        transaction3.setDateAndTime(transaction3LDT);
        // transaction 1 from yilmaz at 13:45
        transaction3.setCountry("Japan");

        // transaction time from 1 : 13:32 (9 - 2) -> 20:32

        // Zone time differences:
        // GMT Belgium -> +2
        // GMT Netherlands -> +2
        // GMT Japan -> +9
        System.out.println(transaction1.getCountry()+transaction1.getDateAndTime());
        System.out.println(transaction2LDT);



    }

}
