/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan3;

/**
 *
 * @author ACER
 */
public class kalkulatortestdrive {
    public static void main(String[] args) {
        kalkulator kalkulator1 = new kalkulator();//membuat objek
        kalkulator1.a = 10;//pemberian nilai variabel
        kalkulator1.b = 5;
        
        int hasilpengurangan = kalkulator1.pengurangan();//inisialisasi variabel hasil pengurangan
        int hasilpenjumlahan = kalkulator1.penjumbalahn();
        System.out.println("hasil pengurangnan dari "+"-"+"b "+hasilpengurangan);
        System.out.println(hasilpenjumlahan);
//        kalkulator1.penjumbalahn();
//        kalkulator1.pengurangan();
        
    }
}
