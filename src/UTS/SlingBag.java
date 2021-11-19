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
public class SlingBag extends Tas{
    //instance variabel
    int jumlahtali;
    int B=9;
    //setter dan getter
    public int getJumlahtali() {
        return jumlahtali;
    }
    public void setJumlahtali(int jt) {
        jumlahtali = jt;
    }
    //method
   void hitunghargassetelahdiskon(){
        setPersendiskon((50/jumlahtali)+B);
        System.out.println("Diskon yang didapat : "+getPersendiskon()+"%");
        setPotongandiskon(getPersendiskon()/100*getHargajual());
        System.out.println("Potongan diskon : "+getPotongandiskon());
    }
    void hitungpotongandiskon(){
        setHargasetelahdiskon(getHargajual()-getPotongandiskon());
        System.out.println("Harga setelah dipotong Diskon : "+getHargasetelahdiskon());
        }
    void cetakinfo(){
        setJenistas("Slingbag");
        setBahan("Kulit");
        setWarnadasar("Abu-abu");
        System.out.println(getJenistas()+" berwarna "+getWarnadasar() +" \nbahan "+getBahan());
    }

    
}
