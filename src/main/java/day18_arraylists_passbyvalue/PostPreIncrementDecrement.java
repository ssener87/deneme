package day18_arraylists_passbyvalue;

public class PostPreIncrementDecrement {
    public static void main(String[] args) {

        //Post Increment
        int a=5;
        int b=a++;
        System.out.println(b);//5 ==> Java analamli bir cumle buldugunda hemen uygular.Java arttirmaya gelmeden sayiyi atar.
        System.out.println(a);//6

        //Pre Increnent
        int c=10;
        int d=++c;

        System.out.println(d);//11
        System.out.println(c);//11

        //Post Decrement
        int e=20;
        int f=e--;
        System.out.println(f);//20
        System.out.println(e);//19

        //Pre Decrement
        int h=30;
        int i=--h;
        System.out.println(h);//29
        System.out.println(i);//29

    }
}
