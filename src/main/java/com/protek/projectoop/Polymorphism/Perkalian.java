package com.protek.projectoop.Polymorphism;

public class Perkalian {

    //PERKALIAN BILANGAN BULAT:
    public void hitungPerkalian(int a, int b) {
        int hasil = a * b;
        System.out.println("Hasil perkalian : "+hasil);
    }

    public void hitungPerkalian(int a, int b, int c) {
        int hasil = a * b * c;
        System.out.println("Hasil perkalian : "+hasil);
    }

    //PERKALIAN BILANGAN PECAHAN:
    public void hitungPerkalian(double a, double b) {
        double hasil = a * b;
        System.out.println("Hasil perkalian : "+hasil);
    }

    //PERKALIAN PECAHAN DAN BULAT:
    public void hitungPerkalian(double a, int b) {
        double hasil = a * b;
        System.out.println("Hasil perkalian : "+hasil);
    }

    public void hitungPerkalian(int a, double b) {
        double hasil = a * b;
        System.out.println("Hasil perkalian : "+hasil);
    }
}
