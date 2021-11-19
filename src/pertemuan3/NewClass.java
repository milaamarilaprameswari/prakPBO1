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
public class NewClass {
    public static void main(String[] args) {
        String [] island = new String[4];
        int[] index = new int[4];
        
        int y=0;
        
        int ref;
        while(y<4){
            ref = index[y];
            System.out.println(island[ref]);
            y++;
        }
        
    }
}
