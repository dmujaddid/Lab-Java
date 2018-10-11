/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fungsiYgMengembalikanNilai;

/**
 *
 * @author eka
 */
public class Main {

    /*
    Fungsi yang Mengembalikan Nilai
    Setelah fungsi memproses data yang diinputkan melalui parameter,
    selanjutnya fungsi harus mengembalikan nilai agar dapat diolah
    pada proses berikutnya.
    
    Pengembalian nilai pada fungsi menggunakan kata kunci return.
     */
    static int luasPersegi(int sisi) {
        int luas = sisi * sisi;
        return luas;
    }

    /*
    Pada contoh tersebut, kita membuat sebuah parameter bernama sisi.
    Kemudian fungsi akan mengembalikan nilai dengan tipe int (integer)
    dari variabel luas.    
     */
    public static void main(String[] args) {

        // Contoh pemanggilanya:
        System.out.println("Luas persegi dengan panjang sisi 5 adalah " + luasPersegi(5));
    }

}
