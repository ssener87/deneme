package day06nestedifswitch;

public class NestedIf01 {
    public static void main(String[] args) {
        /*
        Passwurd'un (sifre) ilk harfi buyuk harf ise
              'A' olursa gecerli password aksi halde gecersiz password
        Password'un ilk harfi kucuk harf ise
              'z' olursa gecerli password aksi halde gecersiz password

              Note:Java "nested" kodlari calistirirken cok zaman harcar,buna "time comlexity" denir.
                    Bu nedenle mumkunse "nested" kod yazmamaya calisiriz.
         */

        String pwd = "Ax12!";

        if (pwd.charAt(0) >= 'A' && pwd.charAt(0) <= 'Z') {

            if (pwd.charAt(0) == 'A') {
                System.out.println("Gecerli password");

            } else {
                System.out.println("Gecersiz password");
            }

        } else if (pwd.charAt(0) >= 'a' && pwd.charAt(0) <= 'z') {
            System.out.println("Gecerli password");
        } else {
            System.out.println("Gecersiz password");
        }
    }
}
