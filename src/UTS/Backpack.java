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
public class Backpack extends Tas{
    //instance variabel
    int jumlahkantong;
    int A = 1;
    //setter dan getter
    public int getJumlahkantong() {
        return jumlahkantong;
    }
    public void setJumlahkantong(int jk) {
        jumlahkantong = jk;
    }
    //method yang override
    void hitunghargassetelahdiskon(){
        setPersendiskon((50/jumlahkantong)+A);
        System.out.println("Diskon yang didapat : "+getPersendiskon()+"%");
        setPotongandiskon(getPersendiskon()/100*getHargajual());
        System.out.println("Potongan diskon : "+getPotongandiskon());
    }
    void hitungpotongandiskon(){
        setHargasetelahdiskon(getHargajual()-getPotongandiskon());
        System.out.println("Harga setelah dipotong Diskon : "+getHargasetelahdiskon());
        }
    void cetakinfo(){
        setJenistas("Backpack");
        setBahan("Polyester");
        setWarnadasar("coklat");
        System.out.println(getJenistas()+" berwarna "+getWarnadasar() +" \nbahan "+getBahan());
    }

}
