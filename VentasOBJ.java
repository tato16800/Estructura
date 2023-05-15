import java.util.Scanner;

public class VentasOBJ {
    public static void main(String[] args) {
       int tam;
       Scanner insert = new Scanner(System.in);
       System.out.println("Digite el numero de clientes");
       tam = insert.nextInt();
       
       VentasPOO[] admin = new VentasPOO[tam];
        
       int com1,com2,com3,ids,i;
       double promedio;
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
           
           VentasPOO sell = new VentasPOO();
           
           sell.id = ids;
           sell.nombres = nom;
           sell.comp1 = com1;
           sell.comp2 = com2;
           sell.comp3 = com3;
           admin[i] = sell;
           promedio +=((admin[i].comp1 + admin[i].comp2 + admin[i].comp3)/3)/tam;
       }
       
       System.out.println("El promedio de ventas fue: " + promedio);
    }
}
