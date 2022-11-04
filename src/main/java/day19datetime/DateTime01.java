package day19datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DateTime01 {
    public static void main(String[] args) {

        //Example 1:"Anlik tarihi"(Current Date) ekrana yadiran kodu yaziniz.

        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);//2022-10-21

        //Example 2:"Anlik zamani"(Current Time) ekrana yadiran kodu yaziniz.

        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);//20:41:47.487478700

        //Example 3:"Anlik tarihi ve zamani"(Current Time-Date) ekrana yadiran kodu yaziniz.

        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);//2022-10-21T20:43:36.153765200

        //Example 4:"Japonya'daki" "Anlik tarihi ve zamani"(Current Time-Date) ekrana yadiran kodu yaziniz.

        LocalDateTime currentDateTimeInJapan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentDateTimeInJapan);//2022-10-22T02:49:21.516948

        //Example 5:Istanbul'daki "Anlik tarihi ve zamani"(Current Time-Date) ekrana yadiran kodu yaziniz.

        LocalDateTime currentDateTimeInIstanbul = LocalDateTime.now(ZoneId.of("Europe/Istanbul"));
        System.out.println(currentDateTimeInIstanbul);//2022-10-21T20:51:06.959046

        //Example 6: Bugunden 789 gun sonra olacaginiza gore emeklilik tarihini hesaplayan kodu yaziniz?

        LocalDate countDate = LocalDate.of(2022, 10, 21);
        LocalDate retireDate = countDate.plusDays(789);
        System.out.println(retireDate);//2024-12-18

        //Example 7: Iki cocugunuzun dogum tarihleri arasindaki farki gun olarak hesaplayan kodu yaziniz?

        LocalDate dobAli = LocalDate.of(2005, 5, 17);
        LocalDate dobVeli = LocalDate.of(2013, 2, 8);
        //between(dobAli,dobVeli) methodu kullanildiginda daha eski olan tarih daha once yazilmalidir.
        Long diff = ChronoUnit.DAYS.between(dobAli, dobVeli);
        System.out.println(diff);//2824

        //Example 8: Istanbulun Fethi ile Cumhuriyetin kurukmasi arasinda kac ay oldugunu gosteren kodu yaziniz?
        //           29 Mayis 1453       29 ekim 1923

        LocalDate istanbulunFethi = LocalDate.of(1453, 5, 29);
        LocalDate cumhuriyetinIlani = LocalDate.of(1923, 10, 29);

        Long aySayisi = ChronoUnit.MONTHS.between(istanbulunFethi, cumhuriyetinIlani);
        System.out.println(aySayisi);//5645

        //Example 9: Verilen tarih'in hangi burcta oldugunu gosteren kodu yaziniz?

        LocalDate myDate=LocalDate.of(1989,3,22);
        int day=myDate.getDayOfMonth();
        int month=myDate.getMonthValue();

        if (day>21 && month==3){
            System.out.println("Koc");
        } else if (day<20 && month==4) {
            System.out.println("Koc");
        }


    }
}
