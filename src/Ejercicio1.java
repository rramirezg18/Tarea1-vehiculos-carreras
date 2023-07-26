/*Aplicación desarrollada por: Roberto Ramírez 7690-22-12700
 * Aplicación en java que permite obtener la velocidad
 * promedio de diferentes vehiculos
 */
import java.util.*;
public class Ejercicio1 {
    public static void main(String[] args) {
    	Scanner entrada = new Scanner(System.in);
    	int cantidadVehiculos = 0;
    	int cantidadVueltas = 0;
    	float tiempoTotal = 0;
    	float tiempoVuelta = 0;
    	float velocidadPromedio = 0;
    	int contadorVueltas = 1;
    	int contadorVehiculos = 1;
    	float longitud = 0;
    	int opcion = 0;
    	int salir = 0;
    	//Menu principal
    	while(salir !=1) {
    		System.out.println("\tBIENVENIDO");
    		System.out.println("\n1.INICIAR");
    		System.out.println("\n2.FINALIZAR");
    		System.out.println("\nElige una opción");
    		opcion = entrada.nextInt();
    		if(opcion == 1) {//opcion 1
    			System.out.println("Ingrese la longitud de la pista: ");
    			longitud = entrada.nextFloat();
    			System.out.println("Ingrese la cantidad de vehiculos");
    			cantidadVehiculos = entrada.nextInt();
    			if(cantidadVehiculos > 0) {
    				contadorVehiculos = 1;
    				while(contadorVehiculos <= cantidadVehiculos) {
    					//Ingresando las vueltas que dio el vehiculo
    					System.out.println("Ingrese la cantidad de vueltas que dio el vehiculo " + contadorVehiculos);
    					cantidadVueltas = entrada.nextInt();
    					contadorVueltas = 1;
    					tiempoTotal = 0;
    					if(cantidadVueltas > 0) {
    						while(contadorVueltas <= cantidadVueltas) {
    							//Ingresando los tiempos de cada vuelta
    							System.out.println("Ingrese el tiempo de la vuelta " + contadorVueltas);
    							tiempoVuelta = entrada.nextFloat();
    							tiempoTotal += tiempoVuelta;
    							velocidadPromedio = longitud / tiempoTotal;
    							contadorVueltas++;
    						}
    						System.out.println("\nLa velocidad promedio del vehiculo " + contadorVehiculos + " es: " + velocidadPromedio + " kms/h\n");
    					}else {
    						System.out.println("\nEl vehiculo " + contadorVehiculos + " aun no ha registrado vueltas\n");
    					}
    					contadorVehiculos ++;
    				}
    			}else {
    				System.out.println("No hay vehiculos dando vueltas...!");
    			}
    		}else if(opcion == 2) {//opcion 2
    			salir = 1;
    			System.out.println("\n¡Vuelve Pronto!");
    		}else {
    			System.out.println("Opción no valida, intentalo nuevamente.");
    		}
    	}
    	entrada.close();
    }
}

