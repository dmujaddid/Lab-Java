/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variabelGlobalLokal;

/**
 *
 * @author eka
 */
public class Main {

    // ini variabel global
    static String nama = "Programku";
    static String version = "1.0.0";

    static void help() {

        // ini variabel lokal
        String nama = "Petani kode";

        // mengakses variabel global di dilam fungsi help()
        System.out.println("Nama : " + nama);
        System.out.println("Versi : " + version);
    }

    public static void main(String[] args) {

        // panggil fungsi help()
        help();

        System.out.println();

        System.out.println("Nama : " + nama);
        System.out.println("Version : " + version);
    }

}

/*
Saat pemanggilan fungsi help() kita membuat ulang variabel nama.
Sehingga variabel nama menjadi variabel lokal pada fungsi help()
dan nilainya berubah menjadi "Petani Kode".

Sedangkan, saat kita akases lagi variabel nama melalui fungsi main()
nilainya tetap sama seperti yang didefinisikan.
 */
