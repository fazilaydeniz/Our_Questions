package Sayfa_121;

public class Soru_3 {
    public static void main(String[] args) {
        //Kullanicidan alinan metindeki istenmeyen rakam ve ozel karakterleri silip,
        //sadece ilk harfi buyuk diger harfler kucuk harf yapan bir program yazin.

         String input = "java1 ogRe2@nMek3 #ne +Gu=zel";
        //output : Java ogrenmek ne guzel.


        input=input.toLowerCase();
        input=input.replaceAll("\\d","");
        input= input.replaceAll(" ","5");
        input=input.replaceAll("\\W", "");
        input=input.replaceAll("5"," ");
        input=input.replaceFirst("j","J");
        System.out.println(input);

    }
}
