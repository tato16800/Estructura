import java.util.Scanner;

/**
 * Write a description of class Taller here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Taller
{
    public static void main(String[]args){
        int id[];
        id = new int [3];
        int comp1[];
        comp1 = new int [3];
        int comp2[];
        comp2 = new int [3];
        int comp3[];
        comp3 = new int [3];
        String nombres[];
        nombres = new String [3];
        int clientes,i,com1,com2,com3;
        int promedio;
        int ids;
        String nom;
        promedio = 0;
        
        Scanner a = new Scanner(System.in);
        Scanner txt = new Scanner(System.in);
        System.out.println("Digite el numero de clientes");
        clientes = a.nextInt();
        
        for (i=0;i <= clientes -1;i++){
            System.out.println("Digite su numero de cedula ");
            ids = a.nextInt();
            System.out.println("Digite su nombre");
            nom = txt.nextLine();
            System.out.println("Digite el valor del primer computador");
            com1 = a.nextInt();
            System.out.println("Digite el valor del segundo computador");
            com2 = a.nextInt();
            System.out.println("Digite el valor del tercer computador");
            com3 = a.nextInt();
            id[i] = ids;
            nombres[i] = nom;
            comp1[i] = com1;
            comp2[i] = com2;
            comp3[i] = com3;
            promedio += ((comp1[i] + comp2[i] + comp3[i])/3)/clientes;
        }
        System.out.println("El promedio de ventas fue " + promedio);
    }
}
