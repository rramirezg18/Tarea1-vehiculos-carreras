import java.util.*;
public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int cantCarros = 0;
		int cantVueltas = 0;
		float tiempoTotal = 0;
		float tiempoVuelta = 0;
		float velocidadPromedio = 0;
		int contadorCarros = 1; 
		int contadorVueltas = 1;
		int distancia = 4995;
		System.out.println("Ingrese la cantidad de carros: ");
		cantCarros = entrada.nextInt();
		if(cantCarros > 0) {
			while(contadorCarros <= cantCarros) {
				System.out.println("Ingrese la cantidad de vueltas del carro " + contadorCarros);
				cantVueltas = entrada.nextInt();
				contadorVueltas = 1;
				tiempoTotal = 0;
				while(contadorVueltas <= cantVueltas) {
					System.out.println("Ingrese el tiempo de la vuelta " + contadorVueltas);
					tiempoVuelta = entrada.nextFloat();
					tiempoTotal += tiempoVuelta;
					velocidadPromedio = distancia / tiempoTotal;
					contadorVueltas ++;
				}
				contadorCarros ++;
				System.out.println("La velocidad promedio es: " + velocidadPromedio + " kms/h" );	
			}
		}else {
			System.out.println("No hay carros dando vueltas...!");
		}
	}
}
