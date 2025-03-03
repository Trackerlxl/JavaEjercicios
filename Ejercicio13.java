package Ejerciciosjava;
import java.util.Scanner;
public class Ejercicio13 {

	public static void main(String[] args) {
		

		 String genero;
	        int numeroBolita;
	        String premio;

	        // Crear el objeto Scanner para leer la entrada del usuario
	        Scanner scanner = new Scanner(System.in);

	        // Solicitar al usuario que ingrese su género
	        System.out.print("Ingrese su género (hombre/mujer): ");
	        genero = scanner.nextLine().toLowerCase(); // Convertimos la entrada a minúsculas

	        // Verificar que el género sea válido
	        if (!genero.equals("hombre") && !genero.equals("mujer")) {
	            System.out.println("Género no válido. El programa se cerrará.");
	            scanner.close();
	            return; // Termina la ejecución si el género no es válido
	        }

	        // Solicitar al usuario que ingrese el número de la bolita
	        System.out.print("Ingrese el número de la bolita (1 a 5): ");
	        numeroBolita = scanner.nextInt();

	        // Verificar que el número de la bolita esté dentro del rango válido
	        if (numeroBolita < 1 || numeroBolita > 5) {
	            System.out.println("Número de bolita no válido. El programa se cerrará.");
	            scanner.close();
	            return; // Termina la ejecución si el número no es válido
	        }

	        // Determinar el premio según el género y el número de bolita
	        if (genero.equals("hombre")) {
	            switch (numeroBolita) {
	                case 1:
	                    premio = "Desodorante";
	                    break;
	                case 2:
	                    premio = "Six-Pack de cerveza";
	                    break;
	                case 3:
	                    premio = "Camiseta";
	                    break;
	                case 4:
	                    premio = "Pantaloneta";
	                    break;
	                case 5:
	                    premio = "Sudadera";
	                    break;
	                default:
	                    premio = "Premio no disponible";
	                    break;
	            }
	        } else { // Si el género es mujer
	            switch (numeroBolita) {
	                case 1:
	                    premio = "Loción";
	                    break;
	                case 2:
	                    premio = "Bikini";
	                    break;
	                case 3:
	                    premio = "Crema para la cara";
	                    break;
	                case 4:
	                    premio = "Plancha para el cabello";
	                    break;
	                case 5:
	                    premio = "Esmalte de uñas";
	                    break;
	                default:
	                    premio = "Premio no disponible";
	                    break;
	            }
	        }

	        // Mostrar el premio que le corresponde al usuario
	        System.out.println("¡Felicidades! Tu premio es: " + premio);

	        // Cerrar el scanner
	        scanner.close();
		
		
	}

}
