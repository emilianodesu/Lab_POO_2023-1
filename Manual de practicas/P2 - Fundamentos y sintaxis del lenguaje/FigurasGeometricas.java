import java.util.Scanner;

public class FigurasGeometricas {
    public static void main(String[] args) {
        float area;
        int opcion;
        final float PI = 3.14159f;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Elige la opcion");
            System.out.println("1. Area de círculo");
            System.out.println("2. Area de triángulo");
            System.out.println("3. Area de cuadrado");
            System.out.println("4. Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    //Circulo
                    System.out.println("Seleccionó el círculo");
                    float radio = 15;
                    area = PI * radio * radio;
                    break;
                
                case 2:
                    //Triángulo
                    System.out.println("Seleccionó el triángulo");
                    float base = 8, altura = 5;
                    area = (base * altura)/2;
                    break;
                
                case 3:
                    //Cuadrado
                    System.out.println("Seleccionó el cuadrado");
                    float lado = 10;
                    area = lado * lado;
                    break;
                
                case 4:
                    //Salir
                    System.out.println("Hasta luego");
                    continue;
                
                default:
                    //Ninguno de los anteriores
                    System.out.println("Su eleccion no es correcta");
                    continue;
            }
            System.out.println("El area es: " + area);
        } while (opcion != 4);
        sc.close();
    }
}
