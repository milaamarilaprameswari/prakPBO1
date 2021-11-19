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
public class GoodDog {
    //instance variable
    private int size;
    //getter dan setter
    public int getSize(){
        return size;
    }
    public  void setSize(int s){
        size=s;
    }
    //method agar dog dapat bersuara
    void bark(){
        if (size > 60){
            System.out.println("Wooof! Wooof!");
        }else if(size>14){
            System.out.println("Ruff! Ruff!");
        }else {
            System.out.println("Kaing! Kaing!");
        }
    }
}
