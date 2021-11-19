/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objekbehavior;

/**
 *
 * @author ACER
 */
public class GoodDogTestDrive {
    public static void main(String[] args) {
        //membuat referensi
        GoodDog one = new GoodDog();
        one.setSize(70);
        GoodDog two = new GoodDog();
        two.setSize(8);
        //menampilkan ukuran dog dengan menggunakan getter
        System.out.println("Dog pertama: "+one.getSize());
        System.out.println("Dog Kedua: "+two.getSize());
        //menjalankan method bark
        one.bark();
        two.bark();
    }
}
