package day21accessmodifiersinheritance;

public class AnimalRanner {

    /*
      1)"Inheritance" sayesinde
        i)Code tekrarlarindan kurtuluruz
        ii)Code tamiri(maintenance) kolay olur
        iii)Chlid Class'lari daha atomic yapmis oluruz
      2)Bir Class'i baska Class'in Chlid Class'i yapmak icin "extends" keyword kullanilir.
        ilk yazilan Class Chlid, ikinci yazilan Class Parent olur.
      3)Chlid Class object'leri Parent Class'dan method ve variable'lari kullanilirler.
      4)Parent Class object'leri Chlid Class'dan method ve variable'lari kullanamazlar.
      5)Object Class her Class'in parent'idir.
        Java'da Object Class haric her Class'in parent'i vardir.
        Java'da parent'i olmayan tek Class Object Class dir.
      6)"private" method ve variable'ler Child Class'lar tarafindan kullanilamaz.
        "protected" method ve variable'lar Child Class'lar tarafindan kullanilabilir.
        "default" method ve variable'lar ayni package'deki Child Class'lar tarafindan kullanilabilir.
        "public" method ve variable'lar Child Class'lar tarafindan kullanilabilir.

       Note:"Child Class'lar tarafindan kullanilabilir" olmak "inherit edilebilir" demektir.

       7) 4 tip inheritance vardir.
          i)Multilevel Inheritance:Java bunu kabul eder.
          ii)Hieararchila Inheritance:Bir parent icin coklu child,Java bunu kabul eder.
          iii)Multiaple Inheritance:Bir Child'a coklu Parent ,Java bunu desteklemez.(Java does not support Multiaple inheritance)
          iv)Single Inheritance:Bir Child Class icin bir Parent Class demektir, Java bunu destekler.
     */
    public static void main(String[] args) {

        Cat c1=new Cat();
        c1.eat();
        c1.drink();
        c1.meow();

        Dog d1=new Dog();
        d1.eat();
        d1.drink();
        d1.bark();




    }

}
