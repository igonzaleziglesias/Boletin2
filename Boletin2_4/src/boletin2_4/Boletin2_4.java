
package boletin2_4;
import java.util.Scanner;
public class Boletin2_4 {

    
    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int dinero=0,b100=0,b20=0,b5=0,m1=0;
    System.out.println("Introduce la cantidad de dinero: ");
    dinero=ler.nextInt();
    b100=dinero/100;
    dinero=dinero%100;
    System.out.println(b100+" Billetes de 100");
    b20=dinero/20;
    dinero=dinero%20;
    System.out.println(b20+" Billetes de 20");
    b5=dinero/5;
    dinero=dinero%5;
    System.out.println(b5+" Billetes de 5");
    m1=dinero;
    System.out.println(m1+" Monedas de 1");
    }
    
}
