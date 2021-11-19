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
public class guessgame {
    player p1;
    player p2;
    player p3;
    
    public void startgame(){
        p1=new player();
        p2=new player();
        p3=new player();
        
        int guessp1= 0;
        int guessp2=0;
        int guessp3=0;
        
        boolean p1right= false;
        boolean p2right= false;
        boolean p3right= false;
        
        int targetnumber =(int) (Math.random()*10);
        System.out.println("aku mikirin angka antara 0-9...");
        
        while(true){
            System.out.println("Angka yang harus ditebak adalah "+targetnumber);
            
            p1.guess();
            p2.guess();
            p3.guess();
            
            guessp1 = p1.number;
            System.out.println("pemain pertama menebak angka "+guessp1);
            
            guessp2 = p2.number;
            System.out.println("pemain pertama menebak angka "+guessp2);
            
            guessp3 = p3.number;
            System.out.println("pemain pertama menebak angka "+guessp3);
            
            if (guessp1==targetnumber){
                p1right=true;
            }
            if (guessp2==targetnumber){
                p2right=true;
            }
            if (guessp3 == targetnumber){
                p3right=true;
            }
            
            if (p1right || p2right || p3right){
                System.out.println("Mantab sudah ada yang berhasil");
                System.out.println("apa pemain 1 yang menang? "+p1right);
                System.out.println("apa pemain 2 yang menang? "+p2right);
                System.out.println("apa pemain 3 yang menang? "+p3right);
                System.out.println("permainan selesai");
                break;
                
            } else {
                System.out.println("hayoo... coba tebak lagi");
            }
        }
    }
}
    

