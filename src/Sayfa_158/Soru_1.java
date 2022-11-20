package Sayfa_158;

public class Soru_1 {
    //Aşağıdaki class için asagidaki sorulari yanitlayin.1- hangi satirlarda local variable’lar vardir ?
    //2- class level’da olusturulan variable’larin scope’lari ve degerleri nelerdir ?
    //3- Hangi satirlarda CTE vardir ve duzeltilmesi gerekir ?
    static String str;
    static String tel= "03123454354";

    public static void main(String[] args) {

        Soru_1 obj = new Soru_1();
        System.out.println(tel);
        obj. str= "Java ne güzel";
        int sayi= 15;
        method2(sayi);
        method1();
    }

    public static void method1(){
        tel="03124324353";
        String isim= "John Doe";
        boolean dogruMu;
        int sayi;
    }
    public static void method2(int sayi){
        str=str + ".";
        tel=tel.substring(1);
        int sayi1=10;
    }




}
