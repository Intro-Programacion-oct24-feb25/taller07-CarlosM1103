/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;
/**
 *
 * @author CDML
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero = 2;
        int suma;
        int contador = 4;
                
        while (numero <= 110){
            System.out.println(numero);
            suma = numero + contador;
            numero = suma;
            contador = contador + 2;
        }
    }
    
}