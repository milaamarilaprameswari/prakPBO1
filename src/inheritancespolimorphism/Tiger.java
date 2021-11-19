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
public class Tiger extends Feline{
    void Makenoise(){//menampilkan jenis suara hewan
        System.out.println("Macan bersuara Hrraaa Hrraaa");
    }
    void eat(){//menampilkan jenis makanan yang dimakan Macan
        System.out.println("Macan makan Daging yang sudah dimangsanya");
    }
    void sleep(){//menampilkan kalimat keterangan tentang Macan yang tidur
        System.out.println("Macan tidur setelah makan ");
    }
    
    void roam(){//menampilkan keadaan Macan saat berkeliaran
        System.out.println("Macan berkeliling mencari makan"+ location
                +"dengan luas lebih "+ boundaries+" berkelompok atau sendirian");
    }
}
