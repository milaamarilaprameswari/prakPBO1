/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS;

/**
 *
 * @author ACER
 */
public class ToteBag extends Tas{
    //instance variabel
    int jumlahwarna;
    int C = 1;
    //setter getter
    public int getJumlahwarna() {
        return jumlahwarna;
    }
    public void setJumlahwarna(int jw) {
        jumlahwarna = jw;
    }
    //method yang override
    void hitunghargassetelahdiskon(){
        setPersendiskon(((50/jumlahwarna)+C));
        System.out.println("Diskon yang didapat : "+getPersendiskon()+"%");
        setPotongandiskon((getPersendiskon()/100)*getHargajual());
        System.out.println("Potongan diskon : "+getPotongandiskon());
    }
    void hitungpotongandiskon(){
        setHargasetelahdiskon(getHargajual()-getPotongandiskon());
        System.out.println("Harga setelah dipotong Diskon : "+getHargasetelahdiskon());
    }
    void cetakinfo(){
        setJenistas("Totebag");
        setBahan("Kain");
        setWarnadasar("Hitam");
        System.out.println(getJenistas()+" berwarna "+getWarnadasar() +" \nbahan "+getBahan());
    }
    
}
