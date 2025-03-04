package Ejerciciosjava;
import java.util.Scanner;
public class EjercicioPreParcial {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		 System.out.print("ingrese el numero total de camiones parqueados  ");
	        int cantidadRegistros = scanner.nextInt();
	        scanner.nextInt();
	        
	        double[][] datosParqueadero = new double[cantidadRegistros][6];
	        
	        capturarDatosParqueadero(scanner, datosParqueadero);
	        System.out.println("Datos capturados:");
	        for (int i = 0; i < cantidadRegistros; i++) {
	            System.out.println("Registro " + (i + 1) + ":");
	            System.out.println("Tipo de servicio: " + datosParqueadero[i][0]);
	            System.out.println("Tipo de producto: " + datosParqueadero[i][1]);
	            System.out.println("Peso transportado: " + datosParqueadero[i][2]);
	            System.out.println("Tiempo de permanencia: " + datosParqueadero[i][3]);
	            System.out.println("Largo del camión: " + datosParqueadero[i][4]);
	            System.out.println("Costo parqueadero: " + datosParqueadero[i][5]);
	            System.out.println("-------------------------------");
	        }
	        
	        scanner.close();
	}
	        
	
	        
	
	
	
	
	        
	        public static void capturarDatosParqueadero (Scanner scanner , double [][] datosParqueadero) {
	
	
	        for(int i=0; i<datosParqueadero.length;i++) {
		
		System.out.println("Capturando datos para el registro " + (i + 1));

        System.out.print("Ingrese el tipo de servicio: ");
        datosParqueadero[i][0] = scanner.nextDouble();

        System.out.print("Ingrese el tipo de producto: ");
        datosParqueadero[i][1] = scanner.nextDouble();

        System.out.print("Ingrese el peso transportado: ");
        datosParqueadero[i][2] = scanner.nextDouble();

        System.out.print("Ingrese el tiempo de permanencia: ");
        datosParqueadero[i][3] = scanner.nextDouble();

        System.out.print("Ingrese el largo del camión: ");
        datosParqueadero[i][4] = scanner.nextDouble();

        System.out.print("Ingrese el costo del parqueadero: ");
        datosParqueadero[i][5] = scanner.nextDouble();
		
	        }
	        
	        
	    public static vehiculosdecarga ( double [][] datosparqueadero,double parametropeso ) {
	    	parametropeso=8;
	    	if (datosparqueadero < parametropeso) {
	    		datosparqueadero[i][2]*
	    	}
	    }
	    return vehiculosdecarga;
	    
	    public static vehiculosdedescarga() {
	    	
	    }
	    return vehiculosdedescarga;
	        
	        
	}
	
}



	        
		
		



