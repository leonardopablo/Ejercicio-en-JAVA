
package ejercicio_5_poo;

import java.util.Scanner;

public class Ejercicio_5_POO {

    public static void main(String[] args) {
      
//        Ejercicio 5: Clase Banco
//Crea una clase Banco que tenga una lista de cuentas bancarias. Cada
//cuenta bancaria debe ser representada como un objeto de una clase
//CuentaBancaria que tiene atributos como número de cuenta, saldo, etc. La
//clase Banco debe tener métodos para agregar cuentas, eliminar cuentas y
//consultar el saldo de una cuenta.

    Scanner entrada = new Scanner(System.in);
        Banco banco = new Banco(10); // Banco con capacidad máxima de 10 cuentas
        int opcion;
        
        do {
            System.out.println("\n--- Menú del Banco ---");
            System.out.println("1. Agregar cuenta");
            System.out.println("2. Eliminar cuenta");
            System.out.println("3. Consultar saldo");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = entrada.nextInt();
            entrada.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el número de cuenta: ");
                    String numeroCuenta = entrada.nextLine();
                    System.out.print("Ingrese el saldo inicial: ");
                    double saldo = entrada.nextDouble();
                    banco.agregarCuenta(numeroCuenta, saldo);
                    break;
                case 2:
                    System.out.print("Ingrese el número de cuenta a eliminar: ");
                    String numeroCuentaEliminar = entrada.nextLine();
                    banco.eliminarCuenta(numeroCuentaEliminar);
                    break;
                case 3:
                    System.out.print("Ingrese el número de cuenta para consultar saldo: ");
                    String numeroCuentaConsultar = entrada.nextLine();
                    banco.consultarSaldo(numeroCuentaConsultar);
                    break;
                case 4:
                    System.out.println("Saliendo del sistema.");
                    break;
                default:
                    System.out.println("Opción inválida, intente de nuevo.");
            }
        } while (opcion != 4);

      
    
 

    }
 }
    

