/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancespolimorphism;

/**
 *
 * @author ACER
 */
 class A {
    int var = 7;
    void m1(){
        System.out.print("A's m1, ");
}void m2(){
    System.out.print("A's m2, ");
}void m3(){
    System.out.print("A's m3, ");
}
 }
 class B extends A{
     void m1(){
         System.out.print("B's m1, ");
 }
 }
class C extends B{
    void m3(){
        System.out.print("C's m3, "+(var +6));
    }
}

public class quiz{
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        A a2 = new C();
        
        c.m1();
        c.m2();
        c.m3();
    }
}