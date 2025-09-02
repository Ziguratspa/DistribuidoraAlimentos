// Importar la clase Scanner para leer entrada del usuario
import java.util.Scanner;

/**
 * Sistema de cálculo de despacho para distribuidora de alimentos
 */
public class DistribuidoraAlimentos {
    
    /**
     * Método principal que ejecuta la aplicación
     * @param args Argumentos de línea de comandos
     */
    public static void main(String[] args) {
        // Crear objeto Scanner para leer entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Variables para almacenar datos del vehículo de despacho
        String marca;           // Almacena la marca del vehículo
        String modelo;          // Almacena el modelo del vehículo
        int cilindrada;         // Almacena la cilindrada del motor
        String combustible;     // Almacena el tipo de combustible
        int pasajeros;          // Almacena la capacidad de pasajeros
        
        // Variables para el cálculo del despacho
        double totalCompra;     // Almacena el monto total de la compra
        double distancia;       // Almacena la distancia en kilómetros
        double costoDespacho;   // Almacena el costo total del despacho
        
        // Mostrar mensaje de bienvenida
        System.out.println("=== SISTEMA DE DISTRIBUCIÓN DE ALIMENTOS ===");
        System.out.println("=== REGISTRO DE VEHÍCULO DE DESPACHO ===\n");
        
        // Solicitar y leer datos del vehículo
        System.out.print("Ingrese la marca del vehículo: ");
        marca = scanner.nextLine();  // Leer línea completa para marca
        
        System.out.print("Ingrese el modelo del vehículo: ");
        modelo = scanner.nextLine();  // Leer línea completa para modelo
        
        System.out.print("Ingrese la cilindrada del motor (cc): ");
        cilindrada = scanner.nextInt();  // Leer número entero para cilindrada
        scanner.nextLine();  // Limpiar buffer del scanner
        
        System.out.print("Ingrese el tipo de combustible: ");
        combustible = scanner.nextLine();  // Leer línea completa para combustible
        
        System.out.print("Ingrese la capacidad de pasajeros: ");
        pasajeros = scanner.nextInt();  // Leer número entero para pasajeros
        
        // Mostrar datos ingresados (Salida requerida)
        System.out.println("\n=== DATOS DEL VEHÍCULO REGISTRADO ===");
        System.out.println("La marca que ha ingresado es: " + marca);
        System.out.println("El modelo que ha ingresado es: " + modelo);
        System.out.println("La cilindrada que ha ingresado es: " + cilindrada + " cc");
        System.out.println("El tipo de combustible es: " + combustible);
        System.out.println("Tiene una capacidad de " + pasajeros + " pasajeros.");
        
        // Sección de cálculo de despacho
        System.out.println("\n=== CÁLCULO DE COSTO DE DESPACHO ===");
        
        // Solicitar datos para el cálculo del despacho
        System.out.print("Ingrese el total de la compra ($): ");
        totalCompra = scanner.nextDouble();  // Leer número decimal para compra
        
        System.out.print("Ingrese la distancia a recorrer (km): ");
        distancia = scanner.nextDouble();  // Leer número decimal para distancia
        
        // Calcular costo de despacho según reglas de negocio
        if (totalCompra > 50000) {
            // Despacho gratis para compras sobre 50,000 pesos
            costoDespacho = 0;
            System.out.println("\n¡Despacho gratuito! Compra sobre $50,000");
        } 
        else if (totalCompra >= 25000 && totalCompra <= 49999) {
            // Tarifa de $150 por km para compras entre 25,000-49,999
            costoDespacho = 150 * distancia;
            System.out.println("\nTarifa aplicada: $150 por km");
        } 
        else {
            // Tarifa de $300 por km para compras menores a 25,000
            costoDespacho = 300 * distancia;
            System.out.println("\nTarifa aplicada: $300 por km");
        }
        
        // Mostrar resumen del cálculo
        System.out.println("Total compra: $" + totalCompra);
        System.out.println("Distancia: " + distancia + " km");
        System.out.println("Costo despacho: $" + costoDespacho);
        System.out.println("Total a pagar: $" + (totalCompra + costoDespacho));
        
        // Cerrar el scanner para liberar recursos
        scanner.close();
        
        System.out.println("\n=== PROCESO COMPLETADO ===");
    }
}