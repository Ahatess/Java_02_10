package com.company;

import java.util.Scanner;

import static com.company.skaiciuotuvas.suma;

public class Main {

    public static void main(String[] args) {

        ivedimas();
        System.out.println(skaiciuotuvas.suma(a, b));
        System.out.println(skaiciuotuvas.skirtumas(a,b));
        System.out.println(skaiciuotuvas.sandauga(a,b));
    }

    static float a;
    static float b;


    public static void ivedimas() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite 2 skaicius");
         a = sc.nextFloat();
         b = sc.nextFloat();
    }


}

