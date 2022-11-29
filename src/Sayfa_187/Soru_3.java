package Sayfa_187;

import java.util.ArrayList;
import java.util.List;

public class Soru_3 {
    //Verilen String bir listede istenmeyen harf iceren elementleri silip, kalan
    //kismini list olarak bize donduren bir method olusturun
    public static void main(String[] args) {

     System.out.println(istenmeyenHarfleriSil());

    }

    public static List<String> istenmeyenHarfleriSil() {
        List<String> harfListesi = new ArrayList<>();
        harfListesi.add("a");
        harfListesi.add("b");
        harfListesi.add("c");
        harfListesi.add("d");
        harfListesi.add("e");
        harfListesi.add("f");
        harfListesi.add("g");
        harfListesi.add("h");

        harfListesi.remove("h");

        //List<String> silinecekHarfler=new ArrayList<>();
        //silinecekHarfler.add("c");
        //silinecekHarfler.add("f");
        //silinecekHarfler.add("h");

       // harfListesi.removeAll(silinecekHarfler);


       return harfListesi;
    }
}
