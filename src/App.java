import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello JD, Welcome to Java!");

        System.out.println("================================");
        
        Scanner scanner = new Scanner(System.in);
        int op = 0;

        // ARREGLO CON UNA DIMENSION
        String[] signoZodiacal = new String[12];

        signoZodiacal[0] = " PISCIS ";
        signoZodiacal[1] = " ARIES ";
        signoZodiacal[2] = " SAGITARIO ";
        signoZodiacal[3] = " CAPRICORNIO ";
        signoZodiacal[4] = " ACUARIO ";
        signoZodiacal[5] = " LEO ";
        signoZodiacal[6] = " TAURO ";
        signoZodiacal[7] = " CANCER ";
        signoZodiacal[8] = " LIBRA ";
        signoZodiacal[9] = " GEMINIS";
        signoZodiacal[10] = " VIRGO ";
        signoZodiacal[11] = " ESCORPIO ";

        System.out.println("EL TAMAÑO DEL ARREGLO ES : " + signoZodiacal.length);

        // CERRAR ESCANER
        //scanner.close();
        System.out.println("==================================");

        // IMPRIMIR ARREGLO
        System.out.println("¡¡NOMBRES ZODIACALES!!");
            for (String nombre : signoZodiacal) {
                System.out.println(nombre);
            }
        System.out.println("==================================");
        for (int i = 0; i < signoZodiacal.length; i++){
            System.out.println("INGRESA LA POSICION QUE DESEA VER");
                op = scanner.nextInt();
                 if ( op >= 0 && op < signoZodiacal.length){
                System.out.println("EN ESTA POSICION ESTÁ: " + signoZodiacal [ i = op]);

                break;
                }
                 else{
                 System.out.println("ERROR DE OPCION");
                }
                scanner.close();
        }
        System.out.println("==================================");

        // IMPRIMIR ARREGLO CON POSICION
        System.out.println("|ARREGLO CON INDICE|");
            for(int i=0; i< signoZodiacal.length; i++){
                System.out.println("EL INDICE " + i + " TIENE A: " + signoZodiacal[i]);
            }
        System.out.println("==================================");

        //ORDENAR DE FORMA ASCENDETE EL ARREGLO
        System.out.println("|ORDENADO A ASCENDENTE|");
        Arrays.sort(signoZodiacal);
            for(int i = 0; i < signoZodiacal.length; i++){
                System.out.print(signoZodiacal [i] + " ");
            }

        System.out.print("\n"); // CODIGO DE SALTO DE LINEA

        System.out.println("==================================");
        
        //ORDENAR DE FORMA DESCENDETE EL ARREGLO
        System.out.println("|ORDENADO A DESCENDENTE|");
        Arrays.sort(signoZodiacal, Collections.reverseOrder());

            for(int i = 0; i < signoZodiacal.length; i++){
                System.out.print(signoZodiacal  [i] + " ");
            }
    }
}
