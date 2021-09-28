import java.util.Scanner;

public class AreaTriangulo{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double a,b,c,p;

        System.out.print("Introduzca longitud del primer lado del triángulo: ");
        a = sc.nextDouble();

        System.out.print("Introduzca longitud del segundo lado del triángulo: ");
        b = sc.nextDouble();

        System.out.print("Introduzca longitud del tercer lado del triángulo: ");
        c = sc.nextDouble();

        p = (a+b+c)/2;
        
        System.out.println("Area -> " +  Math.sqrt(p*(p-a)*(p-b)*(p-c)));
    }
}
