package Sayfa_126;

import java.util.Scanner;

public class Soru_10 {
    public static void main(String[] args) {
        //Kullanicidan bir String isteyin ve String’i tersine cevirip
        //kaydedin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz");
        String kelime= scan.nextLine();
        String tersInput ="";

        for (int i = kelime.length()-1; i >=0 ; i--) {

            tersInput+=  kelime.substring(i,(i+1));

        }
        System.out.println(tersInput);
    }
}
