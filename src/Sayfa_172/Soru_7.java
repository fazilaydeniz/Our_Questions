package Sayfa_172;

public class Soru_7 {
    //Verilen String bir array’deki en uzun ve en kisa kelimeleri yazdiran bir method
    //olusturun.
    public static void main(String[] args) {
        String [] kelimeler= { "Veli","Hüsamettin", "Hasan","Ali", "Hüseyin", };

         enUzunenKısaKelime(kelimeler);


    }
    public static void enUzunenKısaKelime(String [] kelimeler) {
        String enKısaKelime = kelimeler[0];
        String enUzunKelime = kelimeler[0];
        for (int i = 1; i < kelimeler.length; i++) {

            if (kelimeler[i].length() <= enKısaKelime.length()) {

                enKısaKelime = kelimeler[i];

            }
            if (kelimeler[i].length() >= enUzunKelime.length()) {

                enUzunKelime = kelimeler[i];
            }

        }
        System.out.println("Arraydeki en kısa kelime " + enKısaKelime  +
                           "\nArraydeki en uzun kelime " + enUzunKelime);
    }

}
