/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;

/**
 *
 * @author CDML
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numerador = 1;
        int denominador = 1;
        String signo;
        String cadenaF = "";
        
        cadenaF = String.format("%s%d ",cadenaF,numerador);
        
        
        while (denominador <= 13) {
            
            signo = switch (denominador) {
                case 1, 5, 9, 13 -> "-";
                default -> "+";
            };
            
         
         denominador = denominador + 2;
         cadenaF = String.format("%s %s %d/%d",cadenaF,signo,numerador,denominador);
            
            
        }
        
        System.out.println(cadenaF);
    }
    
}
