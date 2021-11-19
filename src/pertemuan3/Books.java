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
public class Books {
    String title;
    String author;
}
class bookstestdrive{
    public static void main(String[] args) {
        //buat array books
        Books[] mybooks = new Books[3];
        /*hal yang perlu ditambah adalah kode di baris 23,24, dan 25. termasuk 
        kode untuk membuat array
        */
        mybooks[0] = new Books();
        mybooks[1] = new Books();
        mybooks[2] = new Books();
        //akses objek books menggunakan referensi array 
        mybooks[0].title = "Melawan Kemustahilan";
        mybooks[1].title = "Muhammad Al Fatih 1453";
        mybooks[2].title = "Awe-inspiring me";
        mybooks[0].author = "Dewa Eka Prayoga";
        mybooks[1].author = "Felix Siauw";
        mybooks[2].author = "Dewi Nur Aisyah";
        
        //loop array dan setiap buku akan dicetak judul dan penulisnya
        int x = 0;
        while(x<mybooks.length){
            System.out.print(mybooks[x].title);
            System.out.print(" karya ");
            System.out.println(mybooks[x].author);
            x++;
        }
    }
}