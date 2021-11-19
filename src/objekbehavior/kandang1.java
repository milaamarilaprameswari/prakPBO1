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
public class kandang1 {
    //variabel
    private String jenisternak;
    private String makananternak;
    private String jeniskandang;
    //membuat Getter dan Setter
    public String getjenisternak(){
        return jenisternak;
    }
    public void setjenisternak(String ternak){
        jenisternak = ternak;
    }
    public String getmakananternak(){
        return makananternak;
    }
    public void setmakananternak(String makanan){
        makananternak = makanan;
    }
    public String getjeniskandang(){
        return jeniskandang;
    }
    public void setjeniskandang(String kandang){
        jeniskandang = kandang;
    }
}
class kandangtestdrive{
    public static void main(String[] args) {
        //buat array kandang
        kandang1[] isikandang = new kandang1[4];
        int x=0;
        while(x<isikandang.length){
            isikandang[x] = new kandang1();
            x++;
        }
        //mengakses objek kandang menggunakan referensi array
        //memasukkan array ke setjeniskandang
        isikandang[0].setjeniskandang("Kandang Kayu");
        isikandang[1].setjeniskandang("Kandang Bambu");
        isikandang[2].setjeniskandang("Kandang Kayu");
        isikandang[3].setjeniskandang("Kandang Bambu");
        //memasukkan array ke setjenisternak
        isikandang[0].setjenisternak("Sapi");
        isikandang[1].setjenisternak("Kambing");
        isikandang[2].setjenisternak("Unta");
        isikandang[3].setjenisternak("Domba");
        //memasukkan array ke setmakananternak
        isikandang[0].setmakananternak("rumput gajah");
        isikandang[1].setmakananternak("daun ramban");
        isikandang[2].setmakananternak("kaktus");
        isikandang[3].setmakananternak("rumput-rumputan");
        //loop array dan setiap ternak akan memiliki rincian makanan dan kandangnya
        int y =0;
        while(y<isikandang.length){
            System.out.print(isikandang[y].getjenisternak());
            System.out.print(" memakan ");
            System.out.print(isikandang[y].getmakananternak());
            System.out.print(" di ");
            System.out.println(isikandang[y].getjeniskandang());
            y++;
        }
    }
}