/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancespolimorphism;

/**
 *
 * @author ACER
 */
public class Hippo extends animal{
    //instance variabel
    String boundaries = "Wilayah kekuasaannya";
    void Makenoise(){//menampilkan jenis suara hewan
        System.out.println("Hoooup hoooup");
    }
    void eat(){//menampilkan jenis makanan yang dimakan Kudanil
        System.out.println("Kudanil makan Tumbuhan danau");
    }
    void sleep(){//menampilkan kalimat keterangan tentang kudanil yang tidur
        System.out.println("Kudanil tidur setelah makan ");
    }
    
    void roam(){//menampilkan keadaan Kudanil saat berkeliaran
        System.out.println("Kudanil berkeliling "+boundaries+
                "mencari makanan bersama anaknya");
    }
}
