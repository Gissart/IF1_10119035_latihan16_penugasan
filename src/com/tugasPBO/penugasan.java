//latihan 16 PBO
// Nama       : Argya Aulia Fauzandika
// NIM        : 10119035
// Kelas      : IF-1
// Deskripsi  : menampilkan penugasan operator aritmatika dan bit
package com.tugasPBO;

public class penugasan {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 0;

        System.out.println("Nilai a = "+a);
        System.out.println("Nilai b = "+b);
        System.out.println("Nilai c = "+c);

        c = a + b;
        System.out.println("c = a + b = " + c);

        c += a;
        System.out.println("c += a = " + c);

        c -= a;
        System.out.println("c -= a = " + c);

        c *= a;
        System.out.println("c *= a = " + c);

        a = 10;
        c = 15;
        c /= a;
        System.out.println("c /= a = " + c);

        a = 10;
        c = 15;
        c &= a;
        System.out.println("c &= a = " + c);

        c <<= 2;
        System.out.println("c <<= 2 = " + c);

        c >>= 2;
        System.out.println("c >>= 2 = " + c);

        c >>= 2;
        System.out.println("c >>= a = " + c);

        c &= a;
        System.out.println("c &= a = " + c);

        c ^= a;
        System.out.println("c ^= a = " + c);

        c |= a;
        System.out.println("c |= a = " + c);
    }
}
