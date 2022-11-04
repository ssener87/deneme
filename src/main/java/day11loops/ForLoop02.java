package day11loops;

public class ForLoop02 {
    public static void main(String[] args) {
        //Bir String deki "m" karakteri haric tum karakterleri yazdiriniz
        //Andromeda ==>Androeda

        String str="Andromeda";

        //1.Yol:
        for (int i = 0; i <str.length()-1;i++){

            char c=str.charAt(i);

            if (c!='m'){
                System.out.print(c);
            }

        }
        System.out.println();
        //2.Yol:
        for (int i = 0; i < str.length()-1; i++){
            char c=str.charAt(i);

            if (c=='m'){
                continue;//Bosver demek. "continue" loop larda kullanilir.

            }

            System.out.print(c);
        }
        System.out.println();

        //Example 2: 1 den 100 e kadar 6 ile bolunenler haric tum tam sayilari ekrana yazdiriniz

        for (int i=1;i<101;i++){

            if (i%6==0){
                continue;
            }
            System.out.print(i + " ");

        }
        System.out.println();
        //Example 3: Size verilen bir String deki 'm' den onceki karakterleri yazdiriniz
        //           Luxemburg==> Luxe

        String s="Luxemburg";

        for (int i=0;i<s.length();i++) {

            char c=s.charAt(i);

            if (c=='m'){
                break;
            }
            System.out.print(c);
        }
    }
}
