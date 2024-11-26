/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;
import java.util.Scanner;
/**
 *
 * @author CDML
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in) ;
        String nombre;
        int posicion;
        int edad;
        double estatura;
        String cadenaF = "";
        double promedioEdad;
        double promedioEstatura;
        int contador = 1;
        String posicionS = "";
        String edades = "";
        int sumaEdad = 0;
        double sumaEstatura = 0;
        int limite = 0;
        
        System.out.println("Ingrese con un número el límite de jugadores "
                + "que va a registrar");
        
        limite = leer.nextInt();
        leer.nextLine();
        
        while (contador <= limite ){
            
            System.out.println("\nIngrese el nombre y apellido del jugador");
            nombre = leer.nextLine();
            System.out.println("""
                               \nSeleccione la posición del jugador con un nunero:
                               1. Portero
                               2. Defensor
                               3. Mediocampistas
                               4. Delantero""");
            posicion = leer.nextInt();
            
            if (posicion == 1){
                posicionS = "Portero";
            }
            
            if (posicion >1 && posicion <=4){
                System.out.println("\nSeleccione la posición específica "
                            + "del jugador con un número:");
                switch(posicion){
                    case 2:
                        System.out.println("""
                                            1. Lateral derecho
                                            2. Lateral izquierdo
                                            3. Defensa central derecho
                                            4. Defensa central izquierdo
                                            5. Líbero
                                            6. Carrilero""");
                        posicion = leer.nextInt();

                        switch(posicion){
                            case 1 -> posicionS = "Lateral derecho";
                            case 2 -> posicionS = "Lateral izquierdo";
                            case 3 -> posicionS = "Defensa central derecho";
                            case 4 -> posicionS = "Defensa central izquierdo";
                            case 5 -> posicionS = "Líbero";
                            case 6 -> posicionS = "Carrilero";
                        }
                                 
                    break;

                    
                    case 3:
                        System.out.println("""
                                           1. Mediocentro defensivo
                                           2. Mediocentro ofensivo
                                           3. Interior derecho
                                           4. Interior izquierdo
                                           5. Mediocampista central
                                           6. Pivote""");
                        posicion = leer.nextInt();
                       
                        switch(posicion){
                            case 1 -> posicionS = "Mediocentro defensivo";
                            case 2 -> posicionS = "Mediocentro ofensivo";
                            case 3 -> posicionS = "Interior derecho";
                            case 4 -> posicionS = "Interior izquierdo";
                            case 5 -> posicionS = "Mediocampista central";
                            case 6 -> posicionS = "Pivote";
                        }
                                  
                    break;

                    
                    case 4:
                        System.out.println("""
                                           1. Extremo derecho
                                           2. Extremo izquierdo
                                           3. Delantero centro
                                           4. Segundo delantero
                                           5. Delantero centro""");
                        posicion = leer.nextInt();

                        switch(posicion){
                            case 1 -> posicionS = "Extremo derecho";
                            case 2 -> posicionS = "Extremo izquierdo";
                            case 3 -> posicionS = "Delantero centro";
                            case 4 -> posicionS = "Segundo delantero";
                            case 5 -> posicionS = "Delantero centro";
                        }
        
                    break;
                    
                    
                    
                }
                
                
            }

            System.out.println("\nIngrese la edad");
            edad = leer.nextInt();
            System.out.println("\nIngrese la estatura");
            estatura = leer.nextDouble();
            leer.nextLine();
            
            edades = String.format("%s%d\n", edades,edad);
            sumaEstatura = sumaEstatura + estatura;
            sumaEdad = sumaEdad + edad;
            
            cadenaF = String.format("%s%d. %s -%s-, edad %d, estatura %.2f\n"
                    ,cadenaF
                    ,contador
                    ,nombre
                    ,posicionS
                    ,edad
                    ,estatura );
            
            contador = contador + 1;
            
            
            
        }
        promedioEstatura = sumaEstatura/contador;
        promedioEdad = sumaEdad/contador;
        cadenaF = String.format("""
                                %sListado de edades
                                %sPromedio de edades:  %.1f
                                Promedio de estaturas: %.2f"""
                ,cadenaF
                ,edades
                ,promedioEdad
                ,promedioEstatura);
        
        System.out.printf("\n%s\n",cadenaF);
                
    }
    
}
