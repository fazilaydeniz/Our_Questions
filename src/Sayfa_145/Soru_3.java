package Sayfa_145;

import java.util.Scanner;

public class Soru_3 {
    public static void main(String[] args) {
        //While loop kullanarak verilen bir String’i terse cevirip, bu halini bize
        //donduren bir method olusturun.

        String input = "Beykozda bahar güzel";
        System.out.println(stringTersCevir(input));
    }
    public static String stringTersCevir(String input) {
        String tersInput = "";
        int i = 1;

        while (i <= input.length()) {

            tersInput += input.charAt(input.length() - i);
            i++;
        }
        return tersInput;
    }
}
