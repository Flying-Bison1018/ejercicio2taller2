
package ejercicio2vectores;

import java.util.Scanner;
public class Ejercicio2vectores {

   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int saldoMes,totalBonos,totalCred,limPer,nuevoSald;
        System.out.println("Ingrese saldo(Incio del mes)");
        saldoMes = entrada.nextInt();
        
        System.out.println("Ingrese el total de abonos");
        totalBonos = entrada.nextInt();
        
        System.out.println("Ingrese el total de creditos aplicados");
        totalCred = entrada.nextInt();
        
        System.out.println("Limite de credito permitido");
        limPer = entrada.nextInt();
        
        System.out.println("---Nuevo Saldo---");
        nuevoSald = saldoMes+totalBonos+totalCred;
        System.out.println("El saldo nuevo es:"+nuevoSald);
        
        if(nuevoSald>limPer)
        {
            System.out.println("Se excedio el limite de su credito");
        }
    }
    
}
