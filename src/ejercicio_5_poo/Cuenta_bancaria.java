
package ejercicio_5_poo;
public class Cuenta_bancaria{
    
    private String numeroCuenta;
    private double saldo;

    public Cuenta_bancaria() {
    }

    public Cuenta_bancaria(String numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
 
    
}
