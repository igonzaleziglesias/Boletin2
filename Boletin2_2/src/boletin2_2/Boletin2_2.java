
package boletin2_2;
import java.util.Scanner;
public class Boletin2_2 {
  
    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    float T=0.0f, F=0.0f, K=0.f;
    System.out.println("Introducir a Temperatura en ºC: ");
    T=ler.nextFloat();
    F=T*9/5+32;
    K=T+273;
    System.out.println("Fahrenheit = "+F);
    System.out.println("Kelvin = "+K);
    }
    
}
