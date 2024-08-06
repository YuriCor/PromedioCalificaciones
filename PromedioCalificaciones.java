import java.util.Scanner;
@author yuri cortez

public class PromedioCalificaciones {
    public static void main(String[] args) {
        System.out.print("Esta es la tercera version del archivo");
        system.out.print("Parte final de la segunda tarea");
        Scanner scanner = new Scanner(System.in);
       
	
        double calificacion1, calificacion2, calificacion3, calificacion4;
        double suma, promedio;

	
        System.out.print("Ingrese la calificación del primer examen: ");
        calificacion1 = scanner.nextDouble();
        
        System.out.print("Ingrese la calificación del segundo examen: ");
        calificacion2 = scanner.nextDouble();
        
        System.out.print("Ingrese la calificación del tercer examen: ");
        calificacion3 = scanner.nextDouble();
        
        System.out.print("Ingrese la calificación del cuarto examen: ");
        calificacion4 = scanner.nextDouble();

        suma = calificacion1 + calificacion2 + calificacion3 + calificacion4;

        promedio = suma / 4;

        System.out.println("El promedio de las calificaciones es: " + promedio);
        
        scanner.close();
    }
}