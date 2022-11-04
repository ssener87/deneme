package day24statickeywordencapsulation;

    //Encapsulation: "Data Hiding(gizlemek)" demektir.
    //Data'yi nicin gizlersiniz?: Data'yi dis etkenlerden korumak icin
    //Data'yi nasil gizlersin?: Access Modifier'ini "privite" yaparak gizlerim.
    //Data'yi gizledikten sonra baska Class'lardan okumak istersen ne yaparsin?:
    //"get" methodlar(getter) olusturarak gizledigimiz data'lari okunur hale getirebiliriz.
    //Data'yi gizledikten sonra baska Class'lardan degistirmek istersen ne yaparsin?
    //"set method'lar (setter)" olusturarak gizledigimiz datalari degistirilir hale getirebiliriz.
    //Variable'in "data type"i ile get method'un "return type"i ayni olmalidir.
    //"get method"ları isimlendirirken "get + <variable name>" ancak variable'ın data type' ı "boolean" ise "is + <variable name>"


public class Student {

      public String stdName="Tom Hanks";
      private String stdId="TH202201";
      private double gpa=3.8;
      private boolean retired=false;

    public String getStdId() {
        return stdId;
    }

    public double getGpa() {
        return gpa;
    }

    public boolean isRetired() {
        return retired;
    }

    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setRetired(boolean retired) {
        this.retired = retired;
    }
}

