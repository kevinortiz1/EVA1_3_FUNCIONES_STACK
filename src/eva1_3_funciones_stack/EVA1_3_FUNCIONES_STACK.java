/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_3_funciones_stack;

/**
 *
 * @author Kevin Ortiz
 */
public class EVA1_3_FUNCIONES_STACK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("INICIA MAIN");
        A();
        System.out.println("TERMINA MAIN");
    }
    public static void A(){
        System.out.println("INICIA A");
        B();
        System.out.println("TERMINA A");
    }
    public static void B(){
        System.out.println("INICIA B");
        C();
        System.out.println("TERMINA B");
    }public static void C(){
        System.out.println("INICIA C");
        D();
        System.out.println("TERMINA C");
    }public static void D(){
        System.out.println("INICIA D");
        System.out.println("TERMINA D");
    }
}
