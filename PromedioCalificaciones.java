import java.util.Scanner;

public class PromedioCalificaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

	//declarar las variables para las calificaciones
        double calificacion1, calificacion2, calificacion3, calificacion4;
        double suma, promedio;

	//leer las calificaciones
        System.out.print("Ingrese la calificación del primer examen: ");
        calificacion1 = scanner.nextDouble();
        
        System.out.print("Ingrese la calificación del segundo examen: ");
        calificacion2 = scanner.nextDouble();
        
        System.out.print("Ingrese la calificación del tercer examen: ");
        calificacion3 = scanner.nextDouble();
        
        System.out.print("Ingrese la calificación del cuarto examen: ");
        calificacion4 = scanner.nextDouble();

	//calcular la suma de las calificaciones
        suma = calificacion1 + calificacion2 + calificacion3 + calificacion4;

	//calcular el promedio
        promedio = suma / 4;

	//mostrar el promedio
        System.out.println("El promedio de las calificaciones es: " + promedio);
        
        scanner.close();
    }
}