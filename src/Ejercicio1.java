/*Aplicación en java que permite obtener la velocidad
 * promedio de diferentes vehiculos
 */
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
        int distancia = 0;
        int opcion = 0;
        int salir = 0;
        while (salir != 1) {
            System.out.println("\tBIENVENIDO");
            System.out.println("\n1.INICIAR");
            System.out.println("\n2.SALIR");
            System.out.println("\n¡Elige una opción!");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la longitud de la pista: ");
                    distancia = entrada.nextInt();
                    System.out.println("Ingrese la cantidad de vehiculos: ");
                    cantCarros = entrada.nextInt();
                    if (cantCarros > 0) {
                        contadorCarros = 1;
                        while (contadorCarros <= cantCarros) {
                            System.out.println("Ingrese la cantidad de vueltas que dio el vehiculo " + contadorCarros);
                            cantVueltas = entrada.nextInt();
                            contadorVueltas = 1;
                            tiempoTotal = 0;
                            if (cantVueltas > 0) {
                                while (contadorVueltas <= cantVueltas) {
                                    System.out.println("Ingrese el tiempo de la vuelta " + contadorVueltas);
                                    tiempoVuelta = entrada.nextFloat();
                                    tiempoTotal += tiempoVuelta;
                                    velocidadPromedio = distancia / tiempoTotal;
                                    contadorVueltas++;
                                }
                                System.out.println("La velocidad promedio del vehiculo " + contadorCarros + " es: " + velocidadPromedio + " kms/h");
                            } else {
                                System.out.println("El vehiculo aun no ha registrado ninguna vuelta..");
                            }
                            contadorCarros++;
                        }
                    } else {
                        System.out.println("No hay vehiculos dando vueltas...!");
                    }
                    break;
                case 2:
                    salir = 1;
                    System.out.println("\n¡Vuelve Pronto!");
                    break;
            }
        }
        entrada.close();
    }
}

