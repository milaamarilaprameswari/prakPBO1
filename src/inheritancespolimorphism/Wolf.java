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
public class Wolf extends Canine{
    
    void Makenoise(){//menampilkan jenis suara hewan
        System.out.println("Serigala bersuara AAuuuu AAuuuu");
    }
    void eat(){//menampilkan jenis makanan yang dimakan Serigala
        System.out.println("Serigala makan Daging yang sudah dimangsanya");
    }
    void sleep(){//menampilkan kalimat keterangan tentang serigala yang tidur
        System.out.println("Serigala tidur setelah makan ");
    }
    
    void roam(){//menampilkan keadaan Serigala saat berkeliaran
        System.out.println("Serigala Berkeliling "+location
                +" kandangnya sejauh "+boundaries);
    }
}
