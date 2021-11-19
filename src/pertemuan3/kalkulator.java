/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan3;

/**
 *
 * @author ACER
 */
public class kalkulator {
    //variabel global
    int a;//deklarasi variabel
    int b;
   
    //method operator
    //method bertipe void
    public void penjum(){
        int hasil = a+b;
        System.out.println(hasil);
    }
    //method bertipe nonvoid
    public int penjumbalahn(){//yang memiliki tipe data
        int hasil = a+b;//variabel lokal
        return hasil;
    }
    
    public int pengurangan(){
        int hasil = a-b;
        return hasil;
    }
}
