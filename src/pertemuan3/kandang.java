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
public class kandang {
    String jenisternak;
    String makananternak;
    String jeniskandang;
}
class kandangtestdrive{
    public static void main(String[] args) {
        //buat array kandang
        kandang[] isikandang = new kandang[4];
        isikandang[0] = new kandang();
        isikandang[1] = new kandang();
        isikandang[2] = new kandang();
        isikandang[3] = new kandang();
        //mengakses objek kandang menggunakan referensi array
        isikandang[0].jenisternak = "Kambing";
        isikandang[1].jenisternak = "Sapi";
        isikandang[2].jenisternak = "Unta";
        isikandang[3].jenisternak = "Domba";
        isikandang[0].jeniskandang ="Bambu";
        isikandang[1].jeniskandang ="Kayu";
        isikandang[2].jeniskandang ="Kayu";
        isikandang[3].jeniskandang ="Bambu";
        isikandang[0].makananternak ="daun ramban";
        isikandang[1].makananternak ="rumput gajah";
        isikandang[2].makananternak ="kaktus";
        isikandang[3].makananternak ="rumput-rumputan";
        
        //loop array dan setiap ternak akan memiliki rincian makanan dan kandangnya
        int y =0;
        while(y<isikandang.length){
            System.out.print(isikandang[y].jenisternak);
            System.out.print(" memakan ");
            System.out.print(isikandang[y].makananternak);
            System.out.print(" di kandang ");
            System.out.println(isikandang[y].jeniskandang);
            y++;
        }
        
    }
}