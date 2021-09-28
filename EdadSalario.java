import java.util.Scanner;
class EdadSalario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre;
        int edad;
        float salario, salar;
        System.out.println ("introduce un nombre: ");
        nombre = teclado.nextLine();
        System.out.println();
        System.out.println ("introduce una edad: ");
        edad = teclado.nextInt();
        System.out.println();
        System.out.println ("introduce un salario: ");
        salario = teclado.nextFloat();
        System.out.println();
        if(edad >= 16 && edad <= 18) {
            salar = salario;
            System.out.println(nombre + " con " + edad + " cobra " + salario + " + 0% = " + salar);
        }
        else if(edad >= 19 && edad <= 50) {
            salar = salario + ((salario * 5)/100);
            System.out.println(nombre + " con " + edad + " cobra " + salario + " + 5% = " + salar);
        }
        else if(edad >= 51 && edad <= 60) {
            salar = salario + ((salario * 10)/100);
            System.out.println(nombre + " con " + edad + " cobra " + salario + " + 10% = " + salar);
        }
        else if(edad > 60) {
            salar = salario + ((salario * 15)/100);
            System.out.println(nombre + " con " + edad + " cobra " + salario + " + 15% = " + salar);
        }
        else if(edad < 16) {
            System.out.println("No tiene edad para trabajar");
        }
    }
}