/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticDanNonStatic;

/**
 *
 * @author eka
 */
public class Main {

//     Fungsi non-static
    void makan(String makanan) {
        System.out.println("Hi!");
        System.out.println("Saya sedang makan " + makanan);
    }

    // Fungsi ststic
    static void minum(String minuman) {
        System.out.println("Hi!");
        System.out.println("Saya sedang minum " + minuman);
    }

    // Fungsi main()
    public static void main(String[] args) {

        // Pemanggilan fungsi static
        minum("Jus");

        // mambuat instansiasi objek saya dari class Main
        Main saya = new Main();

        // pemanggilan fungsi non-static
        saya.makan("tahu");

        /*
        Pada contoh tersebut, fungsi makan() adalah fungsi non-static.
        Sedangkan fungsi minum() adalah fungsi static.
         */
    }
}
