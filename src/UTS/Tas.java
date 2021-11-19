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
public class Tas {
    //instance variabel
    private String jenistas;
    private String warnadasar;
    private String bahan;
    private double hargajual;
    private double Persendiskon;
    //instance variabel tambahan 
    private double potongandiskon;
    private double hargasetelahdiskon;
    //setter dan getter
    public double getHargasetelahdiskon() {
        return hargasetelahdiskon;
    }
    public void setHargasetelahdiskon(double hsd) {
        hargasetelahdiskon = hsd;
    }
    public double getPotongandiskon() {
        return potongandiskon;
    }
    public void setPotongandiskon(double potd) {
       potongandiskon = potd;
    }
    public String getJenistas() {
        return jenistas;
    }
    public void setJenistas(String jnstas) {
        jenistas = jnstas;
    }
    public String getWarnadasar() {
        return warnadasar;
    }
    public void setWarnadasar(String wd) {
        warnadasar = wd;
    }
    public String getBahan() {
        return bahan;
    }
    public void setBahan(String bhn) {
        bahan = bhn;
    }
    public double getHargajual() {
        return hargajual;
    }
    public void setHargajual(double hj) {
        hargajual = hj;
    }
    public double getPersendiskon() {
        return Persendiskon;
    }
    public void setPersendiskon(double pd) {
        Persendiskon = pd;
    }
    //method 
    void cetakinfo(){}
    void hitunghargassetelahdiskon(){}
    void hitungpotongandiskon(){}
}
 

