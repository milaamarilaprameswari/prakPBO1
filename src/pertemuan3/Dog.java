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
public class Dog {
    String nama;
    public static void main(String[] args) {
        //buat objek dog dan aksesnya
        Dog dog1 = new Dog();
        
        dog1.nama="ciko";
        dog1.bark();
        /*jika pada baris ke 17 dimasukkan kode dog1.bark(); maka hasilnya ada null
        didalam runnya, tetapi jika dog1.bark() diletakkan setelah kode baris ke 18 
        maka null tadi berganti menjadi ciko. hal ini disebabkan prograam menjalankan 
        perintah dengan urut. sehingga jika kode dog1.bark() diletakkan di awal maka
        output akan null, karena dog1 belum ada isinya.
        */ 
        //buat array dog
        Dog[] anjing = new Dog[3];
        anjing[0]= new Dog();
        anjing[1]= new Dog();
        anjing[2]= dog1;
        
        //akses objek DOg menggunakan referensi array
        anjing[0].nama = "Dalma";
        anjing[1].nama= "Doggy";
        
        //coba cetak, anjing terakhir namanya siapa ya?
        System.out.println("nama anjing terakhir");
        System.out.println(anjing[2].nama);
        
        //loop array dan semua anjing menggongging
        int x=0;
        while (x<anjing.length){
            anjing[x].bark();
            x=x+1;
        }
    }
       public void bark(){
           System.out.println(nama + " bersuara guk-guk");
       }
               
}
