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
public class animaltestdrive {
    public static void main(String[] args) {
        //buat isi objek dari class Cat
        Cat cat1 = new Cat();
        //panggil method kemudian dijalankan
        cat1.Makenoise();
        cat1.eat();
        cat1.roam();
        cat1.sleep();
        
        System.out.println("");//digunakan untuk memberi space antar kalimat di output
        //buat isi objek dari class Hippo
        Hippo kudanil = new Hippo();
        //panggil method kemudian dijalankan
        kudanil.Makenoise();
        kudanil.eat();
        kudanil.roam();
        kudanil.sleep();
        
        System.out.println("");//digunakan untuk memberi space antar kalimat di output
        //buat isi objek dari class Wolf
        Wolf wolf1 = new Wolf();
        //panggil method kemudian dijalankan
        wolf1.Makenoise();
        wolf1.eat();
        wolf1.roam();
        wolf1.sleep();
        
        System.out.println("");//digunakan untuk memberi space antar kalimat di output
        //buat isi objek dari class Tiger
        Tiger macan = new Tiger();
        //panggil method kemudian dijalankan
        macan.Makenoise();
        macan.eat();
        macan.roam();
        macan.sleep();
        
        System.out.println("");//digunakan untuk memberi space antar kalimat di output
        //buat isi objek dari class Lion
        Lion singa = new Lion();
        //panggil method kemudian dijalankan
        singa.Makenoise();
        singa.eat();
        singa.roam();
        singa.sleep();
        
        System.out.println("");//digunakan untuk memberi space antar kalimat di output
        //buat isi objek dari class Dog
        Dog anjing = new Dog();
        //panggil method kemudian dijalankan
        anjing.Makenoise();
        anjing.eat();
        anjing.roam();
        anjing.sleep();
    }
}
