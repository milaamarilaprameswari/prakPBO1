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
public class Dogtestdrive {
    public static void main(String[] args) {
        //membuat referensi objek
        Dog one= new Dog();
        one.size =70;
        Dog two = new Dog();
        two.size = 8;
        Dog three = new Dog();
        three.size = 35;
        //menjalankan void bark
        one.bark();
        two.bark();
        three.bark();
    }
}
