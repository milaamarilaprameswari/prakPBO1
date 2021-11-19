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
public class animal {
    //instance variable
    public String Picture;
    public String Food;
    public String hunger;
    public String boundaries;
    public String location;
    //Method yang di override
    
    void Makenoise(){//menampilkan jenis suara hewan
        System.out.println("Hewan bersuara ");
    }
    void sleep(){//menampilkan kalimat keterangan tentang hewan yang tidur
        System.out.println("hewan tidur setelah makan");
    }
    void roam(){//menampilkan keadaan hewan saat berkeliaran
        System.out.println("Hewan berkeliaran");
    }
    void eat(){//menampilkan jenis makanan yang dimakan hewan
        System.out.println("Hewan memakan daging");
    }
}
