package day21accessmodifiersinheritance;

public class Student {

    /*
    Axcess Modifer
    1)public   2)protected   3)default(Access Modifier'i default yapmak icin access modifier yazmayiz)   4)private

    Note: Access Modifier'lari genisten dara dogru sayiniz?
          public>protected>default>private
    Note: Access Modifier'lari birer birer aciklayiniz?
          public her class tan kullanilabilir
          protected olanlar baska package'lerden kullanilmaz ancak baska package'de "child class" icinden kullanilabilir
          default olanlar baska package'den kullanilamazlar
          private olanlar sadece olusturulduklari class icinde kullanilabililerler
    Note: "protected" ile "default" un farkini soyleyiniz.
          protected olanlar baska package'lerden kullanilamaz ancak baska package'de "child class" icinden kullanilabilir
          default olanlar baska package'den kullanilamazlar
    Note: Class'lar icin hangi Access Modifier'lar kullanilabilir.
          public, default kullanilir ama protected ve private kullanilamaz
     */
    //public her class tan kullanilabilir
    public String stdName="Tom Hanks";

    //protected olanlar baska package'lerden kullanilmaz ancak baska package'de "child class" icinden kullanilabilir
    protected String address="Miami";

    //default olanlar baska package'den kullanilamazlar
    String email="th@gmail.com";

    //private olanlar sadece olusturulduklari class icinde kullanilabililerler
    private String stdId="20206517004";
}
