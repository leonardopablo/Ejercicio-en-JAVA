
package ejercicio_5_poo;


public class Banco{

    private Cuenta_bancaria[] cuentas;
    private int numeroCuentas; // Rastrea cuántas cuentas se han agregado

    public Banco(int capacidadMaxima) {
        cuentas = new Cuenta_bancaria[capacidadMaxima];
        numeroCuentas = 0;
    }

    public void agregarCuenta(String numeroCuenta, double saldo) {
        if (numeroCuentas < cuentas.length) {
            cuentas[numeroCuentas++] = new Cuenta_bancaria(numeroCuenta, saldo);
            System.out.println("Cuenta agregada exitosamente.");
        } else {
            System.out.println("No se pueden agregar más cuentas, capacidad máxima alcanzada.");
        }
    }

    public void eliminarCuenta(String numeroCuenta) {
        int index = buscarCuenta(numeroCuenta);
        if (index != -1) {
            // Elimina la cuenta desplazando el resto de elementos hacia la izquierda
            for (int i = index; i < numeroCuentas - 1; i++) {
                cuentas[i] = cuentas[i + 1];
            }
            cuentas[--numeroCuentas] = null; // Reduce el contador de cuentas y anula la última
            System.out.println("Cuenta eliminada exitosamente.");
        } else {
            System.out.println("Cuenta no encontrada.");
        }
    }

    public void consultarSaldo(String numeroCuenta) {
        int index = buscarCuenta(numeroCuenta);
        if (index != -1) {
            System.out.println("El saldo de la cuenta " + numeroCuenta + " es: " + cuentas[index].getSaldo());
        } else {
            System.out.println("Cuenta no encontrada.");
        }
    }

    private int buscarCuenta(String numeroCuenta) {
        for (int i = 0; i < numeroCuentas; i++) {
            if (cuentas[i].getNumeroCuenta().equals(numeroCuenta)) {
                return i;
            }
        }
        return -1; // Retorna -1 si no se encuentra la cuenta
    }
}

    


