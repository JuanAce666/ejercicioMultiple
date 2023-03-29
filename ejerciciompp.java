/*Hacer un programa que lea n registros de viajes (código viaje, numero de personas que viajan y ciudad destino), debe imprimir el valor del viaje si el valor por persona para cada destino es el siguiente: Cartagena vale 1200000, Leticia vale 2000000, Cali vale 800000 y Bogotá vale 700000) */
package viajes_selector_multiple;
//Librerias
import java.text.DecimalFormat;
import java.util.Scanner;

public class Viajes_selector_Multiple {

  
    public static void main(String[] args) {
        // Definicion de objetos y variables
        Scanner objread=new Scanner(System.in);
        DecimalFormat formato=new DecimalFormat("#.##");
        int n,nro_personas;
        float valor_persona,valor_total;
        String cod,ciudad;
        System.out.print("Digite cantidad de registros ");
        n=objread.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("¿Cual es el codigo del viaje? ");
            cod=objread.next();
            System.out.print("¿Cuantas personas viajan");
            nro_personas=objread.nextInt();
            System.out.print("¿Cual es la ciudad destinada?");
            ciudad=objread.next();
            //selector multiple
            //en caso de ciudad
            switch (ciudad){
                case "cartagena":valor_persona=1200000;
                valor_total=valor_persona * nro_personas;
                    System.out.print("El valor total es " + formato.format (valor_total));
                break;
                case "leticia":valor_persona=2000000;
                    valor_total=valor_persona * nro_personas;
                    System.out.print("El valor total es " + formato.format (valor_total));
                break;
                case "cali":valor_persona=8000000;
                    valor_total=valor_persona * nro_personas;
                    System.out.print("El valor total es " + formato.format (valor_total));
                break;
                case "bogota":
                    valor_persona=7000000;
                    valor_total=valor_persona * nro_personas;
                    System.out.print("El valor total es " + formato.format(valor_total));
                break;
                default:System.err.println("\n Opcion no valida");
                valor_persona=0;
                break;
            }
            
           
        }
    }
    
}
