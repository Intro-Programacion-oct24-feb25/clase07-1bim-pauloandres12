/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplociclowhile;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo102 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int limite_tabla;
        int contador = 1;
        int contador2 = 1;
        int contador3 = 1;
        
        int operacion;
        int operacion2;
        int operacion3;
        
        int tabla; //numero negativo = tabla 12
                   //>0 = tabla 12
        
        System.out.println("Ingrese el número de tabla a generar");
        tabla = entrada.nextInt();
        System.out.println("Ingrese el limite de tabla");
        limite_tabla = entrada.nextInt();
        
        String cadena = ""; 
        cadena = String.format("%sTabla de sumar\n",cadena);
        String cadenaResta = "";
        cadenaResta = String.format("%sTabla de restar\n",cadenaResta);
        String cadenaMultiplicacion = "";
        cadenaMultiplicacion = String.format("%sTabla de multiplicar\n",
                cadenaMultiplicacion);
        
        while (contador <= limite_tabla){
            operacion = tabla + contador;
            operacion2 = tabla - contador2;
            operacion3 = tabla * contador3;
            
            cadena = String.format("%s%d+%d=%d\n", 
                    cadena, 
                    tabla, 
                    contador,
                    operacion);
            contador = contador + 1;
            
            cadenaResta = String.format("%s%d-%d=%d\n", 
                    cadenaResta, 
                    tabla, 
                    contador2,
                    operacion2);
            contador2 = contador2 + 1;
            
            cadenaMultiplicacion = String.format("%s%d*%d=%d\n",
                    cadenaMultiplicacion,
                    tabla,
                    contador3,
                    operacion3);
            contador3 = contador3 + 1;
        }
                
        System.out.printf("%s\n%s\n%s\n", 
                cadena,
                cadenaResta,
                cadenaMultiplicacion);
        
    }
}
