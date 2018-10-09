
package boletin2_5;
import java.util.Scanner;
public class Boletin2_5 {

    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    double sb=0.0,sl=0.0;
    float sf=0.0f,ventas=0.0f,km=0.0f;
    int dias=0;
    System.out.println("Indique o seu soldo fixo: ");
    sf=ler.nextFloat();
    System.out.println("Indique o importe total de ventas: ");
    ventas=ler.nextFloat();
    System.out.println("Indique os km que ha recorrido: ");
    km=ler.nextFloat();
    System.out.println("Indique os dias que ha estado desprazado: ");
    dias=ler.nextInt();
    sb=sf+0.05*ventas+2*km+30*dias;
    System.out.println("O seu soldo bruto é: "+(float)sb);
    
    sl=sb-sb*0.18-36;
    System.out.println("O seu soldo liquido é: "+(float)sl);
    
    }
    
}
