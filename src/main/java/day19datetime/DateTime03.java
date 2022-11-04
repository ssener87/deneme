package day19datetime;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DateTime03 {
    public static void main(String[] args) {

        //Example 1: Japonya ile Almanya arasindaki zman farkini hesaplayan kodu yaziniz?

     LocalDateTime japan=LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
     LocalDateTime germany=LocalDateTime.now(ZoneId.of("Europe/Belin"));

     Long fark=ChronoUnit.HOURS.between(germany,japan);
        System.out.println(fark);
    }
}
