package day23inheritancepolymorphism;

public class Cat extends Mammal {

    public void meow() {
        System.out.println("Cat meow");
    }

    @Override
    //@Override annatation'ini kullanarak,Java'nin yaptigimız Ovverrıde ıslemını kontrol etmıs olur.eat methodu'u parent class dan alinmis method anlamina gelir.
    public void eat() {                     //@ varsa annatation denir
        System.out.println("Cat eat");
    }

    @Override
    public int add(int a, int b) {
        return a+b+1;
    }

    @Override
    public Integer multiply(int a, int b) {
        return a*b+1;
    }
    //Asgidaki method "Overriding Method"
    @Override
    public Animal create() {
        return new Mammal();
    }


    /*
       @Override annotation'ini kullanarak, Java'nin yaptigimiz Override islemini kontrol etmesini saglariz
       1)Override yaparken "method'un body" si degistirilir.
       2)Override yaparken ASLA method signature(isim ve paremetre) dokunulmaz.
       3)Override yaparken "inheritance" olmak zorundadir.
       4)Override yaparken "access modifier"lar belli kurallara gore farklilastirilabilirler.
          i)"private"methodlar Ovverride edilemez.
          ii)Child Class'daki "Ovverride" edilen method'un access modifier'i Parent class'daki methodu'un
          access modifier'i ile ayni ve genis olmalidir.
          ==>private<protected<default<public genisligi
          Note:Child Class'daki method'un access modifier'i daha dar olamaz.
          iii)"default method"lar ayni package icindeyse Ovverride edilebilirler,
              farkli package'den Override edilemezler.
       5)Paretn Class'daki methodun "return type"i void ise "return type" degistirilemez
       6)Parent Class'daki methodun "return type" i primitive ise "return type" degistirilemez.
       7)Parent Class'daki methodun "return type" i Wrapper Class ise "return type" degistirilemez.
       8)Parent Class'daki methodun "return type" i Parent Class ise "return type" child'lardan biri olabilir.
         Note:Child class'daki return type Parent Class'dakinden genis olamaz.
         Note:Aralarinda "Parent Child"iliskisi olmayan class'lar Overriding'de Return Type degisiminde
              kullanilamazlar. Mesala "Short","Integer"den kucuktur,fakat aralarinda "Parent Child" iliskisi
              olmadigindan "Integer" yerine "Short" kullanmazsiniz.
              Note: Child daki method'un Return Type'indan Parent'taki method'un Return Type'ina gidiste
                 "IS-A" Relationship olmali.
              Note: Aralarinda "IS-A" Relationship olan Data Type'lara "Covariant" denir.
       9)Child<Prent ==>IS-A (Her kedi hayvandır ama her hayvan kedi değildir.
          HAS-A ==> Hayvanlar kedileri içerir ama kediler tüm hayvanları içermez.
       10)"final"methodlar Override edilemezler,cunku "Overriding"de method body degistirilebilir
           fakat
          "final" method body degistirilmesine musaade etmez.
       11)   Polymorphism   =   Overloading + Overriding
          (coklu yapi demek)
          Note: Poymorphism nedir? derlerse Overloading ve Overriding'i anlatin.
       12)Overloading ile Overriding arasindaki farklar nelerdir?
            i)Oveloading icin "inheritance" gerekmez fakat Overriding icin gerekir.
            ii)"private" method'lar Overload edilebilir, Override edilemezler.
            iii)"final" method'lar Overload edilebilir, Override edilemezler.
            iv)"Overloading" "static polymorphism" olarak, "Overriding" "dynamic polymorphism" olarak adlandirilir.
                Cunku "static" method'lar Overload edilebilir, Override edilemezler.
            v) "Overloading" de method signature degisir ama "Overriding" method signature a dokunulmaz.
    */


}