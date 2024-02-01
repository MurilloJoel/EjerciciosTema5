package PruebasInput;

/**
 *
 * @author joel
 */
public class Cuenta {
    private long numCuenta;
    private double saldo;
    private String titular;
    private static double MAXIMO_DESCUBIERTO=0; // podría ser negativo
    private static double MAXIMO_RETIRO=600; 

    public Cuenta(long numCuenta, double saldo, String titular) {
        this.numCuenta = numCuenta;
        this.saldo = saldo;
        this.titular = titular;
    }
    
    public Cuenta(long numCuenta, double saldo, String titular, double cmd, double cmc) {
        this.numCuenta = numCuenta;
        this.saldo = saldo;
        this.titular = titular;
        this.MAXIMO_DESCUBIERTO = cmd;
        this.MAXIMO_RETIRO = cmc;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public long getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(long numCuenta) {
        this.numCuenta = numCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getMAXIMO_DESCUBIERTO() {
        return MAXIMO_DESCUBIERTO;
    }

    public void setCantidaMaxDescubierto(int cantidaMaxDescubierto) {
        this.MAXIMO_DESCUBIERTO = cantidaMaxDescubierto;
    }

    public double getMAXIMO_RETIRO() {
        return MAXIMO_RETIRO;
    }

    public void setCantidadMaxCajero(int cantidadMaxCajero) {
        this.MAXIMO_RETIRO = cantidadMaxCajero;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numCuenta=" + numCuenta + ", saldo=" + saldo + ", titular=" + titular + ", cantidaMaxDescubierto=" + MAXIMO_DESCUBIERTO + ", cantidadMaxCajero=" + MAXIMO_RETIRO + '}';
    }
    
    public boolean retirar(double retiro){
        
        if (retiro<=0) {
            throw new ExcepcionPropia("Cantodad invalida");
        } else if(retiro> MAXIMO_RETIRO){
            
        }
        
        // programarlo
        return true;
    }
    
    public void ingresar(double cantidadNueva){
        if (cantidadNueva>0) {
            saldo+=cantidadNueva;
        }
    }
    
    public boolean transferir(double cantidad, Cuenta origen, Cuenta destino){
        
        // programarlo
        return true;
    }
}
