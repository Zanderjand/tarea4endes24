/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entidadFinanciera;


public class Main {

    public static void main(String[] args) {
        CCuenta objetoCuenta;
        double saldoActual;
        

        objetoCuenta = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = objetoCuenta.estado();
        System.out.println("El saldo actual es"+ saldoActual );
        
    // Probar ingresar
    probarIngresar(objetoCuenta, 500);

    // Probar retirar
    probarRetirar(objetoCuenta, 300);
        
    
    }
    
    public static void probarIngresar(CCuenta cuenta, double cantidadEsperada) {
    try {
        cuenta.ingresar(cantidadEsperada);
        System.out.println("Ingreso realizado correctamente. Nuevo saldo: " + cuenta.estado());
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
}

public static void probarRetirar(CCuenta cuenta, double cantidadEsperada) {
    try {
        cuenta.retirar(cantidadEsperada);
        System.out.println("Retiro realizado correctamente. Nuevo saldo: " + cuenta.estado());
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
}
}
