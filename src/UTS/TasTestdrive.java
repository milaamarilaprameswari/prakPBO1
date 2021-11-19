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
public class TasTestdrive {
    public static void main(String[] args) {
        //panggil method di class backpack
        Backpack bp = new Backpack();
        bp.cetakinfo();
        bp.setJumlahkantong(20);
        bp.setHargajual(500000);
        bp.hitunghargassetelahdiskon();
        bp.hitungpotongandiskon();
        
        System.out.println("");
        //panggil method di class slingbag
        SlingBag sb = new SlingBag();
        sb.cetakinfo();
        sb.setJumlahtali(5);
        sb.setHargajual(450000);
        sb.hitunghargassetelahdiskon();
        sb.hitungpotongandiskon();
        
        System.out.println("");
        //panggil method di class totebag
        ToteBag tb = new ToteBag();
        tb.cetakinfo();
        tb.setJumlahwarna(2);
        tb.setHargajual(50000);
        tb.hitunghargassetelahdiskon();
        tb.hitungpotongandiskon();
 
        }
    }

