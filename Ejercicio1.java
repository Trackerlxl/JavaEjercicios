package Ejerciciosjava;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		int cantidadComputadoras;
        
        double precioPorComputadora = 500.0;
        
        double totalCompra;
       
        double descuento;

        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese la cantidad de computadoras que desea comprar: ");
        cantidadComputadoras = scanner.nextInt();

        
        totalCompra = cantidadComputadoras * precioPorComputadora;

       
        if (cantidadComputadoras < 5) {
            
            descuento = totalCompra * 0.10;
        } else if (cantidadComputadoras >= 5 && cantidadComputadoras < 10) {
            
            descuento = totalCompra * 0.20;
        } else {
            
            descuento = totalCompra * 0.40;
        }

       
        double totalFinal = totalCompra - descuento;

        
        System.out.println("Total de la compra antes del descuento: U$" + totalCompra);
        System.out.println("Descuento aplicado: U$" + descuento);
        System.out.println("Total final después del descuento: U$" + totalFinal);

       
        scanner.close();
    

	}

}
