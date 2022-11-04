package day22inheritancepolymorphism;

import java.util.concurrent.Callable;

public class Runner {
    public static void main(String[] args) {

        //Inheritance'da variable'lar seçilirken Java Object'in data type'ına bakar.
        //Öncelikle istediğiniz variable'ı Object'in data type'ı olan Class'da arar.
        //O Class'da bulamazsa Parent Class'lara bakar.
        //Hicbir Parent Class'da bulamazsa hata verir.

        Cat cat1=new Cat();
        System.out.println(cat1.a);//14
        System.out.println(cat1.b);//34
        System.out.println(cat1.c);//45

        Mammal cat2=new Cat();
        System.out.println(cat2.a);//13

        Animal cat3=new Cat();
        System.out.println(cat3.a);//12

        //Object olustururken Object'in data type'i Child Class'lardan secilemez.
        //Inheritance'da variable'ler secilirken Java Constructor'a bakar.
        //Oncelikle istediginiz method'u Constructori kullanilan Class'dan alir.
        //O Class'da bulamazsa Parent Class'lara bakar.
        //Hicbir Parent Class'da bulamazsa hata verir.
        Cat cat4=new Cat();
        cat4.eat();//Cat eat
        cat4.drink();//Mammal drink

        Mammal cat5=new Mammal();
        cat5.eat();//Mammal eat

        Animal cat6=new Animal();
        cat6.eat();//Animal eat



            }
        }


