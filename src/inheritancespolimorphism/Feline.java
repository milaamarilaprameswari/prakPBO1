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
public class Feline extends animal{
    //instance variable
    String boundaries = "dari 200 meter persegi";
    String location = "Di wilayah tempat tinggalnya";
    //override method dari class animal    
    void Makenoise(){//menampilkan jenis suara hewan
        System.out.println("Hewan bersuara ");
    }
    void sleep(){//menampilkan kalimat keterangan tentang hewan yang tidur
        System.out.println("hewan tidur setelah makan");
    }
    void roam(){//menampilkan keadaan hewan saat berkeliaran
        System.out.println("Hewan berkeliling mencari makan"+ location+
                "dengan luas lebih "+ boundaries+" berkelompok maupun sendirian");
    }
    void eat(){//menampilkan jenis makanan yang dimakan hewan
        System.out.println("Hewan pemakan daging");
    }
    
}
