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
public class PoorDog {
    //Instance variable 
    private int size;
    private String name;
    //membuat Getter
    public  int getSize(){
        return size;
    }
    public String getName(){
        return name;
    }
}
class PoorDogTestDrive {
    public static void main(String[] args) {
        //referensi objek
        PoorDog one = new PoorDog();
        //menampilkan ukuran dan nama anjing
        System.out.println("Ukuran Anjing = " +one.getSize());
        System.out.println("Nama anjing = "+ one.getName());
    }
}