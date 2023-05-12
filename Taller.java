import java.util.Scanner;

/**
 *
 * @author A340
 */
public class Taller {

    public static void main(String[] args) {
       int tam;
       Scanner insert = new Scanner(System.in);
       System.out.println("Digite el numero de clientes");
       tam = insert.nextInt();
        
       int ced[];
       ced = new int [tam];
       int comp1[];
       comp1 = new int [tam];
       int comp2[];
       comp2 = new int[tam];
       int comp3[];
       comp3 = new int[tam];
       String nombres[];
       nombres = new String [tam];
       int com1,com2,com3,promedio,ids,i;
       String nom;
       promedio = 0;
       
       
       for (i=0;i < tam;i++){
           System.out.println("Digine su numero de cedula");
           ids = insert.nextInt();
           System.out.println("Digite su nombre");
           nom = insert.nextLine();
           System.out.println("Digite el valor del primer computador");
           com1 = insert.nextInt();
           System.out.println("Digite el valor del segundo computador");
           com2 = insert.nextInt();
           System.out.println("Digite el valor del tercer computador");
           com3 = insert.nextInt();
           ced[i] = ids;
           nombres[i] = nom;
           comp1[i] = com1;
           comp2[i] = com2;
           comp3[i] = com3;
           promedio +=((comp1[i] + comp2[i] + comp3[i])/3)/tam;
       }
       
       System.out.println("El promedio de ventas fue: " + promedio);
    }
}
