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
public class Dog extends Canine{
    void Makenoise(){//menampilkan jenis suara hewan
        System.out.println("Anjing bersuara Gukguk Gukguk");
    }
    void eat(){//menampilkan jenis makanan yang dimakan Anjing
        System.out.println("Anjing makan daging dari hasil buruannya");
    }
    void sleep(){//menampilkan kalimat keterangan tentang Anjing yang tidur
        System.out.println("Anjing tidur setelah makan ");
    }
    void roam(){//menampilkan keadaan Anjing saat berkeliaran
        System.out.println("Anjing berkeliling mencari makanan "+location
                +" kandangnya sejauh "+boundaries);
    }
}
