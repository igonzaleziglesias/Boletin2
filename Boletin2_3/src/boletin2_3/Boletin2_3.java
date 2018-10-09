
package boletin2_3;
import java.util.Scanner;
public class Boletin2_3 {
 
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int b100=0,b20=0,b5=0,m1=0,dinero=0;
        System.out.println("Introduce el numero de billetes de 100: ");
        b100=ler.nextInt();
        System.out.println("Introduce el numero de billetes de 20: ");
        b20=ler.nextInt();
        System.out.println("Introduce el numero de billetes de 5: ");
        b5=ler.nextInt();
        System.out.println("Introduce el numero de monedas de 1: ");
        m1=ler.nextInt();        
        dinero=b100*100+b20*20+b5*5+m1*1;
        System.out.println(dinero+" Euros");
    
    }
    
}
