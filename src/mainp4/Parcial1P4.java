package mainp4;
import java.util.Scanner;

public class Parcial1P4 {
    private float num[];
    private float promedio;
    private float suma;
    Scanner sc = new Scanner(System.in);
    
    public Parcial1P4(){
    }
    public void captura(){
       num = new float[10];
       for(int i=0; i<10; i++){
           System.out.print("ingrese un numero: ");
           num[i]=sc.nextFloat();
           suma=(suma+num[i]);
       }
    }
    public void promedio(){
        promedio=(suma/10);
    }
    public void salida(){
        System.out.println("El arreglo original es: ");
        for(int i = 0; i<10; i++){
            System.out.println(num[i]);
        }
        System.out.println("El promedio es: " +promedio);
    }
}

