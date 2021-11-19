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
public class Cat extends Feline{
    void eat(){//menampilkan jenis makanan yang dimakan Kucing
        System.out.println("Kucing pemakan ikan dan daging");
    }
    void Makenoise(){//menampilkan jenis suara hewan
        System.out.println("kucing bersuara Meooww Meooww");
    }   
    
    void sleep(){//menampilkan kalimat keterangan tentang kucing yang tidur
        System.out.println("Kucing tidur setelah makan ");
    }
    
    void roam(){//menampilkan keadaan Kucing saat berkeliaran
        System.out.println("Kucing berkeliling mencari makan"+ location
                +"dengan luas kurang "+ boundaries+" sendirian");
    }
}
