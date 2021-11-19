/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prakpbo;

/**
 *
 * @author ACER
 */
public class bentukfrasa {
    public static void main(String[] args) {
        String [] listkata1 = {"Baju", "Rumah", "Celana", "Buku", "Pensil", "Komputer", "Tas", "Lampu", "Boneka"};
        String [] listkata2 = {"Baru", "Bersih", "Kotor", "Rusak", "Usang", "Indah", "lama", "populer", "lucu"};
        String [] listkata3 = {"kuning", "itu", "di bawah", "ini", "hijau", "miliknya", "adik", "putih", "di sana"};
        
        int bykkata1= listkata1.length;
        int bykkata2 = listkata2.length;
        int bykkata3 = listkata3.length;
        
        int hsl1 = (int)(Math.random()*bykkata1);
        int hsl2 = (int)(Math.random()*bykkata2);
        int hsl3 = (int)(Math.random()*bykkata3);
        
        String Bentukfrasa = (" "+listkata1[hsl1]+" "+listkata2[hsl2]+" "+listkata3[hsl3]);
        
        System.out.println("Saya memiliki sebuah"+Bentukfrasa);
    }
}
