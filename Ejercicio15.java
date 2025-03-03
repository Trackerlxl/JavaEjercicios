package Ejerciciosjava;
import java.util.Scanner;
public class Ejercicio15 {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
	        int cantidadMasculino = 0, cantidadFemenino = 0, nacimientos;
	        String nombreBebe, sexoBebe;

	        System.out.print("Ingrese la cantidad de nacimientos: ");
	        nacimientos = scanner.nextInt();
	        scanner.nextLine();

	        for (int i = 1; i <= nacimientos; i++) {
	            System.out.print("Ingrese el nombre del bebé " + i + ": ");
	            nombreBebe = scanner.nextLine();

	            do {
	                System.out.print("Ingrese el sexo del bebé " + nombreBebe + " (M/F): ");
	                sexoBebe = scanner.nextLine().toUpperCase();
	            } while (!sexoBebe.equals("M") && !sexoBebe.equals("F"));

	            if (sexoBebe.equals("M")) {
	                cantidadMasculino++;
	            } else {
	                cantidadFemenino++;
	            }
	        }

	        System.out.println("Cantidad de bebés masculinos: " + cantidadMasculino);
	        System.out.println("Cantidad de bebés femeninos: " + cantidadFemenino);

	        scanner.close();
		
		
	}

}
