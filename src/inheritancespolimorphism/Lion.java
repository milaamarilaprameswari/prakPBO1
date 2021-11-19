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
public class Lion extends Feline{
    void Makenoise(){//menampilkan jenis suara hewan
        System.out.println("Singa bersuara Hhrr Hhrr");
    }
    void eat(){//menampilkan jenis makanan yang dimakan Singa
        System.out.println("Singa makan Daging yang sudah dimangsanya");
    }
    void sleep(){//menampilkan kalimat keterangan tentang Singa yang tidur
        System.out.println("Singa tidur setelah makan ");
    }
    void roam(){//menampilkan keadaan Singa saat berkeliaran
        System.out.println("Singa berkeliling mencari makan"+ location
                +"dengan luas lebih "+ boundaries+" berkelompok ");
    }
}
