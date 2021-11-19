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
public class PetsBark {
    public static void main(String[] args) {
        //membuat objek gooddog dan aksesnya
        GoodDog[] pets = new GoodDog[10];
        for (int i=0; i<pets.length; i++){
            pets[i] = new GoodDog();
        }
        //mengakses objek pets agar bisa menghasilkan nilai random untuk digunakan
        //pada proses selanjutnya
        for(int j=0; j<pets.length; j++){
            int p= (int)(Math.random()*100);
            pets[j].setSize(p);
        }
        //loop array untuk menampilkan suara anjing
        int x=0;
        while (x<pets.length){
            System.out.println("Pets ke-"+ x +" ukuran suara dog : "+pets[x].getSize());
            pets[x].bark();
            System.out.println(" ");
            x++;
        }
    }
}
