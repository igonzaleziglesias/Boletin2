
package boletin2_1;
import java.util.Scanner;

public class Boletin2_1 {
    
    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    float pt=0.0f,pp=0.0f,desconto=0.0f;
    System.out.println("Precio da tarifa= ");
    pt=ler.nextFloat();
    System.out.println("Precio pagado= ");
    pp=ler.nextFloat();
    desconto=(1-(pp/pt))*100;
    System.out.println("O desconto e do "+desconto+" %");
    }
    
}
